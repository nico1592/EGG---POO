/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 * Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo
 * de String) y su longitud. En el main se creará el objeto y se le pedirá al
 * usuario que ingrese una frase que puede ser una palabra o varias palabras
 * separadas por un espacio en blanco y a través de los métodos set, se guardará
 * la frase y la longitud de manera automática según la longitud de la frase
 * ingresada. Deberá además implementar los siguientes métodos:
 *
 * @author Pc
 */
public class Cadena {
    
    private String raza;

    public Cadena() {
    }

    public Cadena(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    

}
