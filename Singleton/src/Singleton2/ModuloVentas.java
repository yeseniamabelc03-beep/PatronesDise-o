/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton2;

/**
 *
 * @author labesp
 */
public class ModuloVentas {
    public void vender(double monto) {
        CajaRegistradora caja = CajaRegistradora.getInstancia();
        caja.registrarVenta(monto);
    }
}
