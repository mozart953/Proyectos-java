/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evaluacion2_WilsonPop_201840972_;

import javax.swing.JOptionPane;

/**
 *
 * @author Wilson Pop
 */
public class ControlFlujow {
    
    TablasTipos obj2 = new TablasTipos ();
    
    public String Control1(String array1[],String array2[],String array3[]){
        
        String escribe = "Operación terminada";
        String aux1 []=array1; //identificadores
        String aux2 [] = array2; //tipos
        String aux3 []= array3; // scope
        String aux7 []=new String[array3.length];//scope
        String aux5 [] = new String[array2.length];//identificadores
        String aux6 [] = new String[array2.length];
        String aux="";
        String aux4 = "";
        int contador =0;
        int contador1 =0;
        int contador2=1;
        int cont=0;
        int cont1=0;
        
        
        for(int x=0;x<aux2.length;x++){
            aux += aux2[x];
            if(aux.equals("int")){
                aux4+=x;
                aux5[contador]=aux1[x];
                aux7[contador]=aux3[x];
                contador++;
            }
            else if(aux.equals("char")){
                aux4+=x;
                aux5[contador]=aux1[x];
                aux7[contador]=aux3[x];
                contador++;
            }
            else if(aux.equals("double")){
                aux4+=x;
                aux5[contador]=aux1[x];
                aux7[contador]=aux3[x];
                contador++;
            }else{
                aux6[contador1]=aux1[x];
                contador1++;
            }
            aux="";
        }
        
      /* if(contador>0){ 
        for(int x1=0;x1<contador;x1++){
                for(int y1=0;y1<contador1;y1++){
                    if(aux5[x1].equals(aux6[y1])){
                        System.out.println("Coincidencia de tipos No." + contador2 + " variable: " + aux5[x1] );
                        contador2++;
                    }else{
                        System.out.println("La variable: " + aux5[x1]+ " no coincide con ningún tipo");
                    }
                }        
            }
       }else{
           System.out.println("Ninguna variable ha sido utilizada.");
       }*/
      
      if(contador>0){
          for(int x1=0;x1<contador;x1++){
              cont1=0;
              cont=0;
              for(int y1=0;y1<contador;y1++){
                  
                  if(aux5[x1].equals(aux5[y1]) && aux7[x1].equals(aux7[y1])){
                      cont++;
                     /* if(cont>1){
                          System.out.println("Error, se repite la variable " + aux5[x1] + " en mas de un tipo." );
                      }else{}*/
                  
                  }
                                   
                  else if(aux5[x1].equals(aux5[y1]) && aux7[x1]!=(aux7[y1])){                    
                       if(aux5[x1].equals(aux5[y1]) && aux7[x1].equals("0")){
                             cont1++;
                        }else{}
                  }else{}
              }
                if(cont>1){
                          System.out.println("Error, se repite la variable " + aux5[x1] + " en mas de un tipo en"
                                  + " el scope " + aux7[x1]);
                          cont=0;
                          contador2++;
                }
                else if(cont1>0){
                          System.out.println("Error, se repite la variable " + aux5[x1] + " global en mas de un tipo en"
                                  + " el scope " + aux7[x1]);
                          cont1=0;  
                          contador2++;
                }else{}
              
          }
          
      }else{}
        
        
        if(contador2>1){
            escribe="error";
        }else{
            escribe="noerror";
        }
        
        return escribe;
    }
    
    
    //metodo para determinar si una expresion declada es igualada a otra y determinar si son los mismos tipos
    public String Control2(String array1[],String array2[],String array3[],String error, int lon,String id[]){
        int lg = lon;
        String ctr2 = error;
        String array4[] = array1; //identificadores 
        String array5[] = array2; // tipos
        String array6[] = array3; // scope
        String array7[] = new String [array5.length];//tipos2
        String array8[] = new String [array5.length];
        String arru[]=id;
        String aux = "";
        String aux1 = "";
        int contador =0;
        String array9[] = new String [array5.length]; //tipos declarados
        String arrayr[] = new String [array5.length]; //Identificadores declarados
        String arrayi[] = new String [array5.length]; //scope3
        boolean inte = true;  
        int contador1 = 0;
        
        for(int x=0;x<lg;x++){
            aux+=array5[x];
            aux1=Tipos1(aux);
            if(aux1.equals("0")){
                array7[x]="0";
            }else{
                array7[x]=array5[x];
                array9[contador]=array5[x];
                arrayr[contador]=array4[x];
                arrayi[contador]=array6[x];
                contador++;
                
            }
            
            aux="";
            aux1="";
        }
        System.out.println(ctr2);
        
        
        
        
        //esta parte es para asignar el tipo a cada identificador despues de un signo igual
        for(int n=0;n<lg;n++){
            for(int a=0;a<lg;a++){
                if(array4[n].equals(array4[a]) && array6[n].equals(array6[a])){
                       if(array7[n]!="0"){
                        array8[a]=array7[n];
                       }else{}
                    
                }else if(array4[n].equals(array4[a]) && array6[n].equals("0")){
                        if(array7[n]!="0"){
                            array8[a]=array7[n];
                         }else{}
                }else{}
            }
        }
        
        
        
        
        for(int r=0;r<lg;r++){
            System.out.println(array7[r]+ "\n");
        }
        
        for(int r=0;r<lg;r++){
            System.out.println(array8[r]+ "\n");
        }
        
        //esta parte determina si existe alguna coincidencia con una variable declarada y no declarada en el mismo scope
        if(ctr2 !="error"){
          //se imprime la tabla ya con los valores  
          obj2.TablaV(arru, array4, array5, array6, array8,lg);  
            
            for(int z=0;z<contador;z++){
                inte=true;
                //contador1=0;
                for(int t=0;t<lg;t++){
                    if(inte==true){
                        if((arrayr[z].equals(array4[t])) && (arrayi[z].equals(array6[t]))){
                            if((array7[t].equals("0")) && (array7[t+1]!="0")){
                                inte=false;
                            }else{}
                        }else if((arrayr[z]!=array4[t]) && (arrayi[z].equals(array6[t]))){
                            if((array7[t].equals("0")) && (array9[z].equals(array8[t])) ){
                                if(array7[t+1]!="0"){
                                    inte=false;
                                }else{}  
                                
                            }
                            else if((array7[t].equals("0")) && (array9[z]!=array8[t])){
                                
                               if(array8[t]!=null){
                                 
                                  if((array7[t+1]!="0" || array7[t+1].equals("0")) && array8[t+1]!=null){
                                    //contador1++;
                                      //if(contador1>0){
                                          inte=false;
                                          System.out.println("Error de tipos " + arrayr[z]);
                                          contador1++;
                                      //}else{}
                                     
                                  }else{}
                                  
                              }else{} 
                              
                            }else{}
                        }else{}
                    }else{}  
                    }
                
                }
            
                    if(contador1>0){
                        System.out.println("Existen uno o mas errores al igualar tipos.");
                    }else{}          
                    
            }else{
                System.out.println("Se repite una o mas variables en diferentes tipos.");
            }
        
        
        
        return ctr2;
    }
    
    public String Tipos1(String tip){
        String aux=tip;
        String ini="";
        int uno=0;
        String palabra [][]= {
         {"int", "double", "char"}
                
        };
        
        for(int i=0;i<1;i++){
            for(int r=0;r<3;r++){
                    
                     if(aux.equals(palabra[i][r])){
                         uno++;
                     }else{
                         
                     }       
            }
        }
        
        
            ini+= uno;
        
        
        
        return ini;
    
    }
    
    
}
