/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

/**
 *
 * @author Lenovot490
 */
public class Archivo implements ComponenteArchivo{
    private String nombre;
    private int tamanio;

    public Archivo(String nombre, int tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
    }
    
    @Override
    public void mostrar() {
        System.out.println("Archivo: "+nombre+"\nTamanio: "+tamanio+"kb");
    }

    @Override
    public int getTamanio() {
        return tamanio;
    }
    
}
