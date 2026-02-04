/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singletoninventario;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SingletonInventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ModuloIngreso ingreso = new ModuloIngreso();
        ModuloSalida salida = new ModuloSalida();
        int op, cant, stock;
        do {
            System.out.println("\n_______SISTEMA INVENTARIO_________");
            System.out.println("1. Ingresar stock");
            System.out.println("2. Agregar producto");
            System.out.println("3. Retirar producto");
            System.out.println("4. Ver stock");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Ingrese el stock disponible: ");
                    stock = sc.nextInt();
                    sc.nextLine();
                    ingreso.agregar(stock);
                    break;
                case 2:
                    System.out.print("Ingrese el stock a agregar: ");
                    cant = sc.nextInt();
                    ingreso.agregar(cant);
                    
                    break;
                case 3:
                    System.out.print("Ingrese stock a retirar: ");
                    cant = sc.nextInt();
                    salida.retirar(cant);
                    break;
                case 4:
                    Inventario inv = Inventario.getInstancia();
                    System.out.println("Stock: " + inv.getStock());
                    break;
                case 5: break;
                default:
                    System.out.println("opcion no valida");
            }
        } while (op != 5);
        sc.close();
    }
    
}
