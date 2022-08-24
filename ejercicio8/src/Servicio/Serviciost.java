/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Clases;
import java.util.Scanner;


/**
 *
 * @author nico_
 */
public class Serviciost {

    Scanner leer = new Scanner(System.in);

    Clases ob1 = new Clases();

    public void crear() {

        System.out.println("Ingrese una frase");
        ob1.setCadena(leer.nextLine());
        ob1.setLonguitud(ob1.getCadena().length());
        System.out.println("La frase es " + ob1.getCadena());
        System.out.println("El numero de letras es " + ob1.getLonguitud());
    }

    public int vocal() {

        int cont = 0;
        for (int i = 0; i < ob1.getLonguitud(); i++) {

            String vocal = ob1.getCadena().substring(i, i + 1);

            if (vocal.equalsIgnoreCase("a") || vocal.equalsIgnoreCase("e")) {

                cont++;
            }

        }
        return cont;

    }

    public void invertir() {

        for (int i = ob1.getLonguitud(); i > 0; i--) {

            System.out.println("La frase invertida es " + ob1.getCadena().substring(i - 1, i));

        }

    }

    public void repetir() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la letra");
        String letra = leer.nextLine();
        int contador = 0;

        for (int i = 0; i < ob1.getLonguitud(); i++) {
            if (ob1.getCadena().substring(i, i + 1).equalsIgnoreCase(letra)) {
                contador++;
            }

        }
        System.out.println("La letra " + letra + " se repite " + contador);

    }

    public boolean comparar() {
        Scanner leer = new Scanner(System.in);
        String frase2 = leer.nextLine();
        boolean devolver = ob1.getLonguitud() == frase2.length();

        return devolver;
    }

    public void unir() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase3 = leer.nextLine();
        
        System.out.println("La frase unida es "+ob1.getCadena().concat(frase3));

    }
    
    public boolean contiene(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra2 = leer.nextLine();
        
        return ob1.getCadena().contains(letra2);
    }

}
