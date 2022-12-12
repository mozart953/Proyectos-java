/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotokens;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class Ejerciciotokens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String entrada = "";
        String acumulador2 = "";
        String acumulador3 = "";
        String acumulador4 = "";
        String acumulador5 ="";
        String acumulador6 = ""; //no debo borrarlo
        int num4 = 0;
        int num = 0;
        int num2 = 1;

        System.out.println("Escriba la palabra a separar");
        entrada = leer.nextLine();
        
        for(int nb=0;nb<entrada.length()-1;nb++){
            if(entrada.charAt(nb)!=' ' && entrada.charAt(nb+1)==' '){
                acumulador6+=entrada.charAt(nb)+" ";
            }
            else if(entrada.charAt(nb)!=' ' && entrada.charAt(nb+1)!=' '){
                acumulador6+=entrada.charAt(nb);
            }
        }
        
        if(entrada.charAt(entrada.length()-1)!=' '){
            acumulador6+=entrada.charAt(entrada.length()-1);
        }
        

        for (int a = 0; a < entrada.length(); a++) {
            if (entrada.charAt(a) != ' ') {
                acumulador2 += entrada.charAt(a);
            } else {
                num4++;
            }

        }
         //String acum[] = new String[num4];
        
        /*for (int ab = 0; ab < num4; ab++) {
            acum1 += " ";
            acum[ab] = acum1;

        }*/

        /*for (int bin = 0; bin < acumulador2.length(); bin++) {
            if (acumulador2.charAt(bin) != '"') {
                acumulador5 += acumulador2.charAt(bin);
            }

        }*/
        

        if (acumulador2.charAt(0) != '"' && acumulador2.charAt(acumulador2.length()-1) != '"') {

            for (int enu = 0; enu <acumulador6.length(); enu++) {
                if (acumulador6.charAt(enu) != '"') {
                    acumulador3 += acumulador6.charAt(enu);
                }

            }

            String[] acumulador = acumulador3.split(" ");

            for (String token : acumulador) {
                num++;
            }

            for (int i = 0; i < num; i++) {

                if (acumulador[i] != " ") {
                    System.out.println("token no." + num2 + ": " + acumulador[i]);
                    num2++;
                }

            }

        } else {
            for(int alf=0;alf<acumulador6.length();alf++){
                if(acumulador6.charAt(alf)!='"'){
                    acumulador4+=acumulador6.charAt(alf);
                }
            }
            
            for(int r2d=1;r2d<acumulador4.length();r2d++){
               acumulador5+=acumulador4.charAt(r2d);
            }
                        
            System.out.println(acumulador5);
        }

    }

}
