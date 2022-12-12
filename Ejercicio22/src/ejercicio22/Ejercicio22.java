/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio22;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] num = new int[10];
        int num1 = 0;
        int num2 = 9;

        for (int x = 0; x < 10; x++) {

            System.out.println("Escriba el número " + (x + 1));
            num[x] = leer.nextInt();
        }

        System.out.println("Su nuevo orden es: ");

        do {
            System.out.println(num[num1]);
            System.out.println(num[num2]);
            num1++;
            num2--;
        } while (num1 <= 4);

    }

}
