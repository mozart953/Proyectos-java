/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num;
        System.out.println("Escriba un número entero entre 0 y 10");
        num = leer.nextInt();
        
        while (num<0){
            System.out.println("Escriba un número entero entre 0 y 10");
            num = leer.nextInt();
        
        }
        while(num>10){
            System.out.println("Escriba un número entero entre 0 y 10");
            num = leer.nextInt();           
        }
        
        if (num==0){
            System.out.println("cero");
        }
        if (num==1){
            System.out.println("uno");
        }
        if(num==2){
            System.out.println("dos");
        }
        if(num==3){
            System.out.println("tres");
        }
        if(num==4){
            System.out.println("cuatro");
        }
        if(num==5){
            System.out.println("cinco");
        }
        if(num==6){
            System.out.println("seis");
        }
        if(num==7){
            System.out.println("siete");
        }
        if(num==8){
            System.out.println("ocho");
        }
        if(num==9){
            System.out.println("nueve");
        }
        if(num==10){
            System.out.println("diez");
        }
        
        
        
    }
    
}
