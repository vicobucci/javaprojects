/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio.celcius;

import java.util.Scanner;

/**
 *
 * @author vinicius.cobucci
 */
public class ExercicioCelcius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalcularTemperatura();
    }
    static void CalcularTemperatura(){
             double tpCelcius = 0.0d;
             double tpFahrenheit = 0.0d;
             
                   
             
       Scanner scanner = new Scanner(System.in);   
     //entrada dados      
        System.out.print("Informe a temperatura em Celsius: ");
         tpCelcius = scanner.nextDouble();
     
         tpFahrenheit = (tpCelcius * 9 + 160)/5; 
         
         System.out.print("A temperatura em Fahrenheit é" + tpFahrenheit);
    }
}
