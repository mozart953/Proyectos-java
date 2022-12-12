/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio24;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double[][] num = new double[10][1];
        
        System.out.println("Escriba los números de menor a mayor.");
        
        for (int x = 0; x < 5; x++) {
            System.out.println("Escriba el número " + (x+1));
            num[(2*x)+1][0] = leer.nextDouble();
        }
        System.out.println("La tabla de los números ingresados es: ");
        
        for(int y=0;y<10;y++){
            System.out.print("["+num[y][0]+"]");
        }
        
        System.out.println("\n------------------------------------------");
       
        
    }

}
