package com.example.pi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Repositorio {
    private static final String NOME_ARQUIVO = "dados.txt";

    public static void salvarValores(int contadorPoltronas,List<String> cadeirasVerdes) {
        resetarValores();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(NOME_ARQUIVO, true))) {
            StringBuilder linha = new StringBuilder();

            for (int i = 0; i < cadeirasVerdes.size(); i++) {
                linha.append(cadeirasVerdes.get(i));

                if (i < cadeirasVerdes.size() - 1) {
                    linha.append(",");
                }
            }

            writer.write(linha.toString());
            writer.newLine();

            System.out.println("Valores salvos com sucesso no arquivo 'dados.txt'.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os valores: " + e.getMessage());
        }
    }


    public static void lerValores() {
        try (BufferedReader reader = new BufferedReader(new FileReader(NOME_ARQUIVO))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] valores = linha.split(":");
                if (valores.length > 1) {
                    System.out.println(valores[1]);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler os valores: " + e.getMessage());
        }
    }


    public static void resetarValores() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(NOME_ARQUIVO))) {
            writer.write("");
        } catch (IOException e) {
            System.out.println("Erro ao resetar os valores: " + e.getMessage());
        }
    }
}
