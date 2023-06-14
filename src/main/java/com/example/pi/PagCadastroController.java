package com.example.pi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class PagCadastroController {
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
    void btprosseguircadastro(ActionEvent event) {


    }
    @FXML
    void pegarData(ActionEvent event) {
        LocalDate dataCine = datepicker.getValue();
        String dataFormatada = dataCine.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        datacadastrolabel.setText(dataFormatada);
    }


}

