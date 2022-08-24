/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.ClaseBan;
import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Servban {

    public ClaseBan crear() {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su numero de cuenta bancaria");
        System.out.println("Ingrese su DNI");

        ClaseBan ob1 = new ClaseBan(leer.nextInt(), leer.nextInt());

        return ob1;

    }

    public int retirar(double retiro, ClaseBan ob1) {

        int ret = (int) (ob1.getSaldoActual() - retiro);

        return ret;
    }

    public void consulta(ClaseBan ob1) {

        System.out.println("Su saldo es de " + ob1.getSaldoActual());

    }

    public void datos(ClaseBan ob1) {

        System.out.println("Su numero de cuenta bancaria es " + ob1.getNumeroCuenta());
        System.out.println("Su DNI es " + ob1.getDni());
    }
}
