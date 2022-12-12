/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Random;
import javax.swing.JButton;

/**
 *
 * @author Wilson Pop
 */
public class Procedimientos {

    public void VerificarLugarVacio(JButton boton0, JButton boton1) {
        String numero = boton1.getText(); // agregar el numero verificado a un String

        if (numero == "") { // si el numero verificado es igual a vacio entonces se procede a mover el numero
            boton1.setText(boton0.getText()); //se inserta el numero al boton vacio
            boton0.setText("");// se vacia el boton del numero
        }
    }

    public boolean CompararMatriz(String MatrizI[][], String MatrizD[][]) {
        boolean comparar = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (MatrizI[i][j] != MatrizD[i][j]) {
                    comparar = true;
                    break;
                }
            }
        }

        return comparar;
    }

     public int CompararMatriz2(String MatrizI[][], String MatrizD[][]) { //comparacion para determinar el coste
        int comparar = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (MatrizI[i][j] != MatrizD[i][j]) {
                   comparar++;
                }
            }
        }

        return comparar;
    }


}
