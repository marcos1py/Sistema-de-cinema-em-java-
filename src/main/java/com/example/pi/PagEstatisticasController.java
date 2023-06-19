package com.example.pi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PagEstatisticasController {


    @FXML
    private Label sessao_mais_ocupada;

    @FXML
    private Label sessao_menos_ocupada;

    public void muda_as_sessoes(String sessao_mais, String sessao_menos){
        sessao_mais_ocupada.setText(sessao_mais);
        sessao_menos_ocupada.setText(sessao_menos);
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
