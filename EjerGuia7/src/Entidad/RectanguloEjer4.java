/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 * @author Usuario
 */
public class RectanguloEjer4 {
    Scanner leer = new Scanner(System.in);
    private double base;
    private double altura;

    public RectanguloEjer4() {
    }

    public RectanguloEjer4(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void crearRectangulo(){
          System.out.println(" ingrese la base de su triangulo");
        base=leer.nextDouble();
        System.out.println(" ingrese la altura de su triangulo");
        altura=leer.nextDouble();
        
    }
    
    public double superficie(double base , double altura){
        
        
        return base * altura;
    }
    public double perimetro(double base , double altura){
        
        return (base + altura)*2;
    }
     public void dibujar (double base , double altura ){
         
           for (int i = 0; i < base ; i++) {
             for (int j = 0; j< altura ; j++) {
                 System.out.print(" * ");
                 
             }
             System.out.println(" * ");
        }
     }
}
