/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete2;

/**
 *
 * @author Wilson Pop
 */
public class CalculoRegresionLineal {
    
    
    public double [] calcMult (double x[]){
        
        double a[] = x;
        double aux =0;
        
        for(int i=0;i<x.length;i++){
            aux=Mult(x[i]);
            a[i]=aux;
        }
    
        return a;
    }
    
    public double [] calcMult2(double x[], double y[]){
         double a[] = x;
         double b[] = y;
         double c[] = new double [x.length];
         double aux = 0;
        
        for(int i=0;i<x.length;i++){
            aux=Mult1(x[i],y[i]);
            c[i]=aux;
        }
    
        return c;
    }
    
    
    public double Mult(double x1){
        double cal = x1*x1;
        
        return cal;        
    }
    
    public double Mult1(double x1, double y1){
        double cal1 = x1*y1;
        
        return cal1;
    }
    
    
    public double Sum(double x1[], int numbers) {
        double sum [] = new double[numbers];
        double aux = 0;

        sum[0] = x1[0];
        aux = sum[0];
        for (int i = 1; i <numbers; i++) {
            sum[i] = aux + x1[i];
            aux = sum[i];
        }
        
        return aux;
    } 
    
    public double m (double sumxy,double sumx,double sumy, double sumxx,int numeros){
        
        double m1=0;
        double num = (numeros*sumxy)-((sumx)*(sumy));
        double den = (numeros*sumxx) - (sumx*sumx);
        m1 = num/den;
        return m1;
    }
    
    public double b (double sumy,double m, double sumx, double numeros){
        double promy=0;
        double promx=0;
        double b=0;
        
        promy = sumy/numeros;
        promx = sumx/numeros;
        
        b=promy - m*promx;
        
        return b;
    
    }
    
    public double calR (double sumxy, double sumx, double sumy, double sumxx,double sumyy, double numeros){
        double num=0;
        double den=0;
        double mult1=0;
        double mult2 =0;
        double raiz1 =0;
        double raiz2=0;
        double res =0;
        
        num = (double)(numeros*sumxy) - (sumx*sumy);
        mult1 = (double)(numeros * sumxx) - (sumx*sumx);
        mult2 = (double)(numeros * sumyy) - (sumy*sumy);
        
        raiz1 = Math.sqrt(mult1);
        raiz2 = Math.sqrt(mult2);
        
        den = raiz1 * raiz2;
        
        res = num/den;
        
        return res;    
    }
    
    public double calSxy (double sumx, double sumy, double sumxx,double sumyy, double numeros, double r){
        double num=0;
        double den=0;
        double mult1=0;
        double mult2 =0;
        double raiz1 =0;
        double raiz2=0;
        double res =0;
        
        
        mult1 = (double)(numeros * sumxx) - (sumx*sumx);
        mult2 = (double)(numeros * sumyy) - (sumy*sumy);
        
        raiz1 = Math.sqrt(mult1);
        raiz2 = Math.sqrt(mult2);
        
        den = raiz1 * raiz2;
        res = den * r;
        
        
        return res;    
    }
    
    public double yx (double m, double x, double b){
        double y = 0;
        y = m*x+b;
        
        return y;
    }
    
    
    public double yyresta2 (double y[],double sumy[], int numbers){
        //double promedio = sumy/numbers;
        double a[] = new double[y.length];
        double aux = 0;
        
        double valor = 0;
        double valor2 = 0;
        double valor3 = 0;
        double valor4 =0;
        
        for(int i=0;i<numbers;i++){
            aux = (y[i] - sumy[i])*(y[i] - sumy[i]);
            a[i]=aux;
        }
        
        valor = Sum(a, numbers);
        valor2 = numbers-2;
        valor3 = valor/valor2;
        valor4 = Math.sqrt(valor3);
        
        
        return valor4;
    
    }
    
}
