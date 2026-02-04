/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author labesp
 */
public class Compra {
   private MetodoPago metodo;

    public Compra() {
    }

    public Compra(MetodoPago metodo) {
        this.metodo = metodo;
    }

    public void setMetodo(MetodoPago metodo) {
        this.metodo = metodo;
    }
   
    public void realizarPago(double monto){
        metodo.pagar(monto);
    }
}
