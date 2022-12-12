/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptadorwilson;

/**
 *
 * @author Wilson Pop
 */
public class Nodos {
    int dato;
    String nombre;
    Nodos hiz;
    Nodos hde;
    
    public Nodos(int d, String n){
        this.dato=d;
        this.nombre = n;
        this.hde = null;
        this.hiz=null;
    }
    
    public String toString(){
        return nombre + "Dato: " + dato; 
    }
    
}
