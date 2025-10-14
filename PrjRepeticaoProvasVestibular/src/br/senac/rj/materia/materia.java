/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.rj.materia;

/**
 *
 * @author vinicius.cobucci
 */
public class materia {
    private String nome;
    private float nota;
    
    public materia() {
        
    }

    public materia(String nome, Float nota) {
        
        this.nome = nome;
        this.nota = nota;
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    
    
    
}
