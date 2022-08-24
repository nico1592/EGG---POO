
import Entidad.Clasebanc;
import java.util.Scanner;



public class Servicio11 {

    public Clasebanc Crear() {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su numero de cuenta");
        System.out.println("Ingrese su Dni");

        Clasebanc ob1 = new Clasebanc(leer.nextInt(), leer.nextInt());

        return ob1;

    }

    public void retirar(double retiro) {

    }
}
