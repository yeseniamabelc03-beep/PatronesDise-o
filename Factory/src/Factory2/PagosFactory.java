/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2;

/**
 *
 * @author labesp
 */
public class PagosFactory {
    public static Pagos crearPago(int tipo){
        switch(tipo){
            case 1: return new PagoEfectivo(); 
            case 2: return new PagoTransferencia();
            case 3: return new PagoTarjeta();
            case 4: return new PagoAppBancoPichincha();
            case 5: System.out.println("Saliendo del sistema...");  return null;
            default:
            System.out.println("Pago no disponible");
        }
        return null;
    }
}
