/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronEstrategia;

/**
 *
 * @author Wilson Pop
 */
public class StrategyLecheEntera implements StrategyAsignarPrecio{

    @Override
    public double AsignarPrecio() {
        double precio = 0.10;
        return precio;
    }
    
}
