/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observer;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Observer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Canal canal = new Canal();
        int opcion;
        String titulo ="";
        do {
            System.out.println("\n*******CANAL DE YOUTUBE*********");
            System.out.println("1. Suscribite");
            System.out.println("2. Subir video");
            System.out.println("3. Ver Noficaciones");
            System.out.println("4. salir");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch(opcion){
                case 1: System.out.print("Ingrese su nombre: ");
                        String nombre = sc.nextLine();
                        canal.suscribir(new Usuario(nombre)); break;
                case 2: System.out.print("Ingrese el nombre del video: ");
                        titulo = sc.nextLine();
                        canal.subir(titulo); break;
                case 3: canal.notificar(titulo); break;
                case 4: break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion !=4);
        sc.close();
    }
}
