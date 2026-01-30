/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author labesp
 */
public class Impresora {
    private int totalimpresiones; //solo en esta clase se puede trabajar con ek atributo
    
     //1. definir una variable estatica 
    private static Impresora instancia;
    
     //2. crear un constructor privado
    private Impresora() {
        System.out.println("Impresora Encendida/Lista para imprimir");
    }
    
    //3. Agregar un metodo publico estatico
    public static Impresora getInstancia(){ //get instancia se encarga de la instancia solo esa
        if (instancia == null) {
            instancia = new Impresora(); // solo impresora puede instanciarse
        }
        return instancia;
    }
    
    //metodo imprimir
    public void imprimir(String documento){
        totalimpresiones++;
        System.out.println("Documento impreso: " + documento);
    }
    
    public int getTotalImpresiones(){
        return totalimpresiones;
    }
}
