/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton2;

/**
 *
 * @author labesp
 */
public class ModuloFacturacion {
    public void facturar(double monto) {
        CajaRegistradora caja = CajaRegistradora.getInstancia();
        caja.registrarFactura(monto);
    }
}
