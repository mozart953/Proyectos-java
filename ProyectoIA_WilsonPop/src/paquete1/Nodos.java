/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;

/**
 *
 * @author Wilson Pop
 */
public class Nodos {
    String [][] estado;
    ArrayList<Nodos> hijos = new ArrayList<Nodos>();
    Nodos padre;

    public Nodos(String[][] estado) {
        this.estado = estado;
        hijos = null;
        padre=null;
    }

    public String[][] getEstado() {
        return estado;
    }

    public void setEstado(String[][] estado) {
        this.estado = estado;
    }

    public ArrayList<Nodos> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Nodos> hijos) {
        this.hijos = hijos;
        if(hijos!=null){
            for(Nodos h: hijos){
                h.padre = this;
            }
        }
    }

    public Nodos getPadre() {
        return padre;
    }

    public void setPadre(Nodos padre) {
        this.padre = padre;
    }
    
    
    
}
