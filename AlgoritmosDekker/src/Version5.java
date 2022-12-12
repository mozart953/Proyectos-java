
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
public class Version5 {

    boolean proceso1_puede_entrar;
    boolean proceso2_puede_entrar;
    int turno;
    boolean cancelar;

    public void retardar_unos_milisegundos(int velocidad) {
        for (int i = 0; i < velocidad && !cancelar; i++) {
            for (int j = 0; j < velocidad && !cancelar; j++) {
                /* no hace nada */
            }
        }
    }

    public void retardo_aleatoreo() {

        int tiempo = (int) ((random() % 100) * 50);

        retardar_unos_milisegundos(tiempo);
    }

    public void ejecutar_seccion_critica_1() {
        System.out.println("proceso 1 en region critica");
        retardar_unos_milisegundos(15000);
    }

    public void proceso1() {

        while (!cancelar) {

            proceso1_puede_entrar = true;

            while (proceso2_puede_entrar && !cancelar) {

                if (turno == 2) {
                    proceso1_puede_entrar = false;
                    while (turno == 2 && !cancelar) {
                        /* esperar */
                    }
                    proceso1_puede_entrar = true;
                }
            }

            if (cancelar) {
                break;
            }

            ejecutar_seccion_critica_1();

            turno = 2;
            proceso1_puede_entrar = false;
        }

        System.out.println("Ha terminado el proceso 1");

    }

    public void ejecutar_seccion_critica_2() {
        System.out.println("ptoceso 2 en region critica");
        retardar_unos_milisegundos(5000);
    }

    public void proceso2() {

        while (!cancelar) {

            proceso2_puede_entrar = true;

            while (proceso1_puede_entrar && !cancelar) {

                if (turno == 1) {
                    proceso2_puede_entrar = false;
                    while (turno == 1 && !cancelar) {
                        /* esperar */
                    }
                    proceso2_puede_entrar = true;
                }
            }

            if (cancelar) {
                break;
            }

            ejecutar_seccion_critica_2();

            turno = 1;
            proceso2_puede_entrar = false;
        }

        System.out.println("Ha terminado el proceso 2");
    }

    public void esperar_enter_del_usuario() {
        System.out.println("Presione la tecla [Enter] para salir.");
    }

    public void inciar() {
        cancelar = false;
        proceso1_puede_entrar = false;
        proceso2_puede_entrar = false;
        turno = 1;

        proceso1();
        proceso2();

        esperar_enter_del_usuario();

        cancelar = true;

    }

}
