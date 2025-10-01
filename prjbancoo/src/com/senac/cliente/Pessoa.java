/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.cliente;

/**
 *
 * @author vinicius.cobucci
 */
public class Pessoa {
    
    private String nome;
    private String cpf;
    private String endereco;
    public Pessoa() {
        this.nome = "Caetana";
        this.cpf = "10987765400";
        this.endereco = "rua ati 20";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereço(String endereco) {
        this.endereco = endereco;
    }
    
     
}
