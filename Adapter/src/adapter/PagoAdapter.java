/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

import java.util.Scanner;

/**
 *
 * @author labesp
 */
public class PagoAdapter implements Pago{ 
    private int opcion;
    private PagoEuro euro = new PagoEuro();
    private PagarPesoColombiano peso = new PagarPesoColombiano();
    private PagoReal real = new PagoReal();

    public PagoAdapter(int opcion) {
        this.opcion = opcion;
    }

    @Override
    public void pagar(double monto) {
        switch (opcion) {
            case 1:
                euro.PagarEuros(monto * 0.84);
                break;
            case 2:
                peso.PagarPesoColombiano(monto * 4000);
                break;
            case 3:
                real.PagarReales(monto * 5.3);
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }
}
