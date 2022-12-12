/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package automatawilson;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Wilson Pop
 */
public class Automatawilson extends JPanel{
    
   
    @Override
    public void paint (Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2d.setColor(Color.red);
        g2d.drawOval(50, 50, 25, 25);
        
    }
     public static void main(String[] args) throws InterruptedException {
        JFrame miFrame = new JFrame ("Autómata finito determinista/Lenguajes formales de programación");
        Automatawilson miPrincipal= new Automatawilson();
        miFrame.add(miPrincipal);
        miFrame.setSize(400,400);
        miFrame.setVisible(true);
        miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Scanner ingresar = new Scanner (System.in);
        
        
        miFrame.repaint();
    }
    
    
}
