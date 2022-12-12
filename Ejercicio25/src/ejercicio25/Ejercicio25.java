/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio25;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int [][] num = new int [10][2];
        
        System.out.println("Escriba la primera serie de 10 números en forma creciente.");
        for (int x=0;x<10;x++){
            System.out.print((x+1)+ ")");
            num[x][0] = leer.nextInt();
        }
        System.out.println("Escriba la segunda seri de 10 números en forma creciente");
        for(int y =0; y<10;y++){
            System.out.print((y+1)+ ")");
            num[y][1] = leer.nextInt();
        }
        
        System.out.println("La tabla de los números ingresados es: ");
        for (int i=0;i<=1;i++){
                
                for(int n=0;n<10;n++){
                        System.out.print("["+num[n][i]+ "]");
                }
        }
        
        System.out.println("\n");
        
    }
    
}
