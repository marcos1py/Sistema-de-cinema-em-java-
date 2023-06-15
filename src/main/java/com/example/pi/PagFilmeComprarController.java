package com.example.pi;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PagFilmeComprarController {
    @FXML
    private Label nomeFilmeComprarLabel;

    private static PagFilmeComprarController instance;

    public PagFilmeComprarController() {
        instance = this;
    }

    public static PagFilmeComprarController getInstance() {
        return instance;
    }



    @FXML
    void btvoltarcompra(ActionEvent event) {
        Main.mudarTela("usuariofilme");
    }

    @FXML
    void btprosseguircomrpra(ActionEvent event) {
        Main.mudarTela("tipoingresso");
    }
}
