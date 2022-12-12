/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class principal6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int dia1, dia2;
        int mes1, mes2;
        int an1, an2;

        int difa;
        int difd;
        int difm;
        int dt;
        
        System.out.println("Escriba el día de la primera fecha");
        dia1 = leer.nextInt();
        
        System.out.println("Escriba el mes de la primera fecha");
        mes1 = leer.nextInt();
        
        
        System.out.println("Escriba el año de la primera fecha");
        an1 = leer.nextInt();
        System.out.println("--------------------------------------");
        
        System.out.println("Escriba el día de la segunda fecha");
        dia2 = leer.nextInt();
        
        System.out.println("Escriba el mes de la segunda fecha");
        mes2 = leer.nextInt();
        System.out.println("Escriba el año de la seguda fecha");
        an2 = leer.nextInt();

        if (an1 > an2) {
            difa = ((an1 - an2) * 360);
            difd = dia1 - dia2;
            difm = ((mes1 - mes2) * 30);
            dt = difa + difd + difm;
            System.out.println("La diferencia de días es: " + dt);
        }
        if (an1 < an2) {
            difa = ((an2 - an1) * 360);
            difd = (dia2 - dia1);
            difm = ((mes2 - mes1) * 30);
            dt = difa + difd + difm;
            System.out.println("La diferencia de días es: " + dt);
        }
        if (an1 == an2) {
            if (mes1 > mes2) {
                difm = ((mes1 - mes2) * 30);
                difd = (dia1 - dia2);
                dt = difm + difd;
                System.out.println("La diferencia de días es: " + dt);
            }
            if (mes1 < mes2) {
                difm = ((mes2 - mes1) * 30);
                difd = (dia2 - dia1);
                dt = difm + difd;
                System.out.println("La diferencia de días es: " + dt);
            }
            if (mes1 == mes2) {
                if (dia1 > dia2) {
                    difd = dia1 - dia2;
                    System.out.println("La diferencia de días es: " + difd);
                }
                if (dia1 < dia2) {
                    difd = dia2 - dia1;
                    System.out.println("La diferencia de día es: " + difd);
                }
                if (dia1 == dia2) {
                    System.out.println("La diferencia de días es: 0");
                }
            }

        }

    }

}
