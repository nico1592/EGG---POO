/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Clases {

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Clases() {
    }

    public Clases(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Clases crearpuntos() {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la coordenada de x1");
        x1 = leer.nextDouble();
        System.out.println("Ingrese la coordenada de x2");
        x2 = leer.nextDouble();
        System.out.println("Ingrese la coordenada de y1");
        y1 = leer.nextDouble();
        System.out.println("Ingrese la coordenada de y2");
        y2 = leer.nextDouble();

        Clases ob1 = new Clases(x1, y1, x2, y2);
        return ob1;

    }

    public double calcular(){
        
        
        return Math.sqrt(Math.pow(x2, x1)+Math.pow(y2, y1));
        
    

}
    
    
    
            
            

}
