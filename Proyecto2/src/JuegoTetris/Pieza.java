package JuegoTetris;

import java.awt.Graphics;

public class Pieza implements Runnable {

    SuperficieDeDibujo superficieDeDibujo;
    static Tablero tablero;
    Imagen imagen;
    static Dupla posicion = new Dupla(3, 10);
    static Tetrimino PA = Tetrimino.Aleatorio();
    static Tetrimino Proximos[] = new Tetrimino[7];
    Thread Hilo = new Thread(this);
    boolean EstadoDelHilo=true;

    public Pieza(SuperficieDeDibujo superficieDeDibujo) {
        this.superficieDeDibujo = superficieDeDibujo;
        this.tablero = superficieDeDibujo.tablero;
        this.imagen = superficieDeDibujo.imagen;
        for (int i = 0; i < Proximos.length; i++) {
            Proximos[i] = Tetrimino.Aleatorio();
        }
        Hilo.start();
    }

    Pieza() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void dibujar(Graphics g) {
        for (int i = 0; i < 4; i++) {
            imagen.dibujarPeriferico(new Dupla(posicion.X + PA.periferico[i].X, posicion.Y + PA.periferico[i].Y), g, PA.nombre);
        }
        for (int i = 0; i < Proximos.length; i++) {
            Dupla pos = new Dupla(12, 1 + i * 3);
            for (int j = 0; j < Proximos[i].periferico.length; j++) {
                double XReal = Proximos[i].periferico[j].X + pos.X;
                double YReal = Proximos[i].periferico[j].Y + pos.Y;
                imagen.dibujarPeriferico(new Dupla(XReal, YReal), g, Proximos[i].nombre);
            }
        }
    }

    static public void Reiniciar() {
        posicion = new Dupla(4, 0);
        PA = Proximos[0];
        for (int i = 0; i < Proximos.length - 1; i++) {
            Proximos[i] = Proximos[i + 1];
        }
        Proximos[Proximos.length - 1] = Tetrimino.Aleatorio();
    }

    static public void almacenarEnTablero() {
        for (int i = 0; i < PA.periferico.length; i++) {
            int columna = PA.periferico[i].intX() + posicion.intX(),
                    fila = PA.periferico[i].intY() + posicion.intY();
            String dato = PA.nombre;

            tablero.Tablero[columna][fila] = dato;
        }
    }

   static  public void girarDerecha() {
        PA.girarDerecha();
        if (MovimientoErroneo()) {
            PA.girarIzquierda();
        }
    }
    
    static public void MoverDerecha() {
        posicion.moverDerecha();
        if (MovimientoErroneo()) {
            posicion.moverIzquierda();
        }
    }

    static public void MoverIzquierda() {
        posicion.moverIzquierda();
        if (MovimientoErroneo()) {
            posicion.moverDerecha();
        }
    }

    static public void MoverAbajo() {
        posicion.moverAbajo();
        if (MovimientoErroneo()) {
            posicion.moverArriba();
            System.out.println("Depositando pieza y reiniciando");
            almacenarEnTablero();
            Reiniciar();
            tablero.borrarBasurilla();
        }
    }

    static public boolean MovimientoErroneo() {
        for (int i = 0; i < PA.periferico.length; i++) {
            double XReal = PA.periferico[i].X + posicion.X;
            double YReal = PA.periferico[i].Y + posicion.Y;
            if (XReal > tablero.COLUMNAS - 1 || XReal < 0) {
                return true;
            }
            if (YReal > tablero.FILAS - 1) {
                return true;
            }
            if (!tablero.Obtener((int) XReal, (int) YReal).equals("")) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void run() {
        try {
            while (true) {                
               MoverAbajo();
               Thread.sleep(850); //Tiempo de caida 
            }
        } catch (Exception e) { //Se ejecuta si ha error 
            System.out.println("tetrisserieyt.Pieza.run() - ERROR");
        }
    }
    
    public void PausarReanudar(){
        if (EstadoDelHilo) {
          Hilo.suspend(); //Pausar 
        }else{
            Hilo.resume();//Reanudar
        }
        EstadoDelHilo=!EstadoDelHilo;
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
