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
public class Clasemat {

    private double num1;
    private double num2;

    public Clasemat() {
    }

    public Clasemat(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double mayor() {

        return Math.max(num1, num2);

    }

    public double potencia() {
        double aux = 0;

        num1 = Math.round(num1);
        num2 = Math.round(num2);
        if (num1 > num2) {
            aux = Math.pow(num1, num2);
        }

        return aux;
    }

    public double raiz() {
        double aux = 0;
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        if (num1 > num2) {
            aux = Math.sqrt(num2);
        } else {

            aux = Math.sqrt(num1);

        }

        return aux;

    }
      
}
 