/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronDecorador;

/**
 *
 * @author Wilson Pop
 */
public class CafeExpresso implements Bebida {

    private String nombreUsuario="";
    
    public CafeExpresso(String nombre) {
        this.nombreUsuario =nombre;
    }
   
    //retornara el costo de la bebida, en este caso Q 1.99
    @Override
    public double ObtenerCosto() {
        double costobebida= 1.99;
        return costobebida;
    }

    @Override
    public String ObtenerDescripcion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
