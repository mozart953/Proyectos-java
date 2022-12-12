/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evaluacion2_WilsonPop_201840972_;
import java.io.*;

/**
 *
 * @author Wilson Pop
 */
public class datos {
    public static void main(String[] args) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        try{
            fichero = new FileWriter("");
            pw = new PrintWriter(fichero);
            pw.println();
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try {
                if(null != fichero){
                    fichero.close();
                }
            }catch(Exception e2){
                e2.printStackTrace();
            }
        
        }
        
    }
    
    
}
