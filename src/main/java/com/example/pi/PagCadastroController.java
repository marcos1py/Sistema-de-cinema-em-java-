package com.example.pi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;


public class PagCadastroController{
    private  String[] horarios ={"Inteira", "Meia"};

    private  String[] salas = {"Sala 1", "Sala 2", "Sala 3","Sala 4", "Sala 5", "Sala 6"};
    @FXML
    private ChoiceBox<String> choiceboxhorario;

    @FXML
    private ChoiceBox<String> choiceboxsala;

    @FXML
    private TextField nomeFilmeC;

    @FXML
    private Label avisotipoingressolabel;

    @FXML
    private Label salacadastrolabel;
    @FXML
    private Label datacadastrolabel;


    @FXML
    private Label horariocadastrolabel;
    @FXML
    private DatePicker datepicker;



    @FXML
    void btvoltarcadastro(ActionEvent event) {


    }


    @FXML
    void btsalvar(ActionEvent event) {
        String aa = nomeFilmeC.getText();
        System.out.println(aa);

    }
    @FXML
    void pegarData(ActionEvent event) {
        LocalDate dataCine = datepicker.getValue();
        String dataFormatada = dataCine.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        datacadastrolabel.setText(dataFormatada);
    }




}

