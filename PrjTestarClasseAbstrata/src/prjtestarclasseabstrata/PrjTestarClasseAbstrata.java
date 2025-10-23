package prjtestarclasseabstrata;


import br.senac.classes.concretas.NavioPassageiros;
import br.senac.classes.concretas.NavioPesqueiro;
import br.senac.classes.tipoPesca.TipoPesca;



public class PrjTestarClasseAbstrata {
    public static void main(String[] args) {
        System.out.println("=== Testando Navio de Passageiros ===");
        NavioPassageiros navio1 = new NavioPassageiros("Poseidon", 20000.0, 150.0, 300);
        navio1.navegar();
        navio1.embarcar(120);
        navio1.desembarcar(50);
        navio1.parar();
        
        System.out.println("\n=== Testando Navio Pesqueiro ===");
        NavioPesqueiro pesqueiro = new NavioPesqueiro("Mar Azul", 15000.0, 90.0, 2000, TipoPesca.INDUSTRIAL);
        pesqueiro.navegar();
        pesqueiro.pescar();
        pesqueiro.pescar();
        pesqueiro.parar();
    }
}
