/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer2;

import Entidad.RectanguloEjer4;

/**
 *
 * @author Usuario
 */
public class Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        RectanguloEjer4 n1 = new RectanguloEjer4();
        n1.crearRectangulo();
        
        System.out.println(" la superfice del rectangulo es "+ n1.superficie(n1.getBase(), n1.getAltura()));
        System.out.println(" el perimetro de el rectangulo es "+ n1.perimetro(n1.getBase(), n1.getAltura()));
       
          for (int i = 0; i < n1.getBase(); i++) {
             for (int j = 0; j < n1.getAltura(); j++) {
                 System.out.print(" * ");
                 
             }
             System.out.println(" * ");
        }
    }
    
}
