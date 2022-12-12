/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num; 
        int r;
        System.out.println("Escriba un número entre 0 y 9999");
        num = leer.nextInt();
        
        while (num>9999){
            System.out.println("Escriba un número entre 0 y 9999");
            num = leer.nextInt();
        }
        while (num<0){
            System.out.println("Escriba un número entre 0 y 9999");
            num = leer.nextInt();
        }
        
        while (num != 0){
            r= num % 10;
            System.out.print(r);
            num = num/10;
            
        }
        System.out.println(" ");
        
        
    }

}
