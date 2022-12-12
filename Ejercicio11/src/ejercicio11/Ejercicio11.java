/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        double num; 
        double num2=0;
        
        do {
            System.out.println("Digite un número, si desea ver la suma de todos los que introdujo"
                    + " digite un 0.");
            num = leer.nextDouble();
            num2 = num2+num;
        }while(num !=0);
         System.out.println("La suma de los números introducidos es: " + num2);
        
        
    }
    
}
