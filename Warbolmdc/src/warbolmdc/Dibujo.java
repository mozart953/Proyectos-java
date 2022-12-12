/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warbolmdc;

import java.awt.Graphics;
import javax.swing.JPanel;
import logica_programa.Arbol;
import logica_programa.Nodo;

/**
 *
 * @author Wilson Pop
 */
public class Dibujo extends JPanel{
    private Arbol objarbol;
    public static final int DIAMETRO = 30;
    public static final int RADIO = DIAMETRO/2;
    public static final int ANCHO = 50;

    public void setObjarbol(Arbol objarbol) {
        this.objarbol = objarbol;
        repaint();
        
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        pintar(g, getWidth()/2, 20, objarbol.getRaiz());
    }
    
    private void pintar(Graphics g,int x, int y, Nodo n){
        if (n==null){}
        else{
            int EXTRA  = n.nodosCompletos(n) * (ANCHO/2);
            g.drawOval(x, y, DIAMETRO, DIAMETRO);
            g.drawString(n.getElemento().toString(), x+12, y+18);
            if(n.getIzquierda() != null)
                g.drawLine(x+RADIO, y+RADIO, x-ANCHO-EXTRA+RADIO, y+ANCHO+RADIO);
            if(n.getDerecha() != null)
                g.drawLine(x+RADIO, y+RADIO, x+ANCHO+EXTRA+RADIO, y+ANCHO+RADIO);
            
            pintar(g,x-ANCHO-EXTRA,y+ANCHO,n.getIzquierda());
            pintar(g,x+ANCHO+EXTRA,y+ANCHO,n.getDerecha());
        }
            
    }

  

   
    
    
}
