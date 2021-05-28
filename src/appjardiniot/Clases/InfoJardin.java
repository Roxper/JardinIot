/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjardiniot.Clases;

import java.io.Serializable;

/**
 *
 * @author Rodrigo S
 */
public abstract class InfoJardin implements Serializable{
    protected String Nombre;
    protected String Tipo;
    protected int Temperatura;
    protected int H_Suelo;
    protected int H_Ambiente;

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return Tipo;
    }
 
    public void setTemperatura(int Temperatura) {
        this.Temperatura = Temperatura;
    }

    public void setH_Suelo(int H_Suelo) {
        this.H_Suelo = H_Suelo;
    }

    public void setH_Ambiente(int H_Ambiente) {
        this.H_Ambiente = H_Ambiente;
    }
    
    public String getNombre() {
        return Nombre;
    }
    
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    public int getTemperatura() {
        return Temperatura;
    }
    
    public int getH_Suelo() {
        return H_Suelo;
    }

    public int getH_Ambiente() {
        return H_Ambiente;
    }
    
}
