/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1;

import Entidad.Clase;
import Servicio.Serviciom;

/**
 *
 * @author nico_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Serviciom ob2 = new Serviciom();

        double porcentaje = 0;

        System.out.println("Datos primera persona");
        Clase ob = ob2.crear();
        System.out.println("Datos segunda persona");
        Clase ob3 = ob2.crear();
        System.out.println("Datos tercera persona");
        Clase ob4 = ob2.crear();
        System.out.println("Datos cuarta persona");
        Clase ob5 = ob2.crear();

        System.out.println("Primera persona");
        ob2.imc(ob);

        System.out.println("Es mayor de edad " + ob2.mayoredad(ob));
        

        System.out.println("Segunda persona");
        ob2.imc(ob3);
        System.out.println("Es mayor de edad " + ob2.mayoredad(ob3));
        
        
        System.out.println("Tercera persona");
        ob2.imc(ob4);
        System.out.println("Es mayor de edad "+ob2.mayoredad(ob4));
        
        
        System.out.println("Cuarta persona");
        ob2.imc(ob5);
        System.out.println("Es mayor de edad "+ob2.mayoredad(ob5));

    }

}
