/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menormayornnumeros;

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
        int may = 0;
        int men = 100;
        int n1;
        System.out.println("Escriba la cantidad de números que desea comparar");
        n1 = leer.nextInt();
        for (int x = 1; x <= n1; x++) {
            System.out.println("Ingrese el número " + x);
            int n2;
            n2 = leer.nextInt();

            if (n2 > may) {
                may = n2;
            }
            if (n2 < men) {
                men = n2;
            }
        }
        System.out.println("El mayor es: " + may);
        System.out.println("El menor es: " + men);

    }

}
