/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esarbolbinario;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class Esarbolbinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int op=0, dt;
      
        String nombre;
        
        Arbol arb = new Arbol();
        do{
            try{
                System.out.println("1. Agregar nodo " +"\n2.Recorrido en preorden" +"\n3.Salir");
                op = leer.nextInt();
                switch(op){
                    case 1: 
                        System.out.println("Ingresar nodo");
                        dt = leer.nextInt();
                        System.out.println("Ingresar nombre al nodo");
                        nombre = leer.next();
                        arb.agregarNodo(dt, nombre);
                        break;
                    case 2:
                        if(!arb.Vacio()){
                            arb.Imprimir(arb.raiz);
                        }else{
                            System.out.println("Árbol vacio");
                        }
                        
                        break;
                    case 3:
                        System.out.println("Programa finalizado");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }
                
                
            }catch(NumberFormatException n){
                System.out.println("Error " + n.getMessage());
            }
        }while(op!=3);
    }
    
}
