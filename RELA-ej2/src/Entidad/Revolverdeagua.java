

package Entidad;

/**
 *
 * @author Pc
 */
public class Revolverdeagua {
    
    private int PosicionAgua;
    private int PosicionActual;

    public Revolverdeagua() {
    }

    public Revolverdeagua(int PosicionAgua, int PosicionActual) {
        this.PosicionAgua = PosicionAgua;
        this.PosicionActual = PosicionActual;
    }

    public int getPosicionAgua() {
        return PosicionAgua;
    }

    public void setPosicionAgua(int PosicionAgua) {
        this.PosicionAgua = PosicionAgua;
    }

    public int getPosicionActual() {
        return PosicionActual;
    }

    public void setPosicionActual(int PosicionActual) {
        this.PosicionActual = PosicionActual;
    }

    @Override
    public String toString() {
        return "Revolverdeagua{" + "PosicionAgua=" + PosicionAgua + ", PosicionActual=" + PosicionActual + '}';
    }
    
    public void llenarRevolver(){
        
        PosicionAgua = (int)(Math.random()*6)+1;
        PosicionActual = (int)(Math.random()*6)+1;
        System.out.println( "posiciones"+  PosicionAgua+"---"+"\n"+ PosicionActual);
    }
    
//    mojar(): devuelve true si la posición del agua coincide con la posición actual
    
    public boolean mojar(){
        
        return PosicionAgua ==  PosicionActual;
        
    }
//     siguienteChorro(): cambia a la siguiente posición del tambor
    
    public void siguienteChorro(){
        if (PosicionActual==6) {
            PosicionActual=1;
            
        }else{
            PosicionActual+=1;
        }
    }
    
    
}
