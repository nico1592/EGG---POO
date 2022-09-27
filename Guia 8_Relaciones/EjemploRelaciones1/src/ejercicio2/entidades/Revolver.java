package ejercicio2.entidades;

public class Revolver {
    // posición actual (posición
    // del tambor que se dispara, puede que esté el agua o no) y posición agua (la
    // posición del
    // tambor donde se encuentra el agua). Estas dos posiciones, se generarán
    // aleatoriamente.
    private final static int CANTIDAD_POSICIONES = 6;
    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    // • llenarRevolver(): le pone los valores de posición actual y de posición del
    // agua.
    // Los valores deben ser aleatorios.
    public void llenarRevolver() {
       posicionActual = (int) (Math.random() * (CANTIDAD_POSICIONES - 1));
       posicionAgua = (int) (Math.random() * (CANTIDAD_POSICIONES - 1));
    }

    // • mojar(): devuelve true si la posición del agua coincide con la
    // posiciónactual
    public boolean mojar() {
        return posicionAgua == this.posicionActual;
    }

    // • siguienteChorro(): cambia a la siguiente posición del tambor
    public void siguienteChorro() {
        if (posicionActual == CANTIDAD_POSICIONES - 1) {
            posicionActual = 0;
        } else {
            posicionActual += 1;
        }
    }

    // • toString(): muestra información del revolver (posición actual y donde está
    // el agua)
    @Override
    public String toString() {
        return "{" +
                " posicionActual='" + getPosicionActual() + "'" +
                ", posicionAgua='" + getPosicionAgua() + "'" +
                "}";
    }
}
