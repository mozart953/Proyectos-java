/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinadorwilson;

import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class AdivinadorWilson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       String opc="";
       
       
       Tndos raiz=new Tndos ("¿Puede volar?");
       Tndos n2=new Tndos ("¿Puede ladrar?");
       Tndos n3=new Tndos ("Pájaro");
       
       raiz.setHz(n2);
       n2.setDc(new Tndos("Perro"));
       
       Tndos n4= new Tndos ("¿Se arrastra?");
       n2.setHz(n4);
       
       n4.setDc(new Tndos("Serpiente"));
       
       Tndos n5= new Tndos ("¿nada?");
       n4.setHz(n5);
       
       n5.setDc(new Tndos("Ballena"));
       
       
       Tndos n6 = new Tndos ("¿Salta?");
       n5.setHz(n6);
       
       n6.setDc(new Tndos ("Conejo"));
       
       Tndos n7 = new Tndos ("¿Maulla?");
       n6.setHz(n7);
       
       n7.setDc(new Tndos("Gato"));
       n7.setHz(new Tndos("Ni idea"));
       
       raiz.setDc(n3);
       

//Aqui se crea el árbol
       if(raiz!=null){
            System.out.println(raiz.getDt());
            System.out.println("si");
                if(raiz!=null){
                    System.out.println(n3.getDt());
                }
            System.out.println("no");    
                if(raiz!=null){
                    System.out.println(n2.getDt());
                }
            System.out.println("si");
                if(raiz!=null){
                    System.out.println(n2.getDc().getDt());
                }    
            System.out.println("no");    
                if(raiz!=null){
                    
                    System.out.println(n2.getHz().getDt());
                }    

            System.out.println("si");    
                if(raiz!=null){
                    
                    System.out.println(n4.getDc().getDt());
                }  
            System.out.println("no");    
                if(raiz!=null){
                    
                    System.out.println(n4.getHz().getDt());
                }    
            System.out.println("si");    
                if(raiz!=null){
                    
                    System.out.println(n5.getDc().getDt());
                }    
            System.out.println("no");    
                if(raiz!=null){
                    
                    System.out.println(n5.getHz().getDt());
                }    
            System.out.println("si");    
                if(raiz!=null){
                    
                    System.out.println(n6.getDc().getDt());
                }    
            System.out.println("no");    
                if(raiz!=null){
                    
                    System.out.println(n6.getHz().getDt());
                }    
            System.out.println("si");    
                if(raiz!=null){
                    
                    System.out.println(n7.getDc().getDt());
                }    
            System.out.println("no");    
                if(raiz!=null){
                    
                    System.out.println(n7.getHz().getDt());
                }    
                
       }
            
       
    }
    
    
}
