/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import Entidad.Clases;

/**
 *
 * @author nico_
 */
public class Main {

    public static void main(String[] args) {

        Clases ob1 = new Clases();

        Clases ob2 = ob1.crearpuntos();

        System.out.println("La distancia de los puntos es de " + ob1.calcular());

    }

}
