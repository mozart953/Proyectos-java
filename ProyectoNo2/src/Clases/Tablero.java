package Clases;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Tablero {

    final int COLUMNAS = 10, FILAS = 20, LADO = 28;
    String[][] Tablero;
    SuperficieDeDibujo superficieDeDibujo;
    int anchoSDD, altoSDD;
    Dupla posicion;
    Imagen imagen;

    public Tablero(SuperficieDeDibujo superficieDeDibujo) {
        this.superficieDeDibujo = superficieDeDibujo;
        calcularPosicion();
        Tablero = new String[COLUMNAS][FILAS];
        casillasVacias();
    }

    public void casillasVacias() {
        for (int Y = 0; Y < FILAS; Y++) {
            for (int X = 0; X < COLUMNAS; X++) {
                Tablero[X][Y] = "";
            }
        }
    }

    public void calcularPosicion() {
        anchoSDD = superficieDeDibujo.getWidth();
        altoSDD = superficieDeDibujo.getHeight();
        posicion = new Dupla((anchoSDD - COLUMNAS * LADO) / 2, (altoSDD - FILAS * LADO) / 2);
    }

    public void dibujar(Graphics2D g) {
        for (int Y = 0; Y < FILAS; Y++) {
            for (int X = 0; X < COLUMNAS; X++) {
                Dupla posTemp = new Dupla(X * LADO + posicion.X, Y * LADO + posicion.Y);

                //dibujar casilla
                if (Tablero[X][Y] == "") {

                    Color color = new Color(0, 0, 0);
                    Color color2 = new Color(0, 0, 0);

                    if ((X + Y) % 2 == 0) {
                        color = new Color(0, 0, 68);
                        color2 = new Color(30, 20, 128);
                    } else {
                        color = new Color(0, 0, 33);
                        color2 = new Color(0, 0, 63);
                    }

                    g.setPaint(new GradientPaint(20, 0, color, 0, 20, color2, true));
                    g.fillRect(posTemp.intX(), posTemp.intY(), LADO, LADO);

                    g.setColor(new Color(0, 0, 0));
                    g.drawRect(posTemp.intX(), posTemp.intY(), LADO, LADO);

                } else {
                    imagen.dibujarPeriferico(new Dupla(X, Y), g, Tablero[X][Y]);
                }

                //dibujar posicion dentro de la casilla
                if (false) {
                    g.setFont(new Font("verdana", Font.PLAIN, 9));
                    g.drawString(X + "," + Y, (int) posTemp.X + 5, (int) posTemp.Y + 11);
                }
            }
        }
    }

    public void borrarBasurilla() {
        int Y = FILAS - 1, lineas = 0;

        while (Y >= 0) {
            int X = 0;

            while (X < COLUMNAS && !Tablero[X][Y].equals("")) {
                X++;
            }

            if (X == COLUMNAS) {
                lineas++;
                bajarBasurilla(Y);
            } else {
                Y--;
            }

        }
        //Aqui aumentaran las lineas para el puntaje
        System.out.println("Lineas = " + lineas);
    }

    public void bajarBasurilla(int Y) {
        for (int X = 0; X < COLUMNAS; X++) {
            Tablero[X][Y] = "";
        }

        while (Y >= 0) {
            for (int X = 0; X < COLUMNAS; X++) {
                Tablero[X][Y] = Y==0?"":Tablero[X][Y-1];
            }
            Y--;
        }
    }

    public String Obtener(int X, int Y) {
        if (Y >= 0) {
            return Tablero[X][Y];
        }
        return "";
    }

}
