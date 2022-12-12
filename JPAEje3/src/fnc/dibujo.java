package fnc;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class dibujo extends Canvas{
    int tam=18;
    int[][] mat=new int[7][16];
    
    //Constructor de la Clase.
    public dibujo()
    {
        this.setSize (450, 450);
        for(int y=1;y<=16;y++){
            for(int x=1;x<=7;x++){
                mat[x-1][y-1]=0;
            }
        }
        
        mat[2][2]=1;
        mat[3][2]=2;
    }

    public void paint(Graphics g)
    {
        
        for(int y=1;y<=16;y++){
            for(int x=1;x<=7;x++){
                if(mat[x-1][y-1]==0){
                    g.setColor(Color.black);
                    g.drawRect(10+(tam*x), 10+(tam*y), tam, tam);
                }else if(mat[x-1][y-1]==1){
                    g.setColor(Color.BLUE);
                    g.fillRect(10+(tam*x), 10+(tam*y), tam, tam);
                }else if(mat[x-1][y-1]==2){
                    
                    g.setColor(Color.GREEN);
                    g.fillRect(10+(tam*x), 10+(tam*y), tam, tam);
                }
                
            }
        }
        
        g.drawString("hola", 10, 10);
    }    
    
    public void cambiar(){
        for(int y=16;y>=1;y--){
            for(int x=1;x<=7;x++){
                if (y>2){
                    if (mat[x-1][y-1]==0 && mat[x-1][y-2]!=0){
                        mat[x-1][y-1]=mat[x-1][y-2];
                        mat[x-1][y-2]=0;
                    }
                }
                System.out.print(" "+mat[x-1][y-1]);
            }
            System.out.print("\n");
        }
    }
}