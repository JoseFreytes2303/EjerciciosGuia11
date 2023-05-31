/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia10ejercicio4.servicios;

import com.mycompany.guia10ejercicio4.entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PeliculaServicio {

    Scanner sc = new Scanner(System.in);
    ArrayList<Pelicula> pelis = new ArrayList();

    public ArrayList<Pelicula> cargarPelicula() {

        System.out.println("Ingrese el titulo de la pelicula");
        Pelicula peli1 = new Pelicula();
        peli1.setTitulo(sc.nextLine());
        System.out.println("Ingrese el director de la pelicula");
        peli1.setDirector(sc.nextLine());
        System.out.println("Ingrese la duracion de la pelicula");
        peli1.setDuracion(sc.nextInt());
        sc.nextLine();
        pelis.add(peli1);
        System.out.println("Desea ingresar otra pelicula?");
        String resp = sc.nextLine();
        if (resp.equalsIgnoreCase("si")) {
            cargarPelicula();
        }
        return pelis;
    }

    public void mostarPelis(ArrayList<Pelicula> peli1) {
        for (Pelicula pelicula : peli1) {
            System.out.println(pelicula);
        }
    }

    public void mayorUnaHora(ArrayList<Pelicula> peli1) {
        for (Pelicula pelicula : peli1) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }
    }

    public void mayorMenor(ArrayList<Pelicula> peli1) {
        Collections.sort(peli1, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return Double.compare(p2.getDuracion(), p1.getDuracion());
            }
        });
        for (Pelicula pelicula : peli1) {
            System.out.println(pelicula);
        }
    }

    public void menorMayor(ArrayList<Pelicula> peli1) {
        Collections.sort(peli1, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return Double.compare(p1.getDuracion(), p2.getDuracion());
            }
        });
        for (Pelicula pelicula : peli1) {
            System.out.println(pelicula);

        }
    }

    public void ordenarAlfabeticamente(ArrayList<Pelicula> peli1) {
        Collections.sort(peli1, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getTitulo().compareToIgnoreCase(p2.getTitulo());
            }
        });
        for (Pelicula pelicula : peli1) {
            System.out.println(pelicula);
        }
    }
public void ordenarAlfabeticamenteDirector(ArrayList<Pelicula> peli1) {
        Collections.sort(peli1, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getDirector().compareToIgnoreCase(p2.getDirector());
            }
        });
        for (Pelicula pelicula : peli1) {
            System.out.println(pelicula);
        }
    }
}

//• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
