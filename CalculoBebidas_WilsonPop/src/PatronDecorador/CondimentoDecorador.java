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
public abstract class CondimentoDecorador implements Bebida {
    
    private Bebida bebida;

    public CondimentoDecorador(Bebida bebida) {
        this.bebida = bebida;
    }
    
    protected Bebida getBebida(){
        return bebida;
    }
}
