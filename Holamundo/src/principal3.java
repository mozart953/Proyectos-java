
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wilson Pop
 */
public class principal3 {
    public static void main (String [] args){
    Scanner leer =new Scanner (System.in); 
    
    int k1;
    int k2;
    int k3;
    
    System.out.println ("Escriba el primer número");
    k1= leer.nextInt(); 
    
    System.out.println ("Escriba el segundo número");
    k2= leer.nextInt();
    
    System.out.println("Escriba el tercer número");
    k3=leer.nextInt();
    
    if (k1>k2){
            if (k1>k3){
            System.out.println("El mayor es: " + k1 );
            }
            else{
                System.out.println("El mayor es: " + k3);
        
             }
    }
    
    else {
        if (k2>k3){
            System.out.println("El mayor es: " + k2);
        }  
        else{
             System.out.println("El mayor es: " + k3);       
                }
    
    }
    
    if (k1<k2) {
            if (k1<k3){
                System.out.println("El menor es: " + k1);
                }
            else {
                
                System.out.println("El menor es: " + k3);
            }
            }
    else{
            if (k2<k3){
            System.out.println("El menor es: " + k2);
            }
            else {
            System.out.println("El menor es: " + k3);
            }
        }    
  }
}