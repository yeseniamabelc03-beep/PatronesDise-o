/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategyconversiontemperatura;

import java.util.Scanner;

/**
 *
 * @author labesp
 */
public class StrategyConversionTemperatura {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ConvesorTemperatura conversor = new ConvesorTemperatura();
        int op;
        double temperatura;

        do {
            System.out.println("\n=== CONVERSOR DE TEMPERATURA ===");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Celsius a Kelvin");
            System.out.println("3. Fahrenheit a Celsius");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            op = sc.nextInt();

            if (op >= 1 && op <= 3) {
                System.out.print("Ingrese la temperatura: ");
                temperatura = sc.nextDouble();

                switch (op) {
                    case 1:
                        conversor.setConvertir(new Celcius_Fahrenheit());
                        break;
                    case 2:
                        conversor.setConvertir(new Celcius_kelvin());
                        break;
                    case 3:
                        conversor.setConvertir(new Fahrenheit_Celsius());
                        break;
                    case 4: break;
                    default:
                        System.out.println("Opcion invalida");
                }

                double resultado = conversor.calcularConversion(temperatura);
                System.out.println("Resultado: " + resultado);
            }

        } while (op != 4);

        sc.close();
    }
    
}
