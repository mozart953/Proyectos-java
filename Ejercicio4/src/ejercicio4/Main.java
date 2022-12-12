/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

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
        int dia, mes, año;

        System.out.println("Escriba un día");
        dia = leer.nextInt();
        System.out.println("Escriba un mes");
        mes = leer.nextInt();
        System.out.println("Escriba un año");
        año = leer.nextInt();

        if ((dia >= 1) && (dia <= 30)) {

            if ((mes >= 1) && (mes <= 12)) {
                if (año != 0) {
                    System.out.println("La fecha es correcta");
                } else {
                    System.out.println("La fecha es incorrecta porque el año es incorrecto");
                }
                
            } else {
                System.out.println("La fecha es incorrecta, porque el mes es incorrecto");
            }

        } else {
            System.out.println("La fecha es incorrecta, porque el día es incorrecto");
        }

    }

}
