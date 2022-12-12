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
public class distHiper {

    public double[] calculoProbabilidad(int Poblacion, int k, int n) {
        double a[] = new double[n + 1];
        
        double resultado = 0;
        double Poblacionn = combinat(Poblacion, n);
        System.out.println(Poblacionn);
        System.out.println("ejecutando");
        for (int r = 0; r < n + 1; r++) {
            
            resultado = calcular(Poblacion, k, n, r,Poblacionn) * 100;
            System.out.println(resultado);
            a[r] = resultado;

        }

        return a;
    }
    
    public double calcular(int Poblacion, int k, int n, int x, double co){
        double kx = combinat(k, x);
        double PoblacionKnx = combinat(Poblacion-k, n-x);
        //int Poblacionn = combinat(Poblacion, n);
        double mult1 = kx * PoblacionKnx;
        double div1 = mult1/co;
        return div1;
    }
        
    public double combinat(int a, int b){
        double combinacion = 0;
        double fact1=factorial(a);
        double fact2=factorial(b);
        double resta = a-b;
        double fact3=factorial(resta);
        combinacion = fact1/(fact2*fact3);
        System.out.println(fact1);
        return combinacion;
    }       

    public double factorial(double n) {
        //int resultado = 1;

        if (n <=0) 
            return n = 1;
        else 
           return  (n * factorial(n - 1));

    }

    public double Potencia(double p, int x, int n) {
        double px =0;
        double px2 = 0;
        double unoP = 1 - p;
        double nx = n - x;
        double resultado = 0;

        px = Math.pow(p, x);
        px2 = Math.pow(unoP, nx);
        resultado = px * px2;
        return resultado;
    }
    
    public boolean Porcentaje (int x, int n){
        boolean desicion = false;
        double ac=x;
        double porciento = (20*n)/100;
        
        if(ac>=porciento)
        { 
            desicion = true;
            System.out.println("verdad");
        } else{
            desicion = false;
        }
        return desicion;
    }
    
    public double media (int n, int k, int pob){
        double med = (double)(n*k)/pob;
        return med;    
    }
    
    public double calP (int k, int pob){
        double p =0.0;
        double x =k;
        double pot=pob;
        p = x/pot;
        return p;
    }
    
    public double desviacion (int n, int k, int pob){
        double k1= k;
        double pob1 = pob;
        double p = k1/pob1;
        double q = 1-p;
        //double desv = 0;
        double resta1 = (double)(pob-n);
        double resta2 = (double)(pob-1);
        double div = (double)(resta1/resta2);
        double n1 = n;
        double mult = n1*p*q*div;
        double desv = Math.sqrt(mult);
        return desv;
        
    }
    
    public double calSesgo (int n, int K, int Pob){
        double s1 = (double)(Pob - 2 * K) * Math.pow(Pob - 1, 0.5) * (Pob - 2 * n);
        double s2 = (double)(Pob - 2) * Math.pow(n * K * (Pob - K) * (Pob - n), 0.5);
        double sesgo = s1/s2;
        return sesgo;
    }
    
    public double calCurtosis (int n, int K, int Pob){
       double c1 = (double)1 / (n * K * (Pob - K) * (Pob - n) * (Pob - 2) * (Pob - 3));
       double c2 = (double)(Pob - 1) * Math.pow(Pob, 2) * (Pob * (Pob + 1) - 6 * K * (Pob - K) - 6 * n * (Pob - n));
       double c3 = (double)6 * n * K * (Pob - K) * (Pob - n) * (5 * Pob - 6);
       double curtosis = c1 * (c2 + c3);
       return curtosis;
    }
    
    public double Mediana (int var1, int var2){
        double mediana = (var1 + var2)/2;
        return mediana;
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
}
