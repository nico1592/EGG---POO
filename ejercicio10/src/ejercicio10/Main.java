/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author nico_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double vector[] = new double[50];
        double vector2[] = new double[20];

        for (int i = 0; i < 50; i++) {
            vector[i] = Math.random() * 20;

        }

        for (int i = 0; i < 50; i++) {
            System.out.println(vector[i]);

        }

        for (int i = 0; i < 20; i++) {

            if (i < 10) {

                vector2[i] = vector[i];

            } else {

                vector2[i] = 0.5;
            }
            System.out.println("["+vector2[i]+"]");
        }

    }
}
