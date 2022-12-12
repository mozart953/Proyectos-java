/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol_mdcw;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Wilson Pop
 */
public class Arbol_mdcw extends JPanel{
    public static final int DI = 30;
    public static final int RA = DI/2;
    public static final int AN = 50;
    int xent=700;
    int yent=20;
    static String pa=null;
    static String hi=null;
    static String hd=null;
    static int ca=0;
    static String ma [][] = new String [7][4];
    //proyecto serecto - nombre en clave:Proyecto mdcwilson
    public void paint(Graphics g){
        int x=xent, y=yent, x1=x,x2=x,y1=y,y2=y;
        int an = AN;
        int comp=ca;
        int ex= comp*(an/2);
        int at=-an-ex;
        int ad=an+ex;
        int cor1=0;
        int cor11=0;
        int cor2=0;
        int cor22=0;
        int cor3=0;
        int cor33=0;
        int cor4=0;
        int cor44=0;
        int cor5=0;
        int cor55=0;
        int cor6=0;
        int cor66=0;
        int cor7=0;
        int cor77=0;
        int cor8=0;
        int cor88=0;
        int cor9=0;
        int cor99=0;
        int cor10=0;
        int cor12=0;
        int contador = 0;
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke(2));
        
        //Raíz  
        if(ca!=0){
            for(int ar=0;ar<comp;ar++){
                for(int er=0;er<4;er++){
                    if(ar==0){
                        if(er==0){
                            g2d.setColor(Color.BLUE);
                            g2d.drawOval(x, y, DI, DI);
                            g2d.setColor(Color.red);
                            g2d.drawString(ma[ar][er], x+12,y+18 );
                        }
                        else if(er==2){
                            g2d.setColor(Color.BLUE);
                            g2d.drawOval(x+at, y+ad, DI, DI);
                            g2d.setColor(Color.red);
                            g2d.drawString(ma[ar][er], x+at+12,y+ad+18 );
                            cor1=x+at;
                            cor11=y+ad;
                            x1=x+at;
                            y1=y+ad;
                        }
                        else if(er==3){
                            g2d.setColor(Color.BLUE);
                            g2d.drawOval(x+ad, y+ad, DI, DI);
                            g2d.setColor(Color.red);
                            g2d.drawString(ma[ar][er], x+ad+12,y+ad+18 );
                            cor2=x+ad;
                            cor22=y+ad;
                            x2=x+ad;
                            y2=y+ad;
                        }
                    }
                    else if(ar==1){
                       if(er==2){
                            g2d.setColor(Color.BLUE);
                            g2d.drawOval(x1+at+ex, y1+ad, DI, DI);
                            g2d.setColor(Color.red);
                            g2d.drawString(ma[ar][er], x1+at+ex+12,y1+ad+18 );
                            cor3=x1+at+ex;
                            cor33=y1+ad;
                       }
                       else if(er==3){
                            g2d.setColor(Color.BLUE);
                            g2d.drawOval(x1+ad-ex, y1+ad, DI, DI);
                            g2d.setColor(Color.red);
                            g2d.drawString(ma[ar][er], x1+ad-ex+12,y1+ad+18 );
                            cor4=x1+ad-ex;
                            cor44=y1+ad;
                            x1=x1+at;
                            y1=y1+ad;
                       }
                        
                    }
                    else if(ar==2){
                       if(er==2){
                            g2d.setColor(Color.BLUE);
                            g2d.drawOval(x2+ex+at, y2+ad, DI, DI);
                            g2d.setColor(Color.red);
                            g2d.drawString(ma[ar][er], x2+ex+at+12,y2+ad+18 );
                            cor5=x2+ex+at;
                            cor55=y2+ad;
                       }
                       else if(er==3){
                            g2d.setColor(Color.BLUE);
                            g2d.drawOval(x2+ad-ex, y2+ad, DI, DI);
                            g2d.setColor(Color.red);
                            g2d.drawString(ma[ar][er], x2+ad-ex+12,y2+ad+18 );
                            cor6=x2+ad-ex;
                            cor66=y2+ad;
                            x2=x2+at;
                            y2=y2+ad;
                       } 
                    }
                    else if(ar==3){
                        if(er==2){
                            g2d.setColor(Color.BLUE);
                            g2d.drawOval(x1+at+ex, y1+ad, DI, DI);
                            g2d.setColor(Color.red);
                            g2d.drawString(ma[ar][er], x1+at+ex+12,y1+ad+18 );
                            cor7=x1+at+ex;
                            cor77=y1+ad;
                       }
                       else if(er==3){
                            g2d.setColor(Color.BLUE);
                            g2d.drawOval(x1+ad-ex, y1+ad, DI, DI);
                            g2d.setColor(Color.red);
                            g2d.drawString(ma[ar][er], x1+ad-ex+12,y1+ad+18 );
                            cor8=x1+ad-ex;
                            cor88=y1+ad;
                            //x1=x1+at;
                            //y1=y1+ad;
                       }
                    }
                    else if(ar==6){
                        if(er==2){
                            g2d.setColor(Color.BLUE);
                            g2d.drawOval(x2+ex+at, y2+ad, DI, DI);
                            g2d.setColor(Color.red);
                            g2d.drawString(ma[ar][er], x2+ex+at+12,y2+ad+18 );
                            cor9=x2+ex+at;
                            cor99=y2+ad;
                       }
                       else if(er==3){
                            g2d.setColor(Color.BLUE);
                            g2d.drawOval(x2+ad-ex, y2+ad, DI, DI);
                            g2d.setColor(Color.red);
                            g2d.drawString(ma[ar][er], x2+ad-ex+12,y2+ad+18 );
                            cor10=x2+ad-ex;
                            cor12=y2+ad;
                            x2=x2+at;
                            y2=y2+ad;
                       }
                    }
                    
                    
                }
            }   
                            if(comp==1){
                                g2d.setColor(Color.GREEN);
                                g2d.drawLine(x+RA, y+DI,cor1+RA ,cor11);
                                g2d.drawLine(x+RA, y+DI,cor2+RA,cor22);
                            }
                            if(comp==2){
                                g2d.setColor(Color.GREEN);
                                g2d.drawLine(x+RA, y+DI,cor1+RA ,cor11);
                                g2d.drawLine(x+RA, y+DI,cor2+RA,cor22);
                                g2d.drawLine(cor1+RA, cor11+DI, cor3+RA,cor33);
                                g2d.drawLine(cor1+RA, cor11+DI, cor4+RA, cor44);
                            }
                            if(comp==3){
                                g2d.setColor(Color.GREEN);
                                g2d.drawLine(x+RA, y+DI,cor1+RA ,cor11);
                                g2d.drawLine(x+RA, y+DI,cor2+RA,cor22);
                                g2d.drawLine(cor1+RA, cor11+DI, cor3+RA,cor33);
                                g2d.drawLine(cor1+RA, cor11+DI, cor4+RA, cor44);
                                g2d.drawLine(cor2+RA, cor22+DI, cor5+RA,cor55);
                                g2d.drawLine(cor2+RA, cor22+DI, cor6+RA,cor66);
                            
                            }
                            if(comp==4 || comp==5||comp==6){
                                g2d.setColor(Color.GREEN);
                                g2d.drawLine(x+RA, y+DI,cor1+RA ,cor11);
                                g2d.drawLine(x+RA, y+DI,cor2+RA,cor22);
                                g2d.drawLine(cor1+RA, cor11+DI, cor3+RA,cor33);
                                g2d.drawLine(cor1+RA, cor11+DI, cor4+RA, cor44);
                                g2d.drawLine(cor2+RA, cor22+DI, cor5+RA,cor55);
                                g2d.drawLine(cor2+RA, cor22+DI, cor6+RA,cor66);
                                g2d.drawLine(cor3+RA, cor33+DI, cor7+RA,cor77);
                                g2d.drawLine(cor3+RA, cor33+DI, cor8+RA,cor88);
                            }
                            if(comp==7){
                                g2d.setColor(Color.GREEN);
                                g2d.drawLine(x+RA, y+DI,cor1+RA ,cor11);
                                g2d.drawLine(x+RA, y+DI,cor2+RA,cor22);
                                g2d.drawLine(cor1+RA, cor11+DI, cor3+RA,cor33);
                                g2d.drawLine(cor1+RA, cor11+DI, cor4+RA, cor44);
                                g2d.drawLine(cor2+RA, cor22+DI, cor5+RA,cor55);
                                g2d.drawLine(cor2+RA, cor22+DI, cor6+RA,cor66);
                                g2d.drawLine(cor3+RA, cor33+DI, cor7+RA,cor77);
                                g2d.drawLine(cor3+RA, cor33+DI, cor8+RA,cor88);
                                g2d.drawLine(cor6+RA, cor66+DI, cor9+RA,cor99);
                                g2d.drawLine(cor6+RA, cor66+DI, cor10+RA,cor12);
                            }
        }
    }
    

   
    public static void main(String[] args) throws InterruptedException{
        JFrame miFrame = new JFrame ("ÁRBOL/matemática de computo/Wilson Victor Alexander Pop Cac -201840972");
        Arbol_mdcw miPrincipal= new Arbol_mdcw();
        miFrame.add(miPrincipal);
        miFrame.setSize(1000,500);
        miFrame.setVisible(true);
        miFrame.setLocationRelativeTo(miFrame);
        miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Scanner entrada = new Scanner (System.in);
        int lot=0;    
        
            while(ca==0 || ca>7){
                ca=Integer.parseInt(JOptionPane.showInputDialog("Escriba el número de nodos"));
                lot=ca;
            }
            //pa=JOptionPane.showInputDialog("Escriba el padre");
            //ma[0][0]=JOptionPane.showInputDialog("Escriba el padre");
            for(int fil=0;fil<lot;fil++){
                for(int col=0;col<4;col++){
                    if(col==0){
                        ma[fil][col]=JOptionPane.showInputDialog("Escriba la id No." + (fil+1));
                    }
                    if(col==1){
                        ma[fil][col]=JOptionPane.showInputDialog("Escriba el padre No." + (fil+1));
                        for(int aa=0;aa<lot;aa++){
                            for(int bb=0;bb<4;bb++){
                                if(ma[fil][col].equals(ma[aa][bb])){
                                    if(aa !=fil && bb==1){
                                        ma[fil][col]=JOptionPane.showInputDialog("Este padre ya aparece en otra casilla, por favor vuelva a escribirlo para evitar confusión" );
                                    }
                                    else if(aa== fil && bb ==2){
                                        ma[fil][col]=JOptionPane.showInputDialog("El padre se parece a un hijo izquierdo, debe cambiarlo");
                                    }
                                    else if(aa !=fil && bb==2){
                                        ma[fil][col]=JOptionPane.showInputDialog("El padre se parece a un hijo izquierdo, debe cambiarlo");
                                    }
                                    else if(aa==fil && bb == 3){
                                        ma[fil][col]=JOptionPane.showInputDialog("El padre se parece a un hijo derecho, debe cambiarlo");                                    
                                    }
                                    else if(aa!=fil && bb==3){
                                        ma[fil][col]=JOptionPane.showInputDialog("El padre se parece a un hijo derecho, debe cambiarlo");
                                    }
                                    else{break;}
                                }
                            }
                        }
                    }
                    if(col==2){
                        ma[fil][col]=JOptionPane.showInputDialog("Escriba el hijo izquierdo No." + (fil+1));
                           for(int rr=0;rr<lot;rr++){
                               for(int ll=0;ll<4;ll++){
                                   if(ma[fil][col].equals(ma[rr][ll])){
                                      if(rr ==fil && ll==1){
                                          JOptionPane.showInputDialog("Hay una coincidencia, vuelva a escribir");
                                      }
                                      else if(rr ==fil && ll==3){
                                          JOptionPane.showInputDialog("Hay una coincidencia, vuelva a escribir");
                                      }
                                      else if(rr!=fil && ll==1){
                                          JOptionPane.showInputDialog("Hay una coincidencia, vuelva a escribir");
                                      }
                                      else if(rr!=fil && ll==2){
                                          JOptionPane.showInputDialog("Hay una coincidencia, vuelva a escribir");
                                      }
                                      else if(rr!=fil && ll==3){
                                          JOptionPane.showInputDialog("Hay una coincidencia, vuelva a escribir");
                                      }
                                      
                                   }
                               }
                           }
                    }
                    if(col==3){
                        ma[fil][col]=JOptionPane.showInputDialog("Escriba el hijo derecho No." + (fil+1));
                            for(int mm=0;mm<lot;mm++){
                               for(int nn=0;nn<4;nn++){
                                   if(ma[fil][col].equals(ma[mm][nn])){
                                      if(mm ==fil && nn==1){
                                          JOptionPane.showInputDialog("Hay una coincidencia, vuelva a escribir");
                                      }
                                      else if(mm==fil && nn==2){
                                          JOptionPane.showInputDialog("Hay una coincidencia, vuelva a escribir");
                                      }
                                      else if(mm!=fil && nn==1){
                                          JOptionPane.showInputDialog("Hay una coincidencia, vuelva a escribir");
                                      }
                                      else if(mm!=fil && nn==2){
                                          JOptionPane.showInputDialog("Hay una coincidencia, vuelva a escribir");
                                      }
                                      else if(mm!=fil && nn==3){
                                          JOptionPane.showInputDialog("Hay una coincidencia, vuelva a escribir");
                                      }
                                      
                                   }
                               }
                           }
                    }
                }
        
            }
            
            
        miFrame.repaint();
    }
    
}
