/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wilsonpacmandos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

/**
 *
 * @author Wilson Pop
 */
public class pacman {
        
    private int x=50;
    private int y=50;
    private final int anb=50; 
    private final int alb=50;
    private final int bo=30;
    private final int al=300;
    public final int contador = 50;
    
    
    
    public void paint (Graphics g){
        g.setColor(Color.yellow);
        g.fillArc(x, y,anb, alb, bo, al);
    
    }
    public void presionar (KeyEvent evento){
        int me [][] = Matrix();
            if(evento.getKeyCode()==37){
                if(me[y/50][(x/50)-1]!=11){
                    x=x-contador;
                }
                    
            }
            if(evento.getKeyCode()==40){
                if(me[(y/50)+1][x/50]!=11){
                    y=y+contador;
                }
            }
            if(evento.getKeyCode()==38){
               if(me[(y/50)-1][x/50]!=11){
                    y=y-contador;
                }     
            }
            if(evento.getKeyCode()==39){
                 if(me[y/50][(x/50)+1]!=11){
                    x=x+contador;
                }    
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
    
}
