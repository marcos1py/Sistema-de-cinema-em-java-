package com.example.pi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaLoginController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField txtsenha;

    @FXML
    void login(ActionEvent event) {
        if(txtsenha.getText().equals("1234")){
            Main.mudarTela("");
        }
    }
}