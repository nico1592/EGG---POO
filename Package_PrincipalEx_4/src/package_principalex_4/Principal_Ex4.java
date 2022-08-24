package package_principalex_4;

import Entidad.Nif;
import Servicio_Nif.Clase_Servicio;
import java.util.Scanner;

public class Principal_Ex4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Clase_Servicio ob2 = new Clase_Servicio();

        Nif ob1 = ob2.datos();

        ob2.llenar(ob1);

        ob2.servir();

        System.out.println("Ingrese la cantidad de cafe a añadir");
        double taz = leer.nextDouble();
        ob2.cafe(taz);

    }

}
