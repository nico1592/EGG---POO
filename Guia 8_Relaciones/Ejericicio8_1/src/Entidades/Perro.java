/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enum_Per.Enum_Perro;

/**
 *
 * @author nico_
 */
public class Perro {

    // Atributos
    private String nombre;
    private String raza;
    private int edad;
    private float tamaño;
    private Enum_Perro Enum_Perro;

    // Constructor
    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, float tamaño, Enum_Perro Enum_Perro) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
        this.Enum_Perro = Enum_Perro;

    }

    public Perro(String nombre, String raza, int edad, float tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    // Getters and setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    public Enum_Perro getEnum_Perro() {
        return Enum_Perro;
    }

    public void setEnum_Perro(Enum_Perro Enum_Perro) {
        this.Enum_Perro = Enum_Perro;
    }

    // toString
    @Override
    public String toString() {
        return "{"
                + " nombre='" + getNombre() + "'"
                + ", raza='" + getRaza() + "'"
                + ", edad='" + getEdad() + "'"
                + ", tamaño='" + getTamaño() + "'"
                + "}";
    }

}
