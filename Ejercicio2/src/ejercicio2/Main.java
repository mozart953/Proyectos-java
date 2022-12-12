/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

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
        double num1;
        double num2;
        int resultado;
        double rstu;
        int H = 1;
        String signo;

        System.out.println("Ingrese el primero número");
        num1 = leer.nextDouble();
        System.out.println("Igrese el cualquiera de los siguientes signos aritmético: +, -, *,/,^,%");
        signo = leer.next();
        System.out.println("Ingrese el segundo número");
        num2 = leer.nextFloat();

        if ("+".equals(signo)) {
            resultado = (int) (num1 + num2);
            System.out.println("El resultado es: " + resultado);
        }
        if ("-".equals(signo)) {
            resultado = (int) (num1 - num2);
            System.out.println("El resultado es: " + resultado);
        }
        if ("*".equals(signo)) {
            resultado = (int) (num1 * num2);
            System.out.println("El resultado es: " + resultado);
        }

        if ("/".equals(signo)) {

            if (num2 == 0) {
                System.out.println("El resultado es: Indefinido ");

            } else {
                rstu = (num1 / num2);
                System.out.println("El resultado es: " + rstu);
            }

        }

        if ("^".equals(signo)) {
            for (int i = 1; i <= num2; i++) {
                H = (int) (H * num1);

            }

            System.out.println("El resultado es: " + H);
        }

        if ("%".equals(signo)) {
            resultado = (int) (num1 % num2);
            System.out.println("El resultado es: " + resultado);
        }
        

    }

}
