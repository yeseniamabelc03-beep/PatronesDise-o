/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factory;

import java.util.Scanner;

/**
 *
 * @author labesp
 */
public class Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int op=0;
        do {
            System.out.println("********Fabrica de juguetes*********"); 
            System.out.println("1. Peluche");
            System.out.println("2. Carrito");
            System.out.println("3. Barbie");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            
            Juguete juguete = JugueteFactory.crearJuguete(op);
            if (juguete != null) {
                juguete.crear();
            }else{
                
            }
            
        } while (op != 4);
        sc.close();
    }
    
}
