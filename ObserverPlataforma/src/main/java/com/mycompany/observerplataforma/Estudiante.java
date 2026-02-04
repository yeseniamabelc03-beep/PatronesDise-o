/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observerplataforma;

/**
 *
 * @author USER
 */
public class Estudiante implements Observador {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Estudiante " + nombre + " recibio el aviso: " + mensaje);
    }
}
