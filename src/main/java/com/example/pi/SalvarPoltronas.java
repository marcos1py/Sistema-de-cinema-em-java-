package com.example.pi;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class SalvarPoltronas {

    public static void salvarPoltronas(String[] poltronas) {
        try {
            FileWriter writer = new FileWriter("poltronas.txt");

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");

            for (int i = 0; i < poltronas.length; i++) {
                stringBuilder.append(poltronas[i]);

                if (i < poltronas.length - 1) {
                    stringBuilder.append(",");
                }
            }

            stringBuilder.append("]");

            writer.write(stringBuilder.toString());
            writer.close();

            System.out.println("As poltronas foram salvas com sucesso no arquivo 'poltronas.txt'.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar as poltronas: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filePath = "dados.txt";
        String line = lerArquivo(filePath);

        if (line != null) {
            String[] poltronasCompradas = line.split(",");
            SalvarPoltronas.salvarPoltronas(poltronasCompradas);
        } else {
            System.out.println("Erro ao ler o arquivo.");
        }
    }

    public static String lerArquivo(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            return line;
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
            return null;
        }
    }
}
