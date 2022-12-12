/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package separadortokens;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class Separadortokens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         String palabra="";
        char letra;
        char []array;
        int contador=0;
        
        
        System.out.println("Ingrese una expresion");
        palabra = leer.nextLine();
        
        
        
        for(int i=0; i<palabra.length(); i++)
        {
            if ((palabra.charAt(i)=='a') || (palabra.charAt(i)=='b') || (palabra.charAt(i)=='c') || (palabra.charAt(i)=='d') 
                    || (palabra.charAt(i)=='e')|| (palabra.charAt(i)=='f') || (palabra.charAt(i)=='g')
                    || (palabra.charAt(i)=='h') || (palabra.charAt(i)=='i')|| (palabra.charAt(i)=='j')
                    || (palabra.charAt(i)=='k')|| (palabra.charAt(i)=='l')|| (palabra.charAt(i)=='m')|| (palabra.charAt(i)=='n')
                    || (palabra.charAt(i)=='o')|| (palabra.charAt(i)=='p')|| (palabra.charAt(i)=='q')
                    || (palabra.charAt(i)=='r')|| (palabra.charAt(i)=='s')|| (palabra.charAt(i)=='t')
                    || (palabra.charAt(i)=='u')|| (palabra.charAt(i)=='v')|| (palabra.charAt(i)=='w')
                    || (palabra.charAt(i)=='x')|| (palabra.charAt(i)=='y')|| (palabra.charAt(i)=='z')                   
                    )
       
            System.out.println("Es un Identificador: " + palabra.charAt(i)+ " y la Posicion es : " + 
                    (String.valueOf(palabra).length()-1));
        }

        
    }
    
}
