/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wilsonpacmandos;

/**
 *
 * @author Wilson Pop
 */

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Line2D;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Wilsonpacmandos extends JPanel{

    
    
    int x=50, y=50, x1=550, y1=50, x2=350, y2=250;
    int contador=50;
    private final int nfil=11;
    private final int ncol=13;
    private final int anb=50;
    private final int alb=50;
    static boolean inte = true;
   // static int opcion = 0;
   
    pacman pc=new pacman ();
    //Fantasmauno ft1 = new Fantasmauno(); 
    //Fantasmados ft2 = new Fantasmados ();
    
    public Wilsonpacmandos(){
        addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                pc.presionar(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
        setFocusable(true);
    }
       
    
    
    @Override
    public void paint (Graphics g){
             int ma[][]= Matrix();
        
            for(int fil=0;fil<nfil;fil++){
                for(int col=0;col<ncol;col++){
                    if(ma[fil][col]==11){
                        g.setColor(Color.CYAN);
                        g.fillRect((col*50),fil*50, anb, alb);
                        g.setColor(Color.black);
                        g.drawRect((col*50),fil*50, anb, alb);
                    }
                    else if(ma[fil][col]==10){
                        g.setColor(Color.BLACK);
                        g.fillRect((col*50),fil*50, anb, alb);
                    }
                }
            }
        
        
            pc.paint(g);
            //ft1.paint(g);
            //ft2.paint(g);
            
             g.setColor(Color.red);
             g.fillArc(x1,y1,anb, alb,0, 180);
             g.setColor(Color.orange);
             g.fillArc(x2,y2,anb, alb,0, 180);
        
            if(x==x1 && y==y1){
                JOptionPane.showMessageDialog(this, "Fin");
            }
    
    }
     
    public void mover (){
        int ma [][] = Matrix();
         if(ma[(y1/50)-1][x1/50]!=11){
                    y1=y1-contador;
                    
                }
         else if (ma[(y1/50)-1][(x1/50)]==10){
             y1=y1+contador;
         }
         else if(ma[y1/50][(x1/50)+1]!=11){
                    x1=x1+contador;
                } 
         else if(ma[(y1/50)+1][x1/50]!=11){
                    y1=y1+contador;
                }
         else if(ma[y1/50][(x1/50)-1]!=11){
                    x1=x1-contador;
                } 
        
    }
        
    public void mover2(){
        int ma [][] = Matrix();
        if(ma[(y2/50)-1][x2/50]!=11){
                    y2=y2-contador;
                    
                } 
        
        else if(ma[y2/50][(x2/50)-1]!=11){
                    x2=x2-contador;
                }
        else if(ma[(y2/50)+1][x2/50]!=11){
                    y2=y2+contador;
                }
        
        else if(ma[y2/50][(x2/50)+1]!=11){
                    x2=x2+contador;
                } 
    
    }
    
    
    
    public int [][] Matrix(){
        int ma[][]=
        {{11,11,11,11,11,11,11,11,11,11,11,11,11},
         {11,10,10,10,10,10,10,10,10,10,10,10,11},
         {11,10,10,10,10,10,10,10,10,10,10,10,11},
         {11,10,10,10,10,10,10,10,10,10,10,10,11},
         {11,10,10,10,10,10,11,11,11,10,10,10,11},
         {11,10,10,10,10,10,10,10,10,10,10,10,11},
         {11,10,10,10,10,10,10,10,10,10,10,10,11},
         {11,10,10,10,10,10,10,10,10,10,10,10,11},
         {11,10,10,10,10,10,10,10,10,10,10,10,11},
         {11,10,10,10,10,10,10,10,10,10,10,10,11},
         {11,11,11,11,11,11,11,11,11,11,11,11,11}
        };
        return ma;
    }
    
    
    public static void main(String[] args) throws InterruptedException {
        JFrame ventana = new JFrame ("Pacman/Wison Victor Alexander Pop Cac/201840972");
        Wilsonpacmandos pac = new Wilsonpacmandos();
        ventana.add(pac);
        ventana.setSize(700,600);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        
        while(true){
            pac.mover();
            pac.mover2();
            pac.repaint();
            Thread.sleep(500);
        }
       
    }
    
}
