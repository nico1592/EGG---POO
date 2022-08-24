/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer2;

import Entidad.OperacionEjer3;

/**
 *
 * @author Usuario
 */
public class Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        OperacionEjer3 p1 = new OperacionEjer3();
        p1.crearOperacion();
         System.out.println("la suma de sus numeros es = " + p1.sumar(p1.getNumero1(), p1.getNumero2()));
         System.out.println("la resta de su nuemro es " + p1.restar(p1.getNumero1(), p1.getNumero2()));
         System.out.println("la multiplicacion de sus nuemros es " + p1.multiplicar(p1.getNumero1(), p1.getNumero2()));
        System.out.println(" la division de sus numeros es = " + p1.dividir(p1.getNumero1(), p1.getNumero2()));
       
    }
    
}
