/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
 *
 * @author Pc
 */
public class Cadena {
    
    Scanner leer = new Scanner(System.in);
    
    private String frase;
    
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
   // Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
  //  ingresada.//
    
    public int mostrarVocales() {
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            

        }
        return contador;
    }

    //Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
    //ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    
    public String invertirFrase() {
        String invertida = null;
        for (int i = frase.length()-1; i >= 0; i--) {
            
            invertida += frase.charAt(i);
            
        }
      return invertida; 
        
    }
    
//Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
//contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces. 
    
    public int vecesRepetido(){
        
        System.out.println("ingrese un caracter");
        String letra = leer.next();
        int contador=0;
        for (int i = 0; i < frase.length() ; i++) {
            
           if (frase.charAt(i) == letra.charAt(0) ){
               
              contador ++ ; 
            }
        }
        
        System.out.println("la letra esta "+ contador +  " veces");  
      return contador;  
    }
    
    
    
    
}
    
    

