/*
Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el
método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula
try-catch para probar la nueva excepción que debe ser controlada
 */
package exercise_1;

import exercise_1.service.PersonService;

/**
 *
 * @author Damian
 */
public class NewMain {

    public static void main(String[] args) {
        
    PersonService ps1 = new PersonService();

        try {
              System.out.println(ps1.esMayorDeEdad())  ;
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    
    }  
}
