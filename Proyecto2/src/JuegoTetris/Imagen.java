package JuegoTetris;

import java.awt.Color;
import java.awt.Graphics;


public class Imagen {
    
    SuperficieDeDibujo superficieDeDibujo;
    Dupla posicionTablero;
    int lado;

    public Imagen(SuperficieDeDibujo superficieDeDibujo) {
        this.superficieDeDibujo = superficieDeDibujo;
        posicionTablero = superficieDeDibujo.tablero.posicion;
        lado = superficieDeDibujo.tablero.LADO;
    }
    
    public Dupla calcularPosicion(Dupla pos){
        int X = (int)(pos.X * lado + posicionTablero.X);
        int Y = (int)(pos.Y * lado + posicionTablero.Y);
        return new Dupla(X, Y);
    }
    
    public void dibujarPeriferico(Dupla pos, Graphics g, String tipo){
        switch(tipo){
            case "Z":
                g.setColor(Color.RED);
                break;
            case "S":
                g.setColor(Color.GREEN);
                break;
            case "J":
                g.setColor(Color.BLUE);
                break;
            case "L":
                g.setColor(Color.ORANGE);
                break;
            case "T":
                g.setColor(Color.MAGENTA);
                break;
            case "O":
                g.setColor(Color.YELLOW);
                break;
            case "I":
                g.setColor(Color.CYAN);
                break;
        }
        g.fillRect((int)calcularPosicion(pos).X,(int)calcularPosicion(pos).Y, lado, lado);
    }
    
}
