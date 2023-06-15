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



    public boolean novoFilme;
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
//        switch (PagUsuarioFilmeController.bt){
//            case 0:
//                PagUsuarioFilmeController.btus1.setOpacity(1);
//                break;
//            case 1:
//                PagUsuarioFilmeController.btus2.setOpacity(1);
//                break;
//            case 2:
//                PagUsuarioFilmeController.btus3.setOpacity(1);
//                break;
//            case 3:
//                PagUsuarioFilmeController.btus4.setOpacity(1);
//                break;
//            case 4:
//                PagUsuarioFilmeController.btus5.setOpacity(1);
//                break;
//            case 5:
//                PagUsuarioFilmeController.btus6.setOpacity(1);
//                break;
//            case 6:
//                PagUsuarioFilmeController.btus7.setOpacity(1);
//                break;
//            case 7:
//                PagUsuarioFilmeController.btus8.setOpacity(1);
//                break;
//            case 8:
//                PagUsuarioFilmeController.btus9.setOpacity(1);
//                break;
//            case 9:
//                PagUsuarioFilmeController.btus10.setOpacity(1);
//                break;
//            case 10:
//                PagUsuarioFilmeController.btus11.setOpacity(1);
//                break;
//            case 11:
//                PagUsuarioFilmeController.btus12.setOpacity(1);
//                break;
//            case 12:
//                PagUsuarioFilmeController.btus13.setOpacity(1);
//                break;
//            case 13:
//                PagUsuarioFilmeController.btus14.setOpacity(1);
//                break;
//        }

    }


    @FXML
    void btsalvar(ActionEvent event) {


    }
    @FXML
    void pegarData(ActionEvent event) {
        LocalDate dataCine = datepicker.getValue();
        String dataFormatada = dataCine.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        datacadastrolabel.setText(dataFormatada);
    }




}

