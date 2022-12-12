/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmanwilson;

import java.awt.Color;
import java.awt.Graphics;

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
    
    public void paint (Graphics g){
        g.setColor(Color.yellow);
        g.fillArc(x, y,anb, alb, bo, al);
    
    }
    
}
