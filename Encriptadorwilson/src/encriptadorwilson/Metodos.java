/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptadorwilson;

/**
 *
 * @author Wilson Pop
 */
public class Metodos {
    
      
    public String Traducir (String palreducida){
        String a=palreducida;
        String con="";
        for(int r=0;r<a.length();r++){
            if(r%2==0){
                con+="0";
            }else{
                con+="1";
            }
            
        }
        
        return con;
    }
    
    public String Sumar (String suma){
        String hra=suma;
        int longi=hra.length();
        String lon= Integer.toString(longi);
        String aux ="";
        String aux1="";
        int aux2=0;
        int cont=0;
        String aux3="";
        String aux4="";
                
        if(hra.length()%2==0){
            for(int ui=0;ui<hra.length();ui++){
              cont++;
              aux+=hra.charAt(ui);
              aux2 +=Integer.parseInt(aux);
              aux="";
              if(cont==2){
                  aux1+=aux2;
                  cont=0;
                  aux2=0;
              }else{}
              
            }
        }else{
            hra+="0";
            for(int u=0;u<hra.length();u++){
              cont++;
              aux+=hra.charAt(u);
              aux2 +=Integer.parseInt(aux);
              aux="";
              if(cont==2){
                  aux1+=aux2;
                  cont=0;
                  aux2=0;
              }else{}
              
            }
            
            //aux1+=hra.charAt(hra.length());
        
        }
        
        aux3+=aux1.charAt(aux1.length()-1);
        
        return aux1;
    }
    
    public String Traducir2(String pal){
        String aux = pal;
        int aux1 = pal.length();
        String aux2="";
        
        if(aux1%2==0){
            for(int al=0;al<aux1;al++){
                if(al%2==0){
                    aux2+="0";
                }else{
                    aux2+="1";
                }
             }
        }else{
             for(int al=0;al<aux1-1;al++){
                if(al%2==0){
                    aux2+="0";
                }else{
                    aux2+="1";
                }
             }
            aux2+="1"; 
        }
        
        return aux2;
    }
    
    
    public String Codigo(String a, String b){
        String la=a;
        String le=b;
        String aux="";
        int cont=0;
        int cont1=0;
            if(la.length()%2==0){
                for(int ini=0;ini<la.length();ini++){
                    cont++;
                    aux+=le.charAt(cont1);
                    if(cont==2){
                        cont1++;
                        cont=0;
                    }else{}
                }
            }else{
                for(int ini=0;ini<la.length()-1;ini++){
                    cont++;
                    aux+=le.charAt(cont1);
                    if(cont==2){
                        cont1++;
                        cont=0;
                    }else{}
                }
                aux+=le.charAt(cont1);
                
            }
        
        
        return aux;
    }
    
    
    
}
