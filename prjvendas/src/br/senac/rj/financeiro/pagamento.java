package br.senac.rj.financeiro;
import java.util.Date;
/**
 *
 * @author vinicius.cobucci
 */
public class pagamento {
    
    private float saldo;
    private float valor;
    private float desconto;
    private float jurosDiarios;
    private Date dataPagamento;

    public pagamento() {
        
       //construtor
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getJurosDiarios() {
        return jurosDiarios;
    }

    public void setJurosDiarios(float jurosDiarios) {
        this.jurosDiarios = jurosDiarios;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    
   
}
