package JuegoTetris;

import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import java.awt.PopupMenu;
import java.awt.event.WindowAdapter;
import java.util.logging.Level;
import java.util.logging.Logger;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;




public class ControlPrincipal {
    
    
    static PanamaHitek_Arduino Arduino = new PanamaHitek_Arduino();
    static SerialPortEventListener listener = new SerialPortEventListener(){
        @Override
        public void serialEvent(SerialPortEvent spe) {
            
            try {
                if(Arduino.isMessageAvailable()==true){
                    //System.out.println(Arduino.printMessage());
                    String mensaje = Arduino.printMessage().toString();
                    
                    if(mensaje.equals("izquierda")){
                        Pieza.MoverIzquierda();
                    }else if(mensaje.equals("abajo")){
                        Pieza.MoverAbajo();
                    }else if(mensaje.equals("derecha")){
                        Pieza.MoverDerecha();
                    }else if(mensaje.equals("cambiar")){
                        Pieza.girarDerecha();
                    }
                
                }
            } catch (SerialPortException ex) {
                Logger.getLogger(ControlPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ArduinoException ex) {
                Logger.getLogger(ControlPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        }
    };

        
        
        
        
    private static SuperficieDeDibujo superficieDeDibujo;
    private static Ventana ventana;
    private static int APS = 0, FPS = 0; //Variables de actualizaciones x segundo y fotogramas x segundo 

    public static void main(String[] args) {
        
        try {
            Arduino.arduinoRX("COM3", 9600, listener);
        } catch (ArduinoException ex) {
            Logger.getLogger(ControlPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SerialPortException ex) {
            Logger.getLogger(ControlPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        iniciarJuego();
    }

    public static void iniciarJuego() {
        crearVentana(950, 600, "Proyecto No.2 ");
        iterarBuclePrincipal(); 
    }

    public static void actualizar() {
        APS++;
        superficieDeDibujo.dibujar();
    }


    
    
    
    public static void dibujar() {
        FPS++;
    }

    public static void crearVentana(int ancho, int alto, String Nombre) { //La clase crear ventana recibe el ancho y alto 
        superficieDeDibujo = new SuperficieDeDibujo(ancho, alto);
        ventana = new Ventana(Nombre, superficieDeDibujo);
    }
     
    
    public static void iterarBuclePrincipal() { // esta clase es la que pinta en la ventna del juego  //final quiere decir que no sufrira cambios futuros 
        final int NS_POR_SEGUNDO = 1000000000; // variable de nanosegunfos 
        final int APS_OBJETIVO = 60; //variable que hace las actualizaciones por segunfo
        final int NS_POR_ACTUALIZACION = NS_POR_SEGUNDO / APS_OBJETIVO; // variable de cantidad de segundos que pasan para que haga una actualizaciòn   

        long tiempoDeReferenciaActualizacion = System.nanoTime();// variable tipo long(parecido al tipo entero con mayor capacidad de almacenamiento)
        long tiempoDeReferenciaContador = System.nanoTime(); //nanotime nos devuelve un valor preciso al momento de ejecutar

        double delta = 0;
        double tiempoSinProcesar;

        while (true) {

            long tiempoInicial = System.nanoTime();
            tiempoSinProcesar = tiempoInicial - tiempoDeReferenciaActualizacion; //sirve para saber cuanto tiempo ha trancurridos desde la primer actualizacio 
            tiempoDeReferenciaActualizacion = tiempoInicial;
            delta += tiempoSinProcesar / NS_POR_ACTUALIZACION;

            while (delta >= 1) {
                //actualizar
                delta--;
                actualizar();
            }

            dibujar();

            if (System.nanoTime() - tiempoDeReferenciaContador >= NS_POR_SEGUNDO) {
                System.out.println("APS = " + APS + " FPS = " + FPS);
                tiempoDeReferenciaContador = System.nanoTime();
                APS = 0;
                FPS = 0;
            }
                                                                            
        }
    }

    static void setvisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void show() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void addWindowListener(WindowAdapter windowAdapter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
