package ejercicio3;

import Entidad.Claseop;
import Servicioop.Servop;

/**
 *
 * @author nico_
 */
public class main {

    public static void main(String[] args) {

        Servop ob = new Servop();

        Claseop ob2 = ob.crearmet();

        int sumacion;

        sumacion = ob.sumar(ob2);

        System.out.println("La suma es de " + sumacion);

        System.out.println("La multiplicacion es de " + ob.multipl(ob2));

    }

}
