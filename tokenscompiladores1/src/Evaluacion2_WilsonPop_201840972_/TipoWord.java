
package Evaluacion2_WilsonPop_201840972_;

/**
 *
 * @author Wilson Pop
 */
public class TipoWord {
    
    public String Configuracion(String par[], String descripcion[]){
        
        String tipos []=par;
        String idents[]=descripcion;
        String aux []= new String [par.length];
        String aux1 = "";
        boolean inte = false;
        boolean inte2 = false;
        boolean inte3 = false;
        boolean inte4= false;
        boolean inte5= false;
        boolean inte6 []= new boolean [par.length];
        boolean inte7 =false;
        String aux2 = "";
        String aux3 = "";
        String tword [] = new String [par.length];
        String twordt [] = new String [par.length];
        String tword1 [] = new String [par.length];
        String tword2 [] = new String [par.length];
        String tword3 [] = new String [par.length];
        int contador =0;
        int contador2=0;
        int contador3=0;
        int contador4=0;
        
        for(int x=1;x<par.length-1;x++){
             
            if(idents[x].equals("palabra reservada")){
               
                if(tipos[x].equals("String") || tipos[x].equals("Word")|| tipos[x].equals("int") || tipos[x].equals("double") ){
                    if(tipos[x].equals("Word")){
                       inte =true;
                       aux1 = idents[x];
                       aux3 = tipos[x];     
                    }
                    else if(tipos[x].equals("String")){
                       inte2 =true;
                       aux1 = idents[x];
                       aux3 = tipos[x]; 
                    }
                    else if(tipos[x].equals("int")){
                       inte3 =true;
                       aux1 = idents[x];
                       aux3 = tipos[x];
                    }
                    else if(tipos[x].equals("double")){
                       inte7 =true;
                       aux1 = idents[x];
                       aux3 = tipos[x];
                    }else{}
                    
                }else{}
                
                
            }
            //Esta parte la utilice para detenerminar si un string, double o int podian ser asignados a un word,
            // de igual forma para que el tipo word aceptara un caracter y numeros del 0 al 128
            else if((idents[x].equals("Identificador") && idents[x-1].equals("operador" )) && inte==true){
                for(int lr4=0;lr4<contador4;lr4++){
                    if(tipos[x].equals(tword3[lr4]) && (contador4>0)){
                       System.out.println("Una variable decimal no puede ser asignado a un Word: " + tipos[x-2]);
                       inte5=true;
                    }else{}
                
                } 
                
               
                for(int lr1=0;lr1<contador2;lr1++){
                    if(tipos[x].equals(tword1[lr1]) && (contador2>0)){
                       System.out.println("Un String no puede ser asignado a un Word: " + tipos[x-2]);
                       inte5=true;
                    }else{}
                
                }
         
                for(int lr2=0;lr2<contador3;lr2++){
                    if(tipos[x].equals(tword2[lr2]) && (contador3>0)){
                       System.out.println("Un int no puede ser asignado a un Word: " + tipos[x-2]);
                       inte5=true;
                    }else{}
                
                } 
         
                for(int lr=0;lr<contador;lr++){
                    if(tipos[x].equals(tword[lr]) && (contador>0)){
                        System.out.println("Word asignado a otro Word correctamente: " + tipos[x-2]);
                        inte5=true; 
                    }else{}
                
                }
                if(inte5==true){
                    tword[contador]=tipos[x-2];
                    twordt[contador]="Word";
                    contador++;
                }
                else if(tipos[x].length()==1 && inte5==false){
                    System.out.println("Asignacion a tipo word correcta: " + tipos[x-2]);
                    tword[contador]=tipos[x-2];
                    twordt[contador]="Word";
                    if(tipos[x].equals("0") || tipos[x].equals("1")|| tipos[x].equals("2")||
                            tipos[x].equals("3") ||tipos[x].equals("4")||tipos[x].equals("5")||tipos[x].equals("6")
                            ||tipos[x].equals("7")||tipos[x].equals("8")||tipos[x].equals("9")){
                    
                        inte6 [contador]=true;
                    }else{}
                    
                    contador++;
                }
                else if(tipos[x].length()>1 && inte5==false){
                    for(int al=0;al<=128;al++){
                        if(tipos[x].equals(Integer.toString(al)) && inte4==false){
                            inte4=true;
                        }else{}
                    }
                    if(inte4==true){
                        System.out.println("Asignacion a tipo word correcta: " + tipos[x-2]);
                        inte4=false;
                        tword[contador]=tipos[x-2];
                        twordt[contador]="Word";
                        inte6 [contador]=true;
                        contador++;

                    }else{
                        System.out.println("Asignacion a tipo word incorrecta: " + tipos[x-2]);
                    }
                    
                    
                }else{}
                inte5=false;
                
            }
            //para el int
            else if((idents[x].equals("Identificador") && idents[x-1].equals("operador" )) && inte3==true){
                for(int lr=0;lr<contador;lr++){
                    if(tipos[x].equals(tword[lr]) && (contador>0)){
                        if(inte6[lr]==true){
                            System.out.println("Word asignado a un int correctamente: " + tipos[x-2]);
                            //inte5=true; 
                        }else{
                            System.out.println("Word asignado a un int incorrectamente: " + tipos[x-2]);
                        }
                       
                    }else{}
                
                }
                
                tword2[contador3] = tipos[x-2]; 
                contador3++;
               
            }
            //para el string
            else if((idents[x].equals("Identificador") && idents[x-1].equals("operador" )) && inte2==true){
                for(int lr=0;lr<contador;lr++){
                    if(tipos[x].equals(tword[lr]) && (contador>0)){
                       System.out.println("Word asignado a un String correctamente: " + tipos[x-2]);
                    }else{}
                
                }
                tword1[contador2] = tipos[x-2]; 
                contador2++;
                
            }
            //para el double
            else if((idents[x].equals("Identificador") && idents[x-1].equals("operador" )) && inte7==true){
                for(int lr=0;lr<contador;lr++){
                    if(tipos[x].equals(tword[lr]) && (contador>0)){
                       System.out.println("Una variable de tipo Word no puede ser asignada"
                               + " a un variable double, la cual es decimal: " + tipos[x-2]);
                    }else{}
                
                }
                tword3[contador4] = tipos[x-2];
                contador4++;
            
            }
            
            
            else if(idents[x].equals("simbolo final")){
                inte = false;
                inte2=false;
                inte3=false;
                inte7=false;
                aux1 ="";
                aux3="";
            }
            else{}
            
        }
        
        
        return aux2;
    
    }
    
    
    
}
