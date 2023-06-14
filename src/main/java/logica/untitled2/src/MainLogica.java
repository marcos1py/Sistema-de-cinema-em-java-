package logica.untitled2.src;

import java.util.Scanner;

public class MainLogica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] filmes = new String[10];

        System.out.print("Insira um filme: ");
        String nomeFilme = input.next();
        adicionarFilme(filmes, nomeFilme);

        System.out.print("Nome do filme a deletar: ");
        String nomeDelet = input.next();
        deletarFilme(filmes, nomeDelet);

        System.out.println("");
        System.out.println("Lista de filmes:");
        exibirFilmes(filmes);
    }

    public static void adicionarFilme(String[] filmes, String nomeFilme) {
        for (int index = 0; index < filmes.length; index++) {
            if (filmes[index] == null) {
                filmes[index] = nomeFilme;
                System.out.println("Filme adicionado com sucesso!");
                return;
            }
        }
        System.out.println("A lista de filmes está cheia. Não é possível adicionar mais filmes.");
    }

    public static void deletarFilme(String[] filmes, String nomeDelet) {
        boolean deletado = false;
        for (int index = 0; index < filmes.length; index++) {
            if (filmes[index] != null && filmes[index].equals(nomeDelet)) {
                filmes[index] = null;
                System.out.println("Filme removido com sucesso!");
                deletado = true;
            }
        }
        if (!deletado) {
            System.out.println("O filme não foi encontrado na lista.");
        }
    }

    public static void exibirFilmes(String[] filmes) {
        int conta = 1;
        for (int index = 0; index < filmes.length; index++) {
            if (filmes[index] != null) {
                System.out.println(conta+ " - "+filmes[index]);
                conta++;
            }
        }
    }
}
