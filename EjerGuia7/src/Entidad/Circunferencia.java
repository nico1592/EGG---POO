/*
 *  Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Circunferencia {
    Scanner leer = new Scanner(System.in);
   private double radio;

    public Circunferencia() {
    }
   
   

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        System.out.println(" ingrese el radio ");
        radio=leer.nextDouble();
        }
    public double area(double radio){
        double area = Math.PI*(radio*radio);
        return area;
        
    }
    public double perimetro(double radio){
       double perimetro = (2 * Math.PI) * radio;
      
       return perimetro;
    }
    
}
