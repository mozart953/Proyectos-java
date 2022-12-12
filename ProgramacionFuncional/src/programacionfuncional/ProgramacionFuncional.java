/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionfuncional;

/**
 *
 * @author Wilson Pop
 */
public class ProgramacionFuncional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Operacion operacion = (double a, double b) -> {return (a+b)/2;}; // aplicando funcion lamda
         //Operacion operacion = (double a, double b) -> (a+b)/2; //lo mismo pero mas barato xd
        
        System.out.println(operacion.CalcularPromedio(5, 6));
        
        
        
    }
    
}
