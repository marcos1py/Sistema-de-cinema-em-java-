package com.example.pi;

import javafx.application.Platform;
import javafx.scene.control.TextField;

public class Validador {


    private static void limiteTamanhoCampo(TextField valorDaInteiraCadastro, Integer tamanho) {
        valorDaInteiraCadastro.textProperty().addListener((observableValue, valorAntigo, novoValor) -> {
            if (novoValor == null || novoValor.length() > tamanho) {
                valorDaInteiraCadastro.setText(valorAntigo);
            }
        });
    }

    private static void posicionarCursor(TextField valorDaInteiraCadastro) {
        Platform.runLater(() -> {
            if (valorDaInteiraCadastro.getText().length() != 0) {
                valorDaInteiraCadastro.positionCaret(valorDaInteiraCadastro.getText().length());
            }
        });
    }

    public static void  mskNumero(TextField valorDaInteiraCadastro) {
        Validador.limiteTamanhoCampo(valorDaInteiraCadastro, 6);
        valorDaInteiraCadastro.lengthProperty().addListener((observable, valorAntigo, valorNovo) -> {
            String textoDigitado = valorDaInteiraCadastro.getText();
            textoDigitado = textoDigitado.replaceAll("[^0-9]", "");
            valorDaInteiraCadastro.setText(textoDigitado);
            Validador.posicionarCursor(valorDaInteiraCadastro);
        });
    }
}