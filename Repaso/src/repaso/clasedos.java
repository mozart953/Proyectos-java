/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class clasedos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num;
        System.out.println("Escriba un número");
        num = leer.nextDouble();
        String numero= Integer.toString((int) num);
        System.out.println("El número de cifras del valor es: " + numero.length() );
    
        int num2; 
        System.out.println("Ingrese el número al que le desea calcular el factorial");
        num2= leer.nextInt();
        int ini=0;
        int a = 1;
        int c= 1;
        
        do {
            a= a*(ini+c);
            ini++;
        }while (ini < num2);
        
        System.out.println("El factorial es: " + a);
        
        
                
    
    
    }
}
