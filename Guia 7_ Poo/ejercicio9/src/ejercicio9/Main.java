/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import Entidad.Clasemat;

/**
 *
 * @author nico_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Clasemat ob1 = new Clasemat();

        ob1.setNum1(Math.random() * 10);
        ob1.setNum2(Math.random() * 10);

        System.out.println("El numero mayor es " + ob1.mayor());
        
        System.out.println("La potencia es de "+ob1.potencia());
        
        System.out.println("La raiz cuadrada es de "+ob1.raiz());
        
        

    }

  
    }


