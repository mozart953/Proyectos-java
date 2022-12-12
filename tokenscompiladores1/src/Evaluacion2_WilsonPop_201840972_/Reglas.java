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
public class Reglas {
   //Este método es para agregar las reglas de una expresión. 
    public String r2d2 (String anir){
        String ro= "correcta";
        String ri= "incorrecta";
        int uno = 0;
        String regla [][]={
            
            {"tipodatoidentificadorsimbolofinal"},
            {"tipodatoidentificadoroperadoridentificadorsimbolofinal"},
            {"tipodatoidentificadoroperadoridentificadoroperadoridentificadorsimbolofinal"}
        };
        //ciclo for para comparar si el formato coincide
        for (int re=0;re<3;re++){
            for(int ra=0;ra<1;ra++ ){
                if(anir.equals(regla[re][ra])){
                    uno++;
                }else{}
            }
        }
        
        if(uno==1){
            return ro;
        }else{
            return ri;
        }
        
    }
    
}
