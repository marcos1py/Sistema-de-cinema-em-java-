package com.example.pi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ResetarArquivos {

    public static void main(String[] args) {
        for (int i = 0; i <= 14; i++) {
            String nomeArquivo = "poltoronas_" + i + ".txt";
            resetarArquivo(nomeArquivo);
        }
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
}
