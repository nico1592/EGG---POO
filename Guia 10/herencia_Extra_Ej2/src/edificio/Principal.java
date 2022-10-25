 
package edificio;

import java.util.ArrayList;

 
public class Principal {

    public static void main(String[] args) {
        
        ArrayList<Edificio> edi = new ArrayList();
         
        EdificioOficiona e1 = new EdificioOficiona(20, 20, 30);
        EdificioOficiona e2 = new EdificioOficiona(10, 15, 25);
        
        Polideportivo p1 = new Polideportivo("AtleticoFC", true, 50, 100, 15);
        Polideportivo p2 = new Polideportivo("LaCanchita", false,30, 150, 12 );
        
            e1.llenarOficina();
            edi.add(e1);
            
            System.out.println("**************");
            
            e2.llenarOficina();
            edi.add(e2);
            
            System.out.println("**************");
            edi.add(p1);
            edi.add(p2);
            
            System.out.println("*******");
            
        for (Edificio edificio : edi) {

            System.out.println(edificio.toString());
            edificio.calcularSuperficie();
            edificio.calcularVolumen();
            System.out.println("***");
            
        }
        /*
        nos falta instanciar la cantidad de polideportivos con techa y sin
        techo
        */
        for (Edificio edificio : edi) {
            if (edificio instanceof EdificioOficiona) {

                ((EdificioOficiona) edificio).cantPersona();

            } else {

            }
        }
    }

  
    }
    

