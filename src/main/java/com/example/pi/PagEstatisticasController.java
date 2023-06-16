package com.example.pi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class PagEstatisticasController {
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
