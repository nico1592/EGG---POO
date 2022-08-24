package Servicio;

import Entidad.Clase;
import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Servicioprue {
    
    Clase ob1 = new Clase();
    
    public void ingresar(int dinero) {
        
        ob1.setSaldoactual(ob1.getSaldoactual()+ dinero);
        
        System.out.println("El saldo actual es de "+ob1.getSaldoactual());
        
        
    }
    
    public void retirar(double retiro) {
        
        
        ob1.setSaldoactual((int) (ob1.getSaldoactual()-retiro));
        System.out.println("Su saldo actual es de "+ob1.getSaldoactual());
        
        
    }
    
    public void extraccion() {
        
        
        int porcentaje = (int) (ob1.getSaldoactual() * 0.20);
        
        ob1.setSaldoactual(ob1.getSaldoactual()-porcentaje);
        System.out.println("Su saldo es "+ob1.getSaldoactual());
        
    }
    
    public void consultar() {
        
        System.out.println("Su saldo actual es de " + ob1.getSaldoactual());
    }
    
    public void datoscunt() {
        
        System.out.println(" Los datos de las cuentas son " + ob1.getNumerocuenta() + " y el dni es " + ob1.getDni());
    }
    
    public void datos() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su Dni");
        ob1.setDni(leer.nextInt());
        System.out.println("Ingrese su numero de cuenta");
        ob1.setNumerocuenta(leer.nextInt());
        System.out.println("ingrese su saldo actual");
        ob1.setSaldoactual(leer.nextInt());
        
    }
    
}
