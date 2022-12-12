/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;


import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        double num=0;
        double num2=0;
        double num3 =0;
        int contador =0;
        System.out.println("Digite cualquier número, si desea ver la media de los que introdujo digite un número"
                + "negativo");
        
        do {
            num = leer.nextDouble();
            if (num>0){
            num2 = num2 + num;
            contador ++;}
        }while(num>0);
        
        num3 = num2/contador;
        System.out.println("La media es: " + num3);
    }
    
}
