/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Wilson Pop
 */
public class Ventana extends JFrame{
    JPanel panel = new JPanel();
    public Ventana(String Titulo){
        //setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100, 200, 500, 500);
        setLocationRelativeTo(null);
        setTitle(Titulo);
        IniciarComponente();
    }
    
    private void IniciarComponente(){
        //JPanel panel = new JPanel();
        colocarPaneles();
        //colocarEtiquetas();
        //colocarBotones();
        mostrarRadioButton();
        colocarCajasTexto();
        colocarAreaTexto();
        colocarLista();
        
    }
    
    private void colocarPaneles(){
        panel.setLayout(null);
        panel.setBackground(Color.red);
        this.setContentPane(panel);
        
    }
    
    private void colocarEtiquetas(){
        JLabel label = new JLabel();
        label.setText("Este es un texto");
        label.setForeground(Color.blue);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setOpaque(true);
        label.setBackground(Color.black);
        label.setBounds(10, 20, 400, 50);
        label.setFont(new Font("chiller", Font.PLAIN,20));
        panel.add(label);
        
        ImageIcon imagen = new ImageIcon("Captura002.jpg");
        JLabel etiqueta2 = new JLabel(imagen);
        etiqueta2.setBounds(10, 30, 400, 100);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);

    }
    
    private void colocarBotones(){
        JButton boton1 = new JButton();
        boton1.setText("Click");
        boton1.setBounds(100, 100, 100,50);
        boton1.setEnabled(true);
        boton1.setMnemonic('a');
        boton1.setForeground(Color.blue);
        boton1.setFont(new Font("chiller",Font.BOLD, 20));
        panel.add(boton1);
        
        
        JButton boton2 = new JButton();
        boton2.setText("Click");
        boton2.setBounds(100, 200, 100, 50);
        boton2.setBackground(Color.YELLOW);
        panel.add(boton2);
        
        
    }
    
    public void mostrarRadioButton(){
        JRadioButton radioboton1 = new JRadioButton("item1", true);
        radioboton1.setBounds(100, 100, 100, 50);
        radioboton1.setEnabled(false);
        radioboton1.setText("Item 1");
        radioboton1.setFont(new Font("arial",Font.BOLD,20));
        panel.add(radioboton1);
        
        JRadioButton radioboton2 = new JRadioButton("item2", true);
        radioboton2.setBounds(100, 200, 100, 50);
        panel.add(radioboton2);
        
        JRadioButton radioboton3 = new JRadioButton("item3", true);
        radioboton3.setBounds(100, 300, 100, 50);
        panel.add(radioboton3);
        
        ButtonGroup grupo1 = new ButtonGroup();
        
        grupo1.add(radioboton1);
        grupo1.add(radioboton2);
        grupo1.add(radioboton3);
         
        
        
    }
    
    public void colocarCajasTexto(){
        JTextField campoTexto = new JTextField();
        campoTexto.setBounds(300, 300, 100, 50);
        campoTexto.setText("Este es un texto");
        System.out.println(campoTexto.getText());
        panel.add(campoTexto);
    }
    
    public void colocarAreaTexto(){
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(300, 400, 100, 200);
        areaTexto.setText("Area de texto");
        areaTexto.append("\n Segunda Linea");
        areaTexto.setEditable(false);
        System.out.println(areaTexto.getText());
        panel.add(areaTexto);
    }
    
    public void colocarLista(){
        String items [] = {"Manzana", "Pera", "Melon", "Banana"};
        JComboBox combobox1 = new JComboBox(items);
        combobox1.setBounds(100, 400, 100, 50);
        combobox1.addItem("Platano");
        combobox1.addItem("Item2");
        combobox1.setSelectedItem("Melon");
        panel.add(combobox1);
    }
}
