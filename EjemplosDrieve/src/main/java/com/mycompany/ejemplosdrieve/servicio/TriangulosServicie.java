/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosdrieve.servicio;

import com.mycompany.ejemplosdrieve.entidades.Triangulos;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TriangulosServicie {

    static Scanner sc = new Scanner(System.in);

    public static double perimetro(double lado, double base) {

        double perimetro = 2 * lado * base;
        return perimetro;
    }

    public static double area(double lado, double base) {
        double area = (base * Math.sqrt((lado * lado) - ((base * base) / 4))) / 2;
        return area;
    }

}
