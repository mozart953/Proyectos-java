
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Escriba el primer número");
        n1 = sc.nextInt();

        int num1 = 3;
        int num2 = 7;
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multi = num1 * num2;
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multi);

        if (num1 > num2) {
            System.out.println("El mayor es: " + num1);
        } else {
            System.out.println("El mayor es: " + num2);
        }
        
        System.out.println("Escriba un ");
        switch(num1){
        
        }
    }

}
