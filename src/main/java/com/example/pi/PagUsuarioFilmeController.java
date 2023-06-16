package com.example.pi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
public class PagUsuarioFilmeController {
    @FXML
    public Label foda;

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
    public void atualizarImagemBotao(int indice, ImageView imageView) {
        switch (indice) {
            case 1:
                btus1.setGraphic(imageView);
                btus3.setOpacity(1);
                break;
            case 2:
                btus2.setGraphic(imageView);
                btus3.setOpacity(1);
                break;
            case 3:
                btus3.setGraphic(imageView);
                btus3.setOpacity(1);
                break;
            case 4:
                btus4.setGraphic(imageView);
                btus4.setOpacity(1);
                break;
            case 5:
                btus5.setGraphic(imageView);
                btus5.setOpacity(1);
                break;
            case 6:
                btus6.setGraphic(imageView);
                btus6.setOpacity(1);
                break;
            case 7:
                btus7.setGraphic(imageView);
                btus7.setOpacity(1);
                break;
            case 8:
                btus8.setGraphic(imageView);
                btus8.setOpacity(1);
                break;
            case 9:
                btus9.setGraphic(imageView);
                btus9.setOpacity(1);
                break;
            case 10:
                btus10.setGraphic(imageView);
                btus10.setOpacity(1);
                break;
            case 11:
                btus11.setGraphic(imageView);
                btus11.setOpacity(1);
                break;
            case 12:
                btus12.setGraphic(imageView);
                btus12.setOpacity(1);
                break;
            case 13:
                btus13.setGraphic(imageView);
                btus13.setOpacity(1);
                break;
            case 14:
                btus14.setGraphic(imageView);
                btus14.setOpacity(1);
                break;
        }
    }

    public void  atualizarFODA(String texto){
        foda.setText(texto);
    }
}
