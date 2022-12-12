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
public class Crearusuar {
     //En esta parte creo la carpeta de administrador en el mismo archivo de nuestro proyecto
    String separador = File.separator;
    String ubicacion1 = System.getProperty("user.dir")+separador+"cajerousuarios"+separador;
    
    public int Creacionadmin(String nombre, String tarjeta, String pin, String monto){
        String archivo = pin + ".txt";
        File creaub = new File (ubicacion1); //crear la ubicacion
        File crearchivo = new File (ubicacion1+archivo);//crear archivo en esa ubicacion
        int decision = 0;
        String saldo ="0";
        String retiro ="0";
        String deposito ="0";
        
            if(pin.equals("")){
                decision =0;
            }else{
                
                try {
                    if(crearchivo.exists()){
                        decision =1;
                    }else{
                        creaub.mkdirs();//crear ubicacion
                        Formatter crea = new Formatter(ubicacion1+archivo);
                        //esta parte para darle formato al texto
                        crea.format("%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s", "nombre="+nombre,
                                "tarjeta="+tarjeta,"pin="+pin,"monto="+monto, "saldo="+saldo
                                ,"retiro="+retiro, "deposito="+deposito);
                        crea.close();
                        decision =2;
                    }
                    
                } catch (Exception e) {
                    decision =3;
                }
            }
        
        
        return decision;
        
    }
    
     public int Modificartarjeta (String nombre,String tarjeta,String pin, String monto, String saldo, String ret, String dep){
      
        int x=0;
        File url = new File (ubicacion1+pin+".txt");
        
            if(pin.equals("")){
                x=0;
            }else{
                if(url.exists()){
                        
                    try {
                        FileWriter escribir = new FileWriter(ubicacion1+pin+".txt");
                        String nombre1 = "nombre=";
                        String tarjeta1 = "tarjeta=";
                        String pin1 = "pin=";
                        String monto1 = "monto=";
                        String saldo1 = "saldo=";
                        String retiro1 = "retiro=";
                        String deposito1 = "deposito=";
                        PrintWriter guardar = new PrintWriter(escribir);
                        
                        guardar.println(nombre1+nombre);
                        guardar.println(tarjeta1+tarjeta);
                        guardar.println(pin1+pin);
                        guardar.println(monto1+monto);
                        guardar.println(saldo1+saldo);
                        guardar.println(retiro1+ret);
                        guardar.println(deposito1+dep);
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
   
    public String[] Leerusuario1(String pin){
        int x=0;
        String registro[]= new String [7];
        String nom ="";
        String tarj1 ="";
        String pin1= "";
        String mon1 = "";
        String sal = "";
        String ret = "";
        String dep = "";
        
        File url = new File (ubicacion1+pin+".txt");
        
        if(pin.equals("")){
           //error de usuario no registrado
           registro [0]="-1";
        }else{
            if(url.exists()){
                try {
                    FileInputStream fis = new FileInputStream(url);
                    Properties mostrar = new Properties();
                    mostrar.load(fis);
                    nom = (mostrar.getProperty("nombre"));
                    tarj1 = (mostrar.getProperty("tarjeta"));
                    pin1 = (mostrar.getProperty("pin"));
                    mon1 = (mostrar.getProperty("monto"));
                    sal = (mostrar.getProperty("saldo"));
                    ret = (mostrar.getProperty("retiro"));
                    dep = (mostrar.getProperty("deposito"));
                    
                    registro[0]=nom;    
                    registro[1]=tarj1;
                    registro[2]=pin1;
                    registro[3]=mon1;
                    registro[4]=sal;
                    registro[5]=ret;
                    registro[6]=dep;
                    
                } catch (Exception e) {
                    registro [1] = "-2";
                }
            }else{
                //no existe tal archivo
                registro[2]="-3";
            }
        
        }
        
        return registro;
    }

    public int Leerusuario2(String pin, String tarjeta){
        int x=0;
        String nom ="";
        String ap ="";
        String cl = "";
        String pn = "";
        
        File url = new File (ubicacion1+pin+".txt");
        
        if(pin.equals("")){
           //error de usuario no registrado
           x=0;
        }else{
            if(url.exists()){
                try {
                    FileInputStream fis = new FileInputStream(url);
                    Properties mostrar = new Properties();
                    mostrar.load(fis);
                    nom = (mostrar.getProperty("tarjeta"));
                    pn = (mostrar.getProperty("pin"));
                        if(nom.equals(tarjeta) && pn.equals(pin)){
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
