
package Entidad;

import java.util.Scanner;


public class Libro {

   int ISBM;
   String titulo;
   String autor;
   int numpag;
   
    Scanner leer = new Scanner(System.in);

    public Libro(int ISBM, String titulo, String autor, int numpag) {
        this.ISBM = ISBM;
        this.titulo = titulo;
        this.autor = autor;
        this.numpag = numpag;
    }
   
   public Libro(){
       
   }
          
   
  
   public void llenar( ){
       
       System.out.println("Ingrese le numero ISBC");
       ISBM = leer.nextInt();
       
       System.out.println("Ingrese el titulo del libro");
       titulo= leer.next();
       
       System.out.println("Ingrese el nombre del autor");
       autor=leer.next();
       
       System.out.println("Ingrese el numero de la pagina");
       numpag=leer.nextInt();
   }
  
   public void mostrar (){
       
       System.out.println("El numero de ISBM es "+ISBM);
       System.out.println("El titulo del libro es "+titulo);
       System.out.println("El auto es "+autor);
       System.out.println("El numero de pagina es "+numpag);
   }
}
