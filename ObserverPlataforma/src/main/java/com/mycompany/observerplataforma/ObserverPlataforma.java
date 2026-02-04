/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.observerplataforma;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ObserverPlataforma {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Curso plataforma = new Curso();
        int opcion;

        do {
            System.out.println("----- Plataforma Educativa -----");
            System.out.println("1. Suscribir estudiante");
            System.out.println("2. Quitar estudiante");
            System.out.println("3. Publicar anuncio");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del estudiante: ");
                    String nombre = sc.nextLine();
                    plataforma.suscribir(new Estudiante(nombre));
                    break;
                case 2:
                    System.out.print("Nombre del estudiante a quitar: ");
                    String nombreQuitar = sc.nextLine();
                    plataforma.desuscribir(new Estudiante(nombreQuitar));
                    break;
                case 3:
                    System.out.print("Ingrese el anuncio: ");
                    String anuncio = sc.nextLine();
                    plataforma.publicarAviso(anuncio);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 4);
    }
}
