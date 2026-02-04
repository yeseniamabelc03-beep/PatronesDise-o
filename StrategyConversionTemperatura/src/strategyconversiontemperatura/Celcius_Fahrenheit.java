/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategyconversiontemperatura;

/**
 *
 * @author labesp
 */
public class Celcius_Fahrenheit implements Conversion{
    @Override
    public double convertir(double valor) {
         return (valor * 9 / 5) + 32;
    }
}
