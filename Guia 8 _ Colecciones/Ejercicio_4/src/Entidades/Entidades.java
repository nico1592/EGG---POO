/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author nico_
 */
public class Entidades {
    
    private String director;
    
    private String pelicula;
    
    private Double duracion;

    public Entidades(String director, String pelicula, Double duracion) {
        this.director = director;
        this.pelicula = pelicula;
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Entidades{" + "director=" + director + ", pelicula=" + pelicula + ", duracion=" + duracion + '}';
    }
    
    
    
}
