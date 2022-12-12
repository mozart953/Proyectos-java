/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int contador = 0;
        double num=1;
        
        do{
            System.out.println("Escriba un número");
            num = leer.nextDouble();
            contador++;
        }while(num>0);
        
        System.out.println("La cantidad de números digitados es: " + (contador-1));
    }
    
}
