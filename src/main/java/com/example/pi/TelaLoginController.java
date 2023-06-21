package com.example.pi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class TelaLoginController {

    @FXML
    private Label senhaincorretalabel;

    @FXML
    private ImageView voltarlogin;

    @FXML
    private PasswordField txtsenha;

    public void resetarlogin(){
        senhaincorretalabel.setText("");
    }
    @FXML
    void btvoltarlogin(ActionEvent event) {
        Main.mudarTela("usuariofilme");
        resetarlogin();
    }

    @FXML
    void login(ActionEvent event) {
        if(txtsenha.getText().equals("1234")){
            Main.mudarTela("estatisticas");
            txtsenha.setText(null);
            resetarlogin();
        }
        else{

                senhaincorretalabel.setText("Senha Incorreta");
            }
        }
    }
