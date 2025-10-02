/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package exercicios.java.entrada;

import java.util.Scanner;

/**
 *
 * @author vinicius.cobucci
 */
public class ExerciciosJavaEntrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
     
        float numero1 ;
        float numero2 ;
        float numero3 ;
        float numero4 ;
        
      //entrada
              
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a primeira Nota: ");
        numero1 = scanner.nextFloat();
        System.out.println("Informe a segunda Nota: ");
         numero2 = scanner.nextFloat();
         System.out.println("Informe a terceira Nota: ");
          numero3 = scanner.nextFloat();
          System.out.println("Informe a quarta Nota: ");
           numero4 = scanner.nextFloat();
        
      //processamento
      
      float somaPonderada = (numero1 *1) + (numero2 *2) + (numero3 *3) + (numero4 *4);
      float somaPeso = (1+2+3+4);
      float mediaPonderada = somaPonderada / somaPeso;
             
            System.out.println("a media ponderada é" + mediaPonderada );
    }
}
