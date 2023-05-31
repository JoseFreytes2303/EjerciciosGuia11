/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia10ejercicio5.servicie;

import com.mycompany.guia10ejercicio5.entidades.Pais;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class PaisServicio {

    Scanner sc = new Scanner(System.in);
    Set<Pais> paises = new TreeSet<>(Comparator.comparing(Pais::getNombre));

    public void agregarPais() {
        System.out.println("Ingrese un pais!");
        String nombre = sc.nextLine();
        Pais pais = new Pais();
        pais.setNombre(nombre);
        if(paises.contains(pais)){
            System.out.println("El pais ya esta en la lista");
        }else {
            paises.add(pais);
        }
        System.out.println("Desea agregar otro pais?");
        String resp = sc.nextLine();
        if(resp.equalsIgnoreCase("si")){
            agregarPais();
        }else {
            mostrarPaises();
        }
    }
    
    public void mostrarPaises(){
        System.out.println("La lista de paises ingresados son: ");
        for (Pais paise : paises) {
            System.out.println(paise.getNombre());
        }
    }
    public void ordenAlfa(){
        System.out.println("Los paises ordenados alfabeticamente");
        for (Pais paise : paises) {
            System.out.println(paise.getNombre());
        }
    }
    public void eliminarPais(){
        System.out.println("Ingrese el pais a eliminar");
        String nombre = sc.nextLine();
        Pais pais = new Pais(nombre);
        if(paises.contains(pais)){
            paises.remove(pais);
            System.out.println("El pais ha sido eliminado");
        }else {
            System.out.println("El pais no se encuentra en la lista");
        }
        ordenAlfa();
    }

    
}
