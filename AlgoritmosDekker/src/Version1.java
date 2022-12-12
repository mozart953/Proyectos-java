
import static java.lang.Math.random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wilson Pop
 */
public class Version1 {
    
    int turno;
    boolean cancelar;

    public void retardar_unos_milisegundos(int velocidad) {
        for (int i = 0; i < velocidad && !cancelar; i++) {
            for (int j = 0; j < velocidad && !cancelar; j++) {
                /* no hace nada */
            }
        }
    }

    public void ejecutar_seccion_critica_1() {
        System.out.println("proceso 1 en region critica");
        retardar_unos_milisegundos(10000);
    }

    public void proceso1() {

        while (!cancelar) {
            while (turno == 2 && !cancelar) {
                /* esperar */
            }

            if (cancelar) {
                break;
            }

            ejecutar_seccion_critica_1();

            turno = 2;
        }

        System.out.println("Ha terminado el proceso 1");

    }

    public void ejecutar_seccion_critica_2() {
        System.out.println("proceso 2 en region critica");
        retardar_unos_milisegundos(5000);
    }

    public void proceso2() {

        while (!cancelar) {
            while (turno == 1 && !cancelar) {
                /* esperar */
            }

            if (cancelar) {
                break;
            }

            ejecutar_seccion_critica_2();

            turno = 1;
        }

        System.out.println("Ha terminado el proceso 2");

    }
    
    
   public void esperar_enter_del_usuario() {
       System.out.println("Presione la tecla [x] para salir.");
   }
   
    public void iniciar() {
        cancelar=false;
        turno = random() % 100 + 1 <= 50 ? 1 : 2;
        proceso1();
        proceso2();


       esperar_enter_del_usuario();

       cancelar = true;
    }
   

}
