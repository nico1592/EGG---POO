/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Clasecafe;
import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Serviciocafe {

    Scanner leer = new Scanner(System.in);

    Clasecafe ob1 = new Clasecafe();

    public void llenar() {

        System.out.println("ingrese la capacidad maxima de la cafetera");
        ob1.setCapacidadMaxima(leer.nextInt());
        ob1.setCantidadActual(ob1.getCapacidadMaxima());
        

    }

    public void servir(int taza) {
        if (ob1.getCantidadActual() < taza) {

            System.out.println("No se pudo llenar la taza de cafe , se cargo " + ob1.getCantidadActual());

        } else {

            ob1.setCantidadActual(ob1.getCantidadActual() - taza);
            System.out.println("Se lleno la taza");
        }

    }

    public void vaciar() {

        ob1.setCantidadActual(0);
    }
    
    public void agregarcafe(int cafe){
        
        ob1.setCantidadActual(ob1.getCantidadActual()+cafe);
        System.out.println("La cantidad actual es de "+ob1.getCantidadActual());
    }

}
