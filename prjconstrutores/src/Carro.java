/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author vinicius.cobucci
 */
public class Carro {
    
 private String nome;
 private int anoFabricacao;
 private String modelo;

    public Carro(String nome) {
        this.nome = nome;
    }
    public Carro(String nome, int anoFabricação){
        this(nome);    
        this.anofabricacao = anoFabricacao;
    }
    public Carro(String modelo){
        this.modelo = modelo;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    

   
 
    
}
