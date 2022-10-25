/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Perro;
import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Creador {

    private Scanner scanner = new Scanner(System.in);

    public Persona crearPersona() {
        System.out.println("Ingrese datos de la persona");
        System.out.println("Ingrese nombre");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese apellido");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese edad");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese documento");
        int documento = Integer.parseInt(scanner.nextLine());
        return new Persona(nombre, apellido, edad, documento);
    }

    public Perro crearPerro() {
        System.out.println("Ingrese datos del perro");
        System.out.println("Ingrese nombre");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese raza");
        String raza = scanner.nextLine();
        System.out.println("Ingrese edad");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese tamaño");
        float tamaño = Float.parseFloat(scanner.nextLine());
        return new Perro(nombre, raza, edad, tamaño);
    }
    
   
        
    }


