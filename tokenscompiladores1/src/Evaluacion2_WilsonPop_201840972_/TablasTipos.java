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
public class TablasTipos {
    
    public String TablaV(String id[],String iden[],String tipo[],String scope[],String valor[],int lg){
        String a="0";
        String id1[]=id;
        String iden1[]=iden;
        String scp[]=scope;
        int lon=lg;
        String aux[]= new String[id.length]; //para los valores
        String val[]= valor;
        String aux2[]=new String [id.length];//para los tipos
        boolean cont=true;
        String ap="";
        //para asignar valor a cada variable
            for(int p=0;p<lg;p++){
                cont=true;
                aux2[p]=val[p];
                   for(int r=0;r<lg;r++){
                       if((val[p]==null && cont==true) && (scope[p].equals(scope[r]))){
                           if((val[r]!=null && val[r]!="-")&&(cont==true)){
                                aux[r]=iden[p];
                                val[r]="-";
                                cont=false;    
                            }else{}

                       }else{}
                    }
            }
            
            System.out.println("--------------------------------------------------");
            System.out.println("ID      IDENTIFICADOR       TIPO DE DATO        SCOPE           VALOR ");
            for(int ao=0;ao<lg;ao++){
                System.out.println(id[ao]+ "        "+iden[ao] + "                " + aux2[ao]
                        +"                      " + scope[ao]+"                    "  +aux[ao]+      "\n");
        
            }
            
            //para determinar errores al asignar un valor a un tipo
            ap=Tiposvalor(id1, iden1, aux2, scp, aux,lon);
                 
        
     return a;
    
    }
    
    public String Tiposvalor(String id[], String iden[], String tipo[],String scope[],String valor[], int lon){
        String msg = "";
        String tipo1[]=tipo;
        String val[]=valor;
        String aux[]=new String [id.length];
        String aux1="";
        boolean inte=false;
        String aux6="";
        String aux7="";
        String aux8="";//para el tipo void    
        //System.out.println(tipo1[0]);
        
        
        
            for(int x=0;x<lon;x++){
                inte=false;
                aux6="";
                aux7="";
                aux6+=tipo1[x];
                aux7+=val[x];
                if(aux6.equals("int")){
                    for(int k=0;k<200;k++){
                        aux1="";
                        aux1+=k;
                        if(aux7.equals(aux1)){
                            inte=true; 
                        }else{}
                        
                    }
                    
                   if(inte==false && val[x]!=null){
                       System.out.println("existe un error para una variable int");
                   }else{} 
                    
                }
                else if(aux6.equals("char")){
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
                                    if(aux7.equals(identific[fil][col])){
                                                inte=true;
                                    }else{}
                                }
                            }
        
                   if(inte==false && val[x]!=null){
                       System.out.println("existe un error para una variable char");
                   }else{} 
                     
                
                }
                else if(aux6.equals("double")){
                    for(int k=0;k<100;k++){
                        aux1="";
                        aux1+=k;
                        if(aux7.equals(aux1)){
                            inte=true; 
                        }else{}
                        
                    }
                    
                   if(inte==false && val[x]!=null){
                       System.out.println("existe un error para una variable double");
                   }else{} 
                }else{}
                
            
            }
        
        //si un identificador es de tipo void, lanza el mensaje de que no se puede usar en la expresion
        for(int ol=0;ol<lon;ol++){
            aux8="";
            aux8+=iden[ol];
            if(aux8.equals("void")){
                System.out.println("Se intento declarar una variable de tipo void, por lo tanto su valor es null");
            }else{}
        }
        
    
        return msg;
    }
    
    
    
}
