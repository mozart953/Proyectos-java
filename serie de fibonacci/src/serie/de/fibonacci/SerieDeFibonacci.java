/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie.de.fibonacci;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class SerieDeFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1;
        int a = 0;
        int b = 1;
        System.out.println("Escriba la cantindad de números que desea ver de la serie de fibonacci");
        n1 = leer.nextInt();

        for (int x = 1; x <= n1; x++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;

        }

    }

}
