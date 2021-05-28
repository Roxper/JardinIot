/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjardiniot.Clases;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Rodrigo S
 */
public class Usuario implements Serializable{
    protected String Nombre;
    protected String Correo;
    protected String Password;
    protected int Edad;
    //protected InfoJardin Jardin;
    protected ArrayList <InfoJardin> Jardines;

    public Usuario() {
        Jardines = new ArrayList();
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
  
    public boolean setEdad(int Edad) {
        if(Edad >= 18){
            this.Edad = Edad;
            return true;
        }
        else return false;
    }
    
    public void setJardines(InfoJardin Jardines) {
        this.Jardines.add(Jardines);
    }
    
    public String getNombre() {
        return Nombre;
    }
    public String getCorreo() {
        return Correo;
    }
    
    public String getPassword() {
        return Password;
    }
    
    public InfoJardin getJardines(int index) {
        if ( (index<0) || (getNumJardines()==0) || (index>=getNumJardines()) )
        return null;
        return Jardines.get(index);
    }

    public int getEdad() {
        return Edad;
    }

    public int getNumJardines(){
        return Jardines.size();
    }
    
    
}
