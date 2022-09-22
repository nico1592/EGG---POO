package Servicios;

import Entidad.Equipo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ServiceEquipo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<Integer, Equipo> team = new HashMap<>();

    public void cargarJugador() {
        String v = "n";
        Integer numerojugador = 0;
        do {
            System.out.println("----a continuacion se ingresaran los datos del jugador");
            System.out.println("----");
            System.out.println("Ingrese el nombre:");
            String nombre = leer.next();
            System.out.println("ingrese el apellido:");
            String apellido = leer.next();
            System.out.println("ingrese el apodo:");
            String apodo = leer.next();
            System.out.println("ingrese la posicion en el campo de juego:");
            String posicion = leer.next();
            System.out.println("ingrese la altura del jugador:");
            Double altura = leer.nextDouble();
            System.out.println("ingrese el numero de camiseta:");
            int numerocamiseta = leer.nextInt();
            System.out.println("ingrese la fecha de nacimiento:");
            System.out.println("ingrese dia de nacimiento:");
            int dia = leer.nextInt();
            System.out.println("ingrese mes de nacimiento");
            int mes = leer.nextInt();
            System.out.println("ingrese el año de nacimiento:");
            int nacimiento = leer.nextInt();
            System.out.println("ingrese el puntaje de juego:");
            Double puntaje = leer.nextDouble();

            Date fechanac = new Date(nacimiento-1900, mes-1, dia);
            Equipo E1 = new Equipo(nombre, apellido, apodo, altura, posicion, numerocamiseta, fechanac, puntaje);

            numerojugador++;
            team.put(numerojugador, E1);

            do {
                System.out.println("¿Desea ingresar otro jugador? Si(S)/No(N)");
                v = leer.next();

                if (v.equalsIgnoreCase("n") || v.equalsIgnoreCase("s")) {

                    break;
                } else {
                    System.out.println("La opcion es incorrecta , ingrese S o N");
                }

            } while (true);

        } while (v.equalsIgnoreCase("s"));

        if (v.equalsIgnoreCase("n")) {

            for (Map.Entry<Integer, Equipo> entry : team.entrySet()) {
                Integer key = entry.getKey();
                Equipo value = entry.getValue();

                System.out.println("jugador " + key + " " + value.toString());

            }

        }
       
    }
    
    public void compararPorPuntaje(){
        
        ArrayList<Equipo> a1=new ArrayList<>();
        Set<Integer> s1=team.keySet();
        for (Integer aux : s1) {
            a1.add(team.get(aux));
        }
        Collections.sort(a1, comp);
        
        System.out.println("el orden por puntaje es el siguiente: ");
        System.out.println(a1.toString());
    }

   public static Comparator<Equipo> comp=new Comparator<Equipo>() {
        @Override
        public int compare(Equipo t, Equipo t1) {
//        Double dif=t.getPuntaje()-t1.getPuntaje();
       
         return t.getPuntaje().compareTo(t1.getPuntaje());
        }
       
   };
    
    
}
