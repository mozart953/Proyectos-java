/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detodito;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wilson Pop
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String nombre; 
        nombre = JOptionPane.showInputDialog(null,"Introuduce tu nombre" );
        JOptionPane.showMessageDialog(null, "Hola "+ nombre);
        
        Manzana objman = new Manzana();
        
        objman.Creamanzana("roja", "mediano", "ácido");
        System.out.println("Color "+ objman.getColor());
        System.out.println("Tamaño " + objman.getTamaño());
        System.out.println("Sabor " + objman.getSabor());
    }
    
}
