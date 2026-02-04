/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategyconversiontemperatura;

/**
 *
 * @author USER
 */
public class ConvesorTemperatura {
    private Conversion convertir;

    public ConvesorTemperatura() {
    }

    public ConvesorTemperatura(Conversion convertir) {
        this.convertir = convertir;
    }

    public void setConvertir(Conversion convertir) {
        this.convertir = convertir;
    }

    public double calcularConversion(double valor) {
        return convertir.convertir(valor);
    }
}
