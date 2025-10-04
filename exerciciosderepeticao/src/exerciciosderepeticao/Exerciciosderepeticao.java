/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosderepeticao;

import java.util.Scanner;

/**
 *
 * @author vinicius.cobucci
 */
public class Exerciciosderepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    static void calcularValores(){
            
             String nome = "";
             double arrecadacao1 = 0.0d;
             double arrecadacao2 = 0.0d;
             double valorCompra = 0.0d;
             int i = 0
                   
             
       Scanner scanner = new Scanner(System.in);   
     //entrada dados      
        System.out.print("Informe o primeiro nome :");
         nome = scanner.nextString();
         
        System.out.print("Informe o segundo nome :");
         nome = scanner.nextString(); 
        
         System.out.print("Informe o primeiro nome :");
         nome = scanner.nextString();
       
     
         desconto20 if valorCompra >= 250;
         desconto10 if valorCompra <250;
         
         System.out.print("A" +);
    
    
}
  //public class ClienteCompras {

    public static void main(String[] args) {
        // 1. Declarar arrays
        double[][] compras = new double[10][10]; // 10 clientes, 10 compras cada

        // 2. Preencher os valores das compras
        preencherCompras(compras);

        // 3. Gerar relatório com descontos
        gerarRelatorio(compras);
    }

    // Método para preencher compras com valores aleatórios entre 100 e 1000
    public static void preencherCompras(double[][] compras) {
        for (int i = 0; i < compras.length; i++) {
            for (int j = 0; j < compras[i].length; j++) {
                compras[i][j] = 100 + Math.random() * 900;
            }
        }
    }

    // Método para aplicar desconto percentual
    public static double aplicarDesconto(double valor, double percentual) {
        return valor - (valor * percentual / 100);
    }

    // Método para gerar o relatório redigido
    public static void gerarRelatorio(double[][] compras) {
        System.out.println("===== RELATÓRIO DE COMPRAS DOS CLIENTES =====\n");

        for (int cliente = 0; cliente < compras.length; cliente++) {
            System.out.println("Cliente " + (cliente + 1) + ":");

            for (int compra = 0; compra < compras[cliente].length; compra++) {
                double valorOriginal = compras[cliente][compra];
                double comDesconto10 = aplicarDesconto(valorOriginal, 10);
                double comDesconto20 = aplicarDesconto(valorOriginal, 20);

                // Saída redigida
                System.out.printf("  Compra %02d: Valor original R$ %.2f | Com 10%% de desconto: R$ %.2f | Com 20%% de desconto: R$ %.2f%n",
                        compra + 1, valorOriginal, comDesconto10, comDesconto20);
            }

            System.out.println(); // Linha em branco entre os clientes
        }

        System.out.println("==============================================");
    }
}

