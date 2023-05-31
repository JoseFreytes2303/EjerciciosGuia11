/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia10extras1;

import com.mycompany.guia10extras1.servicios.CodigoServicio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia10Extras1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner (System.in);
        CodigoServicio cod = new CodigoServicio();
        int opc= 0;
        
       
        do {
            System.out.println("\t*-------------- MENU --------------*");
            System.out.println("1. Ingresar los codigos");
            System.out.println("2. Codigos ya cargados");
            System.out.println("3. Listado de codigos");
            System.out.println("4. Averiguar codigo");
            System.out.println("5. Agregar un codigo nuevo");
            System.out.println("6. Elimnar");
            System.out.println("7. Salir");
            System.out.println("\t===============================================");
            System.out.println("Ingrese una opcion: ");
            opc = sc.nextInt();
           switch (opc){
               case 1:
                   cod.llenarCodigosUsuario();
                   break;
               case 2:
                   cod.llenarCodigos();
                    break;
               case 3:
                   cod.mostrar();
                    break;
               case 4:
                   cod.cuidadAsociada();
                    break;
               case 5:
                   cod.agregarCuidad();
                    break;
               case 6:
                   cod.eliminar();break;
               case 7:
                   System.err.println("Hasta luego.");
                    break;
           }
        
        } while (opc !=7);
        
        
    }
}
