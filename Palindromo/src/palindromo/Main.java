/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

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
        String palabra;

        System.out.println("Escriba la palabra");
        palabra = leer.nextLine();
        int a = 1;

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
                a = 0;
            }
        }

        if (a == 1) {
            System.out.println("La palabra es palindromo");
        } else {
            System.out.println("La palabra no es palindromo");
        }

    }

}
