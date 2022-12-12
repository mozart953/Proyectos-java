

package Conversor;
import java.lang.Integer;


/**
 *
 * @author Wilson Pop
 */
public class Conversiones {
    
    public String intToHex (int n){
     return Integer.toHexString(n).toUpperCase();
    }
    
    public String intToOct (int n){
     return Integer.toOctalString(n);
    }
    
    public String intToBin (int n){
     return Integer.toBinaryString(n);
    }
    
    public int Bintodec (int n){
        int resultado=0, cifra=0, exp=0;
        do {
            cifra= n % 10;
            resultado = resultado + cifra*(int) Math.pow(2, exp);
            exp++;
            n = n/10;
        }while(n>0);
        return resultado;
    }
    
    public String Bintohex (int n){
    
        int resultado=0, cifra=0, exp=0;
        do{
            cifra = n % 10;
            resultado = resultado + cifra*(int) Math.pow(2, exp);
            exp++;
            n = n/10;
        }while(n>0);
        return Integer.toHexString(resultado).toUpperCase();
    }
    
    public int Octodec (int n){
        int resultado=0, cifra=0, exp=0;
        
        do{
            cifra = n %10;
            resultado= resultado + cifra*(int)Math.pow(8, exp);
            exp++;
            n= n/10;
        }while(n>0);
        return resultado;
    }
    
    public long HextoD(String n){
        long suma=0;
        StringBuilder num1 = new StringBuilder(n).reverse();
        
        for(int i=0;i<num1.length();i++){
            if (num1.charAt(i)== 'A'){
             suma +=  10*(Math.pow(16, i));
            }
            else if (num1.charAt(i)== 'B'){
             suma += 11*(Math.pow(16, i));
            }
            else if (num1.charAt(i)== 'C'){
             suma += 12*(Math.pow(16, i));
            }
            else if (num1.charAt(i)== 'D'){
             suma += suma + 13*(Math.pow(16, i));
            }
            else if (num1.charAt(i)== 'E'){
             suma += suma + 14*(Math.pow(16, i));
            }
            else if (num1.charAt(i)== 'F'){
             suma += 15*Math.pow(16, i);
            }
            else if (num1.charAt(i)== 'G'){
             suma += 16*(Math.pow(16, i));
            }
            else{
             suma =  suma + Integer.parseInt(""+num1.charAt(i))*(long)(Math.pow(16, i));
            }
            
        }
        return suma;
    }
    
    public String HEXTOBIN (String n){
            int suma =0;
            
            StringBuilder num1 = new StringBuilder(n).reverse();
            
            for(int i=0;i<num1.length();i++){
            
                if(num1.charAt(i)=='A'){
                    suma+= 10*(Math.pow(16, i));
                }
                else if(num1.charAt(i)=='B'){
                    suma+= 11*(Math.pow(16, i));
                }
                else if(num1.charAt(i)=='C'){
                    suma+= 12*(Math.pow(16, i));
                }
                else if(num1.charAt(i)=='D'){
                    suma+= 13*(Math.pow(16, i));
                }
                else if(num1.charAt(i)=='E'){
                    suma+= 14*(Math.pow(16, i));
                }
                else if(num1.charAt(i)=='C'){
                    suma+= 15*(Math.pow(16, i));
                }
                else if(num1.charAt(i)=='C'){
                    suma+= 16*(Math.pow(16, i));
                }
                else{
                    suma = (int) (suma +((num1.charAt(i))*(Math.pow(16, i))));
                }
                
            }
            return Integer.toBinaryString(suma);
                      
            
    }
    
    
}
