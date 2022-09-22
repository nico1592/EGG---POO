
package Entidad;

import java.util.Date;


public class Equipo {
    
    private String nombre;
    private String apellido;
    private String apodo;
    private String posicion;
    private Double altura;
    private Integer camiseta;
    private Date fechanac;
    private Double puntaje;

    public Equipo() {
    }
    
    

    public Equipo(String nombre, String apellido, String apodo,Double altura, String posicion, Integer camiseta, Date fechanac, Double puntaje) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.apodo = apodo;
        this.altura= altura;
        this.posicion = posicion;
        this.camiseta = camiseta;
        this.fechanac = fechanac;
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Integer getCamiseta() {
        return camiseta;
    }

    public void setCamiseta(Integer camiseta) {
        this.camiseta = camiseta;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", apellido=" + apellido + ", apodo=" + apodo + ", posicion=" + posicion + ", altura=" + altura + ", camiseta=" + camiseta + ", fechanac=" + fechanac + ", puntaje=" + puntaje + '}';
    }
    
    
    
    
}
