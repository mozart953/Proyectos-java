/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evaluacion2_WilsonPop_201840972_;

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
public class Crearchivotipos {
    
   
    
    public String Encontrartipos(String par[], String descripcion[]){
       File archivo;
       FileWriter escribir=null;
       PrintWriter linea=null;
       archivo = new File ("tipos.txt");
        
        String tipos []=par;
        String idents[]=descripcion;
        String aux []= new String [par.length];
        String aux1 = "";
        boolean inte = true;
        String aux2 = "";
        String aux3 = "";
       
        
        for(int x=1;x<par.length-1;x++){
           // System.out.println(tipos[x]);
           // System.out.println(idents[x]);
            
            if(idents[x].equals("palabra reservada")){
                inte =true;
                aux1 = idents[x];
                aux3 = tipos[x];
            }
            else if((idents[x].equals("Identificador") && idents[x-1].equals("palabra reservada" )) && inte==true){
                aux2+= aux3 + " " +tipos[x]+ "\n"; 
            }
            else if((idents[x].equals("Identificador") && idents[x-1].equals("desconocido" )) && inte==true){
                if(tipos[x].equals(tipos[x-2])){
                    System.out.println("Existen repetidos");
                }else{
                    aux2+= aux3 + " " + tipos[x]+ "\n";
                }
                
            }
            else if(idents[x].equals("simbolo final")){
                inte = false;
                aux1 ="";
                aux3="";
            }
            else{}
            
        }
        
        System.out.println(aux2);
        
        if(!archivo.exists()){
           try {
               archivo.createNewFile();
               escribir = new FileWriter(archivo);
               linea = new PrintWriter(escribir);
               linea.print(aux2);
               linea.close();
               escribir.close();
           } catch (IOException ex) {
               Logger.getLogger(Crearchivotipos.class.getName()).log(Level.SEVERE, null, ex);
           }
        
        }else{
            try {
               escribir = new FileWriter(archivo);
               linea = new PrintWriter(escribir);
               linea.print(aux2);
               linea.close();
               escribir.close();
           } catch (IOException ex) {
               Logger.getLogger(Crearchivotipos.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        
        return aux2;
        
    }
    
    public String Encontraroperadores(String par[], String descripcion[]){
       File archivo;
       FileWriter escribir=null;
       PrintWriter linea=null;
       archivo = new File ("operaciones.txt");
        
        String tipos []=par;//palabras
        String idents[]=descripcion;
        String aux1 ="";
        String aux2 ="";
        String aux3 = "";
        boolean inte = true;
        int cont = 0;
        
        for(int x=1;x<par.length-1;x++){
            
            if(idents[x].equals("operador")  && (idents[x-1].equals("Identificador") && idents[x+1].equals("Identificador") )){
                aux1=tipos[x];
                if(aux1.equals("+") || aux1.equals("-")|| aux1.equals("*")|| aux1.equals("/") ){
                    aux2 +="var" + cont+"= "+ tipos[x-1]+tipos[x]+tipos[x+1]+ "\n" ;  
                    tipos[x+1]="var" + cont ;
                    cont++;
                }else{}
             
            }
            else if(idents[x].equals("simbolo final")){
               //aux2 += "-------------------------\n";
            }
        
        }
        
        System.out.println(aux2);
        
        
        if(!archivo.exists()){
           try {
               archivo.createNewFile();
               escribir = new FileWriter(archivo);
               linea = new PrintWriter(escribir);
               linea.print(aux2);
               linea.close();
               escribir.close();
           } catch (IOException ex) {
               Logger.getLogger(Crearchivotipos.class.getName()).log(Level.SEVERE, null, ex);
           }
        
        }else{
            try {
               escribir = new FileWriter(archivo);
               linea = new PrintWriter(escribir);
               linea.print(aux2);
               linea.close();
               escribir.close();
           } catch (IOException ex) {
               Logger.getLogger(Crearchivotipos.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        
        
        
        return aux2;
    }
    
    public String Proton(String par[], String descripcion[]){
       File archivo;
       FileWriter escribir=null;
       PrintWriter linea=null;
       archivo = new File ("codigofinal.hex");
        
        
        String tipos []=par;
        String idents[]=descripcion;
        String aux []= new String [par.length];
        String aux1 = "";
        boolean inte = false;
        boolean inte2= false;
        boolean inte3=false;
        boolean inte4=false;
        boolean inte5=false;
        boolean inte6=false;
        int contlin=0;
        int contline=0;
        int pat=42;
        int pats=0;
        String aci="";
        String aux2 = "";
        String aux3 = "";
        String aux4 = "";
        int contador = 0;
        int contador2 =0;
        int contador3=0;
        int contador4=0;
        String acumulador2 ="";
        String acumulador3="";
        String acumulador4="";
        String acu="";
        String aux8="";
        boolean st1 = false;
        int nolinea=0;
        int decontadore=213;
        int empe=213;
        String acumx="";
        int lin = 256;
        int pat1 [] = new int [par.length];
        int lineares [] = new int [par.length];
        String nomvar [] = new String [par.length];
        int contpat=0;
        
        for(int x=1;x<par.length-1;x++){
           // System.out.println(tipos[x]);
           // System.out.println(idents[x]);
            
            if(idents[x].equals("palabra reservada")){
                
                if(tipos[x].equals("TRISA") || tipos[x].equals("TRISB") 
                        || tipos[x].equals("PORTA")|| tipos[x].equals("PORTB")|| tipos[x].equals("IR")
                        || tipos[x].equals("Declara") || tipos[x].equals("Delay")){
                    
                    if(tipos[x].equals("PORTA")|| tipos[x].equals("PORTB")){
                        inte =true;
                        aux1 = idents[x];
                        aux3 = tipos[x];
 
                    }
                    else if(tipos[x].equals("TRISA") || tipos[x].equals("TRISB")){
                        inte2 =true;
                        aux1 = idents[x];
                        aux3 = tipos[x];                    
                    }
                    else if (tipos[x].equals("Declara")){
                        inte3 =true;
                        aux1 = idents[x];
                        aux3 = tipos[x]; 
                    }
                    else if (tipos[x].equals("IR")){
                        inte4 =true;
                        aux1 = idents[x];
                        aux3 = tipos[x];
                    }
                    else if (tipos[x].equals("Delay")){
                        inte6=true;
                    }else{}
                   
                }
                else if(tipos[x].equals("Device")){
                    acumulador4+="0128";
                    contador3=2;
                    aux8 = Hexadecimal(contador3);
                    acumx=Hexadecimal(empe/16)+Hexadecimal(empe%16);
                    acumulador2= ":"+Integer.toString(contador4)+ aux8+"00"+nolinea+"000"+acumulador4+acumx;
                    acu=acumulador3+acumulador2;
                }else{
                    contador3=2;
                    aux8 = Hexadecimal(contador3);
                    acumulador2= ":"+Integer.toString(contador4)+Integer.toString(contador3);
                }
                
            }
            else if((idents[x].equals("Identificador") && idents[x-1].equals("palabra reservada" )) && inte==true){
                if(tipos[x-1].equals("PORTA")|| tipos[x-1].equals("PORTB")){
                    if(tipos[x].equals("A")|| tipos[x].equals("B") || tipos[x].equals("C")
                            || tipos[x].equals("D") ||tipos[x].equals("E")||tipos[x].equals("F")
                            ||tipos[x].equals("G")||tipos[x].equals("H") || tipos[x].equals("a")){
                        //
                        if(decontadore==41){
                            inte5=true;
                            if(tipos[x-1].equals("PORTA")){
                                contador3=contador3+2;
                                acumulador4+="8312"+TablaPuertos1(aux3, tipos[x]);
                            }else if(tipos[x-1].equals("PORTB")){
                                contador3=contador3+2;
                                acumulador4+="8312"+TablaPuertos1(aux3, tipos[x]);
                            }
                            
                        }else{
                            contador3++;
                            acumulador4+=TablaPuertos1(aux3, tipos[x]);
                        }
                        //
                         
                        if(contador3<16){
                            aux8 = Hexadecimal(contador3);
                            acumulador2= ":"+Integer.toString(contador4)+ aux8+"00"+nolinea+"000"+acumulador4;
                            acu = acumulador3+acumulador2;
                        }
                        else if(contador3==16){
                            contador3=0;
                            contador4=1;   
                            aux8 = Hexadecimal(contador3);
                            acumulador2= ":"+Integer.toString(contador4)+ aux8+"00"+nolinea+"000"+acumulador4+"\n";
                            acumulador3+=acumulador2;
                            acu=acumulador3;
                            contador4=0;
                            acumulador4="";
                            nolinea++;
                            st1=true;
                        }else{}
                        //
                        System.out.println(tipos[x-1] + " " + tipos[x] + " sin error de declaracion.");
                    }else{
                        
                        System.out.println("Error: "+tipos[x-1] + " " + tipos[x] + " no existe."  );
                    }
                
                }else{}
            }
            else if((idents[x].equals("Identificador") && idents[x-1].equals("operador")) && inte==true){
                if(tipos[x].equals("1") || tipos[x].equals("0")){
                        //
                        if(decontadore==41){
                            
                            if(tipos[x-3].equals("PORTA")){
                                if(tipos[x-2].equals("a")){
                                    decontadore=10;
                                }else{
                                    decontadore=123;
                                }
                                
                                acumx=Hexadecimal(decontadore/16)+Hexadecimal(decontadore%16);
                                contador3=contador3+2;
                                acumulador4+=Pines(tipos[x-2], tipos[x]);
                            }else if(tipos[x-3].equals("PORTB")){
                                if(tipos[x-2].equals("a")){
                                    decontadore=9;
                                }else{
                                    decontadore=122;
                                }
                                
                                acumx=Hexadecimal(decontadore/16)+Hexadecimal(decontadore%16);
                                contador3=contador3+2;
                                acumulador4+=Pines(tipos[x-2], tipos[x]);
                            }else{}
                            
                        }else{
                            //codigo que ajusta los valores al codigo de linea
                            if(decontadore>=0){
                                decontadore = decontadore - descontar(tipos[x-3], tipos[x-2],tipos[x]);
                                if(decontadore<0){
                                    //por si descubro que no esta bien siempre es lin la variable en vez de 256
                                    decontadore = 256 +decontadore;
                                }else{}
                                
                            }else if(decontadore<0){
                                //lo mismo aqui
                                decontadore = 256 +decontadore;
                            }
                            
                            acumx=Hexadecimal(decontadore/16)+Hexadecimal(decontadore%16);
                            contador3++;
                            acumulador4+=Pines(tipos[x-2], tipos[x]);
                        }
                        //
                                                
                        if(contador3<16){
                            aux8 = Hexadecimal(contador3);
                            acumulador2= ":"+Integer.toString(contador4)+ aux8+"00"+nolinea+"000"+acumulador4+acumx;
                            acu = acumulador3+acumulador2;
                        }
                        else if(contador3==16){
                            contador3=0;
                            contador4=1;   
                            aux8 = Hexadecimal(contador3);
                            acumulador2= ":"+Integer.toString(contador4)+ aux8+"00"+nolinea+"000"+acumulador4+acumx+"\n";
                            acumulador3+=acumulador2;
                            acu=acumulador3;
                            contador4=0;
                            acumulador4="";
                            nolinea++;
                            st1=true;
                            lin = lin -16;
                            if(lin==0){
                                lin=256;
                            }else{}
                            decontadore=lin;
                        }else{}
                        //
                    System.out.println("Sin error");
                }else{
                    System.out.println("Error, el puerto debe tener el valor de 1 o 0");
                }
                
            }
            else if((idents[x].equals("Identificador") && idents[x-1].equals("palabra reservada" )) && inte2==true){
                    if(tipos[x].equals("a")|| tipos[x].equals("b")){
                        //
                        inte5=true;
                        if(tipos[x-1].equals("TRISA")){
                            contador3 = contador3+2;
                        }else{
                            contador3++;
                        }
                        
                        acumulador4+=TablaPuertos1(aux3, tipos[x]);
                        if(contador3<16){
                            aux8 = Hexadecimal(contador3);
                            acumulador2= ":"+Integer.toString(contador4)+ aux8+"00"+nolinea+"000"+acumulador4;
                            acu = acumulador3+acumulador2;
                        }
                        else if(contador3==16){
                            contador3=0;
                            contador4=1;   
                            aux8 = Hexadecimal(contador3);
                            acumulador2= ":"+Integer.toString(contador4)+ aux8+"00"+nolinea+"000"+acumulador4+"\n";
                            acumulador3+=acumulador2;
                            acu=acumulador3;
                            contador4=0;
                            nolinea++;
                            st1=true;
                        }else{}
                        //
                        
                        System.out.println(tipos[x-1] + " " + tipos[x] + " sin error de declaracion.");
                    }else{
                        
                        System.out.println("Error: "+tipos[x-1] + " " + tipos[x] + " no existe."  );
                    }
            }
            else if((idents[x].equals("Identificador") && idents[x-1].equals("operador")) && inte2==true){
                aux4=tipos[x];
                if(tipos[x].length() <= 8){
                    for(int kr=0;kr<tipos[x].length();kr++){
                        if(aux4.charAt(kr) == '1' || aux4.charAt(kr) == '0' ){
                            contador2++;
                        }else{
                            contador++;
                        }
                    }
                    
                    if(contador>0){
                        System.out.println("Alguno de los TRIS contiene error en sus caracteres...");
                        contador=0;
                    }else{
                        //
                        if(tipos[x-3].equals("TRISA")){
                            contador3 = contador3+2;
                        }else{
                            contador3++;
                        }
                        
                        decontadore = decontadore - descontar(tipos[x-3], tipos[x-2],tipos[x]);
                        acumx=Hexadecimal(decontadore/16)+Hexadecimal(decontadore%16);
                        acumulador4+=Pines(tipos[x-2], tipos[x]);
                        
                        if(contador3<16){
                            aux8 = Hexadecimal(contador3);
                            acumulador2= ":"+Integer.toString(contador4)+ aux8+"00"+nolinea+"000"+acumulador4+acumx;
                            acu = acumulador3+acumulador2;
                        }
                        else if(contador3==16){
                            contador3=0;
                            contador4=1;   
                            aux8 = Hexadecimal(contador3);
                            acumulador2= ":"+Integer.toString(contador4)+ aux8+"00"+nolinea+"000"+acumulador4+"\n";
                            acumulador3+=acumulador2;
                            acu=acumulador3;
                            contador4=0;
                            nolinea++;
                            st1=true;
                        }else{}
                        //
                        System.out.println("No hay error en el TRIS...");
                    }
                    
                }else{
                    System.out.println("El byte necesita una longitud de 8 bits");
                }
                
                
                aux4="";
            }
            else if((idents[x].equals("Identificador") && idents[x-1].equals("palabra reservada" )) && inte3==true){
                
                if(inte5==true){
                    contline=contlin+2;
                    pat=pat+2;
                    pats=pat;
                    lineares[contpat]=contline;
                    pat1[contpat]= pats;
                    nomvar[contpat] = tipos[x];
                    contpat++;
                    //por si se necesitan declarar mas, se ajusta
                    contlin=contlin-1;
                    pat=pat-3;
                }else{
                    //pat++;
                    contline=contlin;
                    pats=pat;
                    lineares[contpat]=contline;
                    pat1[contpat]= pats;
                    nomvar[contpat] = tipos[x];
                    contpat++;
                    //por si se necesitan declarar mas, se ajusta
                    contlin=contlin-1;
                    pat=pat-1;
                }
            }
            else if((idents[x].equals("Identificador") && idents[x-1].equals("palabra reservada" )) && inte4==true){
                     //codigo que ajusta los valores al codigo de linea
                            if(decontadore>=0){
                                
                              for(int ui=0;ui<contpat;ui++){
                                  if(tipos[x].equals(nomvar[ui])){
                                    decontadore = decontadore - pat1[ui];
                                  }else{}
                              }  
                                
                            //    decontadore = decontadore -pats;
                                if(decontadore<0){
                                    //cambiar a lin si no revise bien el 256
                                    decontadore = 256 +decontadore;
                                }else{}
                                
                            }else if(decontadore<0){
                                decontadore = 256 +decontadore;
                            }
                            
                            for(int up=0;up<contpat;up++){
                                  if(tipos[x].equals(nomvar[up])){
                                    acumx=Hexadecimal(lineares[up]/16)+Hexadecimal(lineares[up]%16);
                                  }else{}
                            }
                            
                            //acumx=Hexadecimal(contline/16)+Hexadecimal(contline%16);
                            contador3=contador3+2;
                            acumulador4+=acumx+"28";
                            acumx=Hexadecimal(decontadore/16)+Hexadecimal(decontadore%16);
                            
                        if(contador3<16){
                            aux8 = Hexadecimal(contador3);
                            acumulador2= ":"+Integer.toString(contador4)+ aux8+"00"+nolinea+"000"+acumulador4+acumx;
                            acu = acumulador3+acumulador2;
                        }
                        else if(contador3==16){
                            contador3=0;
                            contador4=1;   
                            aux8 = Hexadecimal(contador3);
                            acumulador2= ":"+Integer.toString(contador4)+ aux8+"00"+nolinea+"000"+acumulador4+acumx+"\n";
                            acumulador3+=acumulador2;
                            acu=acumulador3;
                            contador4=0;
                            acumulador4="";
                            nolinea++;
                            st1=true;
                            lin = lin -16;
                            if(lin==0){
                                lin=256;
                            }else{}
                            decontadore=lin;
                        }else{}    
                            
            }
            
            else if(idents[x].equals("simbolo final")){
                inte = false;
                inte2=false;
                inte3=false;
                inte4=false;
                pat++;
                contlin++;
                aux1 ="";
                aux3="";
            }
            else{}
            
        }
        
        if(contador3==0){
            acu+=":02400E00223F4F\n:00000001FF";
        }
        else{
            acu+="\n:02400E00223F4F\n:00000001FF";
        }
        
        if(inte6==true){
            acu=Dela("a");
        }else{}
        System.out.println(acu);
        
        if(!archivo.exists()){
           try {
               archivo.createNewFile();
               escribir = new FileWriter(archivo);
               linea = new PrintWriter(escribir);
               linea.print(acu);
               linea.close();
               escribir.close();
           } catch (IOException ex) {
               Logger.getLogger(Crearchivotipos.class.getName()).log(Level.SEVERE, null, ex);
           }
        
        }else{
            try {
               escribir = new FileWriter(archivo);
               linea = new PrintWriter(escribir);
               linea.print(acu);
               linea.close();
               escribir.close();
           } catch (IOException ex) {
               Logger.getLogger(Crearchivotipos.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        
        
        
        
        
        return aux2;
    
    }
    
    public String Hexadecimal(int contador){
        String simbolos [] = new String [16];
        String aux ="";
        /*
        simbolos[0]="0";
        simbolos[1]="1";
        simbolos[2]="2";
        simbolos[3]="3";
        simbolos[4]="4";
        simbolos[5]="5";
        simbolos[6]="6";
        simbolos[7]="7";
        simbolos[8]="8";
        simbolos[9]="9";
        simbolos[10]="A";
        simbolos[11]="B";
        simbolos[12]="C";
        simbolos[13]="D";
        simbolos[14]="E";
        simbolos[15]="F";*/
        
        if(contador==0){
            aux="0";
        }
        else if(contador==1){
            aux="1";
        }
        else if(contador==2){
            aux="2";
        }
        else if(contador==3){
            aux="3";
        }
        else if(contador==4){
            aux="4";
        }
        else if(contador==5){
            aux="5";
        }
        else if(contador==6){
            aux="6";
        }
        else if(contador==7){
            aux="7";
        }
        else if(contador==8){
            aux="8";
        }
        else if(contador==9){
            aux="9";
        }
        else if(contador==10){
            aux="A";
        }
        else if(contador==11){
            aux="B";
        }
        else if(contador==12){
            aux="C";
        }
        else if(contador==13){
            aux="D";
        }
        else if(contador==14){
            aux="E";
        }
        else if(contador==15){
            aux="F";
        }else{}
        
        
        return aux;
        
    }
    
    public String TablaPuertos1(String puerto, String pin){
        String devolver ="";
            
            if(puerto.equals("PORTA") && pin.equals("A")){
                devolver="05";
            }
            else if(puerto.equals("PORTA") && pin.equals("B")){
                devolver="85";
            }
            else if(puerto.equals("PORTA") && pin.equals("C")){
                devolver="05";
            }
            else if(puerto.equals("PORTA") && pin.equals("D")){
                devolver="85";
            }
            else if(puerto.equals("PORTA") && pin.equals("E")){
                devolver="05";
            }
            else if(puerto.equals("PORTA") && pin.equals("F")){
                devolver="85";
            }
            else if(puerto.equals("PORTA") && pin.equals("G")){
                devolver="05";
            }
            else if(puerto.equals("PORTA") && pin.equals("H")){
                devolver="85";
            }
            else if(puerto.equals("PORTB") && pin.equals("A")){
                devolver="06";
            }
            else if(puerto.equals("PORTB") && pin.equals("B")){
                devolver="86";
            }
            else if(puerto.equals("PORTB") && pin.equals("C")){
                devolver="06";
            }
            else if(puerto.equals("PORTB") && pin.equals("D")){
                devolver="86";
            }
            else if(puerto.equals("PORTB") && pin.equals("E")){
                devolver="06";
            }
            else if(puerto.equals("PORTB") && pin.equals("F")){
                devolver="86";
            }
            else if(puerto.equals("PORTB") && pin.equals("G")){
                devolver="06";
            }
            else if(puerto.equals("PORTB") && pin.equals("H")){
                devolver="86";
            }
            else if(puerto.equals("TRISA") && pin.equals("a")){
                devolver="831685";
            }
            else if(puerto.equals("TRISA") && pin.equals("b")){
                devolver="831685";
            }
            else if(puerto.equals("TRISB") && pin.equals("a")){
                devolver="86";
            }
            else if(puerto.equals("TRISB") && pin.equals("b")){
                devolver="86";
            }
            else if(puerto.equals("PORTA") && pin.equals("a")){
                devolver="85";
            }
            else if(puerto.equals("PORTB") && pin.equals("a")){
                devolver="86";
            }else{}
            
        return devolver;
    }
    
    public String Pines(String puerto, String interruptor){
        String devolver ="";
        if(interruptor.equals("0") && puerto.equals("A")){
            devolver="10";
        }
        else if(interruptor.equals("0") && puerto.equals("B")){
            devolver="10";
        }
        else if(interruptor.equals("0") && puerto.equals("C")){
            devolver="11";
        }
        else if(interruptor.equals("0") && puerto.equals("D")){
            devolver="11";
        }
        else if(interruptor.equals("0") && puerto.equals("E")){
            devolver="12";
        }
        else if(interruptor.equals("0") && puerto.equals("F")){
            devolver="12";
        }
        else if(interruptor.equals("0") && puerto.equals("G")){
            devolver="13";
        }
        else if(interruptor.equals("0") && puerto.equals("H")){
            devolver="13";
        }
        else if(interruptor.equals("1") && puerto.equals("A")){
            devolver="14";
        }
        else if(interruptor.equals("1") && puerto.equals("B")){
            devolver="14";
        }
        else if(interruptor.equals("1") && puerto.equals("C")){
            devolver="15";
        }
        else if(interruptor.equals("1") && puerto.equals("D")){
            devolver="15";
        }
        else if(interruptor.equals("1") && puerto.equals("E")){
            devolver="16";
        }
        else if(interruptor.equals("1") && puerto.equals("F")){
            devolver="16";
        }
        else if(interruptor.equals("1") && puerto.equals("G")){
            devolver="17";
        }
        else if(interruptor.equals("1") && puerto.equals("H")){
            devolver="17";
        }
        else if (interruptor.equals("0") && puerto.equals("a")){
            devolver="01";
        }
        else if (interruptor.equals("1") && puerto.equals("b")){
            devolver="00";
        }
        else{}
        
        
        return devolver;
    }
    
    public int descontar(String puerto, String pin,String valor){
        int descontador =0;
            if(puerto.equals("PORTA") && pin.equals("A")){
                if(valor.equals("0")){
                    descontador=23;
                }else{
                    descontador=27;
                }
                
            }
            else if(puerto.equals("PORTA") && pin.equals("B")){
                if(valor.equals("0")){
                    descontador=151;
                }else{
                    descontador=155;
                }
                
            }
            else if(puerto.equals("PORTA") && pin.equals("C")){
                if(valor.equals("0")){
                    descontador=24;
                }else{
                    descontador=28;
                }
            }
            else if(puerto.equals("PORTA") && pin.equals("D")){
                if(valor.equals("0")){
                    descontador=152;
                }else{
                    descontador=156;
                }
            }
            else if(puerto.equals("PORTA") && pin.equals("E")){
                if(valor.equals("0")){
                    descontador=29;
                }else{
                    descontador=25;
                } 
            }
            else if(puerto.equals("PORTA") && pin.equals("F")){
                if(valor.equals("0")){
                    descontador=157;
                }else{
                    descontador=153;
                } 
            }
            else if(puerto.equals("PORTA") && pin.equals("G")){
                if(valor.equals("0")){
                    descontador=26;
                }else{
                    descontador=30;
                } 
            }
            else if(puerto.equals("PORTA") && pin.equals("H")){
                 if(valor.equals("0")){
                    descontador=154;
                }else{
                    descontador=158;
                }
            }
            else if(puerto.equals("PORTB") && pin.equals("A")){
                if(valor.equals("0")){
                    descontador=24;
                }else{
                    descontador=28;
                }
            }
            else if(puerto.equals("PORTB") && pin.equals("B")){
                if(valor.equals("0")){
                    descontador=152;
                }else{
                    descontador=156;
                }
            }
            else if(puerto.equals("PORTB") && pin.equals("C")){
                if(valor.equals("0")){
                    descontador=25;
                }else{
                    descontador=29;
                }
            }
            else if(puerto.equals("PORTB") && pin.equals("D")){
                if(valor.equals("0")){
                    descontador=153;
                }else{
                    descontador=157;
                } 
            }
            else if(puerto.equals("PORTB") && pin.equals("E")){
                if(valor.equals("0")){
                    descontador=26;
                }else{
                    descontador=30;
                } 
            }
            else if(puerto.equals("PORTB") && pin.equals("F")){
                if(valor.equals("0")){
                    descontador=154;
                }else{
                    descontador=158;
                }
            }
            else if(puerto.equals("PORTB") && pin.equals("G")){
                if(valor.equals("0")){
                    descontador=27;
                }else{
                    descontador=31;
                }
            }
            else if(puerto.equals("PORTB") && pin.equals("H")){
                if(valor.equals("0")){
                    descontador=155;
                }else{
                    descontador=159;
                }
            }
            else if(puerto.equals("TRISA") && pin.equals("a")){
                if(valor.equals("0")){
                    descontador=35;
                }else{}
            }
            else if(puerto.equals("TRISA") && pin.equals("b")){
                if(valor.equals("1")){
                    descontador=85;
                }else{}
            }
            else if(puerto.equals("TRISB") && pin.equals("a")){
                if(valor.equals("0")){
                    descontador=137;
                }else{} 
            }
            else if(puerto.equals("TRISB") && pin.equals("b")){
                
            }
            else if (puerto.equals("PORTA") && pin.equals("a")){
                if(valor.equals("0")){
                    descontador=136;
                }else{} 
            }
            else if(puerto.equals("PORTB") && pin.equals("a")){
                if(valor.equals("0")){
                    descontador=137;
                }else{}
            }else{}
            
        return descontador;
    } 
    
    public String Dela(String par){
        String ini=":100000002828A301A200FF30A207031CA307031C9A\n:1000100023280330A100DF300F200328A101E83E90\n"
                    +":10002000A000A109FC30031C1828A00703181528FC\n:10003000A0070000A10F152820181E28A01C2228A8\n"
                    +":100040000000222808008313831203130000080015\n:100050008316850186018312850186010610C8304A\n"
                    +":0A00600001200614C83001202E28EC\n:02400E00223F4F\n:00000001FF";
        
        return ini;
    }
    
}
