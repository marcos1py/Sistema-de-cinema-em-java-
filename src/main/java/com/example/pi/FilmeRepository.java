package com.example.pi;

import logica.untitled2.src.Filme;

public class FilmeRepository {
    private static Filme[] filmes = new Filme[14];

    public static void adicionarFilme(Filme filme) {
        for (int index = 0; index < filmes.length; index++) {
            if (filmes[index] == null) {
                filmes[index] = filme;
                System.out.println(filmes[index]);
                System.out.println("Filme adicionado com sucesso!");
                return;
            }
        }
        System.out.println("A lista de filmes está cheia. Não é possível adicionar mais filmes.");
    }

    public static void deletarFilme(String nomeDelet) {
        boolean deletado = false;
        for (int index = 0; index < filmes.length; index++) {
            if (filmes[index] != null && filmes[index].getNome().equalsIgnoreCase(nomeDelet)) {
                filmes[index] = null;
                System.out.println("Filme removido com sucesso!");
                deletado = true;
            }
        }
        if (!deletado) {
            System.out.println("O filme não foi encontrado na lista.");
        }
    }

    public static void exibirFilmes() {
        int conta = 1;
        for (int index = 0; index < filmes.length; index++) {
            if (filmes[index] != null) {
                System.out.println(conta + " - " + filmes[index]);
                conta++;
            }
        }
    }
    public static String nome_do_filme(Integer numero) {
        for (int index = 0; index < filmes.length; index++) {
            if (filmes[index] != null) {
                String nomeFilme = filmes[numero].getNome();
                return nomeFilme;
            }
        }
        return null; // Se nenhum filme for encontrado, retorne null ou uma mensagem de erro adequada.
    }

}