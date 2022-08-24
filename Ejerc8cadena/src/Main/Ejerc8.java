/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ejerc8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Cadena c1 = new Cadena();
        
        System.out.println("ingrese una frase");
        
        c1.setFrase(leer.next());
        
        c1.setLongitud(c1.getFrase().length());
        
        c1.vecesRepetido();
        
        System.out.println();
        
        
        
        
        
    }
    
}
