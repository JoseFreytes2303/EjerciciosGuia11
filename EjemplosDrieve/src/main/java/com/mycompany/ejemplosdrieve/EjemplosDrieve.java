/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejemplosdrieve;

import com.mycompany.ejemplosdrieve.servicio.TriangulosServicie;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjemplosDrieve {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor del lado");
        double lado = sc.nextDouble();
        System.out.println("Ingrese el valor de la base");
        double base = sc.nextDouble();
        System.out.println(TriangulosServicie.area(lado, base));
        System.out.println(TriangulosServicie.perimetro(lado, base));

    }
}
