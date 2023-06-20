package com.example.pi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ResetarArquivos {
    public static void resetar_tudo() {
        for (int i = 0; i <= 14; i++) {
            String nomeArquivo = "poltoronas_" + i + ".txt";
            resetarArquivo(nomeArquivo);
        }
        resetarArquivo1("horarios.txt");
        resetarArquivo1("filmes_mais_comprados.txt");
    }

    private static void resetarArquivo(String nomeArquivo) {
        File arquivo = new File(nomeArquivo);
        try {
            FileWriter escritor = new FileWriter(arquivo);
            escritor.write("[]"); // Escreve "[]" no arquivo
            escritor.close();
            System.out.println("Conteúdo do arquivo " + nomeArquivo + " foi resetado.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao resetar o arquivo " + nomeArquivo + ": " + e.getMessage());
        }
    }
    private static void resetarArquivo1(String nomeArquivo) {
        File arquivo = new File(nomeArquivo);
        try {
            FileWriter escritor = new FileWriter(arquivo);
            escritor.write("");
            escritor.close();

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao resetar o arquivo " + nomeArquivo + ": " + e.getMessage());
        }
    }
}
