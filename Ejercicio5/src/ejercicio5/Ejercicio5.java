/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int year =0;
        int ac= 0;
        int day = 0;
        int month =0;
        int mo=0;
        int century=0;
        int dif = 0;
        System.out.println("Escriba el día");
        day = leer.nextInt(); 
        System.out.println("Escriba los últimos dos dígitos del año");
        year = leer.nextInt(); 
        System.out.println("Escriba el año completo");
        ac = leer.nextInt();
        System.out.println("Escriba el mes");
        month = leer.nextInt();
        dif = ac-year;
        
        if (month==1){
         month = 0;
        }
        if(month==2){
         month =3;
        }
        if(month==3){
         month =3;
        }
        if(month==4){
         month =6;
        }
        if(month==5){
         month =1;
        }
        if(month==6){
         month =4;
        }
        if(month==7){
         month =6;
        }
        if(month==8){
         month =2;
        }
        if(month==9){
         month =5;
        }
        if(month==10){
         month =0;
        }
        if(month==11){
         month =3;
        }
        if(month==12){
         month =5;
        }
        
        if (dif==2000){
        dif = 6;
        }
        if (dif==1900){
        dif = 0;
        }
        if (dif==1800){
        dif = 2;
        }
        if (dif==1700){
        dif = 4;
        }
        if (dif==1600){
        dif = 6;
        }
        
        
        
        
        
        
        
        
    }
    
}
