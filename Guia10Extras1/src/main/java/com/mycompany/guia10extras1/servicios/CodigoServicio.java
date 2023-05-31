/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia10extras1.servicios;

import com.mycompany.guia10extras1.entidades.Codigo;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Usuario
 */
public class CodigoServicio {

    Map<Integer, String> codigos = new HashMap<>();
    Scanner leer = new Scanner(System.in);
    Scanner sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public void llenarCodigosUsuario() {
        Codigo cod = new Codigo();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la cuidad");
            cod.setNombre(sc.nextLine());
            System.out.println("Ingrese el codigo postal de la cuidad");
            cod.setCodigo(leer.nextInt());
            codigos.put(cod.getCodigo(), cod.getNombre());
        }
//        for (Map.Entry<Integer, String> entry : codigos.entrySet()) {
//            Integer key = entry.getKey();
//            String val = entry.getValue();
//            System.out.println("La llave es: "  + key + " value: " + val);  
//        }
    }

    public void llenarCodigos() {
        codigos.put(5000, "Cordoba");
        codigos.put(1824, "Lanus");
        codigos.put(5400, "San Juan");
        codigos.put(1885, "Hudson");
        codigos.put(1884, "Bela");
        codigos.put(1182, "Almagro");
        codigos.put(8400, "Bariloche");
        codigos.put(1834, "Lomas");
        codigos.put(1832, "Lomas II");
        codigos.put(2000, "Rosario");

//        for (Map.Entry<Integer, String> entry : codigos.entrySet()) {
//            Object key = entry.getKey();
//            Object val = entry.getValue();
//            System.out.println("Codigo: " + key + "  Cuidad: " + val);
//            
//        }
    }

    public void mostrar() {
        TreeMap <Integer,String> asd = new TreeMap(codigos);
        System.out.println("---------------------------------------------");
        System.out.println("Lista de cuidades ingresadas por el usuario: ");
        System.out.println("---------------------------------------------");
        for (Map.Entry<Integer, String> entry : asd.entrySet()) {
            Integer key = entry.getKey();
            String val = entry.getValue();
            System.out.println("Codigo: " + key + " Ciudad: " + val);
        }
        System.out.println("------------------------");
        System.out.println("Listado de cuidades: ");
        System.out.println("----------------------");
        for (Map.Entry<Integer, String> entry : asd.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println("Codigo: " + key + "  Cuidad: " + val);

        }
    }

    public void cuidadAsociada() {
        System.out.println("Ingrese un codigo");
        int num = sc.nextInt();
        if(codigos.containsKey(num)){
            System.out.println("El codigo pertenece a la cuidad de: "+ codigos.get(num));
        }else {
            System.out.println("El codigo no pertenece a ninguna cuidad, posiblemente sea cerca de la casa de Agustina");
        }
        
    }
    
    public void agregarCuidad(){
        
        System.out.println("Ingrese el codigo postal");
        int num = leer.nextInt(); 
        System.out.println("Ingrese la ciudad");
        String nombre = sc.nextLine();
        codigos.put(num, nombre);
    }
    
    public void eliminar(){
        int contador = 0 ;
        
        for (int i = 0; contador < 3; i++) {
            System.out.println("Ingrese el codigo de la cuidada a eliminar");
        int num = sc.nextInt();
            if(codigos.containsKey(num)){
                codigos.remove(num);
                contador ++;
                System.out.println("La cuidad ha sido eliminada");
            }else {
                System.out.println("El codigo no pertenece a ninguna cuidad!");
                
            }
        }
        
   
    
    } 
    
   
   
}




