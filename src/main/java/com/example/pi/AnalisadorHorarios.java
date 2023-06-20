package com.example.pi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AnalisadorHorarios {
    public static void main(String[] args) {
        Map<String, Integer> contagemHorarios = lerArquivoHorarios();
        String horarioMaisComprado = obterHorarioMaisComprado(contagemHorarios);
        String horarioMenosComprido = obterHorarioMenosComprado(contagemHorarios);

        System.out.println("O horário mais comprado foi: " + horarioMaisComprado);
        System.out.println("O horário menos vendido foi: " + horarioMenosComprido);
    }

    public static Map<String, Integer> lerArquivoHorarios() {
        String nomeArquivo = "horarios.txt";
        Map<String, Integer> contagemHorarios = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String horario = linha.trim(); // Lê o horário diretamente e remove espaços em branco
                contagemHorarios.put(horario, contagemHorarios.getOrDefault(horario, 0) + 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return contagemHorarios;
    }

    public static String obterHorarioMaisComprado(Map<String, Integer> contagemHorarios) {
        String horarioMaisComprado = null;
        int maiorContagem = 0;

        for (Map.Entry<String, Integer> entry : contagemHorarios.entrySet()) {
            String horario = entry.getKey();
            int contagem = entry.getValue();
            if (contagem > maiorContagem) {
                maiorContagem = contagem;
                horarioMaisComprado = horario;
            }
        }

        return horarioMaisComprado;
    }

    public static String obterHorarioMenosComprado(Map<String, Integer> contagemHorarios) {
        String horarioMenosComprido = null;
        int menorContagem = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : contagemHorarios.entrySet()) {
            String horario = entry.getKey();
            int contagem = entry.getValue();
            if (contagem < menorContagem) {
                menorContagem = contagem;
                horarioMenosComprido = horario;
            }
        }

        return horarioMenosComprido;
    }
}
