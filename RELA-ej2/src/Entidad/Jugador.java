
package Entidad;


/**
 *
 */
public class Jugador {
    private int ID;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
      
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "ID=" + ID + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
//    disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.
    
    public boolean disparo(Revolverdeagua r1 ){
        if (r1.mojar()) {
            
            mojado=true;
            return true;
        }else{
            r1.siguienteChorro();
            
            return false;
        }
        
    }
    public static Jugador crearJugador(){
       
             return new Jugador();
    
    }
}
