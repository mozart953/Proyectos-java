
package Ventana;

import javax.swing.JFrame;

/**
 *
 * @author Wilson Pop
 */
public class Ventana extends JFrame {
    
    public Ventana(){
    
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("TITULO");
        //setLocation(WIDTH, WIDTH); sirve para indicar en que posición se quiere la ventana
        //setBounds(WIDTH, WIDTH, WIDTH, HEIGHT); combina el setlocation y setSize
        setLocationRelativeTo(null);
    }
    
}
