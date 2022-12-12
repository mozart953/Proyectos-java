/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador1=0;
        int contador2=0;
        int edad1;
        int edad2;
        int edad3;
        int edad4;
        int edad5;
        double est1;
        double est2;
        double est3;
        double est4;
        double est5;
        double estm;
        double edadm;
        System.out.println("Escriba la edad del primer alumno");
        edad1 = leer.nextInt();
        if (edad1 > 18) {
            contador1++;
        }
        System.out.println("Escriba la estatura del segundo alumno");
        est1 = leer.nextDouble();
        if (est1>1.75){
            contador2 ++;
        }
        
        System.out.println("Escriba la edad del segundo alumno");
        edad2 = leer.nextInt();
        if (edad2 > 18) {
            contador1++;
        }
        System.out.println("Escriba la estatura del segundo alumno");
        est2 = leer.nextDouble();
        if (est2>1.75){
            contador2 ++;
        }
        
        System.out.println("Escriba la edad del tercer alumno");
        edad3 = leer.nextInt();
        if (edad3 > 18) {
            contador1++;
        }
        System.out.println("Escriba la estatura del tercer alumno");
        est3 = leer.nextDouble();
        if (est3>1.75){
            contador2 ++;
        }
        System.out.println("Escriba la edad del cuarto alumno");
        edad4 = leer.nextInt();
        if (edad4 > 18) {
            contador1++;
        }
        System.out.println("Escriba la estatura del cuarto alumno");
        est4 = leer.nextDouble();
        if (est4>1.75){
            contador2 ++;
        }
        System.out.println("Escriba la edad del quinto alumno");
        edad5 = leer.nextInt();
        if (edad5 > 18) {
            contador1++;
        }
        System.out.println("Escriba la estatura del quinto alumno");
        est5 = leer.nextDouble();
        if (est5>1.75){
            contador2 ++;
        }
        edadm = (edad1 + edad2 + edad3 + edad4 + edad5)/5;
        estm = (est1 + est2 + est3 + est4 + est5)/5;
        System.out.println("La edad media es igual a: " + edadm);
        System.out.println("La estatura media es igual a: " + estm);
        System.out.println("La cantidad de alumnos mayores a 18 años es: " + contador1);
        System.out.println("La cantidad de alumnos con altura mayor a 1.75 es: " +contador2);
        
    }

}
