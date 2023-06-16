package com.example.pi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class PagUsuarioFilmeController {
    @FXML
    static Label foda;

    @FXML
    public Button btus1; // Alterado para visibilidade pública

    @FXML
    public void btus1(ActionEvent event) {
        Main.mudarTela("filmecomprar");
    }

    @FXML
    private Button btus10;

    @FXML
    private Button btus11;

    @FXML
    private Button btus12;

    @FXML
    private Button btus13;

    @FXML
    private Button btus14;

    @FXML
    private Button btus2;

    @FXML
    private Button btus3;

    @FXML
    private Button btus4;

    @FXML
    private Button btus5;

    @FXML
    private Button btus6;

    @FXML
    private Button btus7;

    @FXML
    private Button btus8;

    @FXML
    private Button btus9;

    public void setLabelText(String text) {
        foda.setText(text);
    }

    @FXML
    void btadmin(ActionEvent event) {
        Main.mudarTela("login");
    }




    @FXML
    void btus10(ActionEvent event) {
        Main.mudarTela("filmecomprar");
    }

    @FXML
    void btus11(ActionEvent event) {
        Main.mudarTela("filmecomprar");
    }

    @FXML
    void btus12(ActionEvent event) {
        Main.mudarTela("filmecomprar");
    }

    @FXML
    void btus13(ActionEvent event) {
        Main.mudarTela("filmecomprar");
    }

    @FXML
    void btus14(ActionEvent event) {
        Main.mudarTela("filmecomprar");
    }

    @FXML
    void btus2(ActionEvent event) {
        Main.mudarTela("filmecomprar");
    }

    @FXML
    void btus3(ActionEvent event) {
        Main.mudarTela("filmecomprar");
    }

    @FXML
    void btus4(ActionEvent event) {
        Main.mudarTela("filmecomprar");
    }

    @FXML
    void btus5(ActionEvent event) {
        Main.mudarTela("filmecomprar");
    }

    @FXML
    void btus6(ActionEvent event) {
        Main.mudarTela("filmecomprar");
    }

    @FXML
    void btus7(ActionEvent event) {
        Main.mudarTela("filmecomprar");
    }

    @FXML
    void btus8(ActionEvent event) {
        Main.mudarTela("filmecomprar");
    }

    @FXML
    void btus9(ActionEvent event) {
        Main.mudarTela("filmecomprar");
    }
    public void atualizarImagemBotao(ImageView imageView) {
        btus1.setGraphic(imageView);
        System.out.println(btus1);
        System.out.println(btus2);

    }
}
