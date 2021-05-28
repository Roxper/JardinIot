/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjardiniot.Clases;

/**
 *
 * @author Rodrigo S
 */
public class JDesertico extends InfoJardin{
    //MIN = APAGADO
    //MAX = Encendido 
    protected String Nombre;
    protected String Tipo;
    protected int TempMin;
    protected int TempProm;
    protected int TempMax;    
    protected int HAMin;
    protected int HAProm;
    protected int HAMax;
    protected int HSMin;
    protected int HSProm;
    protected int HSMax;      
    
    public void setTemperatura(int TM, int TP, int Tm) {
        TempMin = Tm;
        TempProm = TP;
        TempMax = TM;
    }
    
    public void setActTemperatura(int TP) {        
        TempProm = TP;    
    }

    public void setH_Suelo(int HSM, int HSP, int HSm) {
        HSMin = HSm;
        HSProm = HSP;
        HSMax = HSM;
    }

    public void setActH_Suelo(int HSP) {        
        HSProm = HSP;    
    }
    
    public void setH_Ambiente(int HAM, int HAP, int HAm) {
        HAMin = HAm;
        HAProm = HAP;
        HAMax = HAM;
    }
    
    public void setActH_Ambiente(int HAP) {        
        HAProm = HAP;    
    }

    public int getTempMin() {
        return TempMin;
    }

    public int getTempMax() {
        return TempMax;
    }

    public int getHAMin() {
        return HAMin;
    }

    public int getHAMax() {
        return HAMax;
    }

    public int getHSMin() {
        return HSMin;
    }

    public int getHSMax() {
        return HSMax;
    }   
    
    @Override
    public int getTemperatura() {
        return TempProm;
    }
    
    @Override
    public int getH_Suelo() {
        return HSProm;
    }

    @Override
    public int getH_Ambiente() {
        return HAProm;
    }

    @Override
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    @Override
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    @Override
    public String getNombre() {
        return Nombre;
    } 

    @Override
    public String getTipo() {
        return Tipo;
    }  
    
}
