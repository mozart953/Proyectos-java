/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warbolgraficow;

import java.awt.BasicStroke;
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
public class Dibujoar extends JPanel{
     //int x=0, m=0;
     static int valorX=100;
     int tam=18;
     int[][] mat=new int[100][30];
    public void paint(Graphics g){
        int x=valorX, y=50;
        int a=1;
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        //g2d.setColor(Color.yellow);
        //g2d.fillArc(50, 50, 250, 250, x+90, 3);
           for(int r=1;r<=30;r++){
            for(int s=1;s<=70;s++){
                if(mat[s-1][r-1]==0){
                    g.setColor(Color.black);
                    g.drawRect(10+(tam*s), 10+(tam*r), tam, tam);
                }else if(mat[s-1][r-1]==1){
                    g.setColor(Color.BLUE);
                    g.fillRect(10+(tam*s), 10+(tam*r), tam, tam);
                }else if(mat[s-1][r-1]==2){
                    
                    g.setColor(Color.GREEN);
                    g.fillRect(10+(tam*s), 10+(tam*r), tam, tam);
                }
                
            }
        }
        
        g2d.setStroke(new BasicStroke(2));
        g2d.draw(new Line2D.Float(600+25,20+50,600+80, 20+80));
        g2d.draw(new Line2D.Float(575,20+80,600+25, 20+50));
        g2d.setColor(Color.red);
        g2d.fillOval(70,1, 50, 50);
        g2d.setColor(Color.black);
        
        g2d.draw(new Line2D.Float(540+25,100+50,540+80, 100+80));
        g2d.draw(new Line2D.Float(515,100+80,540+25,100+50));
        g2d.setColor(Color.red);
        g2d.fillOval(540,100, 50, 50);
        g2d.setColor(Color.black);
        
        g2d.draw(new Line2D.Float(665+25,100+50,580+80, 100+80));
        g2d.draw(new Line2D.Float(750,100+80,665+25,100+50));
        g2d.setColor(Color.red);
        g2d.fillOval(665,100, 50, 50);
        g2d.setColor(Color.black);
        //g2d.setColor(Color.GREEN);
        //g2d.fillArc(50, 50, 250, 250, x+30, 2);
        //g2d.drawLine(110,110,150,150);
        //g2d.fillArc(100,100,90,150,20,330);
        //seis padres
        //g2d.setColor(Color.black);
        //g2d.drawArc(50, 50, 250, 250, 0, 360);
     

        
        
    }
    /*public void mover(){
        x=x+6;
        if(x==360){
            x=0;
            m=m+6;
        }
    }*/
   
    public static void main(String[] args) throws InterruptedException {
        JFrame miFrame = new JFrame ("Mi gráfico");
        Dibujoar miPrincipal= new Dibujoar();
        miFrame.add(miPrincipal);
        miFrame.setSize(800,700);
        miFrame.setVisible(true);
        miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Scanner entrada = new Scanner (System.in);
        valorX=entrada.nextInt();
        miFrame.repaint();
        /*while(true){
            miPrincipal.mover();
            miPrincipal.repaint();
            Thread.sleep(100);
        }*/
    }
    
}
