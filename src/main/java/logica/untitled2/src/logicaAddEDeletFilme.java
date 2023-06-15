package logica.untitled2.src;

import java.time.LocalDate;
import java.util.Scanner;

public class logicaAddEDeletFilme {
    public static void main(String[] args) {
        Filme[] filmes = new Filme[10];
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o nome do filme: ");
        String nomeFilme = input.nextLine();

        System.out.print("Insira a categoria do filme: ");
        String categoriaDoFilme = input.nextLine();

        System.out.print("Insira a duração do filme: ");
        String duracaoDoFilme = input.nextLine();

        System.out.print("Insira a sinopse do filme: ");
        String sinopseDoFilme = input.nextLine();

        System.out.print("Insira o valor da entrada inteira do filme: ");
        String valorInteira = input.nextLine();

        System.out.print("Insira o valor da entrada meia do filme: ");
        String valorMeia = input.nextLine();

        System.out.print("Insira a data de exibição do filme: ");
        LocalDate dataExibicao = LocalDate.parse("2023-04-10");


        System.out.print("Insira a sala de exibição do filme: ");
        String salaExibicao = input.nextLine();

        System.out.print("Insira o horário de exibição do filme: ");
        String horarioExibicao = input.nextLine();

        System.out.print("Insira a idade mínima do filme: ");
        String idadeMinima = input.nextLine();

        Filme filme = new Filme(nomeFilme, categoriaDoFilme, duracaoDoFilme, sinopseDoFilme, valorInteira, valorMeia, dataExibicao, salaExibicao, horarioExibicao, idadeMinima);
        adicionarFilme(filmes, filme);

        System.out.print("Nome do filme a deletar: ");
        String nomeDelet = input.nextLine();
        deletarFilme(filmes, nomeDelet);

        System.out.println("");
        System.out.println("Lista de filmes:");
        exibirFilmes(filmes);
    }

    public static void adicionarFilme(Filme[] filmes, Filme filme) {
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

    public static void deletarFilme(Filme[] filmes, String nomeDelet) {
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

    public static void exibirFilmes(Filme[] filmes) {
        int conta = 1;
        for (int index = 0; index < filmes.length; index++) {
            if (filmes[index] != null) {
                System.out.println(conta + " - " + filmes[index]);
                conta++;
            }
        }
    }
}
