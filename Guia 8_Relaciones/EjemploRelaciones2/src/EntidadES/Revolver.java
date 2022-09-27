package EntidadES;

public class Revolver {
    // posiciÃ³n actual (posiciÃ³n
    // del tambor que se dispara, puede que estÃ© el agua o no) y posiciÃ³n agua (la
    // posiciÃ³n del
    // tambor donde se encuentra el agua). Estas dos posiciones, se generarÃ¡n
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

    // â€¢ llenarRevolver(): le pone los valores de posiciÃ³n actual y de posiciÃ³n del
    // agua.
    // Los valores deben ser aleatorios.
    public void llenarRevolver() {
        this.posicionActual = (int) (Math.random() * (CANTIDAD_POSICIONES - 1));
        this.posicionAgua = (int) (Math.random() * (CANTIDAD_POSICIONES - 1));
    }

    // â€¢ mojar(): devuelve true si la posiciÃ³n del agua coincide con la
    // posiciÃ³nactual
    public boolean mojar() {
        return this.posicionAgua == this.posicionActual;
    }

    // â€¢ siguienteChorro(): cambia a la siguiente posiciÃ³n del tambor
    public void siguienteChorro() {
        if (this.posicionActual == CANTIDAD_POSICIONES - 1) {
            this.posicionActual = 0;
        } else {
            this.posicionActual += 1;
        }
    }

    // â€¢ toString(): muestra informaciÃ³n del revolver (posiciÃ³n actual y donde estÃ¡
    // el agua)
    @Override
    public String toString() {
        return "{" +
                " posicionActual='" + getPosicionActual() + "'" +
                ", posicionAgua='" + getPosicionAgua() + "'" +
                "}";
    }
}

