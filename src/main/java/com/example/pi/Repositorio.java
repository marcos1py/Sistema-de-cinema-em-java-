package com.example.pi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Repositorio {
    private static final String NOME_ARQUIVO = "dados.txt";

    public static void salvarValores(int contadorPoltronas, List<String> cadeirasVerdes) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(NOME_ARQUIVO, true))) {
            StringBuilder linha = new StringBuilder();
            linha.append(contadorPoltronas).append(":");
            for (String cadeira : cadeirasVerdes) {
                linha.append(cadeira).append(",");
            }
            writer.write(linha.toString());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao salvar os valores: " + e.getMessage());
        }
    }

    public static void lerValores() {
        try (BufferedReader reader = new BufferedReader(new FileReader(NOME_ARQUIVO))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] valores = linha.split(":");
                int contadorPoltronas = Integer.parseInt(valores[0]);
                String[] cadeirasVerdes = valores[1].split(",");
                System.out.println("Contagem de poltronas: " + contadorPoltronas);
                System.out.println("Cadeiras verdes: ");
                for (String cadeira : cadeirasVerdes) {
                    System.out.println(cadeira);
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