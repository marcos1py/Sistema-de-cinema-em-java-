package com.example.pi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class PagCadastroController {

    @FXML
    private TextField nomeFilmeC;

    @FXML
    private Label avisotipoingressolabel;


    @FXML
    private Label datacadastrolabel;


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

