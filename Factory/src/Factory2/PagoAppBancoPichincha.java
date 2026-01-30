/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2;

/**
 *
 * @author USER
 */
public class PagoAppBancoPichincha implements Pagos {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago realizado mediante App Banco Pichincha");
        System.out.println("Monto pagado: $ " + monto);
    }
}
