package JuegoTetris;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

public class SuperficieDeDibujo extends Canvas{  //Creamos la estrucutura del dibujo con CANVAS
    
    private BufferStrategy buffer;   //Creamos un Buffer (Espacio de memoria temporal)
    private Graphics g;
    Imagen imagen;
    Tablero tablero;
    Pieza pieza;
  
    
    public SuperficieDeDibujo(int ancho, int alto) { //creamos un constructor 
        setSize(ancho,alto);
        tablero = new Tablero(this);
        imagen = new Imagen(this);
        tablero.imagen = imagen;
        pieza = new Pieza(this);
        CapturarTeclas();
        setFocusable(true);
    }

    SuperficieDeDibujo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void dibujar(){
        buffer = getBufferStrategy();
        
        if(buffer==null){
            createBufferStrategy(2);
            return;
        }
        
        g = buffer.getDrawGraphics();
            //Dibujar Aqui
            
            tablero.dibujar((Graphics2D)g);
            pieza.dibujar(g);
            
        g.dispose();
        buffer.show();
    }
    
    public Dupla Tamaño(){
        return new Dupla(this.getWidth(),this.getHeight());
    }
    
    public void CapturarTeclas(){
        addKeyListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e) { //este no lo usaremos
            }

            @Override
            public void keyPressed(KeyEvent e) { 
                
                if(e.getKeyCode()==KeyEvent.VK_RIGHT){//derecha
                    pieza.MoverDerecha();
                    return;
                }
                if(e.getKeyCode()==KeyEvent.VK_DOWN){//abajo
                    pieza.MoverAbajo();
                    return;
                }
                if(e.getKeyCode()==KeyEvent.VK_UP){//arriba
                    pieza.girarDerecha();
                    return;
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {//izquierda
                    pieza.MoverIzquierda();
                    return;
                }
                if (e.getKeyCode() == KeyEvent.VK_P) {//Con el boton p podremos hacer la Pausa
                    pieza.PausarReanudar();
                    return;
                }
                
            }

            @Override
            public void keyReleased(KeyEvent e) {//sirve para averiguar cuando soltemos cualquier tecla
                //entra cuando se libere alguna tecla
            }
        });
    }
    
}
