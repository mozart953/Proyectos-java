/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptadorwilson;

/**
 *
 * @author Wilson Pop
 */
public class Arbol {
    Nodos raiz;
    
    public Arbol(){
        raiz=null;
    }
    //insertar
    public void agregarNodo(int d,String nom){
        Nodos nuevo = new Nodos (d,nom);
        if(raiz==null){
            raiz =nuevo;
        }else{
            Nodos aux = raiz;
            Nodos padre;
            while(true){
                padre=aux;
                if(d<aux.dato){
                    aux=aux.hiz;
                    if(aux==null){
                        padre.hiz=nuevo;
                        return;
                    }
                }else{
                    aux = aux.hde;
                    if(aux==null){
                        padre.hde = nuevo;
                        return;
                    }
                }
            }
        }
    }

    
    
    
}
