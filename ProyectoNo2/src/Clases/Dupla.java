package Clases;

public class Dupla {

    double X, Y;

    public Dupla(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    public void sustituir(double a, double b){
        X = a;
        Y = b;
    }
    
    public int intX(){
        return (int)X;
    }
    
    public int intY(){
        return (int)Y;
    }
    
    public void Adicionar(Dupla dupla){
        X+=dupla.X;
        Y+=dupla.Y;
    }

    public void moverDerecha() {
        X++;
    }

    public void moverAbajo() {
        Y++;
    }

    public void moverIzquierda() {
        X--;
    }

    public void moverArriba() {
        Y--;
    }

    public double getX() {
        return X;
    }

    public void setX(double X) {
        this.X = X;
    }

    public double getY() {
        return Y;
    }

    public void setY(double Y) {
        this.Y = Y;
    }
    public void girarDerecha(){
        double temp = X;
        X = -Y;
        Y = temp;
    }
    public void girarIzquierda(){
        double temp = X;
        X = Y;
        Y = -temp;
    }
}
