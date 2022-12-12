package JuegoTetris;

public class Dupla {

    double X, Y; // declaramos las variables x y y 

    public Dupla(double X, double Y) { // creamos un constructor para x y x 
        this.X = X;
        this.Y = Y;
    }

    public void sustituir(double a, double b){
        X = a;
        Y = b;
    }
    
    public int intX(){ //generamos el get y set para guardar en x y y 
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
