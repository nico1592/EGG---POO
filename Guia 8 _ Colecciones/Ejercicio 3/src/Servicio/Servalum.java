/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Clase;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Servalum {
    
    Scanner leer = new Scanner(System.in);
    
    ArrayList<Clase> alum = new ArrayList();
    
    Clase ob2 = new Clase();
    
    public void crear() {
        
        ArrayList<Integer> notas3 = new ArrayList();
        
        String resp = "si";
        
        do {
            
            System.out.println("Ingrese el nombre del alumno");
            String nombre = leer.next();
            
            System.out.println("Ingrese la nota 1");
            Integer not1 = leer.nextInt();
            System.out.println("Ingrese la nota 1");
            Integer not2 = leer.nextInt();
            System.out.println("Ingrese la nota 1");
            Integer not3 = leer.nextInt();
            
            notas3.add(not1);
            notas3.add(not2);
            notas3.add(not3);
            
            for (Integer integer : notas3) {
                System.out.println("las notas son " + integer);
            }
            
            alum.add(new Clase(nombre, notas3));
            
            do {
                System.out.println("Desea ingresar otro alumno ----- SI / NO ");
                
                resp = leer.next();
                
                if (resp.equalsIgnoreCase("Si") || resp.equalsIgnoreCase("No")) {
                    break;
                    
                } else {
                    
                    System.out.println("La opcion no es valida");
                }
                
            } while (true);
            
        } while (resp.equalsIgnoreCase(
                "Si"));
        
    }
    
    public void notafina() {
        System.out.println("Ingrese el nombre del alumno");
        String alum2 = leer.next();
        
        for (Clase aux : alum) {
            
            if (aux.getNombre().equalsIgnoreCase(alum2)) {
                System.out.println("El promedio del alumno es de " + aux.promed(this));
                
            }
            
        }
        
    }
    
}
