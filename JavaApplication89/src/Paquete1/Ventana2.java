/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Wilson Pop
 */
public class Ventana2 extends JFrame {
    JPanel panel = new JPanel();
    JTextField campoTexto = new JTextField();
    JLabel etiqueta = new JLabel();
    JTextArea areaTexto = new JTextArea();
    JTextField texto2 = new JTextField();
    JTextArea areaTexto2 = new JTextArea();
    
    public Ventana2(String titulo){
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle(titulo);
        inicializarComponentes();
    }
    
    public void inicializarComponentes(){
        mostrarVentana();
        /*crearCajaTexto();
        Etiqueta();
        Evento();
        mostrarAreaTexto();
        EventoRaton();*/
        mostrarCajaTexto2();
        mostrarAreaTexto2();
        eventoTeclado();
    }
    
    public void mostrarVentana(){
        panel.setLayout(null);
        panel.setBackground(Color.blue);
        this.setContentPane(panel);
    }
    
    public void crearCajaTexto(){
        
        campoTexto.setBounds(100, 100, 100, 25);
        panel.add(campoTexto);
        
    }
    
    public void Etiqueta(){
        etiqueta.setBounds(100, 300, 100, 50);
        etiqueta.setFont(new Font("arial",Font.BOLD, 20));
        panel.add(etiqueta);
    }
    
    public void Evento(){
        JButton boton1 = new JButton();
        boton1.setText("Click");
        boton1.setBounds(100, 150, 100, 25);
        panel.add(boton1);
        
        ActionListener escucha = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               etiqueta.setText(campoTexto.getText());
            }
        };
        
        boton1.addActionListener(escucha);
        
    }
    
    public void mostrarAreaTexto(){
        areaTexto.setBounds(100, 400, 100, 100);
        panel.add(areaTexto);
    }
    
    public void EventoRaton(){
        JButton boton2 = new JButton();
        boton2.setText("Click2");
        boton2.setBounds(20, 200, 100, 50);
        panel.add(boton2);
        
        
        MouseListener eventoRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                areaTexto.append("\nhola");
            }

            @Override
            public void mousePressed(MouseEvent e) {
               areaTexto.append("\nhola2");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               areaTexto.append("\nhola3");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
               areaTexto.append("\nhola4");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                areaTexto.append("\nhola5");
            }
        };
        
        boton2.addMouseListener(eventoRaton);
    }
    
    public void eventoTeclado(){
        KeyListener eventoTeclado = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //areaTexto2.append("keyTyped\n");
            }

            @Override
            public void keyPressed(KeyEvent e) {
               //areaTexto2.append("keyPressed\n");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //areaTexto2.append("keyRealeased\n")
                if(e.getKeyChar() =='b'){
                    System.out.println("b");
                    areaTexto2.append("b");
                }else if(e.getKeyChar()=='\n'){
                    areaTexto2.append("enter");
                }else if(e.getKeyChar()==' '){
                    System.out.println("space");
                    areaTexto2.append("space");
                }
            }
        };
        
        texto2.addKeyListener(eventoTeclado);
    }
    
    public void mostrarCajaTexto2(){
      
        texto2.setBounds(50,50, 100,50);
        panel.add(texto2);
        
    }
    
    public void mostrarAreaTexto2(){

        areaTexto2.setBounds(50,100, 100,80);
        panel.add(areaTexto2);
    }
}
