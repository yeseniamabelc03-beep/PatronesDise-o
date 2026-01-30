/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Factory2;

import java.util.Scanner;

/**
 *
 * @author labesp
 */
public class Factory2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int op=0;
        double monto;
        do {
            System.out.println("___________Fabrica de Pagos_________"); 
            System.out.println("1. Pago Efectivo");
            System.out.println("2. Pago Transferencia");
            System.out.println("3. Pago Tarjeta");
            System.out.println("4. Pago App Banco Pichincha");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            
            Pagos pago = PagosFactory.crearPago(op);
            if (pago != null) {
            System.out.println("Ingrese el monto de pago: ");
            monto = sc.nextDouble();
                pago.procesarPago(monto);
            }
            
        } while (op != 4);
        sc.close();
    }
    
}
