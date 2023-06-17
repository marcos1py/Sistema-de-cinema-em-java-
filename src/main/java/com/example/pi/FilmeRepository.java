package com.example.pi;

import logica.untitled2.src.Filme;

import java.time.LocalDate;

public class FilmeRepository {
    private static Filme[] filmes = new Filme[14];

    public static boolean adicionarFilme(Filme filme) {
        if (!salaEstaOcupada(filme.getSala(), filme.getHorario())) {
            for (int index = 0; index < filmes.length; index++) {
                if (filmes[index] == null) {
                    filmes[index] = filme;
                    System.out.println(filmes[index]);
                    System.out.println("Filme adicionado com sucesso!");
                    return true;
                }
            }
            System.out.println("A lista de filmes está cheia. Não é possível adicionar mais filmes.");
        } else {
            System.out.println("Erro: Sala já ocupada no horário especificado.");
            return false;
        }
        return false;
    }

    private static boolean salaEstaOcupada(String sala, String horario) {
        for (int index = 0; index < filmes.length; index++) {
            if (filmes[index] != null && filmes[index].getSala().equalsIgnoreCase(sala)
                    && filmes[index].getHorario().equalsIgnoreCase(horario)) {
                return true; // Sala ocupada no horário especificado
            }
        }
        return false; // Sala disponível no horário especificado
    }

    public static boolean salaEstaDisponivel(String sala, String horario) {
        System.out.println(!salaEstaOcupada(sala, horario));
        return !salaEstaOcupada(sala, horario);
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
    public static String getCaminhoDaImagem(int index) {
        if (index >= 0 && index < filmes.length) {
            Filme filme = filmes[index];
            if (filme != null) {
                return filme.getCaminho_da_img();
            }
        }
        return null; // Retorne null se o índice estiver fora dos limites ou se o filme não existir.
    }
    public static LocalDate getDataDoFilme(int index) {
        if (index >= 0 && index < filmes.length) {
            Filme filme = filmes[index];
            if (filme != null) {
                return filme.getData();
            }
        }
        return null; // Retorne null se o índice estiver fora dos limites ou se o filme não existir.
    }

}