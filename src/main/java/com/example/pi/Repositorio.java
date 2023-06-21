package com.example.pi;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Repositorio {
    private static final String NOME_ARQUIVO = "dados.txt";
    private static final String ARQUIVO_POLTRONAS = "poltronas.txt";

    public static void salvarValores(int contadorPoltronas, List<String> cadeirasVerdes) {
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

    public static void lerValores(int id) {

        try (BufferedReader reader = new BufferedReader(new FileReader(NOME_ARQUIVO))) {
            String linha;
            List<String> poltronas = new ArrayList<>();

            while ((linha = reader.readLine()) != null) {
                String[] valores = linha.split(",");
                for (String valor : valores) {
                    poltronas.add(valor.trim());
                }
            }
            System.out.println("----------"+poltronas);
            salvarPoltronas(id, poltronas);
            System.out.println("Valores lidos com sucesso e salvos no arquivo 'poltronas_" + id + ".txt'.");
        } catch (IOException e) {
            System.out.println("Erro ao ler os valores: " + e.getMessage());
        }
    }
    private static void salvarPoltronas(int id, List<String> poltronas) {
        String nomeArquivo = "poltoronas_" + id + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo, true))) {
            List<String> poltronasExistentes = new ArrayList<>();

            // Lê as poltronas existentes no arquivo
            try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
                String linha;
                while ((linha = reader.readLine()) != null) {
                    linha = linha.replace("[", "").replace("]", ""); // Remove os colchetes
                    String[] poltronasArray = linha.split(",");
                    for (String poltrona : poltronasArray) {
                        poltronasExistentes.add(poltrona.trim());
                    }
                }
            }

            // Adiciona as novas poltronas à lista existente
            poltronasExistentes.addAll(poltronas);

            // Remove as duplicatas
            List<String> poltronasUnicas = new ArrayList<>(new LinkedHashSet<>(poltronasExistentes));

            // Escreve as poltronas no arquivo
            try (BufferedWriter writer2 = new BufferedWriter(new FileWriter(nomeArquivo))) {
                writer2.write("[");
                for (int i = 0; i < poltronasUnicas.size(); i++) {
                    writer2.write(poltronasUnicas.get(i));
                    if (i < poltronasUnicas.size() - 1) {
                        writer2.write(",");
                    }
                }
                writer2.write("]");
            }

            System.out.println("Poltronas adicionadas com sucesso no arquivo 'poltronas_" + id + ".txt'.");
        } catch (IOException e) {
            System.out.println("Erro ao adicionar as poltronas: " + e.getMessage());
        }
    }

    public static void resetarValores() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(NOME_ARQUIVO))) {
            writer.write("");
        } catch (IOException e) {
            System.out.println("Erro ao resetar os valores: " + e.getMessage());
        }
    }

    public static void exemplo(int id) {
        String nomeArquivo = "poltoronas_" + id + ".txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo 'poltoronas_" + id + ".txt': " + e.getMessage());
        }
    }
}
