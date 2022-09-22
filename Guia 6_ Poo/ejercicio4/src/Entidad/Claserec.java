package Entidad;

import java.util.Scanner;

public class Claserec {

    int base;
    int altura;

    public Claserec() {
    }

    public Claserec(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crear() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la altura del rectangulo");
        altura = leer.nextInt();
        System.out.println("Ingrese al base del rectangulo");
        base = leer.nextInt();

    }

    public void dibujo() {

        for (int fila = 0; fila < altura; fila++) {
            for (int columna = 0; columna < base; columna++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
