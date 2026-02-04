/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategy;

import java.util.Scanner;

/**
 *
 * @author labesp
 */
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Compra compra = new Compra();
        
        int op =0;
        double monto;
        
        do {
            System.out.println("-_-_-_-_-_Menu_-_-_-_-_-");
            System.out.println("1. Pago Tarjeta");
            System.out.println("2. Pago PayPal");
            System.out.println("3. Pago Transferencia");
            System.out.println("4. Salir");
            System.out.println("Escoga una opcion: ");
            op = sc.nextInt();
            
            switch(op){
                case 1: System.out.println("Ingrese el monto a pagar ");
                        monto = sc.nextDouble();
                        compra.setMetodo(new PagoTarjeta());
                        compra.realizarPago(monto); break;
                case 2: System.out.println("Ingrese el monto a pagar ");
                        monto = sc.nextDouble();
                        compra.setMetodo(new PagoPayPal());
                        compra.realizarPago(monto); break;
                case 3: System.out.println("Ingrese el monto a pagar ");
                        monto = sc.nextDouble();
                        compra.setMetodo(new PagoTransferencia());
                        compra.realizarPago(monto); break;
                case 4: break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (op !=4);
    }
    
}
