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
public class StrategyCafeDescafeinado implements StrategyAsignarPrecio{

    @Override
    public double AsignarPrecio() {
        double precio = 1.05;
        return precio;
    }
    
}