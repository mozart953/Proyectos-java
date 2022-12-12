/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int [] x = new int [5];
        int al = 4; 
       
        
       for (int i =0 ;i<=4;i++){
            System.out.println("Ingrese el número " + (i+1)  );
            x [i]= leer.nextInt();
        } 
       
       System.out.println("Su orden inverso es: ");
       do{
           
           System.out.println(x[al]);
           al--;
       }while(al >=0);
        
    }
    
}
