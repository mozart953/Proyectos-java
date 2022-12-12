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
public class LecheSoya extends CondimentoDecorador{

    public LecheSoya(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double ObtenerCosto() {
        double costo = 0.15; // Precio del condimento
                
        return costo;
    }

    @Override
    public String ObtenerDescripcion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
