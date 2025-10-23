package br.senac.classes.concretas;

import br.senac.classes.abstratas.Navio;

/**
 * Navio especializado em transporte de passageiros.
 */
public class NavioPassageiros extends Navio {

    private int limitePassageiros;
    private int totalPassageirosEmbarcados;

    public NavioPassageiros() {
        super(); // chama o construtor padrão de Navio
        this.limitePassageiros = 0;
        this.totalPassageirosEmbarcados = 0;
    }

    public NavioPassageiros(int limitePassageiros) {
        super("Navio Genérico", 10000.0, 100.0); // valores padrão de exemplo
        this.limitePassageiros = Math.max(0, limitePassageiros);
        this.totalPassageirosEmbarcados = 0;
    }

    public NavioPassageiros(String nome, double peso, double comprimento, int limitePassageiros) {
        super(nome, peso, comprimento); // evita acessar diretamente campos herdados
        this.limitePassageiros = Math.max(0, limitePassageiros);
        this.totalPassageirosEmbarcados = 0;
    }

    /**
     * Tenta embarcar a quantidade informada.
     * @param quantidade número de passageiros a embarcar (deve ser > 0)
     * @return true se o embarque foi bem sucedido, false caso contrário
     */
    public boolean embarcarPassageiros(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para embarque.");
            return false;
        }
        if (totalPassageirosEmbarcados + quantidade <= limitePassageiros) {
            totalPassageirosEmbarcados += quantidade;
            System.out.println(quantidade + " passageiros embarcaram.");
            return true;
        } else {
            System.out.println("Não há espaço suficiente para embarcar " + quantidade + " passageiros.");
            return false;
        }
    }

    /**
     * Tenta desembarcar a quantidade informada.
     * @param quantidade número de passageiros a desembarcar (deve ser > 0)
     * @return true se o desembarque foi bem sucedido, false caso contrário
     */
    public boolean desembarcarPassageiros(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para desembarque.");
            return false;
        }
        if (quantidade <= totalPassageirosEmbarcados) {
            totalPassageirosEmbarcados -= quantidade;
            System.out.println(quantidade + " passageiros desembarcaram.");
            return true;
        } else {
            System.out.println("Quantidade inválida para desembarque.");
            return false;
        }
    }

    public int getPassageirosEmbarcados() {
        return totalPassageirosEmbarcados;
    }

    public int getLimitePassageiros() {
        return limitePassageiros;
    }

    /**
     * Ajusta o limite de passageiros. Não permite reduzir abaixo do já embarcado.
     * @param limitePassageiros novo limite (>= totalPassageirosEmbarcados e >= 0)
     */
    public void setLimitePassageiros(int limitePassageiros) {
        if (limitePassageiros < 0) {
            throw new IllegalArgumentException("Limite inválido: não pode ser negativo.");
        }
        if (limitePassageiros < totalPassageirosEmbarcados) {
            throw new IllegalArgumentException("Limite não pode ser menor que o número de passageiros já embarcados.");
        }
        this.limitePassageiros = limitePassageiros;
    }

    @Override
    public String toString() {
        // assume que Navio implementa toString(); caso contrário ajuste para obter nome/peso/comprimento.
        return super.toString() + String.format(" [limite=%d, embarcados=%d]", limitePassageiros, totalPassageirosEmbarcados);
    }

    /**
     * Apresenta (imprime) a quantidade atual de passageiros embarcados.
     */
    public void apresentarQuantidadePassageirosEmbarcados() {
        System.out.println("Passageiros embarcados: " + totalPassageirosEmbarcados);
    }

    /**
     * Desembarca todos os passageiros atualmente embarcados.
     * @return o número de passageiros que foram desembarcados
     */
    public int desembarcarTodosOsPassageiros() {
        int desembarcados = totalPassageirosEmbarcados;
        if (desembarcados > 0) {
            totalPassageirosEmbarcados = 0;
            System.out.println(desembarcados + " passageiros desembarcaram.");
        } else {
            System.out.println("Não há passageiros para desembarcar.");
        }
        return desembarcados;
    }
}