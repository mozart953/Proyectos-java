package JuegoTetris;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends javax.swing.JFrame{

    
    
    public Ventana(String nombre, SuperficieDeDibujo superficieDeDibujo) { // clase en donde creamos la ventana del Juego 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle(nombre);
        //this.setSize(600,600);
        this.setResizable(false);
        this.setLayout(new BorderLayout());
        this.add(superficieDeDibujo);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.blue);
        
        iniciarComponentes();
    }
        
    Ventana() {
       
    }
    
     private void iniciarComponentes(){
        JPanel panel = new JPanel(); //creacion de panel
        
        panel.setBackground(Color.ORANGE); //Establemos color del panel
        
        this.getContentPane().add(panel);
       JLabel etiqueta = new JLabel(); // se creo una etiqueta 
       etiqueta.setText("Hola");
       panel.add(etiqueta); // se agrego la etiqueta
    
    }
    
}
