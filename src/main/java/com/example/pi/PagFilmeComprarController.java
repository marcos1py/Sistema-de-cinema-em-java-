package com.example.pi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class PagFilmeComprarController {
    @FXML
    void btvoltarcompra(ActionEvent event) {
        Main.mudarTela("usuariofilme");
    }
    @FXML
    void btprosseguircomrpra(ActionEvent event) {
        Main.mudarTela("tipoingresso");
    }

}
