package com.example.pi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AnalisadorHorarios {
    public static void main(String[] args) {
        Map<String, Integer> contagemHorarios = new HashMap<>();
        int totalLinhas = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("horarios.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                totalLinhas++;

                String horario = linha.trim(); // Lê o horário diretamente e remove espaços em branco
                contagemHorarios.put(horario, contagemHorarios.getOrDefault(horario, 0) + 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String horarioMaisComprado = null;
        int maiorContagem = 0;
        String horarioMenosComprido = null;
        int menorContagem = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : contagemHorarios.entrySet()) {
            String horario = entry.getKey();
            int contagem = entry.getValue();
            if (contagem > maiorContagem) {
                maiorContagem = contagem;
                horarioMaisComprado = horario;
            }
            if (contagem < menorContagem) {
                menorContagem = contagem;
                horarioMenosComprido = horario;
            }
        }

        System.out.println("Total de linhas: " + totalLinhas);
        System.out.println("O horário mais comprado foi: " + horarioMaisComprado);
        System.out.println("O horário menos vendido foi: " + horarioMenosComprido);
    }
}