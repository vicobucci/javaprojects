package br.senac.classes.concretas;

import br.senac.classes.abstratas.Navio;
import br.senac.classes.tipoPesca.TipoPesca;

public class NavioPesqueiro extends Navio {

    private int capacidade;
    private TipoPesca tipoPesca;
    private int totalPescadoEmbarcado;

    public NavioPesqueiro() {
        super();
        this.capacidade = 0;
        this.tipoPesca = TipoPesca.ARTESANAL;
        this.totalPescadoEmbarcado = 0;
    }

    public NavioPesqueiro(int capacidade, TipoPesca tipoPesca) {
        super();
        this.capacidade = Math.max(0, capacidade);
        this.tipoPesca = tipoPesca != null ? tipoPesca : TipoPesca.ARTESANAL;
        this.totalPescadoEmbarcado = 0;
    }

    public NavioPesqueiro(String nome, double peso, double comprimento, int capacidade, TipoPesca tipoPesca) {
        super(nome, peso, comprimento);
        this.capacidade = Math.max(0, capacidade);
        this.tipoPesca = tipoPesca != null ? tipoPesca : TipoPesca.ARTESANAL;
        this.totalPescadoEmbarcado = 0;
    }

    /**
     * Override com mesma assinatura da superclasse (void) para evitar conflito.
     * Pescagem padrão: tenta pescar 100 kg.
     */
    public void pescar() {
        pescar(100); // chama o overload que faz a lógica e atualiza totalPescadoEmbarcado
    }

    /**
     * Tenta pescar a quantidade informada (kg). Não ultrapassa a capacidade.
     * @param quantidade kg a pescar (deve ser > 0)
     * @return quantidade efetivamente pescada (kg)
     */
    public int pescar(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para pesca.");
            return 0;
        }
        int espacoDisponivel = capacidade - totalPescadoEmbarcado;
        if (espacoDisponivel <= 0) {
            System.out.println("Capacidade máxima atingida!");
            return 0;
        }
        int efetivo = Math.min(quantidade, espacoDisponivel);
        totalPescadoEmbarcado += efetivo;
        System.out.println("Pescando... total pescado agora: " + totalPescadoEmbarcado + " kg.");
        if (efetivo < quantidade) {
            System.out.println("Atingiu capacidade máxima; apenas " + efetivo + " kg foram embarcados.");
        }
        return efetivo;
    }

    /**
     * Imprime a quantidade atual de pescado embarcado.
     */
    public void apresentarQuantidadeDePescado() {
        System.out.println("Pescado embarcado: " + totalPescadoEmbarcado + " kg.");
    }

    /**
     * Desembarca todo o pescado atualmente embarcado.
     * @return quantidade (kg) que foi desembarcada
     */
    public int desembarcarTodoPescado() {
        int desembarcado = totalPescadoEmbarcado;
        if (desembarcado > 0) {
            totalPescadoEmbarcado = 0;
            System.out.println(desembarcado + " kg de pescado desembarcados.");
        } else {
            System.out.println("Não há pescado para desembarcar.");
        }
        return desembarcado;
    }

    /* Getters / Setters e utilitários */

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        if (capacidade < 0) {
            throw new IllegalArgumentException("Capacidade inválida: não pode ser negativa.");
        }
        if (capacidade < totalPescadoEmbarcado) {
            throw new IllegalArgumentException("Capacidade não pode ser menor que a quantidade já embarcada.");
        }
        this.capacidade = capacidade;
    }

    public TipoPesca getTipoPesca() {
        return tipoPesca;
    }

    public void setTipoPesca(TipoPesca tipoPesca) {
        this.tipoPesca = tipoPesca != null ? tipoPesca : TipoPesca.ARTESANAL;
    }

    public int getTotalPescadoEmbarcado() {
        return totalPescadoEmbarcado;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" [capacidade=%d kg, tipo=%s, embarcado=%d kg]",
                capacidade, tipoPesca, totalPescadoEmbarcado);
    }
}