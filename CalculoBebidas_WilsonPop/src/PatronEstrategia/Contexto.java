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
public class Contexto {
    StrategyAsignarPrecio asignar;

    public Contexto(StrategyAsignarPrecio asignar) {
        this.asignar = asignar;
    }
    
    public void setStrategy(StrategyAsignarPrecio asignar){
        this.asignar = asignar;
    } 
    
    public double Strategy(){
        return asignar.AsignarPrecio();
    }
    
    
}
