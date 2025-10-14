/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.rj.candidato;

import br.senac.rj.materia.materia;

/**
 *
 * @author vinicius.cobucci
 */
public class Candidato {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public materia[] getMateriais() {
        return materiais;
    }

    public void setMateriais(materia[] materiais) {
        this.materiais = materiais;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }
    
    private String nome;
    private materia[] materiais;
    private Situacao situacao;
    
    
    public Candidato() {
    }
    
   
}
