/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoarrecamentoloja;

/**
 *
 * @author vinicius.cobucci
 */
public class Projetoarrecamentoloja {


    public static void main(String[] args) {
        // 1. Declarar array de compras: 10 clientes, 10 compras cada
        double[][] compras = new double[10][1];

        // 2. Nomes dos clientes
        String[] nomesClientes = {
            "Ana Souza", "Bruno Lima", "Carlos Silva", "Daniela Rocha", "Eduardo Alves",
            "Fernanda Costa", "Gabriel Mendes", "Helena Torres", "Igor Fernandes", "Juliana Castro"
        };

        // 3. Preencher as compras com valores aleatórios entre 100 e 1000
        preencherCompras(compras);

        // 4. Gerar o relatório com descontos
        gerarRelatorio(compras, nomesClientes);
    }

    // Método para preencher a matriz de compras com valores aleatórios
    public static void preencherCompras(double[][] compras) {
        for (int i = 0; i < compras.length; i++) {
            for (int j = 0; j < compras[i].length; j++) {
                compras[i][j] = 10 + Math.random() * 900; // valores entre 100 e 1000
            }
        }
    }

    // Método para aplicar desconto em um valor
    public static double aplicarDesconto(double valor, double percentual) {
        return valor - (valor * percentual / 100);
    }

    // Método para gerar o relatório formatado
    public static void gerarRelatorio(double[][] compras, String[] nomesClientes) {
        System.out.println("===== RELATÓRIO DE COMPRAS DOS CLIENTES =====\n");

        for (int cliente = 0; cliente < compras.length; cliente++) {
            System.out.println("Cliente: " + nomesClientes[cliente]);

            for (int compra = 0; compra < compras[cliente].length; compra++) {
                double valorOriginal = compras[cliente][compra];

                // Lógica de desconto baseada no valor
                double percentualDesconto;
                if (valorOriginal >= 250) {
                    percentualDesconto = 20.0;
                } else {
                    percentualDesconto = 15.0;
                }

                double valorComDesconto = aplicarDesconto(valorOriginal, percentualDesconto);

                // Saída formatada
                System.out.printf("  Compra %02d: Valor original R$ %.2f | Desconto %.0f%%: R$ %.2f%n",
                        compra + 1, valorOriginal, percentualDesconto, valorComDesconto);
            }

            System.out.println(); // Linha em branco entre os clientes
        }

        System.out.println("==============================================");
    }
}