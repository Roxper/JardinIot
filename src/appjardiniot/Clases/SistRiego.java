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
public class SistRiego implements Serializable {
    protected String Nombre;
    protected ArrayList<Usuario> Users;
    protected boolean Estado;

    public SistRiego() {
       Users = new ArrayList();
    }

    public void setDatos(String Nombre, boolean Estado) {
        this.Nombre = Nombre;
        this.Estado = Estado;
    }
    
    public void setUsers(Usuario Users) {
        this.Users.add(Users);
    }
    public void CambiarEstado(boolean Estado) {
        this.Estado = Estado;
    }
    public String getNombre() {
        return Nombre;
    }

    public boolean getEstado() {
        return Estado;
    }
    
    public Usuario getUser(int index){
        if  ( (index<0) || (Users.isEmpty()) || (index>=Users.size()) )
                return null;
        return Users.get(index);
    }
    
    public int getNumUsers(){
        return Users.size();
    }

    
    
    
    
}
