 
package edificio;

 
public class Polideportivo extends Edificio{
    
    // ATRIBUTOS
    private String nombre;
    
    // tipo de instalación que puede ser Techado o Abierto
    private boolean instalacion;

    public Polideportivo(double ancho, double largo, double alto) {
        super(ancho, largo, alto);
    }

    public Polideportivo(String nombre, boolean instalacion, double ancho, double largo, double alto) {
        super(ancho, largo, alto);
        this.nombre = nombre;
        this.instalacion = instalacion;
    }

    
    
    
    
    
    
    // METODOS ABSTRAC

    @Override
    public void calcularSuperficie() {
        double superficie = this.getLargo() * this.getAncho();
        System.out.println("la Superficie es : " + superficie);
    }

    @Override
    public void calcularVolumen() {
        double volumen = this.getLargo() * this.getAlto() * this.getAncho();
        System.out.println("El Volumen es: " + volumen);
         }

    @Override
    public String toString() {
        return "Polideportivo" + "nombre=" + nombre + ", Techado=" + instalacion;
    }
    
    
}
