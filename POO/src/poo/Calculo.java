package poo;

import java.util.Scanner;

public class Calculo {

 int numcuenta;
 int  dni;
 int saldoactual;

    public Calculo(int numcuenta, int dni, int saldoactual) {
        this.numcuenta = numcuenta;
        this.dni = dni;
        this.saldoactual = saldoactual;
    }
 
 public void crearcuenta() {
     Scanner leer = new Scanner(System.in);
     
     System.out.println("Ingrese el numero de cuenta ");
     numcuenta= leer.nextInt();
     System.out.println("Ingrese su dni");
     dni=leer.nextInt();
     System.out.println("Ingrese su saldo actual");
     saldoactual=leer.nextInt();
   
}
 
 public void ingresar( int ingreso ){
     saldoactual = (saldoactual + ingreso);
     System.out.println(" Su saldo actual es de "+saldoactual);
  
 }
 public void retirar ( int )
 
}


    
    

    