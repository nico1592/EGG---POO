/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 * @author Usuario
 */
public class CuentaEjer5 {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int numeroCuenta;
    private String nombre;
    private String apellido;
    private Integer dni;
    private  int saldoActual=0;
    private double interes ;
    private double ingreso= 0;

    public CuentaEjer5() {
    }

    public CuentaEjer5(int numeroCuenta, Integer dni, int saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
   // Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario
    public void crearCuenta(){
       this.numeroCuenta= (int) (Math.random()*10);
        System.out.println(" ingrese su nombre ");
        this.nombre=leer.nextLine();
        System.out.println(" ingrese su apellido");
        this.apellido=leer.nextLine();
        System.out.println(" ingrese su dni ");
        this.dni=leer.nextInt();
        
        
    }
   /* d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.*/
    public double ingreso( double ingreso , double saldoActual){
        System.out.println(" ingrese la cantidad de dinero  ingresar ");
        this.ingreso=leer.nextDouble();
        return saldoActual+ ingreso;
      }
    /*Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0. */
    public double retiro(double saldoActual){
        System.out.println(" ingrese a cantidad de dinero a retirar");
        
        double retiro=leer.nextDouble();
        if( retiro > saldoActual ){
           this.saldoActual=0;
           return 0;
        }
        
        return this.saldoActual - retiro ;
    }
    /*Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.*/
    public double extraccionRapida(double saldoActual){
        System.out.println(" ingrese  el monto de extraccion rapia");
        
        return 0;
        
    }
    
    
}
