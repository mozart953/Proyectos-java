/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warbolmdc;

import logica_programa.Arbol;

/**
 *
 * @author Wilson Pop
 */
public class Control {

    private Dibujo objdibujo; 
    private Arbol objArbol; 

    public Control(Dibujo objdibujo, Arbol objArbol) {
        this.objdibujo = objdibujo;
        this.objArbol = objArbol;
    }
    
    public void iniciar() {
        objdibujo.setObjarbol(objArbol);
    }
    
}
