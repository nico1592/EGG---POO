package ejercicio2;

import Entidad.Clasecirc;
import Servicio.serviciocirc;

public class main {

    public static void main(String[] args) {

        serviciocirc ob1 = new serviciocirc();

        Clasecirc ob = ob1.crearmas();

        ob1.crearmas();
        ob1.perimetro(ob);
        ob1.area(ob);

    }

}
