package projeto.navio.classes;

import projeto.navio.Navio;
import projeto.navio.Navio;

public class NavioPassageiros extends Navio {
    private int limitePassageiros;
    private int embarcados;

    public NavioPassageiros() {
        super("Navio Genérico", 5000, 120);
        this.limitePassageiros = 100;
        this.embarcados = 0;
    }

    public NavioPassageiros(String nome, double peso, double comprimento, int limitePassageiros) {
        this.nome = nome;
        this.peso = peso;
        this.comprimento = comprimento;
        this.limitePassageiros = limitePassageiros;
        this.embarcados = 0;
    }

    public void pescar() {
        System.out.println(nome + " não é um navio de pesca!");
    }

    public void atracar() {
        System.out.println(nome + " está atracando no porto de passageiros.");
    }

    public void navegar() {
        System.out.println(nome + " está navegando rumo ao próximo destino turístico!");
    }

    public void parar() {
        System.out.println(nome + " parou em alto-mar.");
    }

    public void embarcar(int quantidade) {
        if (embarcados + quantidade <= limitePassageiros) {
            embarcados += quantidade;
            System.out.println(quantidade + " passageiros embarcaram no " + nome + ".");
        } else {
            System.out.println("Não há espaço para " + quantidade + " passageiros! Limite atingido.");
        }
    }

    public void quantidadeEmbarcada() {
        System.out.println("Passageiros embarcados: " + embarcados + "/" + limitePassageiros);
    }

    public void desembarcar(int quantidade) {
        if (quantidade <= embarcados) {
            embarcados -= quantidade;
            System.out.println(quantidade + " passageiros desembarcaram do " + nome + ".");
        } else {
            System.out.println("Não há tantos passageiros embarcados assim!");
        }
    }

    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Limite de Passageiros: " + limitePassageiros);
        System.out.println("Embarcados: " + embarcados);
    }
}