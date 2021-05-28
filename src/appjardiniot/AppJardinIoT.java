/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjardiniot;

import appjardiniot.Clases.SistRiego;
import appjardiniot.GUIs.Login;


/**
 *
 * @author Rodrigo S
 */
public class AppJardinIoT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        SistRiego SisR;                     //Crea el objeto de la Clase General
        SisR = new SistRiego();             //Se inicializa
        SisR.setDatos("Sistema de Riego Alpha 0.001", false);    //Se le asignan los datos de Nombre y Estado (Es por gusto)
        
        Login Ventana;                      //Crea la ventana de la clase Login
        Ventana = new Login(SisR);          //Se inicializa
        //Ventana = new Login();
        //Ventana.setSR(SisR);
        Ventana.setVisible(true);           //Se hace visible
        
        
    }
    
}
