/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia10ejercicio3.servicio;

import com.mycompany.guia10ejercicio3.entiendades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AlumnosServicios {

    Scanner sc = new Scanner(System.in);

    public List<Alumno> crearAlumnos() {
        ArrayList<Alumno> alumno = new ArrayList<>();
        ArrayList<Integer> notas ;
        boolean asd = true;
        while (asd) {
            System.out.println("Ingrese el nombre del alumno");
            Alumno a1 = new Alumno();
            a1.setNombre(sc.nextLine());
            notas = new ArrayList();
            for (int i = 1; i < 4; i++) {
                System.out.println("Ingrese la nota " + i + " del alumno ");
                notas.add(sc.nextInt());
                sc.nextLine();
            }
            a1.setNotas(notas);
            alumno.add(a1);
            System.out.println("Quiere ingresar otro alumno?");
            String resp = sc.nextLine();
            if (resp.equalsIgnoreCase("no")) {
                asd = false;
            }
        }
        return alumno;
    }

    public double notaFinal(List<Alumno> alumnos) {
        double prom = 0;
        System.out.println("Ingrese el nombre del alumno para calcular promedio");
        String nom = sc.nextLine();
        for (Alumno aux : alumnos) {
            if (nom.equals(aux.getNombre())) {
                for (Integer aux2 : aux.getNotas()) {
                    prom += aux2;
                }
            }
        }
        return prom / 3;
    }
}


