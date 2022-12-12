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
public class LecheEntera extends CondimentoDecorador{

    public LecheEntera(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double ObtenerCosto() {
        double costo = 0.10; // Precio del condimento
                
        return costo;
    }

    @Override
    public String ObtenerDescripcion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
