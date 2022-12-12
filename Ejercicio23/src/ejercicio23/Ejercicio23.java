/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio23;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] num = new int[10];
        int cont3 = 1;
        int cont4 = 1;

        for (int x = 0; x < 10; x++) {
            System.out.println("Escriba el número " + (x + 1));
            num[x] = leer.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            if (num[i] > num[cont3]) {
                cont3++;
            }
            if (num[i] < num[cont4]) {
                cont4++;
            }
        }

        if (cont3 == 10) { 
            System.out.println("Los números están ordenados en forma decreciente.");
        }
        if (cont4 == 10) {
            System.out.println("Los números están ordenados en forma creciente.");
        }

        if (cont3 != 10 && cont4 != 10) {
            System.out.println("Los números están desordenados.");
        }
    }

}
