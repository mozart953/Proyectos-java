/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int contador = 0;
        int cont = 0;
        int ct = 2;

        System.out.println("Escriba un número entero positivo para saber cuantos números primos existen"
                + " entre el mismo y 1");
        num = leer.nextInt();

        do {

            for (int x = 1; x <= ct; x++) {
                if (ct % x == 0) {
                    contador = contador + 1;
                }

            }

            if (contador == 2) {
                cont++;
            }
            contador = 0;
            ct++;

        } while (ct <= num);

        cont = cont + 1;

        System.out.println("Entre " + num + " y 1 hay " + cont + " números primos contando al 1 y al número ingresado si"
                + " es primo.");

    }

}
