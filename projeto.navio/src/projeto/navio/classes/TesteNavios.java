package projeto.navio.classes;

import projeto.navio.classes.Pesqueiro;
import projeto.navio.classes.NavioPassageiros;

public class TesteNavios {
    public static void main(String[] args) {
        Pesqueiro pesqueiro = new Pesqueiro("Rei dos Mares", 800, 55, 30, TipoPesca.ATUM);
        NavioPassageiros cruzeiro = new NavioPassageiros("Sol do Caribe", 9000, 150, 500);

        System.out.println("=== NAVIO PESQUEIRO ===");
        pesqueiro.exibirInfo();
        pesqueiro.navegar();
        pesqueiro.pescar(25);
        pesqueiro.parar();
        pesqueiro.atracar();
        pesqueiro.descarregar();

        System.out.println("\n=== NAVIO DE PASSAGEIROS ===");
        cruzeiro.exibirInfo();
        cruzeiro.navegar();
        cruzeiro.embarcar(200);
        cruzeiro.quantidadeEmbarcada();
        cruzeiro.embarcar(400);
        cruzeiro.desembarcar(150);
        cruzeiro.quantidadeEmbarcada();
        cruzeiro.parar();
        cruzeiro.atracar();
    }
}
