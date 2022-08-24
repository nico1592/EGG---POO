/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Clase;
import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Serviciom {

    Scanner leer = new Scanner(System.in);

    Clase ob1 = new Clase();

    public Clase crear() {

        
       
        System.out.println("ingrese la altura");
        ob1.setAltura(leer.nextDouble());
        System.out.println("Ingrese su peso");
        ob1.setPeso(leer.nextDouble());

        return ob1;

    }

    public void imc(Clase ob1) {

        double ideal = ob1.getPeso() / (ob1.getAltura() * ob1.getAltura());

        if (ideal >= 25) {
            System.out.println("Esta por encima de su peso inicial");

        } else if (ideal >= 20 && ideal <= 25) {

            System.out.println("Usted esta en su peso ideal");

        } else {

            System.out.println("La persona esta debajo de su peso ideal");

        }

    }

    public boolean mayoredad(Clase ob1) {

        return ob1.getEdad() > 18;

    }

}
