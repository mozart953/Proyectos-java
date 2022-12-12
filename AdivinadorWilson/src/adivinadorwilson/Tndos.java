/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinadorwilson;

/**
 *
 * @author Wilson Pop
 */
public class Tndos {

    String dt;//dato
    Tndos hz;//hijo izquierdo
    Tndos dc;//hijo derecho
    
    public Tndos(String n){
        this.dt = n;
        this.hz = null;
        this.dc=null;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public Tndos getHz() {
        return hz;
    }

    public void setHz(Tndos hz) {
        this.hz = hz;
    }

    public Tndos getDc() {
        return dc;
    }

    public void setDc(Tndos dc) {
        this.dc = dc;
    }
   
    
    
    
}
