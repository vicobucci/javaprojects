/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pjacampamento;

/**
 *
 * @author vinicius.cobucci
 */
    public class acampamento {

    // Atributos
    private String nome;
    private char equipe;
    private int idade;

    public acampamento(String nome, char equipe, int idade) {
        this.nome = nome;
        this.equipe = equipe;
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getEquipe() {
        return equipe;
    }

    public void setEquipe(char equipe) {
        this.equipe = equipe;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
   
   

    // Construtor
    

    // Método para exibir os dados
    @Override
    public String toString() {
        return "Nome: " + nome + "\nEquipe: " + equipe + "\nIdade: " + idade;
    }

}