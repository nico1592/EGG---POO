/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer2;

import Entidad.Circunferencia;

/**
 *
 * @author Usuario
 */
public class Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        Circunferencia  cir1= new Circunferencia();
        cir1.crearCircunferencia();
        System.out.println(" el are es "+ cir1.area(cir1.getRadio()));
        System.out.println(" el perimetro es "+ cir1.perimetro(cir1.getRadio()));
        System.out.println(" Muchas Gracias ");
    }
    
}
