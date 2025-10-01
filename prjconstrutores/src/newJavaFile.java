/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author vinicius.cobucci
 */
public class newJavaFile {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // Criando os objetos Carro usando o construtor
        Carro carro1 = new Carro("Volkswagen", 2020, "Gol");
        Carro carro2 = new Carro("Chevrolet", 2019, "Onix");
        Carro carro3 = new Carro("Toyota", 2022, "Corolla");
        Carro carro4 = new Carro("Honda", 2021, "Civic");
        Carro carro5 = new Carro("Ford", 2018, "Ka");

        // Imprimindo os dados de cada carro
        System.out.println("Carro 1:");
        carro1.exibirDados();

        System.out.println("\nCarro 2:");
        carro2.exibirDados();

        System.out.println("\nCarro 3:");
        carro3.exibirDados();

        System.out.println("\nCarro 4:");
        carro4.exibirDados();

        System.out.println("\nCarro 5:");
        carro5.exibirDados();
    }
}

// Classe Carro com construtor e método para exibir dados
class Carro {
    private String nome;
    private int anoFabricacao;
    private String modelo;

    // Construtor
    public Carro(String nome, int anoFabricacao, String modelo) {
        this.nome = nome;
        this.anoFabricacao = anoFabricacao;
        this.modelo = modelo;
    }

    // Método para exibir os dados do carro
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Modelo: " + modelo);
    }
}
