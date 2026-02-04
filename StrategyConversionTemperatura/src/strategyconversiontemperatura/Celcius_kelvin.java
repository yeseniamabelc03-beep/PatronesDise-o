/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategyconversiontemperatura;

/**
 *
 * @author USER
 */
public class Celcius_kelvin implements Conversion{
    @Override
    public double convertir(double valor) {
         return valor + 273.15;
    }
}
