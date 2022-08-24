/*
 * 
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class OperacionEjer3 {
    Scanner leer = new Scanner(System.in);
    private int numero1;
    private int numero2;

    public OperacionEjer3() {
    }

    public OperacionEjer3(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        
        System.out.println(" ingerse su primer numero ");
        numero1=leer.nextInt();
        System.out.println(" ingrese su segundo numero ");
        numero2= leer.nextInt();
        
    }
    
    public int sumar(int nuemro1,int numero2){
        
        return numero1 + numero2;
    }
    public int restar(int numero1, int numero2){
        int restar= numero1 - numero2;
        return restar;
        
    }
    public double multiplicar (int numero1, int numero2){
        if(numero1 ==0 || numero2 == 0){
             System.out.println(" alguno de sus numeros es cero Error ");
             return 0;
        }
            return numero1 * numero2;
            
        }
        
    public double dividir(int numero1, int numero2){
        if(numero1 ==0 || numero2 == 0){
             System.out.println(" alguno de sus numeros es cero Error ");
             return 0;
        
    }
        return numero1 / numero2;
        
    }
    

}