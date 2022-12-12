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
public class TeoriaColas {

    public double CalcularLs(double tsll, double Ws) {

        double Ls = 0;

        Ls = tsll * Ws;

        return Ls;
    }

    public double CalcularLq(double tsll, double Wq) {

        double Lq = 0;

        Lq = tsll * Wq;

        return Lq;
    }

    public double CalcularWs(double Wq, double tsS) {

        double Ws = 0;

        Ws = Wq + (1 / tsS);

        return Ws;
    }

    public double CalcularWq(double tsS, double tsll) {

        double Wq = 0;
        double Lq = (tsll * tsll) / ((tsS) * (tsS - tsll));

        Wq = Lq / tsll;

        return Wq;
    }

    public double CalculaP(double tsS, double tsll) {

        double calP = tsll / tsS;

        return calP;
    }

    public double CalculaOcio(double p) {
        double ocio = 1 - p;

        return ocio;
    }

    public double[] calculoPn(double ocio, double uso, int n) {
        double pn[] = new double[n + 1];
        //double mult = 0;
        //mult = ocio * uso;

        for (int a = 0; a < n + 1; a++) {
            pn[a] = ocio * Math.pow(uso, a);
        }

        return pn;

    }

    public double[] TasaSer(double tsS, int tiempo) {
        double pn[] = new double[tiempo + 1];

        for (int a = 0; a < tiempo + 1; a++) {
            pn[a] = (double) tsS * a;
        }

        return pn;

    }

    public double[] TasaLl(double tll, int tiempo) {
        double pn[] = new double[tiempo + 1];

        for (int a = 0; a < tiempo + 1; a++) {
            pn[a] = (double) tll * a;
        }

        return pn;

    }
    
    public double Wqt(double tsS, double probuso, int t){
        double probabilidad = 0;
        double exponente = 0;
        double e = 2.718182;
        double operacion =(double) -tsS*(1-probuso)*t;
        exponente= Math.pow(e,operacion);
        probabilidad = probuso*exponente;
                
        return probabilidad;
    }
    
     public double Wst(double tsS, double probuso, int t){
        double exponente = 0;
        double e = 2.718182;
        double operacion = (double)-tsS*(1-probuso)*t;
        exponente= Math.pow(e,operacion);
       
                
        return exponente;
    }
    public double Ws2(double Ls, double Tll){
        double ws2 = Ls/Tll;
        return ws2;
    }

    public double Ls2(double Lq, double Tll, double Tss){
        double ls2 = Lq +(Tll/Tss);
        return ls2;
    }
    public double Wq2 (double Lq, double Tll){
        double wq2 = Lq/Tll;
        return wq2;
    }
}
