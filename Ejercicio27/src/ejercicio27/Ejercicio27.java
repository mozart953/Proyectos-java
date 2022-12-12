/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio27;

import java.util.Scanner;

/**
 *
 * @author david_000
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] nombre = new String[10];
        double[] dctc = new double[10];
        double[] dctq = new double[10];
        double[] dcts = new double[10];
        int[] cont1 = new int[10];
        int[] nodorsal = new int[10];
        nombre[0] = "spectopatronus";
        dctc[0] = -100;
        double aux = 0; 
        double aux1 =0;
        String aux2 = "";
        double aux3 = 0;
        int aux4=0;
        int contador = 0;

        int op = 0;

        do {
            System.out.println("1. Inscribir un participante.");
            System.out.println("2. Mostrar listado de datos.");
            System.out.println("3. Mostrar listado por marcas.");
            System.out.println("4. Finalizar el programa");
            op = leer.nextInt();
            switch (op) {

                case 1:

                    if (contador < 10) {
                        System.out.println("Escriba el nombre");
                        nombre[contador] = leer.next();
                        System.out.println("Escriba la mejor marca del 2014");
                        dctc[contador] = leer.nextDouble();
                        System.out.println("Escriba la mejor marca del 2015");
                        dctq[contador] = leer.nextDouble();
                        System.out.println("Escriba la mejor marca del 2016");
                        dcts[contador] = leer.nextDouble();
                       
                        contador++;
                        
                    } else {
                        System.out.println("Los cupos están llenos");
                    }

                    break;

                case 2:
                    if (dctc[0] == -100) {
                        System.out.println("No hay participantes insritos, debe elegir la primera opción"
                                + " para inscribir un participante...");
                    } else {
                        for (int x = 0; x < contador; x++) {
                            nodorsal[x] = x + 1;
                            System.out.println("\n--------------------------------------------");
                            System.out.println("No. de dorsal: " + nodorsal[x]);
                            System.out.println("Nombre: " + nombre[x]);
                            System.out.println("Mejor marca del 2014: " + dctc[x]);
                            System.out.println("Mejor marca del 2015: " + dctq[x]);
                            System.out.println("Mejor marca del 2016: " + dcts[x]);
                            System.out.println("--------------------------------------------");
                        }
                    }

                    break;
                case 3:
                    if (dctc[0] == -100) {
                        System.out.println("No hay participantes insritos, debe elegir la primera opción"
                                + " para inscribir un participante...");
                    } else {

                        for (int i = 0; i < (contador-1); i++) {
                            for (int r = 0; r < (contador-1); r++) {
                                
                                if(dctc[r]>dctc[r+1]){
                                    aux=dctc[r];
                                    aux1=dctq[r];
                                    aux2= nombre [r];
                                    aux3= dcts[r];
                                    aux4 = nodorsal[r];
                                    
                                    dctc[r]=dctc[r+1];
                                    dctq[r]=dctq[r+1];
                                    nombre[r]=nombre[r+1];
                                    dcts[r]=dcts[r+1];
                                    nodorsal[r]=nodorsal[r+1];
                                    
                                    dctc[r+1]=aux;
                                    dctq[r+1]=aux1;
                                    nombre[r+1]=aux2;
                                    dcts[r+1]=aux3;
                                    nodorsal[r+1]=aux4;
                                }
                                
                                
                            }

                        }
                        
                        
                        for(int h=contador-1;h>=0;h--){
                            
                            System.out.println("\n--------------------------------------------");
                            
                            System.out.println("Nombre: " + nombre[h]);
                            System.out.println("------------------------------------");
                            System.out.println("Mejor marca del 2014: " + dctc[h]);
                            System.out.println("------------------------------------");
                            System.out.println("Mejor marca del 2015: " + dctq[h]);
                            System.out.println("Mejor marca del 2016: " + dcts[h]);
                            System.out.println("--------------------------------------------"); 
                        }

                    }

                    break;
            }

        } while (op != 4);
    }

}
