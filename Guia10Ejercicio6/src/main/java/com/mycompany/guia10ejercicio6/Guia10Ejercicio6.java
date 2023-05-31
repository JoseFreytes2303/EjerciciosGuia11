/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia10ejercicio6;

import com.mycompany.guia10ejercicio6.servicio.ProductoServicio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia10Ejercicio6 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        ProductoServicio pr = new ProductoServicio();
        int opcion;
        do {            
            System.out.println("\tMenu!");
            System.out.println("\t1-Agregar producto");
            System.out.println("\t2-Modificar precio de un producto");
            System.out.println("\t3-Eliminar un producto");
            System.out.println("\t4-Mostrar productos");
            System.out.println("\t5-Salir");
            System.out.println("Ingrese una opcion");
            opcion = sc.nextInt();
            switch(opcion){
                case 1 :
                    pr.agregarProductos();break;
                case 2 :
                    pr.modificar();break;
                case 3 :
                    pr.eliminar();break;
                case 4 : 
                    pr.mostarProductos();break;
                case 5 : 
                    System.out.println("Saliendo de la APP");
            }
        } while (opcion != 5);
        
    }
}
