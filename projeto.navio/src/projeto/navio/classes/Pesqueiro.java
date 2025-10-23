package projeto.navio.classes;

import projeto.navio.Navio;
import projeto.navio.Navio;

public class Pesqueiro extends Navio {
    private int capacidade;
    private TipoPesca tipoPesca;
    private int totalPescadoEmbarcado;

    public Pesqueiro() {
        super("Pesqueiro Genérico", 300, 40);
        this.capacidade = 10;
        this.tipoPesca = TipoPesca.MISTO;
        this.totalPescadoEmbarcado = 0;
    }

    public Pesqueiro(TipoPesca tipoPesca, int capacidade) {
        super("Pesqueiro Simples", 400, 45);
        this.tipoPesca = tipoPesca;
        this.capacidade = capacidade;
        this.totalPescadoEmbarcado = 0;
    }

    public Pesqueiro(String nome, double peso, double comprimento, int capacidade, TipoPesca tipoPesca) {
        super(nome, peso, comprimento);
        this.capacidade = capacidade;
        this.tipoPesca = tipoPesca;
        this.totalPescadoEmbarcado = 0;
    }

    public void pescar(int quantidade) {
        if (totalPescadoEmbarcado + quantidade <= capacidade) {
            totalPescadoEmbarcado += quantidade;
            System.out.println(nome + " pescou " + quantidade + " toneladas de " + tipoPesca + ".");
        } else {
            System.out.println("Capacidade máxima atingida! (" + capacidade + " toneladas)");
        }
    }

    public void descarregar() {
        System.out.println(nome + " descarregou " + totalPescadoEmbarcado + " toneladas de peixe.");
        totalPescadoEmbarcado = 0;
    }

    @Override
    public void pescar() {
        System.out.println(nome + " está pescando " + tipoPesca + ".");
    }

    @Override
    public void atracar() {
        System.out.println(nome + " está atracando no porto de pesca.");
    }

    @Override
    public void navegar() {
        System.out.println(nome + " está navegando em direção às áreas de pesca de " + tipoPesca + ".");
    }

    @Override
    public void parar() {
        System.out.println(nome + " interrompeu suas operações de pesca.");
    }

    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Capacidade: " + capacidade + " toneladas");
        System.out.println("Tipo de Pesca: " + tipoPesca);
        System.out.println("Total Pescado Embarcado: " + totalPescadoEmbarcado + " toneladas");
    }
}
