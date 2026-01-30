/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapter;

import java.util.Scanner;

/**
 *
 * @author labesp
 */
public class Adapter {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        int op;
        double monto;

        do {
            System.out.println("------- Sistema de Pago -------");
            System.out.println("1. Euro");
            System.out.println("2. Peso Colombiano");
            System.out.println("3. Real Brasileno");
            System.out.println("4. Salir");
            System.out.print("Elija una opcion: ");
            op = sc.nextInt();
            if (op == 4) {
                System.out.println("Saliendo del sistema...");
                break;
            }
            System.out.print("Ingrese el monto a pagar: ");
            monto = sc.nextDouble();
            Pago pago = new PagoAdapter(op);
            pago.pagar(monto);
        } while (op != 4);
    }
    
}
