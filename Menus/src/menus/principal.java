/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int op = -1;
        Scanner leer = new Scanner(System.in);
        
        do{
            menu();
            op = leer.nextInt();
            switch(op){
                case 1:
                    System.out.println("Decimal a Binario");
                    System.out.println("Ingrese el número: ");
                    int num1 = leer.nextInt();
                    System.out.println(decAbin(num1));
                    break;
                case 2:
                    System.out.println("Opción 2");
                    break;
                default:
                    break;
            }
        }while(op != 0);
    }
    
     public static void menu(){
        System.out.println("--MENU--");
        System.out.println("1) Decimal a Binario");
        System.out.println("2) Binario a Decimal");
        System.out.println("3) Decimal a Hexadecimal");
        System.out.println("4) Hexadecimal a Decimal");
        System.out.println("5) Binario a Hexadecimal");
        System.out.println("6) Hexadecimal a Binario");
        System.out.println("7) Decimal a Octal");
        System.out.println("8) Octal a Decimal");
        System.out.println("0) Salir");
    }
    
    public static String decAbin(int num1){
        String binario = "";
        int cociente = num1;
        for (int x=1;x<=8;x++){
            num1 = num1 /2;
            int residuo = cociente % 2;
            cociente = num1;
            binario = residuo + binario;
        }
        return binario;
    }
    
}
