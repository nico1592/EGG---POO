/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package exercise_5;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        
        int n = (int)(Math.random()*500)+1;
        
        int answer=0;
        
        int i=0;
        
        do {
            
            i++;
            
            System.out.println("enter a number between 1 and 500");
            
            try{
                
            answer = Integer.parseInt(read.nextLine()) ;
            
            if (n<answer) {
                System.out.println("the number entered is greater");
            }else if(n>answer){
                System.out.println("the number entered is less");
            }
            
            }catch(NumberFormatException e){
                
                System.out.println(e.getMessage());        
            }

        } while (answer!=n);

        System.out.println("congratulations you guessed it");
        System.out.println("number of attempts: "+i);
    }
    
}
