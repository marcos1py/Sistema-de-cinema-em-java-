package com.example.pi;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;


import java.net.URL;
import java.util.ResourceBundle;


public class PagTipoIngressoController  {
    boolean vef = false;
    @FXML
    private Label avisotipoingressolabel;

    @FXML
    private Label cadeirasingresso;

    @FXML
    private Label dataingresso;

    @FXML
    private Label horarioingresso;

    @FXML
    private Label nomeingresso;

    @FXML
    private Label salaingresso;

    @FXML
    private Label valoringresso;

    @FXML
    private Label meiainteiralabel;





    @FXML
    void btvoltartipoingresso(ActionEvent event) {
        Main.mudarTela("filmecomprar");
    }





    @FXML
    void btprosseguirtipoingresso(ActionEvent event) {

            Main.mudarTela("usuariofilme");


    }}

