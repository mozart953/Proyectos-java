/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num;
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        double tot1 = 0;
        double tot2 = 0;
        double tot3 = 0;
        double med1=0;
        double med2=0;
        for (int x = 1; x <= 10; x++) {
            System.out.println("Escriba el número " + x);
            num = leer.nextInt();
            if (num > 0) {

                tot1 = tot1 + num;
                contador1++;

            }
            
            if (num<0){
                
                tot2 = tot2 + num;
                contador2++;
            }
            
            if (num ==0){
            
                contador3++;
            }
        }
        med1 = tot1/contador1;
        med2 = tot2/contador2;
        
        if (contador1==0){
            System.out.println("No se introdujeron números positivos");
        }else{System.out.println("La media de los números positivos es: " + med1); }
        
        if (contador2==0){
            System.out.println("No se han introducido números negativos");
        }else{System.out.println("La media de los números negativos es: " + med2);}
        
        System.out.println("La cantidad de ceros es: " + contador3);
        
    }

}
