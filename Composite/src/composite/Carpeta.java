/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovot490
 */
public class Carpeta implements ComponenteArchivo{
    private String nombre;
    private List<ComponenteArchivo> archivos = new ArrayList<>();

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }
    public void agregar(ComponenteArchivo archivo){
        archivos.add(archivo);
    }

    @Override
    public void mostrar() {
        System.out.println("Archivo: " + nombre);
                for(ComponenteArchivo e:archivos){
                e.mostrar();
                }
    }

    @Override
    public int getTamanio() {
        int total = 0;
        for (ComponenteArchivo e: archivos) {
            total += e.getTamanio();
        }
        return total;
    }
}
