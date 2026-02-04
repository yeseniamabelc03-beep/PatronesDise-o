/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy2;

/**
 *
 * @author labesp
 */
public class DescuentoVIP implements Descuento{

    @Override
    public double aplicar(double precio) {
        return precio * 0.2;
    }
}
