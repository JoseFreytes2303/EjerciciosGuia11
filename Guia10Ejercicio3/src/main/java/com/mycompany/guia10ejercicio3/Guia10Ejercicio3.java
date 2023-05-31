/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia10ejercicio3;

import com.mycompany.guia10ejercicio3.entiendades.Alumno;
import com.mycompany.guia10ejercicio3.servicio.AlumnosServicios;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Guia10Ejercicio3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        AlumnosServicios as =new  AlumnosServicios();
        List<Alumno> alumno=  as.crearAlumnos();
        System.out.println(as.notaFinal(alumno));
    }
}
