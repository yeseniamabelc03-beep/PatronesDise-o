/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2;

/**
 *
 * @author labesp
 */ //credito debito de una 
public class PagoTarjeta implements Pagos{
    @Override
    public void procesarPago(double monto) {
        System.out.println("Se paga con tarjeta debito/credito la cantidad de: $ " + monto);
    }
}
