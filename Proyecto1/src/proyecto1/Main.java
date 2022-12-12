/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Wilson Pop
 */
public class Main {

    static boolean validar_pin(int pin) {

        Scanner leer = new Scanner(System.in);
        int pin1;
        int intentos = 0;
        boolean vretorno;

        do {
            System.out.println("Ingrese PIN: ");
            pin1 = leer.nextInt();

            if (pin1 == pin) {
                System.out.println("PIN ACEPTADO");
                vretorno = true;
                intentos = 3;
            } else {

                System.out.println("PIN DENEGADO");
                intentos++;
                vretorno = false;
            }

        } while (intentos < 3);

        return vretorno;

    }

    static boolean validar_usuario(int usuario) {

        Scanner leer = new Scanner(System.in);
        int usuario1;
        int intentos1 = 0;
        boolean vretorno1;

        do {
            System.out.println("Ingrese usuario: ");
            usuario1 = leer.nextInt();

            if (usuario1 == usuario) {
                System.out.println("USUARIO CORRECTO");
                vretorno1 = true;
                intentos1 = 3;
            } else {

                System.out.println("USUARIO DENEGADO");
                intentos1++;
                vretorno1 = false;
            }

        } while (intentos1 < 3);

        return vretorno1;

    }

    static boolean clavem_a(int clavema1) {
        Scanner leer = new Scanner(System.in);
        int clavema;
        int intentos3 = 0;
        boolean vretorno2;

        do {
            System.out.println("Ingrese la clave maestra: ");
            clavema = leer.nextInt();

            if (clavema == clavema1) {
                System.out.println("Puede proseguir...");
                intentos3 = 3;
                vretorno2 = true;
            } else {
                System.out.println("Probablemente no ha creado una cuenta");
                intentos3++;
                vretorno2 = false;
            }

        } while (intentos3 < 3);

        return vretorno2;
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random al = new Random();

        String titular;
        int tipocuenta =0;
        int clavema = 0;
        int pin1 = 0;
        int pinc = 0;
        double deposito = 0;
        String pin = "";
        int nocuenta = 0;
        int nocuenta1 =0;
        int op;
        int op1;
        int op2;
        int op3;
        int op4;
        int op5;
        double retiro = 0;
        double retiro1 = 0;
        double retirototal = 0;
        double retirototal2 = 0;
        double retirototal3 = 0;
        double depositototal = 0;
        double saldo = 0;
        double saldototal = 0;
        double saldo2 = 0;
        int usuario1 = 0;

        do {
            System.out.println("BIENVENIDO AL MENÚ PRINCIPAL");
            System.out.println("Seleccione una opción");
            System.out.println("1. CAJERO");
            System.out.println("2. MANEJO DE CUENTAS");
            System.out.println("3. AYUDA");
            System.out.println("4. Salir");
            do {
                op = leer.nextInt();
            } while (op < 1 && op > 4);

            switch (op) {

                case 1:
                    System.out.println("¡BIENVENIDO AL CAJERO!");
                    System.out.println("Seleccione una opción");
                    System.out.println("1. Consultar Saldo");
                    System.out.println("2. Retirar");
                    System.out.println("3. Cambio de PIN");
                    System.out.println("4. Salir");
                    op1 = leer.nextInt();
                    switch (op1) {
                        case 1:
                            System.out.println("Consulta de saldo");
                            if (validar_pin(pin1) && validar_usuario(usuario1)) {
                                System.out.println("Su saldo es de:" + saldo + "quetzales");
                                System.out.println("Gracias por utilizar nuestros servicios...");

                                System.out.println("Pulse cualquier numero y Enter para continuar...");
                                op1 = leer.nextInt();
                            } else {
                                System.out.println("No se pudo verificar la información suministrada...");
                            }
                            break;
                        case 2:
                            System.out.println("Retiros");
                            if (validar_pin(pin1) && validar_usuario(usuario1)) {
                                if (tipocuenta != 3){
                                if (retirototal < 1500) {
                                    System.out.println("Unicamente puede retirar montos de 50, 100, 200,"
                                            + " 300, 500, 800 y 1000 quetzales.");
                                    System.out.println(" Elija una opción");
                                    System.out.println("1. Q 50.00");
                                    System.out.println("2. Q 100.00");
                                    System.out.println("3. Q 200.00");
                                    System.out.println("4. Q 300.00");
                                    System.out.println("5. Q 500.00");
                                    System.out.println("6. Q 800.00");
                                    System.out.println("7. Q 1000.00");
                                    op2 = leer.nextInt();
                                    switch (op2) {
                                        case 1:
                                            if (saldo >= 50) {
                                                retiro = 50;
                                                retirototal = retirototal + retiro;
                                                saldo = saldo - retiro;
                                                System.out.println("Su saldo actual es: " + saldo + " quetzales.");
                                            } else {
                                                System.out.println("No es posible hacer el retiro porque su saldo es "
                                                        + "insuficiente para cubrirlo" + " ,pulse cualquier número para"
                                                        + "continuar.");
                                                op2 = leer.nextInt();
                                            }

                                            break;
                                        case 2:
                                            if (saldo >= 100) {
                                                retiro = 100;
                                                retirototal = retirototal + retiro;
                                                saldo = saldo - retiro;
                                                System.out.println("Su saldo actual es: " + saldo + " quetzales.");
                                            } else {
                                                System.out.println("No es posible hacer el retiro porque su saldo es "
                                                        + "insuficiente para cubrirlo" + " ,pulse cualquier número para"
                                                        + "continuar.");
                                                op2 = leer.nextInt();
                                            }

                                            break;
                                        case 3:
                                            if (saldo >= 200) {
                                                retiro = 200;
                                                retirototal = retirototal + retiro;
                                                saldo = saldo - retiro;
                                                System.out.println("Su saldo actual es: " + saldo + " quetzales.");
                                            } else {
                                                System.out.println("No es posible hacer el retiro porque su saldo es "
                                                        + " insuficiente para cubrirlo" + " ,pulse cualquier número para"
                                                        + " continuar.");
                                                op2 = leer.nextInt();
                                            }

                                            break;
                                        case 4:
                                            if (saldo >= 300) {
                                                retiro = 300;
                                                retirototal = retirototal + retiro;
                                                saldo = saldo - retiro;
                                                System.out.println("Su saldo actual es: " + saldo + " quetzales.");
                                            } else {
                                                System.out.println("No es posible hacer el retiro porque su saldo es "
                                                        + "insuficiente para cubrirlo" + " ,pulse cualquier número para"
                                                        + "continuar.");
                                                op2 = leer.nextInt();
                                            }

                                            break;
                                        case 5:
                                            if (saldo >= 500) {
                                                retiro = 500;
                                                retirototal = retirototal + retiro;
                                                saldo = saldo - retiro;
                                                System.out.println("Su saldo actual es: " + saldo + " quetzales.");
                                            } else {
                                                System.out.println("No es posible hacer el retiro porque su saldo es "
                                                        + "insuficiente para cubrirlo" + " ,pulse cualquier número para"
                                                        + "continuar.");
                                                op2 = leer.nextInt();
                                            }

                                            break;
                                        case 6:
                                            if (saldo >= 800) {
                                                retiro = 800;
                                                retirototal = retirototal + retiro;
                                                saldo = saldo - retiro;
                                                System.out.println("Su saldo actual es: " + saldo + " quetzales.");
                                            } else {
                                                System.out.println("No es posible hacer el retiro porque su saldo es "
                                                        + "insuficiente para cubrirlo" + " ,pulse cualquier número para"
                                                        + "continuar.");
                                                op2 = leer.nextInt();
                                            }

                                            break;
                                        case 7:
                                            if (saldo >= 1000) {
                                                retiro = 1000;
                                                retirototal = retirototal + retiro;
                                                saldo = saldo - retiro;
                                                System.out.println("Su saldo actual es: " + saldo + " quetzales.");
                                            } else {
                                                System.out.println("No es posible hacer el retiro porque su saldo es "
                                                        + " insuficiente para cubrirlo" + " ,pulse cualquier número para"
                                                        + " continuar.");
                                                op2 = leer.nextInt();
                                            }

                                            break;

                                    }

                                    System.out.println("Gracias por utilizar nuestros servicios...");

                                    System.out.println("Pulse cualquier numero y Enter para continuar...");
                                    op1 = leer.nextInt();
                                } else {
                                    System.out.println("Por ahora no puede hacer un retiro, porque tiene un retiro total"
                                            + " de 1500 quetzales.");
                                }

                            }else{System.out.println("No puedde hacer retiros en el cajero porque su cuenta es de"
                                    + " tipo ahorro programado.");}
                            
                            } else {
                                System.out.println("No se pudo verificar la información suministrada...");
                            }
                            break;

                        case 3:
                            if (validar_pin(pin1)) {
                                System.out.println("Cambio del PIN de la cuenta " + nocuenta + " de " + usuario1);

                                do {
                                    System.out.println("Ingrese nuevo pin (Valor numerico).");
                                    pin1 = leer.nextInt();
                                    System.out.println("Ingrese Nuevamente el nuevo (Valor numerico).");
                                    pinc = leer.nextInt();
                                    if (pin1 != pinc) {
                                        System.out.println("Error en la comprobación de la contraseña.  Intentelo nuevamente...");
                                    }
                                } while (pin1 != pinc);
                                System.out.println("Se ha asignado nuevo pin a la cuenta...");
                            } else {
                                System.out.println("No se pudo verificar la información suministrada...");
                            }

                    }

                    break;
                case 2:
                    System.out.println("¡Bienvenido al manejo de cuentas!");
                    System.out.println("Seleccione una opción");
                    System.out.println("1. Creación de cuenta");
                    System.out.println("2. Deposito a cuenta");
                    System.out.println("3. Retiro a cuenta");
                    System.out.println("4. Modificación de usuario");
                    System.out.println("5. Reporte de saldo a cuenta, por saldo descendente");
                    System.out.println("6. Reporte del balance general");
                    System.out.println("7 Salir");
                    op3 = leer.nextInt();

                    switch (op3) {

                        case 1:
                            System.out.println("Ingrese su número de usuario (sólo valores numéricos).");
                            usuario1 = leer.nextInt();

                            do {
                                System.out.println("Ingrese PIN para su nueva cuenta (sólo valores numéricos).");
                                pin1 = leer.nextInt();
                                System.out.println("Ingrese nuevamente el PIN para su nueva cuenta.");
                                pinc = leer.nextInt();
                                if (pin1 != pinc) {
                                    System.out.println("El pin igresado no coincide, vuelva a intentarlo.");

                                }

                            } while (pin1 != pinc);
                            nocuenta = al.nextInt(100);
                            System.out.println("Su No. de cuenta es: " + nocuenta);
                            System.out.println("Escriba el nombre titular de la cuenta.");
                            titular = leer.next();
                            System.out.println("Ingrese el monto de deposito inicial.");
                            do{
                                saldo = leer.nextDouble();
                                if(saldo <=0){
                                    System.out.println("El monto inicial no puede ser 0, intentelo de nuevo.");
                                }
                            }while(saldo<=0);
                            System.out.println("Debe crear una clave maestra comprendida solo de números.");
                            clavema = leer.nextInt();
                            System.out.println("Debe elegir el tipo de cuenta...");
                            System.out.println("1. Cuenta de ahorro");
                            System.out.println("2. Cuenta monetaria");
                            System.out.println("3. Cuenta de ahorro programado");
                            do{
                            op4 = leer.nextInt();}while(op4<1 && op4 >3);
                                        switch(op4){
                                            case 1:
                                                tipocuenta = 1;
                                                break;
                                            case 2:
                                                tipocuenta = 2;
                                                break;
                                            case 3:
                                                tipocuenta = 3;
                                                break;
                                        }
                            if (tipocuenta == 1){
                                System.out.println("Su cuenta está aperturada y es de tipo ahorro.");
                                
                            }
                            if (tipocuenta == 2){
                                System.out.println("Su cuenta está aperturada y es de tipo monetaria.");
                            }
                            if (tipocuenta == 3){
                                System.out.println("Su cuenta está aperturada y es de tipo ahorro programado.");
                            }

                            break;
                        case 2: 
                            if (clavem_a(clavema)){
                                System.out.println("Depositar a la cuenta de " + usuario1);
                                do{
                                System.out.println("Ingrese la cantidad a depositar, no puede ser negativa o 0.");
                                deposito = leer.nextDouble();
                                }while(deposito <=0);
                                
                                depositototal = deposito + depositototal;
                                saldo = saldo + deposito;
                                System.out.println("Su saldo actual es: " + saldo + "quetzales.");                               
                                System.out.println("¡Gracias por usar nuestros servicios, vuelva pronto!");
                                
                            }else {System.out.println("No sepudo verificar la clave maestra ingresada,"
                                    + " cree una cuenta o regrese al menú principal.");}
                            
                            break;
                        
                        case 3:
                            if (clavem_a(clavema)){
                                do{
                                System.out.println("Ingrese el número de cuenta para poder hacer el retiro.");
                                nocuenta1 = leer.nextInt();
                                }while(nocuenta1 != nocuenta);
                                
                                
                                do {
                                System.out.println("Ingrese la cantidad a retirar.");
                                retiro1 = leer.nextDouble();
                                }while(retiro1>saldo);
                                
                                while(retiro1 <=0){
                                System.out.println("La cantitad ingresada anteriormente fue menor o igual a 0,"
                                        + " intentelo de nuevo.");
                                retiro1 = leer.nextDouble();
                                }
                                
                                retirototal2 = retirototal2 + retiro1; //retiro total del manejo de cuentas
                                retirototal3 = retirototal2 + retirototal ; // retiro total de la cuenta
                                saldo = saldo - retiro1;
                                System.out.println("Su saldo actual es: " + saldo + "quetzales.");
                                System.out.println("Gracias por utilizar nuestros servicios");
                                
                            }else {System.out.println("No sepudo verificar la clave maestra ingresada,"
                                    + " cree una cuenta o verifique nuevamente yendo al menú principal.");}
                        
                            break; 
                        case 4:
                            System.out.println("Cambiar PIN");
                            if(clavem_a(clavema) && validar_usuario(usuario1)){
                                System.out.println("Cambio de clave de la cuenta de " + usuario1);
                                
                                do {
                                    System.out.println("Ingrese el nuevo PIN (sólo valores numéricos)");
                                    pin1 = leer.nextInt();
                                    System.out.println("Ingrese nuevamente el PIN (sólo valores numéricos)");
                                    pinc = leer.nextInt();
                                    if(pin1 != pinc){
                                        System.out.println("Los pines ingresados no coinciden, intentelo nuevamente");
                                    }
                                }while(pin1 != pinc);
                                System.out.println("Se ha asignado el nuevo pin a la cuenta");
                            }else{ System.out.println("Los datos ingresados no existen o han sido modificados, prosiga");}
                                    
                            break;
                        case 5:
                            if (clavem_a(clavema)){
                                System.out.println("El deposito total es: " + depositototal + " quetzales.");
                                System.out.println("Su retiro monetario ha sido: " + retirototal2 + " quetzales.");
                                System.out.println("El retiro total del cajero ha sido: " + retirototal + " quetzales.");
                                
                            }else{System.out.println("La clave maestra no es correcta, prosiga");}
                            break;
                        case 6:
                            if (clavem_a(clavema)){
                                System.out.println("Su saldo actual es de " + saldo + " quetzales");
                                System.out.println("El total de retiros es de " + (retirototal2 + retirototal) + " quetzales.");
                                System.out.println("El total de depositos es de " + depositototal + " quetzales.");
                            }else{System.out.println("La clave maestra no es correcta, prosiga");}
                            break;
                        case 7: break;    

                    }

                    break;
                case 3:
                    System.out.println("¡Bienvenido a la sección de ayuda!");
                    System.out.println("Elija una de la siguientes opciones...");
                    System.out.println("1. Acerca de la aplicación");
                    System.out.println("2. Ayuda");
                    do{
                    op5 = leer.nextInt();
                    }while (op5 <0 && op5>2);
                    switch(op5){
                        case 1:
                            System.out.println("\n\nEsta aplicación fue creada por "
                                    + "Wilson Victor Alexander Pop Cac estudiante de ingeniería\n"
                                    + "en Ciencias y Sistemas del Centro Universitario del Norte -CUNOR- con"
                                    + " el fin de aplicar\nconceptos sumamente importantes dentro del lenguaje"
                                    + "de programación java como lo son las\nclases,las sentencias de control,"
                                    + "las condicionales y los ciclos.");
                            System.out.println("\n\nLa aplicación simula a un cajero de banco y a un manejo de cuentas\n"
                                    + "que es posible tener en un sistema bancario de la vida real.\n\n");
                            break;
                        case 2: 
                            System.out.println("\n\nLa aplicación cuenta con un menú principal compuesta"
                                    + " de 4 partes,\nse accede a cada opción pulsando el número que le corresponde,"
                                    + " de\nno ser así se retornara una vez más al menú.");
                            System.out.println("\nEn la opción del cajero se podran realizar retiros que no excedan\n"
                                    + "los Q 1500.00 y también se podrá modificar el PIN de usuario.");
                            System.out.println("\nEn el manejo de cuentas se podrá crear una cuenta, la cual servirá\npara "
                                    + " poder acceder a cualquier parte del menú principal, por lo -\n"
                                    + "tanto es recomendable crear una cuenta.");
                            System.out.println("\nEn el manejo de cuentas se podrá depositar y retinar dinero.\n\n");
                            break;
                    
                    }
                    
                    break;

            }

        } while (op != 4);

        System.out.println("¡Hasta pronto!");

    }

}
