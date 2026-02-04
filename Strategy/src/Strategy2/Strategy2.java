/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Strategy2;

import java.util.Scanner;

/**
 *
 * @author labesp
 */
public class Strategy2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    Venta venta = new Venta();
        int op =0;
        double precio;
        System.out.println("Ingrese el monto  de la venta: ");
        precio = sc.nextDouble();
        
        do {
            System.out.println("-_-_-_-_Menu_-_-_-_-_");
            System.out.println("1. Descuento Normal");
            System.out.println("2. Descuento VIP");
            System.out.println("3. Descuento Estudiantil");
            System.out.println("4. Salir");
            System.out.println("Escoga una opcion: ");
            op = sc.nextInt();
            
            switch(op){
                case 1: 
                        venta.setDescuento(new DescuentoNormal());
                        System.out.println(precio - venta.calcularTotal(precio));break;
                case 2: 
                        venta.setDescuento(new DescuentoVIP());
                        System.out.println(precio - venta.calcularTotal(precio)); break;
                case 3: 
                        venta.setDescuento(new DescuentoEstudiantil());
                        System.out.println(precio - venta.calcularTotal(precio)); break;
                case 4: break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (op !=4);
    }
    
}
