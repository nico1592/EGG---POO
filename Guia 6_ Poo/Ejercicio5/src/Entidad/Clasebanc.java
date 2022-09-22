/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author nico_
 */
public class Clasebanc {
    
    private int numeroCuenta;
    private int Dni;
    private int saldoactual;

    public Clasebanc() {
    }

    public Clasebanc(int numeroCuenta, int Dni) {
        this.numeroCuenta = numeroCuenta;
        this.Dni = Dni;
        
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public int getSaldoactual() {
        return saldoactual;
    }

    public void setSaldoactual(int saldoactual) {
        this.saldoactual = saldoactual;
    }
    
    
    
}
