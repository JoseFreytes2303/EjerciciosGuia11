/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia10ejercicio1.servicie;

import com.mycompany.guia10ejercicio1.entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AlumnoService {
    static Scanner sc = new Scanner(System.in);
    public static Alumno cargarAlumnos(){
        ArrayList <String> nombres = new ArrayList();
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Ingrese su nombre");
            String nombre = sc.nextLine();
            nombres.add(nombre);
            for (String aux : nombres){
                System.out.println(aux); 
            }
        }
        return new Alumno();
    }
   
}
