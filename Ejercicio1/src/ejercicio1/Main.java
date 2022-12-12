/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

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
        double numero;
        int decimales = 0;
        int entero;

        System.out.println("Escriba un número entre 0 y 9.999");
        numero = leer.nextDouble();

        while (numero > 9.999) {
            System.out.println("Escriba un número entre 0 y 9.999");
            numero = leer.nextDouble();
        }

        while (numero < 0) {
            System.out.println("Escriba un número entre 0 y 9.999");
            numero = leer.nextDouble();
        }

        entero = (int) numero;

        String partera = Integer.toString((int) numero);

        while (numero > entero) {
            numero = numero * 10;
            decimales++;
            entero = (int) numero;

        }

        System.out.println("El numero tiene " + (decimales + partera.length()) + " cifras");

    }

}
