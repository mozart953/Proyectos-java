/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detodito;

/**
 *
 * @author Wilson Pop
 */
public class Manzana {

    private String color;
    private String tamaño;
    private String sabor;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void Creamanzana(String _color, String _tamaño, String _sabor) {
        
        color = _color;
        tamaño =  _tamaño;
        sabor = _sabor;

    }

}
