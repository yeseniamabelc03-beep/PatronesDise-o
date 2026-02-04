/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorador;

import java.util.Scanner;

/**
 *
 * @author labesp
 */
public class Decorador {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner (System.in);
        int op = 0;
     
        
        do {
            System.out.println("\n******MENU CAFETERIA ESPE*****");
            System.out.println("1. Cafe Simple");
            System.out.println("2. Agregar Azucar");
            System.out.println("3. Agregar leche");
            System.out.println("4. Agregar Crema de Canela");     
            System.out.println("5. Salir");
            System.out.println("Ingrese la opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            Bebida cafe = new CafeSimple();
            
            switch(op){
                case 1:cafe = new CafeSimple(); 
                    System.out.println(cafe.getDescripcion() + " = $" + cafe.getCosto());break;
                case 2:cafe = new Azucar(cafe); 
                    System.out.println(cafe.getDescripcion() + " = $" + cafe.getCosto());break;
                case 3:cafe = new Leche(cafe); 
                    System.out.println(cafe.getDescripcion() + " = $" + cafe.getCosto());break;
                case 4:cafe = new Crema(cafe); 
                    System.out.println(cafe.getDescripcion() + " = $" + cafe.getCosto());break;
                case 5: System.out.println("Saliendo......"); break;
                default:
                    System.out.println("Opcion invalida");
            }

        } while (op !=5);
        sc.close();
    }
    
}
