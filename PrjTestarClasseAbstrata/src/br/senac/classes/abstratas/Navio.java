package br.senac.classes.abstratas;

public abstract class Navio {
    protected String nome;
    protected double peso;
    protected double comprimento;

    public Navio() {
        this("Desconhecido", 0.0, 0.0);
    }

    public Navio(String nome, double peso, double comprimento) {
        this.nome = nome;
        this.peso = peso;
        this.comprimento = comprimento;
    }

    public void pescar() {
        System.out.println(nome + " está pescando...");
    }

    public void atracar() {
        System.out.println(nome + " está atracando no porto...");
    }

    public void navegar() {
        System.out.println(nome + " está navegando...");
    }

    public void parar() {
        System.out.println(nome + " parou.");
    }

    public void embarcar(int quantidade) {
        System.out.println("Embarcando " + quantidade + " unidades...");
    }

    public void quantidadeEmbarcada() {
        System.out.println("Quantidade embarcada não especificada.");
    }

    public void desembarcar(int quantidade) {
        System.out.println("Desembarcando " + quantidade + " unidades...");
    }

    // Métodos getters opcionais
    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public double getComprimento() {
        return comprimento;
    }
}