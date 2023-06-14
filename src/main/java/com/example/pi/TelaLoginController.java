package com.example.pi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class TelaLoginController {

    @FXML
    private Label senhaincorretalabel;


    @FXML
    private PasswordField txtsenha;

    @FXML
    void login(ActionEvent event) {
        if(txtsenha.getText().equals("1234")){
            Main.mudarTela("usuariofilme");
        }
        else{
            if (txtsenha.getText().equals("1212")){
                Main.mudarTela("cadastro");
            }else {
                senhaincorretalabel.setText("Senha Incorreta");
            }
        }
    }
}