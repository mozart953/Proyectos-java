/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evaluacion2_WilsonPop_201840972_;

/**
 *
 * @author Wilson Pop
 */
public class Tokenscompiladores1 {

    /**
     * @param args the command line arguments
     */
    // esta determina si parte de la expresión es un identificador, pero caracter a carater
    public String Identificador(String ident){
        String verdad = "verdadero";
        String falso = "falso";
        int uno = 0;
        
        String identific [][]=
        {{"a","b","c"},
         {"d","e","f"},      
         {"g","h","i"},
         {"j","k","l"},
         {"m","n","o"},
         {"p","q","r"}, //Esta matriz separa caracter a caracter
         {"s","t","u"},
         {"v","w","x"},
         {"y","z","0"},
         {"1","2","3"},
         {"4","5","6"},
         {"7","8","9"},
         {"A","B","C"},
         {"D","E","F"},
         {"G","H","I"},
         {"J","K","L"},
         {"M","N","O"},
         {"P","Q","R"},
         {"S","T","U"},
         {"V","W","X"},
         {"Y","Z","_"}
        };
        
        for(int fil=0;fil<21;fil++){
            for(int col=0;col<3;col++){
                if(ident.equals(identific[fil][col])){
                    uno++;
                }else{}
            }
        }
        
        if(uno==1){
            return verdad;
        }else{
            return falso;
        }
        
        
    }
    //Este método determina si parte del código es un operador, compara en una matriz.
    public String Operador(String ope){
        String verdad = "operador";
        String falso = "desconocido";
        int uno = 0;
        
        String identific [][]=
        {{"+","-","*"},
         {"/","=","%"}      
        };
        
        for(int fil=0;fil<2;fil++){
            for(int col=0;col<3;col++){
                if(ope.equals(identific[fil][col])){
                    uno++;
                }else{}
            }
        }
        
        if(uno==1){
            return verdad;
        }else{
            return falso;
        }
        
        
    }
    // método para determinar si es una palabra reservada.
    public String palares (String pal){
        String res="palabra reservada";
        String ide="Identificador";
        int uno=0;
        
        
        String palabra [][]= {
         {"int", "double", "char", "Device","TRISA","TRISB","PORTA","PORTB","Word","String","IR","Declara","Delay"}
                
        };
        
        for(int i=0;i<1;i++){
            for(int r=0;r<13;r++){
                    
                     if(pal.equals(palabra[i][r])){
                         uno++;
                     }else{}       
            }
        }
        
        if(uno==1){
            
            return res;
        }else {
            return ide;
        }
        
        
    
    }
    //método que podría servir en algún momento
    public String separa (String var){
        String a = "l";
        
        
        
        
        return a;
    }
 
    
}
