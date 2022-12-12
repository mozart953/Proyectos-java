/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num1=1;
        int num2=1;
        int num3=1;
        int num4=1;
        int num5=1;
        
        for (int x=1; x<=5;x++){
            System.out.println("Escriba el número "+ x);
            if (x==1){
            num1 = leer.nextInt();
            }
            
            if (x==2){
            num2 = leer.nextInt();
            }
            
            if (x==3){
            num3 = leer.nextInt();
            }
            
            if (x==4){
            num4 = leer.nextInt();
            }
            
            if (x==5){
            num5 = leer.nextInt();
            }
        
        }
        
        if (num1 % 3 == 0){
            System.out.println(num1 + " es multiplo de 3." );
        }
        if (num2 % 3 == 0){
            System.out.println(num2 + " es multiplo de 3." );
        }
        if (num3 % 3 == 0){
            System.out.println(num3 + " es multiplo de 3." );
        }
        if (num4 % 3 == 0){
            System.out.println(num4 + " es multiplo de 3." );
        }
        if (num5 % 3 == 0){
            System.out.println(num5 + " es multiplo de 3." );
        }
        
    }
    
}
