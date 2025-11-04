package com.example.demo;

import com.example.demo.livro.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long> {

    @Query("SELECT b FROM Livro b JOIN FETCH b.lingua JOIN FETCH b.editora p JOIN FETCH p.pais JOIN FETCH b.autor a WHERE LOWER(b.nome) LIKE LOWER(CONCAT('%', :nome, '%')) AND LOWER(a.nome) LIKE LOWER(CONCAT('%', :autor, '%'))")
    List<Livro> buscarLivrosPorNomeEAutor(String nome, String autor);

    @Query("SELECT b FROM Livro b JOIN FETCH b.lingua JOIN FETCH b.editora p JOIN FETCH p.pais WHERE LOWER(b.nome) LIKE LOWER(CONCAT('%', :nome, '%'))")
    List<Livro> buscarLivrosPorNome(String nome);

    @Query("SELECT b FROM Livro b JOIN FETCH b.lingua JOIN FETCH b.editora p JOIN FETCH p.pais JOIN FETCH b.autor a WHERE LOWER(a.nome) LIKE LOWER(CONCAT('%', :autor, '%'))")
    List<Livro> buscarLivrosPorAutor(String autor);

}