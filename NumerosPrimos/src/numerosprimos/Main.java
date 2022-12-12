/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;

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
        int num;
        System.out.println("Escriba el número");
        num = leer.nextInt();
        int a = 0;

        for (int x1 = 1; x1 <= num; x1++) {
            if (num % x1 == 0) {

                a = a + 1;
            }
        }

        if (a == 2) {
            System.out.println("El número es primo ");
        } else {
            System.out.println("El número no es primo");
        }

    }

}
