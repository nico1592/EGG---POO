package Servicio;

import Entidad.Clasecirc;
import java.util.Scanner;

public class serviciocirc {

    Scanner leer = new Scanner(System.in);

    public Clasecirc crearmas() {

        System.out.println("Ingrese el radio");

        Clasecirc ob1 = new Clasecirc(leer.nextDouble());

        return ob1;

    }

    public void area(Clasecirc ob1) {

        double ar = 3.14 * ob1.getRadio() * ob1.getRadio();

        System.out.println("El area es de " + ar);
    }

    public void perimetro(Clasecirc ob1) {

        double per = 2 * 3.14 * ob1.getRadio();

        System.out.println("El perimetro es de " + per);

    }

}
