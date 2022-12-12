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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int div; 
        int con;
        int res; 
        
        div = 10;
        con = 0; 
        
        
        int num;
        System.out.println("Escriba un número");
        num = leer.nextInt();
        do {
        res = num/div;
        con ++;
        div = div*10;
        } while(res>=1);
        
        System.out.println("La cantidad de cifras es: "+ con);
        
        
                
        
    }
    
}
