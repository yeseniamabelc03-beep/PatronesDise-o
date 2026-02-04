/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletoninventario;

/**
 *
 * @author User
 */
public class ModuloSalida {
    public void retirar(int cantidad){
        Inventario inventario = Inventario.getInstancia();
        inventario.retirarProducto(cantidad);
    }
}
