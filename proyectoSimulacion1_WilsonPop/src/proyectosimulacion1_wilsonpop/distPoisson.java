/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosimulacion1_wilsonpop;

/**
 *
 * @author Wilson Pop
 */
public class distPoisson {
    public final double e = 2.71828182;
    
     public double[] calculoProbabilidad(int n, double p) {
        double a[] = new double[n + 1];
        
        double resultado = 0;
        
        for (int r = 0; r < n + 1; r++) {
            
            resultado = CalculoValorUnico(n, p, r) * 100;
            System.out.println(resultado);
            a[r] = resultado;

        }

        return a;
    }      
    
    
    public double CalculoValorUnico(int n,double p,int x){
        double funcionProbabilidad = 0;
        
        double media = (double) n*p;
        double potencia1 = (double) Math.pow(e, media);
        double potencia2 = (double) Math.pow(media,x);
        double factX = factorial(x);
        
        funcionProbabilidad = (double)(potencia2)/(potencia1*factX);
        return funcionProbabilidad;
    }
    
    
     public double factorial(double n) {
        //int resultado = 1;

        if (n <=0) 
            return n = 1;
        else 
           return  (n * factorial(n - 1));

    }
     
    public double Media (int n, double p){
        double media = (double) n*p;
        return media;
    } 
    
    public double Desviacion (double media){
        double desv = 0;
        desv = (double) Math.sqrt(media);
        return desv;
    }
    
    public double Sesgo (double media){
        double raiz = Desviacion(media);
        double division = 1/raiz;
        return division;
    }
    
    public double Curtosis (double media){
        double cur = (double) (3+(1/media));
        return cur;
    }
    
    public double Mediana (double media){
        double medi= (double) (media + (1/3) - 0.02/media);
        return medi;
    }
    
     public String SesMe(double media, double mediana){
        String tipoSes = "";
        
        if(media<mediana){
            tipoSes = "Sesgo negativo";
        }
        else if(media==mediana){
            tipoSes = "Sesgo nulo";
        }
        else if(media>mediana){
            tipoSes = "Sesgo positivo";
        }
        
        return tipoSes;
    
    }
    
    public String Datos (int n, double p){
        double media = Media(n, p);
        double desEstandar = Desviacion(media);
        double sesgo = Sesgo(media);
        double curtosis = Curtosis(media);
        double mediana = Mediana(media);
        String tipSesgo = SesMe(media, mediana);
        
        String recolector = "";
        
        recolector = "Media: " + media+ "\n" + "Desviación estándar: "+ desEstandar 
                + "\n"+"Sesgo: " + sesgo+ "\n"+ "Tipo de sesgo: " + tipSesgo+ "\n"+ "Curtosis: " + curtosis;
                
        return recolector;
    } 
    

}
