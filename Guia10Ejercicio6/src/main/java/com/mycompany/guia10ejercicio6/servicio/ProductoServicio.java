/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia10ejercicio6.servicio;

import com.mycompany.guia10ejercicio6.entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ProductoServicio {

    Scanner sc = new Scanner(System.in);
    Map<String, Producto> produc = new HashMap<>();

    public void agregarProductos() {
        System.out.println("Ingrese el nombre del producto");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el precio de dicho producto");
        double precio = sc.nextDouble();
        sc.nextLine();
        Producto pro = new Producto(nombre, precio);
        produc.put(nombre, pro);
        System.out.println("Producto agregado correctamente");
    }

    public void modificar() {
        System.out.println("Ingrese el nombre del producto a modificar");
        String nombre = sc.nextLine();
        if (produc.containsKey(nombre)) {
            Producto pro = produc.get(nombre);
            System.out.println("Ingrese el nuevo precio");
            double nuevoPrecio = sc.nextDouble();
            sc.nextLine();
            pro.setPrecio(nuevoPrecio);
            System.out.println("El precio del producto ha sido actulizado");
        } else {
            System.out.println("El producto no se encuentra en la tienda");
        }
    }

    public void eliminar() {
        System.out.println("Ingrese el producto a eliminar");
        String nombre = sc.nextLine();
        if (produc.containsKey(nombre)) {
            produc.remove(nombre);
            System.out.println("El producto ha sido eliminado");
        } else {
            System.out.println("El producto no se encuentra en la tienda");
        }
    }

    public void mostarProductos() {
        System.out.println("\tPRODUCTOS EN LA TIENDA ");
        String nombre;
        Producto producto;
        for (Map.Entry<String, Producto> entry : produc.entrySet()) {
            nombre = entry.getKey();
            producto = entry.getValue();
            System.out.println(nombre + " - Precio: " + producto.getPrecio());
        }
    }
}
