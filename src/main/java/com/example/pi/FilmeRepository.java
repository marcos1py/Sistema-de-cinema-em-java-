package com.example.pi;

import logica.untitled2.src.Filme;

import java.time.LocalDate;

public class FilmeRepository {
    private static Filme[] filmes = new Filme[14];

    public static boolean adicionarFilme(Filme filme) {
        if (!salaEstaOcupada(filme.getSala(), filme.getHorario(), filme.getData())) {
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
            System.out.println("Erro: Sala já ocupada no horário e data especificados.");
            return false;
        }
        return false;
    }

    private static boolean salaEstaOcupada(String sala, String horario, LocalDate data) {
        for (int index = 0; index < filmes.length; index++) {
            if (filmes[index] != null && filmes[index].getSala().equalsIgnoreCase(sala)
                    && filmes[index].getHorario().equalsIgnoreCase(horario)
                    && filmes[index].getData().isEqual(data)) {
                return true; // Sala ocupada no horário e data especificados
            }
        }
        return false; // Sala disponível no horário e data especificados
    }

    public static boolean salaEstaDisponivel(String sala, String horario) {
        LocalDate data = LocalDate.now();
        System.out.println(!salaEstaOcupada(sala, horario, data));
        return !salaEstaOcupada(sala, horario, data);
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
        return null; // Se nenhum filme for achado retorna null ou uma mensagem de erro adequada.
    }
    public static String getCaminhoDaImagem(int index) {
        if (index >= 0 && index < filmes.length) {
            Filme filme = filmes[index];
            if (filme != null) {
                return filme.getCaminho_da_img();
            }
        }
        return null; // Retorna null se o índice estiver fora dos limites ou se o filme não existir.
    }
    public static LocalDate getDataDoFilme(int index) {
        if (index >= 0 && index < filmes.length) {
            Filme filme = filmes[index];
            if (filme != null) {
                return filme.getData();
            }
        }
        return null; // Retorna null se o índice estiver fora dos limites ou se o filme não existir.
    }
    public static String getHorarioDoFilme(int index) {
        if (index >= 0 && index < filmes.length) {
            Filme filme = filmes[index];
            if (filme != null) {
                return filme.getHorario();
            }
        }
        return null; // Retorna null se o índice estiver fora dos limites ou se o filme não existir.
    }
    public static String pegarValorInteira(int index){
        if (index >= 0 && index < filmes.length){
            Filme filme = filmes[index];
            if (filme != null){
                return (filme.getValorInteira());
            }
        }
        return null;
    }
    public static String pegarValorMeia(int index){
        if (index >= 0 && index < filmes.length){
            Filme filme = filmes[index];
            if (filme != null){
                return (filme.getValorMeia());
            }
        }
        return null;
    }
    public static String pegarSala(int index){

        if (index >= 0 && index < filmes.length){

            Filme filme = filmes[index];
            if (filme != null){

                return (filme.getSala());
            }
        }
        return null;
    }
    public static String pegarDuracao (int index){
        if (index >= 0 && index < filmes.length){
            Filme filme = filmes[index];
            if(filme != null){
                return (filme.getDuracao());
            }
        }
        return null;
    }
    public static String pegarGenero(int index){
        if(index >= 0 && index < filmes.length){
            Filme filme = filmes[index];
            if(filme != null){
                return (filme.getCategoria());
            }
        }
        return null;
    }
    public static String pegarSinopse(int index){
        if (index >= 0 && index < filmes.length){
            Filme filme = filmes[index];
            if (filme != null) {
                return (filme.getSinopse());
            }
        }
        return null;
    }


}