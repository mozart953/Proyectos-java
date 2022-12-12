/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosimulacion1_wilsonpop;

import static java.lang.Math.sqrt;

/**
 *
 * @author Wilson Pop
 */
public class distrucionBinomial {
    
    public double [] calculoProbabilidad (int n, int x, double p){
        double a[] = new double[n+1];
        double factorialn = 0;//
        double factorialx = 0;//
        double factorialnx = 0;//
        double potencias = 0;
        double resultado = 0;
        double factoriales = 0;
        
        factorialn = factorial(n);
        System.out.println("ejecutando");
        for(int r=0;r<n+1;r++){
            //factorialn = factorial(n);
            factorialx = factorial(r);
            factorialnx = factorial(n-r);
            System.out.println(factorialx);
            System.out.println(factorialnx);
            
            if(factorialx<=0 || factorialnx <=0){
                factoriales = 1;
            }
            else{
                factoriales = (factorialn)/(factorialnx*factorialx);
            }
            
            potencias = Potencia(p,r,n);
            resultado = factoriales * potencias*100;
            System.out.println(resultado);
            a[r]=resultado;
            
        }
        
        return a;
    }
    
    public double factorial (int n){
        double resultado= 1;
        
        if (n==0 || n==1)
           return  1;
        else if(n>1)
            resultado = n * factorial (n-1); 
            return resultado;      
    
    }
    
    public double media (int n, double prob){
        double med = n*prob;
        return med;    
    }
    
    public double desviacionEstandar (int n,double prob){
        double q = 1-prob;
        double desv = 0.0;
        double multiplicacion = n*prob*q;
        
        desv =  Math.sqrt(multiplicacion);
        System.out.println(desv);
        return desv;
    }
    
    public double Potencia (double p, int x,int n){
        double px = 0;
        double px2 = 0;
        double unoP = 1-p;
        double nx=n-x;
        double resultado =0;
        
        px = Math.pow(p, x);
        px2 = Math.pow(unoP,nx);
        resultado = px * px2;
        return resultado;
    }
    
    public boolean Porcentaje (int x, int n){
        boolean desicion = false;
        double ac=x;
        double porciento = (5*n)/100;
        
        if(ac<=porciento)
        { 
            desicion = true;
            System.out.println("verdad");
        } else{
            desicion = false;
        }
        return desicion;
    }
        
    //Poblacion finita
    
    public double FC(int poblacion, int muestra){
        double factorCo = 0;
        double resta1 = poblacion-muestra;
        double resta2 = poblacion-1;
        double div = resta1/resta2;
        System.out.println(div);
        
        factorCo = Math.sqrt(div);
        
        return factorCo;
    }
    
    public double desvFi(double factor, int muestra, double probabilidad){
        double raiz = 0;
        double desviacion =0;
        double q = 1-probabilidad;
        double multiplicacion = muestra * probabilidad * q;
        
        raiz = Math.sqrt(multiplicacion);
        
        desviacion = factor * raiz;
        return desviacion;
    }
    
    public double Sesgo(int muestra, double probabilidad){
        double raiz = 0;
        double q = 1-probabilidad;
        double multiplicacion = muestra * probabilidad * q;
        double curt = 0;
        double resta = q -probabilidad;
        raiz = Math.sqrt(multiplicacion);
        curt = resta/(raiz);
        
        return curt;
    }
    
    public double Curtosis(int muestra, double probabilidad){
        double raiz = 0;
        double q = 1-probabilidad;
        double multiplicacion = muestra*probabilidad * q;
        double calculo1=0;
        double curtosis=0;
        calculo1= (1-(6*probabilidad*q));
        raiz =  Math.sqrt(multiplicacion);
        curtosis = 3+(calculo1/raiz);
        
        return curtosis;
    }
    
    public double Mediana (int var1, int var2){
        double mediana = (var1 + var2)/2;
        return mediana;
    }
    
    public String DetCur(double curtsis){
        double valor = curtsis;
        String devolver = "";
        
        if(valor<0){
            devolver = "Cuva platicúrtica";
        }else if(valor ==0){
            devolver = "Cuva mesocúrtica";
        }else if(valor >0){
            devolver = "Cuva leptocúrtica";
        }
        
        return devolver;
    }
    
    public String DetSes(double curtsis){
        double valor = curtsis;
        String devolver = "";
        
        if(valor<0){
            devolver = "Curva con asimetria a la izquierda";
        }else if(valor ==0){
            devolver = "Curva simétrica";
        }else if(valor >0){
            devolver = "Curva con asimetria a la derecha";
        }
        
        return devolver;
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
