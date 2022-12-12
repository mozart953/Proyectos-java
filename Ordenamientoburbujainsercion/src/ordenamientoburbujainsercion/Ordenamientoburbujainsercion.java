/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientoburbujainsercion;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class Ordenamientoburbujainsercion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int arglo[]= new int[5];
        int argl[]= new int[5];
        int dc=0, aux1,ps,ux2;
        String acu1=" ";
        //primer arreglo
        arglo[0]=4;
        arglo[1]=2;
        arglo[2]=3;
        arglo[3]=5;
        arglo[4]=1;
        //segundo arreglo
        argl[0]=4;
        argl[1]=2;
        argl[2]=3;
        argl[3]=6;
        argl[4]=1;
        
        
        do{
            System.out.println("1. Ordenamiento por burbuja \n"
                             + "2. Ordenamiento por inserción\n"
                             + "3. Salir");
            dc=leer.nextInt();
            switch(dc){
                case 1:
                    for(int x=0;x<arglo.length-1;x++){
                        for(int y=0;y<arglo.length-1;y++){
                            if(arglo[y]>arglo[y+1]){
                                aux1=arglo[y];
                                arglo[y]=arglo[y+1];
                                arglo[y+1]=aux1;
                            }
                        }
                    
                    }
                    for(int r=0;r<arglo.length;r++){
                        acu1 +=arglo[r]+" ";
                    }
                    System.out.println("Salida: "+ acu1);
                    acu1 = " ";
                    break;
                case 2:
                    
                    for(int m=0;m<argl.length;m++){
                        ps= m;
                        ux2=argl[m];
                        while((ps>0) && (argl[ps-1])>ux2){
                            argl[ps] = argl[ps-1];
                            ps--;
                        }
                        argl[ps]=ux2; 
                    
                    }
                    
                    for(int r=0;r<argl.length;r++){
                        acu1 +=argl[r]+" ";
                    }
                    System.out.println("Salida: "+ acu1);
                    acu1 =" ";
                    
                    break;
            }
            
            
        }while(dc!=3);
        
        
        
        
        
    }
    
}
