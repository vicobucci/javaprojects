package com.example.demo.autor;

import jakarta.persistence.*;

@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    public Autor() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {  // Nome em português
        return nome;
    }

    public void setNome(String nome) {  // Nome em português
        this.nome = nome;
    }
}