package Clases;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;


public class Imagen {
    
    SuperficieDeDibujo superficieDeDibujo;
    Dupla posicionTablero;
    int lado;
    /**
     * Es un arreglo que almacena el nombre de las imagenes de los minos.
     * </p>
     * deben coincidir con las imagenes .jpg que creamos en el capitulo anterior
     */
    String[] TetriminoNombre = {"Z","S","J","L","T","O","I"};
    
    /**
     * Es un arreglo que almacena el Color correspondiente para los tetriminos.
     * </p>
     * debe coincidir con el orden del arreglo Anterior
     */
    Color TetriminosColor[] = {Color.RED,Color.GREEN,Color.ORANGE,
        Color.BLUE,Color.MAGENTA,Color.CYAN}; 
    
    /**
     * Es un arreglo que almacena las Imagenes correspondiente para los minos.
     * </p>
     * debe coincidir con el orden del arreglo Anterior
     */    
    BufferedImage[] Perifericos = new BufferedImage[TetriminoNombre.length];

    public Imagen(SuperficieDeDibujo superficieDeDibujo) {
        this.superficieDeDibujo = superficieDeDibujo;
        posicionTablero = superficieDeDibujo.tablero.posicion;
        lado = superficieDeDibujo.tablero.LADO;
        cargarImagenesDePerifericos();
    }
    
    private void cargarImagenesDePerifericos(){
        for (int i = 0; i < Perifericos.length; i++) {
            Perifericos[i] = cargarImagen(TetriminoNombre[i], ".jpg");
        }
    }
    
    public Dupla calcularPosicion(Dupla pos){
        int X = (int)(pos.X * lado + posicionTablero.X);
        int Y = (int)(pos.Y * lado + posicionTablero.Y);
        return new Dupla(X, Y);
    }
    
    public void dibujarPeriferico(Dupla pos, Graphics g, String tipo){
        int i = 0;
        
        while (!TetriminoNombre[i].equals(tipo)) {            
            i++;
        }
        
        g.drawImage(Perifericos[i], calcularPosicion(pos).intX(), 
                calcularPosicion(pos).intY(), superficieDeDibujo);
    }
    
    public BufferedImage cargarImagen(String nombre, String extension){
        
        BufferedImage imagen = null;
        
        try {//Código a ejecutar para cargar la imagen
            
            imagen = ImageIO.read(ClassLoader.class.getResource( "/Imagenes/" + nombre + extension));
            
        } catch (Exception e) {/*Por si sucede algún error*/}
        
        return imagen;
    }
    
}
