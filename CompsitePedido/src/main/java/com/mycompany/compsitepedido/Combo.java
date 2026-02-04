/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compsitepedido;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Combo implements Item {
    private String nombre;
    private List<Item> items = new ArrayList<>();

    public Combo(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(Item item) {
        items.add(item);
    }

    @Override
    public void mostrar() {
        System.out.println("\nCombo: " + nombre);
        for (Item item : items) {
            item.mostrar();
        }
    }

    @Override
    public double getPrecio() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrecio();
        }
        return total;
    }
}
