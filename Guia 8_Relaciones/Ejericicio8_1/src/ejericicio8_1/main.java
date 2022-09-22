/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericicio8_1;

import Entidades.Perro;
import Entidades.Persona;
import Servicio.Creador;
import java.util.ArrayList;

/**
 *
 * @author nico_
 */
public class main {

    public static void main(String[] args) {

        Creador creador = new Creador();
        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Perro> perros = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            personas.add(creador.crearPersona());
            perros.add(creador.crearPerro());
            personas.get(i).setPerro(perros.get(i));
        }

        for (Persona p : personas) {
            System.out.println(p);
        }
    }

}
