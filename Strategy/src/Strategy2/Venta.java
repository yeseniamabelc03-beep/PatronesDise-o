/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy2;

/**
 *
 * @author labesp
 */
public class Venta {
   private Descuento descuento;

    public Venta() {
    }

    public Venta(Descuento descuento) {
        this.descuento = descuento;
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }
   
   public double calcularTotal(double precio){
       return descuento.aplicar(precio);
   }
}
