
package prueba;

import Entidad.Clase;
import Servicio.Servicioprue;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
        Servicioprue ob = new Servicioprue();
        Scanner leer = new Scanner(System.in);
        Clase ob1 = new Clase();
        
        
        ob.datos();
        
        System.out.println("Ingrese la cantidad de dinero a la cuenta");
        int din = leer.nextInt();
        ob.ingresar(din);
        
        
        
        System.out.println("Ingrese una cantidad a retirar");
        int ret=leer.nextInt();
        ob.retirar(ret);
        
          ob.extraccion();
        
        ob.consultar();
        
        ob.datoscunt();
        
        
        
        
        
        
        
    }
    
}
