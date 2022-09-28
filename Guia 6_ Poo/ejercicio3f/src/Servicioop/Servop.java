package Servicioop;

import Entidad.Claseop;
import java.util.Scanner;

public class Servop {

    public Claseop crearmet() {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        System.out.println("Ingrese otro numero");

        Claseop ob = new Claseop(leer.nextInt(), leer.nextInt());

        return ob;

    }

    public int sumar(Claseop ob) {

        int suma=(ob.getNum1()+ob.getNum2());

        return suma;

    }

    public double multipl(Claseop ob){
        
        double multi = ob.getNum1()*ob.getNum2();
        
        return multi;
    }
}
