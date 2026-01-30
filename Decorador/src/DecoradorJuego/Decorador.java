/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DecoradorJuego;

import java.util.Scanner;

/**
 *
 * @author labesp
 */
public class Decorador {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int op = 0;
        Personaje personaje = new PersonajeBase();
        do {
            System.out.println("\n******JUEGO CRASH******");
            System.out.println("1. Personaje Base");
            System.out.println("2. Agregar Espada");
            System.out.println("3. Agregar Escudo");
            System.out.println("4. Agregar Arco");     
            System.out.println("5. Salir");
            System.out.println("Ingrese la opcion: ");
            op = sc.nextInt();
            sc.nextLine();
           
            switch(op){
                case 1: 
                    System.out.println(personaje.getDescricion());
                    System.out.println("Ataque: " + personaje.getAtaque());
                    System.out.println("Defensa: " + personaje.getDefensa()); break;
                case 2:personaje = new Espada(personaje);
                    System.out.println(personaje.getDescricion());
                    System.out.println("Espada Agregada!!");
                    System.out.println("Ataque: " + personaje.getAtaque());
                    System.out.println("Defensa: " + personaje.getDefensa()); break;
                case 3:personaje = new Escudo(personaje);
                    System.out.println(personaje.getDescricion());
                    System.out.println("Escudo Agregado!!");
                    System.out.println("Ataque: " + personaje.getAtaque());
                    System.out.println("Defensa: " + personaje.getDefensa()); break;
                case 4:personaje = new Arco(personaje);
                    System.out.println(personaje.getDescricion());
                    System.out.println("Arco Agregado!!");
                    System.out.println("Ataque: " + personaje.getAtaque());
                    System.out.println("Defensa: " + personaje.getDefensa()); break;
                case 5: System.out.println("Saliendo......"); break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (op !=5);
          sc.close();
    }
}
