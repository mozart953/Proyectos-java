/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio29;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int num=6;
        int contador=0;
        int cociente=0;
        
        
        System.out.println("Los números perfectos del uno al mil son: ");
        do{
            for(int x=1;x<num;x++){
                   cociente = num % x;
                   if (cociente==0){
                       contador = contador+x;
                   }
                   
                    
             }
            
            if (num==contador){
                    System.out.println(num);
                    contador=0;
            }
            num++;
            contador=0;
        }while(num<1000);
}
                     
            
}
        
  
    

