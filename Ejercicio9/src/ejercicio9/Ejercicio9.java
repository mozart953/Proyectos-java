/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int num=1;
        
        do {
        
            System.out.println("Digite un número entero");
            num = leer.nextInt();
            if(num % 2 == 0){
                System.out.println("El número es par");
            }else{System.out.println("El número es impar");}
                    
        }while(num != 0);
    }
    
}
