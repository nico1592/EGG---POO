/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import Entidad.Clasecafe;
import Servicio.Serviciocafe;
import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        Serviciocafe ob1 = new Serviciocafe();
        
        Clasecafe ob2 = new Clasecafe();
        
        ob1.llenar();
        ob1.servir(leer.nextInt());
        ob1.vaciar();
        ob1.agregarcafe(leer.nextInt());
        
    }
    
}
