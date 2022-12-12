/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Areaadministrativa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Properties;

/**
 *
 * @author Wilson Pop
 */
public class InicializarCajero {
    
    String separador = File.separator;
    String ubicacion2 = System.getProperty("user.dir")+separador+"Cajeroinicializado"+separador;
    
    public int Inicializar(String nombre,int total, int cant1, int cant2, int cant3, int cant4,int cant5,int cant6,int cant7){
        String tot = nombre;
        String archivo = tot + ".txt";
        File creaub = new File (ubicacion2); //crear la ubicacion
        File crearchivo = new File (ubicacion2+archivo);//crear archivo en esa ubicacion
        int decision = 0;
        
            if(tot.equals("")){
                decision =0;
            }else{
                
                try {
                    if(crearchivo.exists()){
                        decision =1;
                    }else{
                        creaub.mkdirs();
                        Formatter crea = new Formatter(ubicacion2+archivo);
                        //esta parte para darle formato al texto
                        crea.format("%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s", "total="+Integer.toString(total),"cantidad1="
                                +Integer.toString(cant1),"cantidad2="+Integer.toString(cant2)
                                ,"cantidad3="+Integer.toString(cant3),"cantidad4="+Integer.toString(cant4)
                                ,"cantidad5="+Integer.toString(cant5),"cantidad6="+Integer.toString(cant6)
                                ,"cantidad7="+Integer.toString(cant7));
                        crea.close();
                        decision =2;
                    }
                    
                } catch (Exception e) {
                    decision =3;
                }
            }     
        
        return decision;
        
    }
    
    public int Modificar (String nombre,int total, int cant1, int cant2, int cant3, int cant4,int cant5,int cant6,int cant7){
      
        int x=0;
        File url = new File (ubicacion2+nombre+".txt");
        
            if(nombre.equals("")){
                x=0;
            }else{
                if(url.exists()){
                        
                    try {
                        FileWriter escribir = new FileWriter(ubicacion2+nombre+".txt");
                        String tot = "total=";
                        String ca1 = "cantidad1="; 
                        String ca2 = "cantidad2=";
                        String ca3 = "cantidad3=";
                        String ca4 = "cantidad4=";
                        String ca5 = "cantidad5=";
                        String ca6 = "cantidad6=";
                        String ca7 = "cantidad7=";
                        
                        PrintWriter guardar = new PrintWriter(escribir);
                        guardar.println(tot+Integer.toString(total));
                        guardar.println(ca1+Integer.toString(cant1));
                        guardar.println(ca2+Integer.toString(cant2));
                        guardar.println(ca3+Integer.toString(cant3));
                        guardar.println(ca4+Integer.toString(cant4));
                        guardar.println(ca5+Integer.toString(cant5));
                        guardar.println(ca6+Integer.toString(cant6));
                        guardar.print(ca7+Integer.toString(cant7));
                        
                        escribir.close();
                        
                        x=1;
                        
                    } catch (Exception e) {
                        x=2;
                    }
                }else{
                    x=3;
                }
                
                
            
            }
        
        
        return x;
    }
    //para leer el cajero antes de agregar efectivo
    
    public int [] Consultacajero(String nombre,int total, int cant1, int cant2, int cant3, int cant4,int cant5,int cant6,int cant7){
        int caja1 [] = new int[8];
        int x=0;
        int tot1=0;
        String tot ="";
        String ct1 ="";
        String ct2 = "";
        String ct3 = "";
        String ct4 = "";
        String ct5 = "";
        String ct6 = "";
        String ct7 = "";
        
        File url = new File (ubicacion2+nombre+".txt");
        
        if(nombre.equals("")){
           
           caja1[0]=-1;
        }else{
            if(url.exists()){
                try {
                    FileInputStream fis = new FileInputStream(url);
                    Properties mostrar = new Properties();
                    mostrar.load(fis);
                    tot = (mostrar.getProperty("total"));
                    ct1 = (mostrar.getProperty("cantidad1"));
                    ct2 = (mostrar.getProperty("cantidad2"));
                    ct3 = (mostrar.getProperty("cantidad3"));    
                    ct4 = (mostrar.getProperty("cantidad4"));
                    ct5 = (mostrar.getProperty("cantidad5"));
                    ct6 = (mostrar.getProperty("cantidad6"));
                    ct7 = (mostrar.getProperty("cantidad7"));
                    tot1 = Integer.parseInt(tot);
                    
                    if(tot1>0){
                        caja1[0]=tot1+total;
                        caja1[1]=Integer.parseInt(ct1)+cant1;
                        caja1[2]=Integer.parseInt(ct2)+cant2;
                        caja1[3]=Integer.parseInt(ct3)+cant3;
                        caja1[4]=Integer.parseInt(ct4)+cant4;
                        caja1[5]=Integer.parseInt(ct5)+cant5;
                        caja1[6]=Integer.parseInt(ct6)+cant6;
                        caja1[7]=Integer.parseInt(ct7)+cant7;
                    }else{
                        caja1[0]=-4;
                    }
                    
                    
                } catch (Exception e) {
                    caja1[0]=-3;
                }
            }else{
                //no existe tal archivo
                caja1[0]=-2;
            }
        
        }
        
        return caja1;
    }
    
    
    
    
    public int Leeradm(String nombre,String pin,String clave){
        int x=0;
        String nom ="";
        String ap ="";
        String cl = "";
        String pn = "";
        
        File url = new File (ubicacion2+pin+".txt");
        
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
