/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observerplataforma;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Curso implements Persona {
    private String aviso;
    private List<Observador> estudiantes = new ArrayList<>();
    
    @Override
    public void suscribir(Observador estudiante) {
        estudiantes.add(estudiante);
    }

    @Override
    public void desuscribir(Observador estudiante) {
        estudiantes.remove(estudiante);
    }

    public void publicarAviso(String aviso) {
        this.aviso = aviso;
        System.out.println("\nSe publico un aviso en el curso");
        notificar();
    }

    @Override
    public void notificar() {
        for (Observador est : estudiantes) {
            est.actualizar(aviso);
        }
    }
}
