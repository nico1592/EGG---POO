/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoMain;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolverdeagua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Jugador>aux = new ArrayList();
        Revolverdeagua r1=new Revolverdeagua();
        r1.llenarRevolver();
        //System.out.println ( r1.mojar());
       // r1.siguienteChorro();
      
      
        System.out.println("cuantos jugadores van a participar?");
        int cant = leer.nextInt();
        for (int i = 0; i < cant; i++) {
        Jugador j1 = Jugador.crearJugador();
        j1.setID(i+1);
        j1.setNombre("Jugador");
        aux.add(j1);
       
                }
        Juego f1 = new Juego();
        f1.llenarJuego(aux, r1);
        System.out.println(f1.getLista());
        f1.ronda();
    }
    
}
