/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientoswilson;

/**
 *
 * @author Wilson Pop
 */
public class Algoritmos {
    
    public String Burbuja(String a, String b,String c){
        String arglos = a;
        int ca= Integer.parseInt(b);
        String rr [] = new String [ca];
        int arglo  [] = new int [ca];
        String auxi="";
        String auxu="";
        int dc=0, aux1,ps,ux2;
        String acu1=" ";
        String me="";
        int cont =0;
        int aux=0;
        int comp =0;
        String comp1="";
       
               
            for(int r=0;r<arglos.length();r++){
            auxu+=arglos.charAt(r);
           // System.out.println(auxu);
            if(auxu.equals("/")){
                rr[cont]=auxi;
                System.out.println(rr[cont]);
                auxi="";
                cont++;
                auxu="";
          }else{
                auxi +=arglos.charAt(r);
                auxu="";
            }
            
          //  auxu="";
        }
        
        auxu="";
        auxi="";
        
        for(int t=0;t<cont;t++){
            auxu +=rr[t];
            aux=Integer.parseInt(auxu);
            arglo[t]=aux;
            auxu="";
            aux=0;
        }
      
       //medir tiempo              
        long inicio = System.nanoTime();
        for(int x=0;x<arglo.length-1;x++){
                        for(int y=0;y<arglo.length-1;y++){
                            if(arglo[y]>arglo[y+1]){
                                aux1=arglo[y];
                                arglo[y]=arglo[y+1];
                                arglo[y+1]=aux1;
                                comp++;
                            }
                        }
                    
                    }
                    
            long fin = System.nanoTime(); 
              for(int r=0;r<arglo.length;r++){
                        acu1 +=arglo[r]+" ";
                    }
               System.out.println("Salida: "+acu1);
               acu1 = " ";
                    
            double dif= (double)(fin-inicio)*1.0e-9;        
            
            me = String.valueOf(dif);
            comp1=Integer.toString(comp);
                
        
        
        
        
        if(c.equals("1")){
                 
            return me;
        }else{
             return comp1;     
        }
                    
            
    }
    
    public String Insercion(String a, String b,String c){
        String arglos = a;
        int ca= Integer.parseInt(b);
        String rr [] = new String [ca];
        int arglo  [] = new int [ca];
        String auxi="";
        String auxu="";
        int dc=0, aux1,ps,ux2;
        String acu1=" ";
        String me="";
        int cont =0;
        int aux=0;
        int comp =0;
        String comp1="";
        
        
            for(int r=0;r<arglos.length();r++){
            auxu+=arglos.charAt(r);
           // System.out.println(auxu);
            if(auxu.equals("/")){
                rr[cont]=auxi;
                System.out.println(rr[cont]);
                auxi="";
                cont++;
                auxu="";
          }else{
                auxi +=arglos.charAt(r);
                auxu="";
            }
            
          //  auxu="";
        }
        
        auxu="";
        auxi="";
        
        for(int t=0;t<cont;t++){
            auxu +=rr[t];
            aux=Integer.parseInt(auxu);
            arglo[t]=aux;
            auxu="";
            aux=0;
        }
 
 
    long inicio = System.nanoTime();    
        
        for(int m=0;m<arglo.length;m++){
                        ps= m;
                        ux2=arglo[m];
                        while((ps>0) && (arglo[ps-1])>ux2){
                            arglo[ps] = arglo[ps-1];
                            ps--;
                            comp++;
                        }
                        arglo[ps]=ux2; 
                    
                    }
        long fin = System.nanoTime();
        double dif= (double)(fin-inicio)*1.0e-9;        
            
            me = String.valueOf(dif);
            comp1=Integer.toString(comp);
                
                    for(int r=0;r<arglo.length;r++){
                        acu1 +=arglo[r]+" ";
                    }
                    System.out.println("Salida: "+ acu1);
                    acu1 =" ";
                    
        
         if(c.equals("1")){
                 
            return me;
        }else{
             return comp1;     
        }
       

    }
    
    public String Quicksort(int a[],int r, int f,int dec,double c,int or){
        int i, j, pv, aux;
        int nm=dec;
        int co=0;
        String acu1="";
        String me ="";
        String comp1="";
        Double dif2=0.0;
        int comp=0;
        i=r;
        j=f;
        pv=a[(r+f)/2];
    
    long inicio = System.nanoTime();    
        do{
            
            while(a[i]<pv){
                i++;
            }
            while(a[j]>pv){
                j--;
            }
            if(i<=j){
                aux=a[i];
                a[i]=a[j];
                a[j]=aux;
                i++;
                j--;
                comp++;
            }
                       
        }while(i<=j);
        long fin = System.nanoTime();
        double dif= (double)(fin-inicio)*1.0e-9;    
        
        if(r<j){
            Quicksort(a, r, j,nm,dif,comp);
        }
        if(i<f){
            Quicksort(a, i, f,nm,dif,comp);
        }
           
        dif2=dif+c;
        co =comp+or;
        
        me = String.valueOf(dif2);
        comp1=Integer.toString(co);
        
                    for(int ri=0;ri<a.length;ri++){
                        acu1 +=a[ri]+" ";
                    }
                    System.out.println("Salida: "+ acu1);
                    acu1 =" ";
        
                    
        if(dec==1){
            return me;
        }else{
            return comp1;
        }            
        
        
    }
    
    public int [] Fusion(int a[],int dec){
        int i, j, k;
        String acu1="";
        String me ="";
        String comp1="";
        int co =0;
        Double dif2=0.0;
        int comp=0;
        int aux=dec;
        int re [] = new int [1];
        
         long inicio = System.nanoTime();
            if(a.length>1){
                int nElementosIzq = a.length/2;
                int nElementosDer = a.length -nElementosIzq;
                int arregloIzq[] = new int [nElementosIzq];
                int arrgloDer[] = new int [nElementosDer];
                
                for(i=0;i<nElementosIzq;i++){
                    arregloIzq[i]=a[i];
                }
                for(i=nElementosIzq;i<nElementosIzq+nElementosDer;i++){
                    arrgloDer[i-nElementosIzq]=a[i];
                }
                
                arregloIzq = Fusion(arregloIzq,co);
                arrgloDer = Fusion(arrgloDer,co);
                
                i=0;
                j=0;
                k=0;
                while(arregloIzq.length !=j && arrgloDer.length !=k){
                    if(arregloIzq[j]<arrgloDer[k]){
                        a[i]=arregloIzq[j];
                        i++;
                        j++;
                        comp++;
                    }else{
                        a[i]=arrgloDer[k];
                        i++;
                        k++;
                        comp++;
                    }
                }
                
                while(arregloIzq.length !=j){
                    a[i] = arregloIzq[j];
                    i++;
                    j++;
                }
                while(arrgloDer.length !=k){
                    a[i]=arrgloDer[k];
                    i++;
                    k++;
                }
                
            }
        long fin = System.nanoTime();
        double dif= (double)(fin-inicio)*1.0e-9;
        co = comp+aux;
        me = String.valueOf(dif);
        comp1=Integer.toString(comp);
    
            for(int ri=0;ri<a.length;ri++){
                        acu1 +=a[ri]+" ";
                    }
                    System.out.println("Salida: "+ acu1);
                    acu1 =" ";
        
        re[0] = co;
                return re;  
        
    
    }
    
    public String Gnome(int a[],int n){
        int x,i,j;
        String acu1="";
        String me ="";
        String comp1="";
        Double dif2=0.0;
        int comp=0;
        

long inicio = System.nanoTime();        
        for(x = Integer.SIZE-1;x>=0;x--){
            int auxiliar[] = new int [a.length];
            j=0;
            for(i=0;i<a.length;i++){
                boolean mover = a[i]<< x >=0;
                if(x==0 ? !mover:mover){
                    auxiliar[j]=a[i];
                    j++;
                    comp++;
                }else{
                    a[i-j]=a[i];
                    
                }
            }
            
            for(i=j;i<auxiliar.length;i++){
                auxiliar[i]=a[i-j];
            }
            a=auxiliar;
            
        }
    long fin = System.nanoTime();        
    double dif= (double)(fin-inicio)*1.0e-9;    
    me = String.valueOf(dif);
    comp1=Integer.toString(comp);     
    
                    for(int ri=0;ri<a.length;ri++){
                        acu1 +=a[ri]+" ";
                    }
                    System.out.println("Salida: "+ acu1);
                    acu1 =" ";
        
                    
        if(n==1){
            return me;
        }else{
            return comp1;
        }    
    
    }
    
      
    
}
