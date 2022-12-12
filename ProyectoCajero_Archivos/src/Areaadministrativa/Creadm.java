
package Areaadministrativa;

import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.util.Formatter;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Wilson Pop
 */
public class Creadm {
    //En esta parte creo la carpeta de administrador en el mismo archivo de nuestro proyecto
    String separador = File.separator;
    String ubicacion = System.getProperty("user.dir")+separador+"Administradores"+separador;
    
    public int Creacionadmin(String nombre, String apellido, String pin, String clave, String claveca){
        String archivo = pin + ".txt";
        File creaub = new File (ubicacion); //crear la ubicacion
        File crearchivo = new File (ubicacion+archivo);//crear archivo en esa ubicacion
        int decision = 0;
                
        if(claveca.equals("1234")){
            if(pin.equals("")){
                decision =0;
            }else{
                
                try {
                    if(crearchivo.exists()){
                        decision =1;
                    }else{
                        creaub.mkdirs();
                        Formatter crea = new Formatter(ubicacion+archivo);
                        //esta parte para darle formato al texto
                        crea.format("%s\r\n%s\r\n%s\r\n%s", "nombre="+nombre,"apellido="+apellido,"pin="+pin,"clave="+clave);
                        crea.close();
                        decision =2;
                    }
                    
                } catch (Exception e) {
                    decision =3;
                }
            }
        }else{
            decision =4;
        }
        
        return decision;
        
    }
    
    public int Leeradm(String nombre,String pin,String clave){
        int x=0;
        String nom ="";
        String ap ="";
        String cl = "";
        String pn = "";
        
        File url = new File (ubicacion+pin+".txt");
        
        if(pin.equals("")){
           //error de usuario no registrado
           x=0;
        }else{
            if(url.exists()){
                try {
                    FileInputStream fis = new FileInputStream(url);
                    Properties mostrar = new Properties();
                    mostrar.load(fis);
                    nom = (mostrar.getProperty("nombre"));
                    pn = (mostrar.getProperty("pin"));
                    cl = (mostrar.getProperty("clave"));
                        if(nom.equals(nombre) && cl.equals(clave)){
                            x=1;
                        }else{
                            x=2;
                        }
                    
                    
                } catch (Exception e) {
                }
            }else{
                //no existe tal archivo
                x=3;
            }
        
        }
        
        return x;
    }

    
    
    
    
    
}
