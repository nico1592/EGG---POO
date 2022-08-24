package Servicio_Nif;

import Entidad.Nif;
import java.util.Scanner;
import package_principalex_4.Principal_Ex4;

public class Clase_Servicio {

    Nif ob1 = new Nif();

    public Nif datos() {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la capacidad actual");
        ob1.setActual(leer.nextDouble());
        System.out.println("Ingrese la capacidad maxima");
        ob1.setMaxima(leer.nextDouble());

        return ob1;
    }

    public void llenar(Nif ob1) {

        ob1.setActual(ob1.getMaxima());

        System.out.println("La cantidad actual es de " + ob1.getActual() + " y la maxima es de " + ob1.getMaxima());

    }

    public void servir() {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la taza vacia");
        double vacia = leer.nextDouble();
        
        if (ob1.getActual()<vacia) {
            
            ob1.setActual(ob1.getActual()-vacia);
            System.out.println("No se alcanzo a llenar la taza");
            System.out.println("La taza quedo en "+ob1.getActual());
            
        }else {
            
            System.out.println("Se lleno la taza");
        }

    }
    
    public void vacia (){
        
        ob1.setActual(0);
        System.out.println("La capacidad de la taza es de "+ob1.getActual());
    }
    
    public void cafe(double tazon){
        
        ob1.setActual(ob1.getActual()+tazon);
        System.out.println("La cantidad actual es de "+ob1.getActual());
    }

}
