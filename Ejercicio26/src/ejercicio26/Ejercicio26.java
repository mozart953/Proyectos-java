/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio26;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in); 
        double n=0;
        double [] sct = new double [3];
        System.out.println("Escriba el ángulo al que le desea calcular el seno, coseno y tangente.");
        n = leer.nextInt();
        double rade = Math.toRadians(n);
        sct [0] = Math.cos(rade);
        sct [1] = Math.sin(rade);
        sct [2] = Math.tan(rade);
        System.out.println("Su coseno es: " + (sct[0]));
        System.out.println("Su seno es: " + (sct[1]));
        System.out.println("Su tangente es: " + (sct [2]) );
        
        
    }
    
}
