/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.compsitepedido;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class CompsitePedido {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        Producto hamburguesa = new Producto("Hamburguesa", 4.00);
        Producto papas = new Producto("Papas Fritas", 2.00);
        Producto refresco = new Producto("Refresco", 1.50);
        Combo pedido = new Combo("Pedido del Cliente");

        do {
            System.out.println("\n===== MENU COMBOS =====");
            System.out.println("1. Agregar Hamburguesa");
            System.out.println("2. Agregar Papas");
            System.out.println("3. Agregar Refresco");
            System.out.println("4. Crear Combo");
            System.out.println("5. Ver Pedido");
            System.out.println("6. Ver Total");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");
            op = sc.nextInt();

            switch (op) {
                case 1: pedido.agregar(hamburguesa);
                        System.out.println("Hamburguesa agregada"); break;
                case 2: pedido.agregar(papas);
                        System.out.println("Papas agregadas");  break;
                case 3: pedido.agregar(refresco);
                        System.out.println("Refresco agregado"); break;
                case 4:
                    Combo comboClasico = new Combo("Combo Clasico");
                    comboClasico.agregar(hamburguesa);
                    comboClasico.agregar(papas);
                    comboClasico.agregar(refresco);
                    pedido.agregar(comboClasico);
                    System.out.println("Combo Clasico agregado"); break;
                case 5: pedido.mostrar(); break;
                case 6: System.out.println("Total a pagar: $" + pedido.getPrecio()); break;
                case 7: System.out.println("Gracias por su compra"); break;
                default: System.out.println("Opcion invalida");
            }
        } while (op != 7);
        sc.close();
    }
}
