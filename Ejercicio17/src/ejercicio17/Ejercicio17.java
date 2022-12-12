/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        int cod1;
        int cod2;
        int cod3;
        int cod4;
        int cod5;
        double i1;
        double i2;
        double i3;
        double i4;
        double i5;
        double pr1;
        double pr2;
        double pr3;
        double pr4;
        double pr5;
        int contador=0;
        double tot1;
        double tot2;
        double tot3;
        double tot4;
        double tot5;
        double tot6;
        double tot7;
        System.out.println("Escriba el código del primer artículo de la factura 1");
        cod1 = leer.nextInt();
        System.out.println("Escriba la cantidad vendida en litros");
        i1 = leer.nextDouble();
        System.out.println("Escriba el precio por litro");
        pr1 = leer.nextDouble();
        
        System.out.println("Escriba el código del segundo artículo de la factura 2");
        cod2 = leer.nextInt();
        System.out.println("Escriba la cantidad vendida en litros");
        i2 = leer.nextDouble();
        System.out.println("Escriba el precio por litro");
        pr2 = leer.nextDouble();
        
        System.out.println("Escriba el código del primer artículo de la factura 3");
        cod3 = leer.nextInt();
        System.out.println("Escriba la cantidad vendida en litros");
        i3 = leer.nextDouble();
        System.out.println("Escriba el precio por litro");
        pr3 = leer.nextDouble();
        
        System.out.println("Escriba el código del segundo artículo de la factura 4");
        cod4 = leer.nextInt();
        System.out.println("Escriba la cantidad vendida en litros");
        i4 = leer.nextDouble();
        System.out.println("Escriba el precio por litro");
        pr4 = leer.nextDouble();
        
        System.out.println("Escriba el código del segundo artículo de la factura 5");
        cod5 = leer.nextInt();
        System.out.println("Escriba la cantidad vendida en litros");
        i5 = leer.nextDouble();
        System.out.println("Escriba el precio por litro");
        pr5 = leer.nextDouble();
    
        
        tot1 = i1 * pr1;
        tot2 = i2 * pr2;
        tot3 = i3 * pr3;
        tot4 = i4 * pr4;
        tot5 = i5 * pr5;
        tot6 = i1 + i2+ i3 + i4 + i5;
        tot7 = tot1 + tot2 + tot3 + tot4 + tot5;
        
        if (tot1>600){
        contador ++;
        
        }
        if (tot2>600){
        contador ++;
        
        }
        if (tot3>600){
        contador ++;
        
        }
        if (tot4>600){
        contador ++;
        
        }
        if (tot5>600){
        contador ++;
        
        }
        
        
        
        System.out.println("La facturación total es de : Q " + tot7);
        System.out.println("La cantitdad en litros vendida del primer artículo es: " + tot6);
        System.out.println("La cantidad de facturas que se emitieron con más de Q 600.00 es: " + contador);
        
    }
      
    
}
