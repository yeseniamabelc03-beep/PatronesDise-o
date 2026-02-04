/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2;

/**
 *
 * @author labesp
 */
public class PagoEfectivo implements Pagos{
    @Override
    public void procesarPago(double monto) { 
        double totalEfectivo=0;
        System.out.println("Se pago en efectivo la cantidad de: $ " + monto);
        totalEfectivo = totalEfectivo + monto;
        System.out.println("Total pagado en efectivo: $ " + totalEfectivo); 
    }
  
}
