/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptadorwilson;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Wilson Pop
 */
public class Encriptadorwilson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Metodos obj = new Metodos();
        Arbol arb = new Arbol();
        
        String frase = "";
        String fr = "";
        int ct = 0;
        int ct1 = 0;
        int ct2 = 1;
        int cont = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 1;
        int almacenar[];
        String al2 = "";
        String al3 = "";
        String al4 = "";
        String al5 = "";
        String al6 ="";
        String al7 ="";
        String al8 ="";
        String al9 ="";
        String conte="";
        String conter="";
        String conto="";
        String acuk="";
        String acun="";
        String acuo="";
        String contor="";
        String par="";
        int par1=0;
        boolean inte = false;
        int pr =0;
        String auxr="";
        int raux=0;
        int gr=0;
        
        System.out.println("ESTRUCTURA DE DATOS  - ENCRIPTADOR");
        
        frase = JOptionPane.showInputDialog("Escriba la frase a encriptar sin espacios, inge, hay bugs para palabras muy grandes");
        fr = frase + "-";
        cont3 = fr.length();

        almacenar = new int[cont3];

//parte que va servir para contar el número de repeticiones de los caracteres
        for (int a = 0; a < fr.length(); a++) {
            for (int b = 0; b < fr.length(); b++) {
                if (fr.charAt(a) == fr.charAt(b)) {
                    cont++;
                } else {
                }
            }
            if (cont != 0) {
                almacenar[cont2] = cont;
                cont = 0;
                cont2++;
            } else {
            }
        }

        for (int rs = 0; rs < cont2 - 1; rs++) {
            System.out.print(almacenar[rs]);
        }

        do {
            if (almacenar[ct] == 1) {
                al2 += almacenar[ct];
                al3 += fr.charAt(ct);
            } else {
            }
            ct++;
        } while (ct < fr.length() - 1);

        al8 +=al2;
        al9 +=al3;
//contar repetidos        
        do {

            if (almacenar[ct1] > 1) {
                al6 += almacenar[ct1];
                al4 += fr.charAt(ct1);
            } else {
            }
            ct1++;
        } while (ct1 < fr.length() - 1);

        System.out.println("\n" + al2 + "\n" + al3 + "\n" + al4);
//Para eliminar repetidos
        if (al4!="") {
            al5 += al4.charAt(0);
            al7 +=al6.charAt(0);
            do {
                for (int mit = 0; mit < al5.length(); mit++) {
                    if (al4.charAt(ct2) == al5.charAt(mit)) {
                        inte = true;
                    } else {
                    }
                }

                if (inte == false) {
                    al5 += al4.charAt(ct2);
                    al7 +=al6.charAt(ct2);
                } else {
                    inte = false;
                }

                ct2++;
            } while (ct2 < al4.length());
            System.out.println(al5);
            al8+=al7;
            al9+=al5;
         
        }else{}
        
        System.out.println("\n"+al8+"\n"+al9);
        
//Algoritmo wilsonniano
//1. volver 1s y 0s los caracteres de izquierda a derecha     
        conte=obj.Traducir(al9);
        System.out.println(conte);
//2. sumar cada repetición para formar los nodos    
        
        /*conter=obj.Sumar(al8);
        System.out.println(conter);
        conto=obj.Sumar(conter);
        System.out.println(conto);
        contor=obj.Sumar(conto);
        System.out.println(contor);*/
        
        auxr = Integer.toString(frase.length());
        par=al8;
        par1= Integer.parseInt(auxr);
        
        do{
            pr=0;
            conto="";
            contor=par;
            conter=obj.Sumar(contor);
            par=conter;
            conto+=par.charAt(conter.length()-1); 
            raux= Integer.parseInt(par);
            
            if(raux!=par1){
                acuk+=par;
                acun+=obj.Traducir2(acuk);
                acuo+=acuk;
                acuk="";
            }else{}
            
            System.out.println(par);
            gr++;
            pr = Integer.parseInt(par);
         
        }while(pr!=par1);
       
        System.out.println(acuo + "\n"+acun);

 // 3 . ingresar cada 0 ó 1 a un array       
        String carac [] = new String [conte.length()];
        String auix="";
        String auxii="";
        String auxie="";
        String auxir="";
        int inic=0;
        int fin=0;
        int ar=0;
        int er=0;
        int ir=0;
        int contoro=0;
        String auxu="";
        String auxfin="";
        String auxf="";
        String auxx="";
        
        for(int ma=0;ma<conte.length();ma++){
             auix+=conte.charAt(ma);
             carac[ma]=auix;
             auix="";
             System.out.println(carac[ma]);
        }
          
        //System.out.println(obj.Codigo(conte, acun.substring(0,3)));
        System.out.println(gr);
        
        auxii=conte;
      if(conte.length()>4){
            do{
                auxie=auxii;
                if(fin<=acun.length()){
                if(auxie.length()%2==0){
                    fin=((auxie.length())/2)+inic;
                    auxir=obj.Codigo(auxie,acun.substring(inic,fin));
                }else{
                    fin=((auxie.length()+1)/2)+inic;
                    auxir=obj.Codigo(auxie,acun.substring(inic,fin));
                }
                inic=fin;
                auxii=auxir;
                
                for(int lr=0;lr<auxir.length();lr++){
                    auix+=auxir.charAt(lr);
                    carac[lr]+=auix;
                    auix="";
                    System.out.println(carac[lr]);
                }
                }else{}
                ar++;
                
            }while(ar<gr-3);
        
        }else if(conte.length()==4 || conte.length()==3){
             auxie=auxii;
                if(fin<=acun.length()){
                if(auxie.length()%2==0){
                    fin=((auxie.length())/2)+inic;
                    auxir=obj.Codigo(auxie,acun.substring(inic,fin));
                }else{
                    fin=((auxie.length()+1)/2)+inic;
                    auxir=obj.Codigo(auxie,acun.substring(inic,fin));
                }
                inic=fin;
                auxii=auxir;
                
                for(int lr=0;lr<auxir.length();lr++){
                    auix+=auxir.charAt(lr);
                    carac[lr]+=auix;
                    auix="";
                    System.out.println(carac[lr]);
                }
                }else{}
        }else{
                 for(int lr=0;lr<conte.length();lr++){
                                        
                    if(lr%2==0){
                        carac[lr]+="0";
                    }else{
                        carac[lr]+="1";
                    }
                    System.out.println(carac[lr]);
                    
                }
        }
//para reparar un bug que encontré        
        if(conte.length()>4){
            er=gr-2;
            do{
                 for(int lr=0;lr<((gr*2)-2);lr++){
                                        
                    if(lr%2==0){
                        carac[lr]+="1";
                    }else{
                        carac[lr]+="0";
                    }
                    System.out.println(carac[lr]);
                    
                }               
                ir++;
            }while(ir<er);
            
            
        }else{}
//CODIFICACIÓN        
        System.out.println("\n\n-------------------");
        for(int alf=0;alf<conte.length();alf++){
            System.out.println(al9.charAt(alf)+"="+carac[alf]);
            auxx+=al9.charAt(alf)+"="+carac[alf]+"\n";
        }
        
        for(int alfi=0;alfi<conte.length();alfi++){
           auxu+=al9.charAt(alfi);
           arb.agregarNodo(alfi, auxu);
           auxu="";
        }
        
        for(int r=0;r<frase.length();r++){
            for(int s=0;s<al9.length();s++){
                if(frase.charAt(r)==al9.charAt(s)){
                    auxfin+=carac[s];
                }
                
            }
        
        }
        System.out.println(auxfin);
        JOptionPane.showMessageDialog(null,"\nfrase encriptada: "+frase+"="+auxfin);
        
        
//


        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        String fraseen=auxfin;
        archivo = new File("prueba2.txt");
        
        if(!archivo.exists()){
            try {
                archivo.createNewFile();
                escribir = new FileWriter(archivo,true);
                linea = new PrintWriter(escribir);
                
                linea.println(fraseen);
                escribir.close();
                
            } catch (IOException ex) {
                Logger.getLogger(Encriptadorwilson.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }else{
            try {
                escribir = new FileWriter(archivo,true);
                linea = new PrintWriter(escribir);
                
                linea.println(fraseen);
                escribir.close();
                
            } catch (IOException ex) {
                Logger.getLogger(Encriptadorwilson.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        }
        
        
        
        //if(auxf=="si"){
            JOptionPane.showMessageDialog(null, "frase desencriptada: \n"+auxx);
        //}else if(auxf=="no"){
        
       // }else{}
        
        
    }
  
    

}
