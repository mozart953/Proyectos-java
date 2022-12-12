/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmanwilson;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Wilson Pop
 */
public class Pacmanwilson extends JPanel{
    
   // Matriz maw = new Matriz();
    //Pacman paw = new Pacman();
    int ax1=0;
    int x1=0, y2=0, y3=0, x2=-50, y4=-50;
    private int y5=400;
    private int x3=350;
    private int x=150;
    private int y=50;
    private final int an=45;
    private final int al=45;
    private final int mov=50;
    private int fil=0;
    private int col=0;
    private final int nfil=11;
    private final int ncol=11;
    private final int anb=50;
    private final int alb=50;
    static boolean ite=true;
    static boolean inte=true;
    static boolean inte1=true;
    static boolean inte2=true;
    static boolean ite1=true;
    static boolean ite3=true;
    static boolean inte3=true;
    static boolean ite4=true;
    @Override
    public void paint(Graphics g){
        //maw.paint(g);
        //paw.paint(g);
        int contador=50;
        int aux=0;
        int ma[][]= Matrix();
        boolean interruptor = true;
        
            for(int fil=0;fil<nfil;fil++){
                for(int col=0;col<ncol;col++){
                    if(ma[fil][col]==1){
                        g.setColor(Color.lightGray);
                        g.fillRect((col*50),fil*50, anb, alb);
                        g.setColor(Color.black);
                        g.drawRect((col*50),fil*50, anb, alb);
                    }
                    else if(ma[fil][col]==0){
                        g.setColor(Color.black);
                        g.fillRect((col*50),fil*50, anb, alb);
                        g.setColor(Color.yellow);
                        g.fillOval((col*50)+25,(fil*50)+25, 10, 10);
                    }
                }
            }
        
        //(100,50)
        //(400,50=
        //(400,400)
        //(100,400)
        
            for(int fil1=0;fil1<nfil;fil1++){
            for(int col1=0;col1<ncol;col1++){
                if(ma[fil1][col1]==0){
                           if(inte==true){
                               g.setColor(Color.YELLOW);
                               g.fillArc(x+x1,y,an,al,30,300+y3);
                               System.out.println(fil1+col1);
                               g.setColor(Color.YELLOW);
                               g.fillOval((col1*50)+25,(fil1*50)+25, 10, 10);
                           }
                           if(inte1==false){
                               g.setColor(Color.YELLOW);
                               g.fillArc(400,y+y2,an,al,-30,300+y3);
                               System.out.println(fil1+col1);
                               g.setColor(Color.red);
                               g.fillOval((col1*50)+25,(fil1*50)+25, 10, 10);
                           }
                           if(inte2==false){
                               g.setColor(Color.YELLOW);
                               g.fillArc(x3+x2,400,an,al,-180+y3,300);
                               System.out.println(fil1+col1);
                               g.setColor(Color.blue);
                               g.fillOval((col1*50)+25,(fil1*50)+25, 10, 10);
                           }
                           if(inte3==false){
                               g.setColor(Color.YELLOW);
                               g.fillArc(100,y5+y4,an,al,-180+y3,300);
                               System.out.println(fil1+col1);
                               g.setColor(Color.GREEN);
                               g.fillOval((col1*50)+25,(fil1*50)+25, 10, 10);
                           } 
                }
             
            }
        }
        g.drawString("P", x, y);
        
        
        
        
        /*g.setColor(Color.red);
        g.drawString("PACMAN/WILSON POP", x, 10);*/
        
        
        
    }   
   
    
    public int [][] Matrix(){
        int ma[][]=
        {{1,1,0,1,1,1,1,1,1,1,1},
         {1,1,0,0,0,0,0,0,0,1,1},
         {1,1,0,1,1,1,1,1,0,1,1},
         {1,1,0,1,1,1,1,1,0,1,1},
         {1,1,0,1,1,1,1,1,0,1,1},
         {1,1,0,1,1,1,1,1,0,1,1},
         {1,1,0,1,1,1,1,1,0,1,1},
         {1,1,0,1,1,1,1,1,0,1,1},
         {1,1,0,0,0,0,0,0,0,1,1},
         {1,1,1,1,1,1,1,1,1,1,1},
         {1,1,1,1,1,1,1,1,1,1,1}
        };
        return ma;
    }
    
     public void mover(){
         
        x1=x1+50;
        y3=y3+20;
        if(x1==250){
            x1=0;
            inte=false;
            ite=false;
            ite3=false;
            inte1=false;
        }
        if(y3==60){
            y3=0;
        }
        
    }
    public void mover2(){
        y2=y2+50;
        y3=y3+20;
        if(y2==400){
           ite3=true; 
           inte1=true;
           inte2=false;
           ite1=false;
        }
        if(y3==60){
            y3=0;
        }
        
    }
    public void mover3(){
        y3=y3+20;
        x2=x2-50;
        if(x2==-300){
           inte2=true;
           ite1=true;
           inte3=false;
           ite4=false;
        }
        if(y3==60){
            y3=0;
        }
        
    }
    
    public void mover4(){
        y4=y4-50;
        if(y4==-500){
           inte3=true;
           ite4=true;
        }
        if(y3==60){
            y3=0;
        }
    
    }
    
    
    
   public static void main(String[] args) throws InterruptedException {
        JFrame ventana = new JFrame ("Pacman/Wison Victor Alexander Pop Cac/201840972");
        Pacmanwilson pac = new Pacmanwilson();
        ventana.add(pac);
        ventana.setSize(580,600);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
     
        while(ite==true){
            pac.mover();
            //pac.mover2();
            pac.repaint();
            Thread.sleep(300);
        }
        
        while(ite3==false){
            //pac.mover();
            pac.mover2();
            pac.repaint();
            Thread.sleep(300);
        }
         while(ite1==false){
            //pac.mover();
            pac.mover3();
            pac.repaint();
            Thread.sleep(300);
        }
        while(ite4==false){
            //pac.mover();
            pac.mover4();
            pac.repaint();
            Thread.sleep(300);
        } 
         
        
    }
    
}
