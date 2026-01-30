/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletoninventario;

/**
 *
 * @author User
 */
public class Inventario {
    private int stock;
    private static Inventario instancia;

    private Inventario() {
        System.out.println("Iniciando....");
    }
    public static Inventario getInstancia(){
        if (instancia == null) {
            instancia = new Inventario();
        }
        return instancia;
    }

    public void agregarProducto(int cantidad){
        stock = stock + cantidad;
        System.out.println("Producto agregado: " + cantidad);
    }
    
    public void retirarProducto(int cantidad) {
        if (cantidad <= stock) {
            stock = stock - cantidad;
            System.out.println("Producto retirado: " + cantidad);
        } else {
            System.out.println("Stock insuficiente");
        }
    }
    public int getStock() {
        return stock;
    }
}
