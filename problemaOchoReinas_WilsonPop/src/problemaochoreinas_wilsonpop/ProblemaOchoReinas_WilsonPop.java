/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaochoreinas_wilsonpop;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Wilson Pop
 */
public class ProblemaOchoReinas_WilsonPop extends JPanel {

    private final int filas = 8;
    private final int columnas = 8;
    private final int anchura = 60;
    private final int altura = 60;
    private final int multiplicador = 60;
    public static int combinaciones[] = new int[8];
    public static int combinaciones1[] = new int[736];
    public static String concatenar = "";
    public static boolean interruptor = false;
    int contador3 = 0;
    int contadorsolucion = 1;
    @Override
    public void paint(Graphics g) {
               int reinas[] = new int[8];
                         
                reinas[0] = combinaciones1[contador3];
                reinas[1] = combinaciones1[contador3 + 1];
                reinas[2] = combinaciones1[contador3 + 2];
                reinas[3] = combinaciones1[contador3 + 3];
                reinas[4] = combinaciones1[contador3 + 4];
                reinas[5] = combinaciones1[contador3 + 5];
                reinas[6] = combinaciones1[contador3 + 6];
                reinas[7] = combinaciones1[contador3 + 7];
                
            
            for(int cont=0;cont<92;cont++) {
                
                for (int fil = 0; fil < filas; fil++) {
                    for (int col = 0; col < columnas; col++) {

                        if (reinas[fil] == col) {
                            if ((fil + col) % 2 == 0) {
                                g.setColor(Color.GREEN);
                                g.fillRect((col * multiplicador), fil * multiplicador, anchura, altura);
                                g.setColor(Color.black);
                                g.drawRect((col * multiplicador), fil * multiplicador, anchura, altura);
                                System.out.print("r");
                            } else {
                                g.setColor(Color.GREEN);
                                g.fillRect((col * multiplicador), fil * multiplicador, anchura, altura);
                                g.setColor(Color.black);
                                g.drawRect((col * multiplicador), fil * multiplicador, anchura, altura);
                                System.out.print("r");
                            }

                        } else {
                            if ((fil + col) % 2 == 0) {
                                g.setColor(Color.BLACK);
                                g.fillRect((col * multiplicador), fil * multiplicador, anchura, altura);
                                g.setColor(Color.black);
                                g.drawRect((col * multiplicador), fil * multiplicador, anchura, altura);
                                System.out.print("o");
                            } else {
                                g.setColor(Color.WHITE);
                                g.fillRect((col * multiplicador), fil * multiplicador, anchura, altura);
                                g.setColor(Color.black);
                                g.drawRect((col * multiplicador), fil * multiplicador, anchura, altura);
                                System.out.print("o");

                            }
                        }

                    }
                    System.out.println("");
                }

                
            } 
       
    }
  
    
    public void Contador(){
        contador3 = contador3+8;
    
    }
   
    //este metodo verifica las combinaciones que solucionan el problema
    public boolean verificarAtaque(int[] matriz) {

        boolean respuesta = false;

        for (int fila = 0; fila < 7; fila++) {
            for (int columna = fila + 1; columna < 8; columna++) {
                if (matriz[fila] == matriz[columna]) {
                    return true;
                }
                //else respuesta = false;                
            }
        }

        for (int fila = 0; fila < 7; fila++) {
            for (int columna = fila + 1; columna < 8; columna++) {
                if ((matriz[fila] + fila) == (matriz[columna] + columna)) {
                    return true;
                }
                if ((matriz[fila] - fila) == (matriz[columna] - columna)) {
                    return true;
                }
                //else respuesta = false;                
            }
        }

        return respuesta;
    }

    //este metodo revisa todas las posibles combinaciones
    public void Soluciones() {
        int contador = 0;
        int contador1 = 0;

        for (int a = 0; a < 8; a++) {
            for (int b = 0; b < 8; b++) {
                for (int c = 0; c < 8; c++) {
                    for (int d = 0; d < 8; d++) {
                        for (int e = 0; e < 8; e++) {
                            for (int f = 0; f < 8; f++) {
                                for (int g = 0; g < 8; g++) {
                                    for (int h = 0; h < 8; h++) {
                                        int[] comb = {a, b, c, d, e, f, g, h};
                                        //combinaciones = comb;
                                        if (!verificarAtaque(comb)) {
                                            combinaciones = comb;
                                            for (int r = 0; r < 8; r++) {
                                                System.out.print(combinaciones[r]);
                                                concatenar += combinaciones[r];
                                            }

                                            System.out.println("\n");

                                            combinaciones1[contador] = a;
                                            combinaciones1[contador + 1] = b;
                                            combinaciones1[contador + 2] = c;
                                            combinaciones1[contador + 3] = d;
                                            combinaciones1[contador + 4] = e;
                                            combinaciones1[contador + 5] = f;
                                            combinaciones1[contador + 6] = g;
                                            combinaciones1[contador + 7] = h;
                                            //Reinas(comb);
                                            contador = contador + 8;
                                            contador1++;
                                            System.out.println(contador1);

                                        }

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        JOptionPane.showMessageDialog(this, "solucion No."+ contadorsolucion);
        contadorsolucion+=1;
        //System.out.println(concatenar);
        for (int inter = 0; inter < 736; inter++) {
            System.out.print(combinaciones1[inter]);
            interruptor = true;
        }
        System.out.println("\n");

    }

    public static void main(String[] args) throws InterruptedException {

        JFrame ventana = new JFrame("8 Reinas-Wison Victor Alexander Pop Cac-201840972");
        ProblemaOchoReinas_WilsonPop ven = new ProblemaOchoReinas_WilsonPop();
        ventana.add(ven);
        ventana.setSize(490, 550);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        Timer timer = new Timer();

        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                ven.Soluciones();
                ven.repaint();
                ven.Contador();

          }
        };

        timer.scheduleAtFixedRate(tarea, 0, 300);
        
    }

}
