/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author nico_
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola");
        
        //se crea una variable Scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner (System.in);
        //se crea una variable cadena string que se utiliza pra leer datos del usuario
        String nombre;
        //muestra un mensaje por pantalla
        System.out.println("Ingresa tu nombre");
        //leemos el nombre de la persona en la variable nombre
        nombre = leer.next();
        //mostramos por consola un saludo personalizado
        System.out.println("Hola Mundo! soy" + nombre + " y estoy progrmando en java");

        
    }
    
}
