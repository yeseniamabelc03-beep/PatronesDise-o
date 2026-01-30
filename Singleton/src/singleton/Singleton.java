/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton;

/**
 *
 * @author labesp
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Impresora usuario1 = Impresora.getInstancia();
        Impresora usuario2 = Impresora.getInstancia();
        Impresora usuario3 = Impresora.getInstancia();
        usuario1.imprimir("deber POO");
        usuario1.imprimir("Ejercicios fisica");
        usuario2.imprimir("Ejercicios fisica");
        usuario3.imprimir("Reporte de los ceros");
        
        System.out.println("Total de impresiones: " + usuario1.getTotalImpresiones());//se manda a una sola impresora una sola instancia con eso se garantiza el singleton
        
        System.out.println(usuario1 == usuario2); //comprobar instancia TRUE
        
    }
    
}
