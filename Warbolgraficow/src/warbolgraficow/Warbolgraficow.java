/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warbolgraficow;

import java.awt.BasicStroke;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;
import java.util.Scanner;
/**
 *
 * @author Wilson Pop
 */
public class Warbolgraficow extends JPanel{
    int x=0, m=0, y=0;
    
    public void paint(Graphics g){
        //int x=valorX, y=50;
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2d.setColor(Color.yellow);
        g2d.fillArc(50, 50, 250, 250, x+90, 3);
        //g2d.setStroke(new BasicStroke(2));
        //g2d.draw(new Line2D.Float(x+25,y+50,x+80, y+80));
        //g2d.setColor(Color.black);
        g2d.setColor(Color.GREEN);
        g2d.fillArc(50, 50, 250, 250, y+90, 2);
        //g2d.drawLine(110,110,150,150);
        g2d.setColor(Color.red);
        g2d.fillArc(100,100,40,40,20,330);
        //seis padres
        g2d.setColor(Color.black);
        g2d.drawArc(50, 50, 250, 250, 0, 360);
    }
    public void mover(){
        x=x+6;
        if(x==360){
            x=0;
            y=y+6;
        }
    }
   
    public static void main(String[] args) throws InterruptedException {
        JFrame miFrame = new JFrame ("Mi gráfico");
        Warbolgraficow miPrincipal= new Warbolgraficow();
        miFrame.add(miPrincipal);
        miFrame.setSize(400,400);
        miFrame.setVisible(true);
        miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Scanner entrada = new Scanner (System.in);
        //valorX=entrada.nextInt();
        miFrame.repaint();
        while(true){
            miPrincipal.mover();
            miPrincipal.repaint();
            Thread.sleep(1000);
        }
    }
    
}
