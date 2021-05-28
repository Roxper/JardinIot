/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjardiniot.ClasesCommSerial;

import com.fazecast.jSerialComm.SerialPort;
import java.util.Enumeration;

/**
 *
 * @author Rodrigo S
 */
public class RecibirThread extends Thread{
    private RecibirListener Listener;
    Enumeration puertos_libres;             //Numero de Puertos Libres
    SerialPort[] Puertos;                    //Identificacion del Puerto
    SerialPort Puerto;                      //Puerto de Comunicacion
    
    boolean FlagStop=true;
    
    public void setRecibirListener(RecibirListener L){ //Va a guardar la info cada que llegue por un puerto serial
        Listener=L;
    }
       
    public RecibirThread(){
        Puertos=SerialPort.getCommPorts();    //Cuenta los puertos libres de la pc
    }
    
    public int getNumPorts(){
        return Puertos.length;
    }
    
    public String getNamePort(int index){
        return Puertos[index].getSystemPortName();
    }
    
    public void selectPort(int index){
        Puerto=Puertos[index];
    }
    
    // 11101010 ---- Paridad Par
    // 11101010 1 ---Paridad par ->>>>>  10101010 1 Error
    // 11101010 ---- Paridad Impar
    // 11101010 0 ->>>>>> 10101010 0 Error
    public void openPort(int BaudeRate, int DataBits, int StopBits, int Parity){
       
            Puerto.openPort();
            Puerto.setBaudRate(BaudeRate);
            Puerto.setNumDataBits(DataBits);
            Puerto.setNumStopBits(StopBits);
            Puerto.setParity(Parity);         
    }
    
    public void Connect(){
        FlagStop=false;
        start();
    }
    
    public void Disconnect(){
        FlagStop=true;
    }
    
    @Override
    public void run(){
        byte []buffer;
        buffer=new byte[1];
        while(FlagStop==false){
           if (Puerto.readBytes(buffer, 1)!=0)
                if (Listener!=null)
                    Listener.RecibirDato((int)buffer[0]);
                        
        }
        Puerto.closePort();
    }
    
    public void sendData(int d){
        byte []buffer;
        buffer=new byte[1];
        buffer[0]=(byte)d;
        Puerto.writeBytes(buffer, 1);
    }
        public void sendStrings(String d){
            String []dat;
            dat = new String[1];
            dat[0] = (String)d;
        //Puerto.writeBytes(0, 1);
        //Puerto.readBytes();
    }
}
