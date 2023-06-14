package logica.untitled2.src;

import java.util.Scanner;

public class MainLogica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomeFilme = "";
        String nomeDelet = "";
        String filmes[] = new String[10];

        System.out.print("Insira um filme: ");
        nomeFilme = input.next();
        adicionarFilme(filmes, nomeFilme);


        System.out.print("Nome do filme a deletar: ");
        nomeDelet = input.next();
        deletarFilme(filmes, nomeDelet);
        System.out.println(filmes[0]);

    }

    public static void adicionarFilme(String[] filmes, String nomeFilme) {
        for (int index = 0; index < filmes.length; index++) {
            if (filmes[index] == null) {
                filmes[index] = nomeFilme;
                break;
            }
        }
    }

    public static void deletarFilme(String[] filmes, String nomeDelet) {
        int conta = 0;
        for (int index = 0; index < filmes.length; index++) {

            if (filmes[index] == null) {
                index += 1;
            } else {
                if (filmes[index].equals(nomeDelet)) {
                    filmes[index] = null;
                }
            }

            if (index == filmes.length) {
                break;
            }

        }
    }
}
