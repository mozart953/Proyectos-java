/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package totitowilson;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class Totitowilson {

    public int recutotito(int a) {

        if (a == 2) {
            return 0;
        } else if (a == 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Totitowilson to = new Totitowilson();
        Scanner leer = new Scanner(System.in);
        int jugador = 3;
        int posx = 0;
        int posy = 0;
        int juegom = 4;
        int ma[][]
                = {{2, 2, 2},
                {2, 2, 2},
                {2, 2, 2}
                };
        boolean interrup = true;

        System.out.println("\033[34mBIENVENIDO AL JUEGO DE TOTITO");

        do {
            System.out.print("Escriba su jugada como 1: ");
            jugador = leer.nextInt();
            System.out.println("Escriba la posicón en x: ");
            posx = leer.nextInt();
            System.out.println("Escriba la posicón en y: ");
            posy = leer.nextInt();
            ma[posx][posy] = jugador;
            if (posx <= 2) {
                if (posx == 0) {
                    if (ma[posx][posy + 1] == 2) {
                        System.out.println("La jugada de la máquinaa es: 0 " + " en la posición: " + (posx) + " , " + (posy + 1));
                        ma[posx][posy + 1] = 0;
                    }else{interrup=false;}
                    
                }else if(posx==1){
                    if (ma[posx][posy + 1] == 2) {
                        System.out.println("La jugada de la máquinaa es: 0 " + " en la posición: " + (posx) + " , " + (posy + 1));
                        ma[posx][posy + 1] = 0;
                    }else{
                        interrup=false;
                    }
                }else if(posx==2){
                    if (ma[posx][posy + 1] == 2) {
                        System.out.println("La jugada de la máquinaa es: 0 " + " en la posición: " + (posx) + " , " + (posy + 1));
                        ma[posx][posy + 1] = 0;
                    }else{
                        interrup=false;
                    }
                }else if(posy==2){
                    if (ma[posx][posy - 1] == 2) {
                        System.out.println("La jugada de la máquinaa es: 0 " + " en la posición: " + (posx) + " , " + (posy - 1));
                        ma[posx][posy - 1] = 0;
                    }else{
                        interrup=false;
                    }
                }
            } else {
                interrup = false;
            }

        } while (interrup == true);
    }

}
