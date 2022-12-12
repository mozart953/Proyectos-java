/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num1;
        System.out.println("Escriba un número comprendido entre cero y diez al cual"
                + " desea conocer su tabla de multiplicar.");
        
        num1 = leer.nextInt();
        while (num1<0){
            System.out.println("Escriba un número comprendido entre cero y diez al cual"
                + " desea conocer su tabla de multiplicar.");
            num1 = leer.nextInt();
        }
        while (num1>10){
            System.out.println("Escriba un número comprendido entre cero y diez al cual"
                + " desea conocer su tabla de multiplicar.");
            num1 = leer.nextInt();
        }
        
        
        tablamul(num1);
        
        
    }
    
    public static void tablamul (int num){
        
        for (int x=1; x<=10;x++){
        
                System.out.println(num + "*" + x + "=" + (num*x));
            
        }
        
    
    }
    
    
    
}
