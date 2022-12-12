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
public class metodosb {
    
    ControlFlujow obj = new ControlFlujow();
    
    public String [] Agregaident(String id [], String ident[]){
        String al []= id;
        String bl [] = ident;
        
        return bl;
    }
    
    public String [] Agregatipo(String id [], String tipo[]){
        String a2 [] = tipo ;
        
        return a2;
    }
   
    public String [] Agregascope(String scope[], String idents[]){
        String a3 [] = scope;
        String a4 [] = new String [idents.length];
        String aux [] = new String [idents.length];
        int contador = 1;
        int contador2 = 0;
        int contador3=0;
        int auxi = 0;
        int conta =0;
        int cont = 0;
        String aux1 = "";
        String aux2 = "";
        String axu = "";
        boolean inte=false;
        
        //En esta parte imprimo cada token encontrado
            for(int ini=0;ini<a3.length;ini++){
                System.out.println(a3[ini] + "\n");
            }
        //aqui comparo los tokens del primer arreglo con el arreglo de identificadores    
            for(int r=1;r<scope.length;r++){
                if(a3[r].equals("{")){
                    inte=true;  //si se encuentra una llave entonces el interruptor pasa a ser verdadero
                    //contador++;
                    conta++;
                }
                else if(a3[r].equals(idents[contador3])){
                                        
                    if(inte==false){//si es falso entonces no se encontró una llave de apertura, scope 0
                        aux1 +=auxi;
                        contador3++;//contador de los identificadores
                    }else{
                        contador2++;
                        aux1+=contador; //acumulador de cada posición
                        contador3++;
                    }
                }
                else if(a3[r].equals("}")){
                    cont++;
                    
                    if(conta==cont){
                        aux2+=aux1;//acumulador absoluto
                        aux1 ="";//se vacia el primer acumulador
                        inte = false;
                        contador++;
                    }else{}
                    
                }else{
                    aux2+=aux1;//acumulador absoluto
                    aux1 ="";
                }
                
            }
            System.out.println(aux2);
            for(int r2=0;r2<aux2.length();r2++){ // Se inserta cada caracter en un array para el scope
                axu += aux2.charAt(r2);
                a4[r2] = axu ;
                axu="";
                System.out.println(a4[r2]);
            }
            
            
        return a4;
    }
    
    public String CrearTabla(String ids [], String idents [], String tip [],String scope[] ,int longitud){
        String id []= ids;
        String array2 [] = idents;
        String array3 [] = tip;
        String array4 [] = scope;
        int lg = longitud;
        String err = "";
        String mos= "---tabla----";
        
        System.out.println("--------------------------------------------------");
        System.out.println("ID      IDENTIFICADOR       TIPO DE DATO        SCOPE");
        for(int ao=0;ao<lg;ao++){
            System.out.println(id[ao]+ "        "+array2[ao] + "                " + array3[ao]
                    +"                      " + array4[ao]+ "\n");
        
        }
        
       err=obj.Control1(array2,array3 ,array4);
       
       obj.Control2(array2, array3, array4, err,lg,id);
        
        
        return err;
    }
    
    
}
