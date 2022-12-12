/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio28;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        double cel;
        double kel;
        System.out.print("Escriba los grados en celcius: ");
        cel = leer.nextDouble();
        kel = cel + 273.15; 
        System.out.println("°"+cel+ "c"+ " en kelvins es: " + kel );
        
        
        
    }
    
    
    
    
}
