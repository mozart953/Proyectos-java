/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla_multiplicar;

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
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el número de la tabla que desee ver");
        int num;
        num = leer.nextInt();
        
        tablamul(num);
    }
    
    public static void tablamul (int n){
    
        for (int i=1; i<=10;i++){
            
            System.out.println( n*i );
        
        }
    
    }
    
}

