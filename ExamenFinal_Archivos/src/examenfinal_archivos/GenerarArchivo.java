/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal_archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Wilson Pop
 */
public class GenerarArchivo {
    public String crearArchivo(String valor){
    String a="";
    File archivo;
    FileWriter escribir=null;
    PrintWriter linea=null;
    archivo = new File ("Datos.txt");
    
      if(!archivo.exists()){
           try {
               archivo.createNewFile();
               escribir = new FileWriter(archivo);
               linea = new PrintWriter(escribir);
               linea.print(valor);
               linea.close();
               escribir.close();
           } catch (IOException ex) {
               Logger.getLogger(GenerarArchivo.class.getName()).log(Level.SEVERE, null, ex);
           }
        
        }else{
            try {
               escribir = new FileWriter(archivo);
               linea = new PrintWriter(escribir);
               linea.print(valor);
               linea.close();
               escribir.close();
           } catch (IOException ex) {
               Logger.getLogger(GenerarArchivo.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    
    
       
    
    return a;
}
    
}
