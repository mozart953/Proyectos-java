/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionprolog;

//import org.jpl7.Query;

import java.util.Scanner;
import jpl.Query;


/**
 *
 * @author Wilson Pop
 */
public class ConexionProlog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        String tl="consult('ejercicio4.pl')";
        Query ql = new Query(tl);
        System.out.println(tl+" "+(ql.hasSolution()?"satisfactoria":"insatisfactoria"));
        
        
        String pregunta = "mujer(X)";
        
        Query q2 = new Query(pregunta);
        
        String accion = q2.oneSolution().get("X").toString();
        System.out.println(accion);
        
        //String a = leer.nextLine();
    }
    
}
