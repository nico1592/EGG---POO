/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class ServiciosCadena {

    Cadena ob1 = new Cadena();

    ArrayList<String> arraperro = new ArrayList();
    Scanner leer = new Scanner(System.in);

    public void pedir() {

        String resp = "s";

        do {
            System.out.println("Ingrese la raza de perros");

            arraperro.add(leer.next());

            System.out.println("Desea ingresar otro perro");

            resp = leer.next();

        } while (resp.equalsIgnoreCase("s"));

        for (String string : arraperro) {

            System.out.println("Las razas guardadas son");

            System.out.println(string);

        }

    }

    public void eliminar() {

        System.out.println("Ingrese una raza a eliminar");
        String raza2 = leer.next();

        Iterator< String> it = arraperro.iterator();

        while (it.hasNext()) {

            String aux = it.next();

            if (aux.equalsIgnoreCase(raza2)) {

                it.remove();

            }

        }

    }

    public void mostrar() {

        System.out.println("Las razas guardadas son");

        for (String string : arraperro) {

            System.out.println(string);

        }

    }
}
