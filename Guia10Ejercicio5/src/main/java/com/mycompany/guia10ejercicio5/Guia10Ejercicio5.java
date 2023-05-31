/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia10ejercicio5;

import com.mycompany.guia10ejercicio5.servicie.PaisServicio;

/**
 *
 * @author Usuario
 */
public class Guia10Ejercicio5 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        PaisServicio ps = new PaisServicio();
        ps.agregarPais();
        ps.eliminarPais();
        
    }
}
