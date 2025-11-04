package com.example.demo;

import com.example.demo.livro.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @GetMapping("/buscar")
    public List<Livro> buscarLivros(
            @RequestParam(value = "nome", required = false) String nome,
            @RequestParam(value = "autor", required = false) String autor
    ) {
        List<Livro> livros;

        if (nome != null && autor != null) {
            livros = livroRepository.buscarLivrosPorNomeEAutor(nome, autor);
        } else if (nome != null) {
            livros = livroRepository.buscarLivrosPorNome(nome);
        } else if (autor != null) {
            livros = livroRepository.buscarLivrosPorAutor(autor);
        } else {
            livros = livroRepository.findAll();
        }

        // Trata a ausência de resultados
        if (livros.isEmpty()) {
            throw new NoSuchElementException("Não foram encontrados livros com os critérios fornecidos.");
        }

        return livros;
    }
}