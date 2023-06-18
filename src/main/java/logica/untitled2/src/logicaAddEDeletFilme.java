package logica.untitled2.src;

public class logicaAddEDeletFilme {
    public static void main(String[] args) {
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
