/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compsitepedido;

/**
 *
 * @author USER
 */
public class Producto implements Item {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public void mostrar() {
        System.out.println("- " + nombre + " : $" + precio);
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
