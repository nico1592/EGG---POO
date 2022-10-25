/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edificio;

import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class EdificioOficiona extends Edificio{
    
    Scanner leer = new Scanner(System.in);
    
    //atributos número de oficinas, cantidad de personas por oficina 
    //y número de pisos
    
    //ATRIBUTOS
    private int numOficina;
    private int cantPersona;
    private int numPisos;

    public EdificioOficiona() {
    }

    public EdificioOficiona(int numOficina, int cantPersona, int numPisos, double ancho, double largo, double alto) {
        super(ancho, largo, alto);
        this.numOficina = numOficina;
        this.cantPersona = cantPersona;
        this.numPisos = numPisos;
    }

    public EdificioOficiona(double ancho, double largo, double alto) {
        super(ancho, largo, alto);
    }

    

    
    
    public void cantPersona() {
        System.out.println("catidad de personas por oficina: " + this.cantPersona);
        System.out.println("cantidad de personas totale en el Edificio: "
                + this.cantPersona * this.numOficina);
    }

    public void llenarOficina() {
        System.out.println("1_) ingrese la cantidad de personas en una oficina: ");
        this.cantPersona = leer.nextInt();

        System.out.println("2_) cantidad de pisos del Edificio: ");
        this.numPisos = leer.nextInt();
        this.numOficina = this.numPisos;

    }
    
    @Override
    public void calcularSuperficie() {
        
       double superficie = this.getLargo()*this.getAncho();
        System.out.println("la Superficie es : " + superficie);
        
    }

    @Override
    public void calcularVolumen() {
        double volumen = this.getLargo() * this.getAlto() * this.getAncho();
        System.out.println("El Volumen es: " + volumen);
    }

    @Override
    public String toString() {
        return "Edi.Oficina\n"+ "Oficinas=" + numOficina + ", Personas=" + cantPersona 
                + ", Pisos=" + numPisos + "PersonasTotal: " + (cantPersona*numPisos);
    }
   
    
            
}
