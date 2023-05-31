/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia10ejercicio5.entidades;

import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Pais {
    private String nombre;

    public Pais() {
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pais pais = (Pais)obj;
        return Objects.equals(nombre, pais.nombre);
        
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
    
    
    
    
}
