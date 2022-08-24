package ejercicio5;

import Entidad.ClaseBan;
import Servicio.Servban;

/**
 *
 * @author nico_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Servban ob1 = new Servban();

        ClaseBan ob2 = ob1.crear();

        ob2.setSaldoActual(2000);

       

        System.out.println("Su saldo es de " + ob1.retirar(200, ob2));

        ob1.datos(ob2);

    }

}
