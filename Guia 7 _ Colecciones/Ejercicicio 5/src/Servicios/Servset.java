/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Servset {

    HashSet<String> naciones = new HashSet();
    Scanner leer = new Scanner(System.in);

    public void crea() {

        String resp;

        do {

            System.out.println("Ingrese el pais");

            String paisa = leer.next();

            naciones.add(paisa);

            do {
                System.out.println("Desea ingresar otro pais ----- Si ------- No");

                resp = leer.next();

                if (resp.equalsIgnoreCase("si") || (resp.equalsIgnoreCase("no"))) {
                    break;

                } else {
                    System.out.println("La letra ingresada no es correcta");

                }
            } while (true);

        } while (resp.equalsIgnoreCase("si"));

        System.out.println("Las naciones guardadas son :");
        for (String nacione : naciones) {
            System.out.println(nacione);

        }

    }

    public void mostrarorde() {

        System.out.println("Las naciones ordenadas alfabeticamente son");

        ArrayList<String> nac = new ArrayList(naciones);

        Collections.sort(nac);
    }

    public void eliminar() {
        System.out.println("Ingrese el pais a eliminar");
        String eliminado = leer.next();

        Iterator<String> aux = naciones.iterator();

        while (aux.hasNext()) {
            String aux2 = aux.next();

            if (eliminado.equalsIgnoreCase(aux2)) {
                aux.remove();

            }

        }

    }

    public void mostrarorderr() {

        for (String nacione : naciones) {
            System.out.println(nacione);
            
        }

    }
}
