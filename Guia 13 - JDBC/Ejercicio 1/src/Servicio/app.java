/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Producto;
import java.util.ArrayList;

/**
 *
 * @author nico_
 */
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ServicioProducto servicioProducto = new ServicioProducto();

        Producto producto;
        try {
            producto = servicioProducto.buscarProductoPorCodigo("9546");
            System.out.println(producto);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }

        ArrayList<String> nombres;
        try {
            nombres = servicioProducto.todosNombresProductos();
            for (String string : nombres) {
                System.out.println(string);
            }
        } catch (Exception e) {
            System.out.println("Error nombres");
        }

        try {
            servicioProducto.agregarProducto(1995, "David", 10.5, 2);
            System.out.println("Cargado correctamente");
        } catch (Exception e) {
            System.out.println("Eror al ingresar");
        }
    }

    }
    

