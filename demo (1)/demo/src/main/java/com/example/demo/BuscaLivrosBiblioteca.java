package com.example.demo;

import java.sql.*;

public class BuscaLivrosBiblioteca {

    private static final String URL_BD = "jdbc:postgresql://localhost:5432/bibliotecadb";
    private static final String USUARIO = "Usuario";
    private static final String SENHA = "Senha";

    public static void main(String[] args) {
        String nomeLivro = "Nome do Livro"; // Modifique conforme necessário
        buscarLivrosPorNome(nomeLivro);
    }

    public static void buscarLivrosPorNome(String nome) {
        String sql = "SELECT b.nome AS livro, l.nome AS lingua, p.nome AS editora, c.nome AS pais " +
                "FROM livros b " +
                "JOIN linguas l ON b.lingua_id = l.id " +
                "JOIN editoras p ON b.editora_id = p.id " +
                "JOIN paises c ON p.pais_id = c.id " +
                "WHERE b.nome ILIKE ?";

        try (Connection conn = DriverManager.getConnection(URL_BD, USUARIO, SENHA);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, "%" + nome + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println("Livro: " + rs.getString("livro") +
                        ", Língua: " + rs.getString("lingua") +
                        ", Editora: " + rs.getString("editora") +
                        ", País: " + rs.getString("pais"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}