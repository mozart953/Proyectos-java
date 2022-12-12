/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static java.time.Instant.now;

/**
 *
 * @author Wilson Pop
 */
public class Version5a {

    boolean senal[] = new boolean[2];
    int turno = 1;

    public void retardar_unos_milisegundos(int velocidad) {
        for (int i = 0; i < velocidad; i++) {
            for (int j = 0; j < velocidad; j++) {
                /* no hace nada */
            }
        }
    }

    public void process_0() {
        senal[0] = true;
        while (senal[1]) {
            if (turno == 1) {
                senal[0] = false;
                while (turno == 1) {
                    System.out.println("Proceso#0, Espere 3 seg\n");
                    retardar_unos_milisegundos(3000);
                    senal[0] = true;

                    System.out.println("proceso#0 ini rutina critica \n");
                    retardar_unos_milisegundos(6000);
                    System.out.println("proceso#0 fin rutina critica\n");
                    turno = 1;
                    senal[0] = false;
                }

            }

        }

    }

    public void process_1() {
        senal[1] = true;
        while (senal[0]) {
            if (turno == 0) {
                senal[1] = false;
                while (turno == 0) {
                    System.out.println("Proceso#0, Espere 3 seg\n");
                    retardar_unos_milisegundos(3000);
                    senal[0] = true;
                }

            }

        }
        System.out.println("proceso#0 ini rutina critica \n");
        retardar_unos_milisegundos(6000);
        System.out.println("proceso#0 fin rutina critica\n");
        turno = 1;
        senal[1] = false;

    }

    public void inciar() {
        senal[0] = true;
        senal[1] = true;
        process_0();
        process_0();
    }

}
