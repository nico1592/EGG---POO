/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Servicio.Servalum;
import java.util.ArrayList;

/**
 *
 * @author nico_
 */
public class Clase {

    private String nombre;

    private ArrayList<Integer> notas3 = new ArrayList();

    public Clase(String nombre, ArrayList<Integer> notas3) {
        this.nombre = nombre;
        this.notas3 = notas3;

    }

    public ArrayList<Integer> getnotas3() {
        return notas3;
    }

    public Clase() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Clase{" + "nombre=" + nombre + '}';
    }

    public Clase(String nombre) {
        this.nombre = nombre;
    }

    public double promed(Servalum alum) {

        Integer suma = 0;

        double promedio = 0;

        for (Integer integer : notas3) {

            suma = suma + integer;

        }

        promedio = suma / 3;

        return promedio;

    }

}
