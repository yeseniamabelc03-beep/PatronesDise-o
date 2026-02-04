/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton2;

/**
 *
 * @author labesp
 */
public class CajaRegistradora {
    private double totalVentas;
    private double totalFacturas;
    //1. definir una variable estatica 
    private static CajaRegistradora instancia;
     //2. crear un constructor privado
    private CajaRegistradora() {
        totalVentas = 0;
        totalFacturas = 0;
        System.out.println("Caja Registradora Lista");
    }
    //3. Agregar un metodo publico estatico
    public static CajaRegistradora getInstancia(){
        if (instancia == null) {
            instancia = new CajaRegistradora();
        }
        return instancia;
    }
    
    //metodos
    public void registrarVenta(double monto) {
        totalVentas += monto;
        System.out.println("Venta registrada correctamente");
    }

    public void registrarFactura(double monto) {
        totalFacturas += monto;
        System.out.println("Factura registrada correctamente");
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public double getTotalFacturas() {
        return totalFacturas;
    }
    
    public double getTotal() {
        return totalVentas + totalFacturas;
    }
            
}
