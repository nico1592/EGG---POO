/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7_5_set;

import Servicios.Servset;

/**
 *
 * @author nico_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Servset ob1 = new Servset();

        ob1.crea();
//        ob1.mostrarorde();

        ob1.eliminar();
        ob1.mostrarorderr();

    }

}
