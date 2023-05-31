/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.guia10ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia10Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
       
        ArrayList<String> razas = new ArrayList<>();
         
        boolean asd = false;
        Scanner sc = new Scanner(System.in);
        String opc;
        while (true) {
            System.out.println("Ingrese la raza de los perros!");
            String raza = sc.nextLine();
            razas.add(raza);
            System.out.println("Quiere ingresar otro perro? Si/No/Salir");
            opc = sc.nextLine();
            if (opc.equalsIgnoreCase("salir")) {
                break;
            }
        }
        for (String r : razas) {
            System.out.println(r);
        }
        while (true) {
            System.out.println("\nDesea eliminar una raza? Si/Salir");
            String res = sc.nextLine();
            if (res.equalsIgnoreCase("salir")) {
                break;
            }
            Iterator<String> it = razas.iterator();
            System.out.println("Ingrese la raza a eliminar");
            String nombre = sc.nextLine();
            while (it.hasNext()) {
                if (it.next().equals(nombre)) {
                    it.remove();
                    asd = true;
                }
            }
            if(!asd){
                System.out.println("No se encuentra");
            }
            System.out.println("-------------------");
            Collections.sort(razas);
            System.out.println("-------------------");
            for (String r : razas) {
                System.out.println(r);
            }
        }
        
        

    }
}
