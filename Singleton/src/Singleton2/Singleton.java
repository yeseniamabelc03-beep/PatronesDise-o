/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Singleton2;

import java.util.Scanner;

/**
 *
 * @author labesp
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ModuloVentas ventas = new ModuloVentas();
        ModuloFacturacion facturas = new ModuloFacturacion();
        int op;
        double monto;

        do {
            System.out.println("\n--- SISTEMA CAJA REGISTRADORA ---");
            System.out.println("1. Registrar Venta");
            System.out.println("2. Registrar Factura");
            System.out.println("3. Ver Total de Ventas");
            System.out.println("4. Ver Total de Facturas");
            System.out.println("5. Total de ventas y facturas");
            System.out.println("6. Salir");
            System.out.print("Ingrese opcion: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Ingrese monto de la venta: ");
                    monto = sc.nextDouble();
                    ventas.vender(monto);
                    break;
                case 2:
                    System.out.print("Ingrese monto de la factura: ");
                    monto = sc.nextDouble();
                    facturas.facturar(monto);
                    break;
                case 3:
                    CajaRegistradora cajaVentas = CajaRegistradora.getInstancia();
                    System.out.println("Total de ventas: $" + cajaVentas.getTotalVentas());
                    break;
                case 4:
                    CajaRegistradora cajaFacturas = CajaRegistradora.getInstancia();
                    System.out.println("Total de facturas: $" + cajaFacturas.getTotalFacturas());
                    break;
                case 5:
                    System.out.println("Total de ventas y facturas: $" +
                    CajaRegistradora.getInstancia().getTotal());
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (op != 5);
        sc.close();
    }
    
}
