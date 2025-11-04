package com.example.demo.livro;

import com.example.demo.editora.Editora;
import com.example.demo.lingua.Lingua;
import com.example.demo.autor.Autor;
import jakarta.persistence.*;

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "lingua_id")
    private Lingua lingua;

    @ManyToOne
    @JoinColumn(name = "editora_id")
    private Editora editora;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;

    public Livro() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Lingua getLingua() {
        return lingua;
    }

    public void setLingua(Lingua lingua) {
        this.lingua = lingua;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}