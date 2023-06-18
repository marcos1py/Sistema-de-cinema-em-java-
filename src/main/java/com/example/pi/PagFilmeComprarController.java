package com.example.pi;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

import java.util.List;

public class PagFilmeComprarController {
    @FXML
    Label nomeFilmeComprarLabel;

    public void mostrarNome (String filme){
        nomeFilmeComprar.setText(filme);
    }

    private static PagFilmeComprarController instance;

    public PagFilmeComprarController() {
        instance = this;
    }

    public static PagFilmeComprarController getInstance() {
        return instance;
    }

    @FXML
    private Button A1;

    @FXML
    private Button A2;

    @FXML
    private Button A3;

    @FXML
    private Button A4;

    @FXML
    private Button A5;

    @FXML
    private Button A6;

    @FXML
    private Button A7;

    @FXML
    private Button A8;

    @FXML
    private Button B1;

    @FXML
    private Button B2;

    @FXML
    private Button B3;

    @FXML
    private Button B4;

    @FXML
    private Button B5;

    @FXML
    private Button B6;

    @FXML
    private Button B7;

    @FXML
    private Button B8;

    @FXML
    private Button C1;

    @FXML
    private Button C2;

    @FXML
    private Button C3;

    @FXML
    private Button C4;

    @FXML
    private Button C5;

    @FXML
    private Button C6;

    @FXML
    private Button C7;

    @FXML
    private Button C8;

    @FXML
    private Button D1;

    @FXML
    private Button D2;

    @FXML
    private Button D3;

    @FXML
    private Button D4;

    @FXML
    private Button D5;

    @FXML
    private Button D6;

    @FXML
    private Button D7;

    @FXML
    private Button D8;

    @FXML
    private Button E1;

    @FXML
    private Button E2;

    @FXML
    private Button E3;

    @FXML
    private Button E4;

    @FXML
    private Button E5;

    @FXML
    private Button E6;

    @FXML
    private Button E7;

    @FXML
    private Button E8;

    @FXML
    private Button F1;

    @FXML
    private Button F2;

    @FXML
    private Button F3;

    @FXML
    private Button F4;

    @FXML
    private Button F5;

    @FXML
    private Button F6;

    @FXML
    private Button F7;

    @FXML
    private Button F8;

    @FXML
    private Button G1;

    @FXML
    private Button G2;

    @FXML
    private Button G3;

    @FXML
    private Button G4;

    @FXML
    private Button G5;

    @FXML
    private Button G6;

    @FXML
    private Button G7;

    @FXML
    private Button G8;

    @FXML
    private Button horario1;

    @FXML
    private Button horario2;

    @FXML
    private Button horario3;

    @FXML
    private Label nomeFilmeComprar;
    private int contadorPoltronas = 0; // Variável para contar as poltronas selecionadas
    public static String horaEscolhida = "";

    private List<String> cadeirasVerdes = new ArrayList<>(); // Lista para armazenar os IDs das cadeiras verdes

    @FXML
    void handleButtonClick(Button button) {
        Color currentColor = (Color) button.getBackground().getFills().get(0).getFill();
        String cadeiraID = button.getId();

        if (currentColor.equals(Color.GREEN)) {
            button.setStyle("-fx-background-color: white;");
            contadorPoltronas--;
            cadeirasVerdes.remove(cadeiraID);
        } else {
            button.setStyle("-fx-background-color: green;");
            contadorPoltronas++;
            cadeirasVerdes.add(cadeiraID);
        }

        System.out.println("Contagem de poltronas: " + contadorPoltronas);
        System.out.println("Cadeiras verdes: " + cadeirasVerdes);
    }

    @FXML
    void A1(ActionEvent event) {
        handleButtonClick(A1);
    }

    // Evento de clique para o botão A2
    @FXML
    void A2(ActionEvent event) {
        handleButtonClick(A2);
    }

    // Restante dos eventos de clique para os outros botões

    // Evento de clique para o botão A3
    @FXML
    void A3(ActionEvent event) {
        handleButtonClick(A3);
    }

    // Evento de clique para o botão A4
    @FXML
    void A4(ActionEvent event) {
        handleButtonClick(A4);
    }

    // Evento de clique para o botão A5
    @FXML
    void A5(ActionEvent event) {
        handleButtonClick(A5);
    }

    // Evento de clique para o botão A6
    @FXML
    void A6(ActionEvent event) {
        handleButtonClick(A6);
    }

    // Evento de clique para o botão A7
    @FXML
    void A7(ActionEvent event) {
        handleButtonClick(A7);
    }

    // Evento de clique para o botão A8
    @FXML
    void A8(ActionEvent event) {
        handleButtonClick(A8);
    }
    @FXML
    void B1(ActionEvent event) {
        handleButtonClick(B1);
    }

    @FXML
    void B2(ActionEvent event) {
        handleButtonClick(B2);
    }

    @FXML
    void B3(ActionEvent event) {
        handleButtonClick(B3);
    }

    @FXML
    void B4(ActionEvent event) {
        handleButtonClick(B4);
    }

    @FXML
    void B5(ActionEvent event) {
        handleButtonClick(B5);
    }

    @FXML
    void B6(ActionEvent event) {
        handleButtonClick(B6);
    }

    @FXML
    void B7(ActionEvent event) {
        handleButtonClick(B7);
    }

    @FXML
    void B8(ActionEvent event) {
        handleButtonClick(B8);
    }
    @FXML
    void C1(ActionEvent event) {
        handleButtonClick(C1);
    }

    @FXML
    void C2(ActionEvent event) {
        handleButtonClick(C2);
    }

    @FXML
    void C3(ActionEvent event) {
        handleButtonClick(C3);
    }

    @FXML
    void C4(ActionEvent event) {
        handleButtonClick(C4);
    }

    @FXML
    void C5(ActionEvent event) {
        handleButtonClick(C5);
    }

    @FXML
    void C6(ActionEvent event) {
        handleButtonClick(C6);
    }

    @FXML
    void C7(ActionEvent event) {
        handleButtonClick(C7);
    }

    @FXML
    void C8(ActionEvent event) {
        handleButtonClick(C8);
    }

    @FXML
    void D1(ActionEvent event) {
        handleButtonClick(D1);
    }

    @FXML
    void D2(ActionEvent event) {
        handleButtonClick(D2);
    }

    @FXML
    void D3(ActionEvent event) {
        handleButtonClick(D3);
    }

    @FXML
    void D4(ActionEvent event) {
        handleButtonClick(D4);
    }

    @FXML
    void D5(ActionEvent event) {
        handleButtonClick(D5);
    }

    @FXML
    void D6(ActionEvent event) {
        handleButtonClick(D6);
    }

    @FXML
    void D7(ActionEvent event) {
        handleButtonClick(D7);
    }

    @FXML
    void D8(ActionEvent event) {
        handleButtonClick(D8);
    }

    @FXML
    void E1(ActionEvent event) {
        handleButtonClick(E1);
    }

    @FXML
    void E2(ActionEvent event) {
        handleButtonClick(E2);
    }

    @FXML
    void E3(ActionEvent event) {
        handleButtonClick(E3);
    }

    @FXML
    void E4(ActionEvent event) {
        handleButtonClick(E4);
    }

    @FXML
    void E5(ActionEvent event) {
        handleButtonClick(E5);
    }

    @FXML
    void E6(ActionEvent event) {
        handleButtonClick(E6);
    }

    @FXML
    void E7(ActionEvent event) {
        handleButtonClick(E7);
    }

    @FXML
    void E8(ActionEvent event) {
        handleButtonClick(E8);
    }

    @FXML
    void F1(ActionEvent event) {
        handleButtonClick(F1);
    }

    @FXML
    void F2(ActionEvent event) {
        handleButtonClick(F2);
    }

    @FXML
    void F3(ActionEvent event) {
        handleButtonClick(F3);
    }

    @FXML
    void F4(ActionEvent event) {
        handleButtonClick(F4);
    }

    @FXML
    void F5(ActionEvent event) {
        handleButtonClick(F5);
    }

    @FXML
    void F6(ActionEvent event) {
        handleButtonClick(F6);
    }

    @FXML
    void F7(ActionEvent event) {
        handleButtonClick(F7);
    }

    @FXML
    void F8(ActionEvent event) {
        handleButtonClick(F8);
    }

    @FXML
    void G1(ActionEvent event) {
        handleButtonClick(G1);
    }

    @FXML
    void G2(ActionEvent event) {
        handleButtonClick(G2);
    }

    @FXML
    void G3(ActionEvent event) {
        handleButtonClick(G3);
    }

    @FXML
    void G4(ActionEvent event) {
        handleButtonClick(G4);
    }

    @FXML
    void G5(ActionEvent event) {
        handleButtonClick(G5);
    }

    @FXML
    void G6(ActionEvent event) {
        handleButtonClick(G6);
    }

    @FXML
    void G7(ActionEvent event) {
        handleButtonClick(G7);
    }

    @FXML
    void G8(ActionEvent event) {
        handleButtonClick(G8);
    }


    @FXML
    void btprosseguircomrpra(ActionEvent event) {
        Main.mudarTela("tipoingresso");
    }

    @FXML
    void btvoltarcompra(ActionEvent event) {
        Main.mudarTela("usuariofilme");
    }


    @FXML
    void horario1(ActionEvent event) {
        horario1.setStyle("-fx-text-fill:  #1A2232; -fx-background-color:  #00FFFF");

        horario2.setStyle("-fx-border-color:  #00FFFF; -fx-background-color:  0");
        horario3.setStyle("-fx-border-color:  #00FFFF; -fx-background-color:  0");

        horaEscolhida = String.valueOf(horario1);
    }

    @FXML
    void horario2(ActionEvent event) {
        horario2.setStyle("-fx-text-fill:  #1A2232; -fx-background-color:  #00FFFF");

        horario1.setStyle("-fx-border-color:  #00FFFF; -fx-background-color:  0");
        horario3.setStyle("-fx-border-color:  #00FFFF; -fx-background-color:  0");

        horaEscolhida = String.valueOf(horario2);

    }

    @FXML
    void horario3(ActionEvent event) {
        horario3.setStyle("-fx-text-fill:  #1A2232; -fx-background-color:  #00FFFF");

        horario1.setStyle("-fx-border-color:  #00FFFF; -fx-background-color:  0");
        horario2.setStyle("-fx-border-color:  #00FFFF; -fx-background-color:  0");

        horaEscolhida = String.valueOf(horario3);

    }
}
