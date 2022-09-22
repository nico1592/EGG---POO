/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serviciopeli;

import Entidades.Entidades;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Serv {

    Scanner leer = new Scanner(System.in);

    ArrayList<Entidades> cartelera = new ArrayList();

    String respuesta = "Si";

    public void crearmovie() {

        do {

            System.out.println("Ingrese el nombre de la pelicula");
            String pelicula = leer.next();

            System.out.println("Ingrese el director de la pelicula");
            String director = leer.next();

            System.out.println("Ingrese la duracion de la pelicula");
            Double duracion = leer.nextDouble();

            Entidades ob1 = new Entidades(director, pelicula, duracion);

            cartelera.add(ob1);

            System.out.println("Desea seguir colocando peliculas");

            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("s"));

    }

    public void mostrar() {

        for (Entidades entidades : cartelera) {
            System.out.println(entidades.toString());

        }
    }

    public void moviemayor1() {

        for (Entidades entidades : cartelera) {
            if (entidades.getDuracion() > 1) {
                System.out.println(entidades);

            }

        }
    }

    private static Comparator<Entidades> ordenarduracionas = new Comparator<Entidades>() {
        @Override
        public int compare(Entidades t, Entidades t1) {
            return t1.getDuracion().compareTo(t.getDuracion());

        }

    };

    public void ordenarporduraas() {

        Collections.sort(cartelera, ordenarduracionas);
        mostrar();
    }

    private static Comparator<Entidades> ordenaralfabetico = new Comparator<Entidades>() {
        @Override
        public int compare(Entidades t, Entidades t1) {
            return t.getPelicula().compareTo(t1.getPelicula());

        }

    };

    public void ordenaralfabetido() {

        Collections.sort(cartelera, ordenaralfabetico);
        mostrar();

    }

}
