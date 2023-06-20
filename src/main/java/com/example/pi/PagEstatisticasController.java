package com.example.pi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PagEstatisticasController {

    @FXML
    private Label horario_Mais_Comprado;

    @FXML
    private Label horario_Menos_Comprado;

    @FXML
    private Label sessao_mais_ocupada;

    @FXML
    private Label sessao_menos_ocupada;


    public void muda_as_sessoes(String sessao_mais, String sessao_menos){
        horario_Mais_Comprado.setText(sessao_mais);
        horario_Menos_Comprado.setText(sessao_menos);
    }
    @FXML
    void btcadastroestatistica(ActionEvent event) {
        Main.mudarTela("cadastro");
    }
    @FXML
    void btdeletar(ActionEvent event) {

    }

    @FXML
    void btsair(ActionEvent event) {
        Main.mudarTela("usuariofilme");
    }

}
