package com.example.pi;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;


import java.net.URL;
import java.util.ResourceBundle;


public class PagTipoIngressoController implements Initializable {
    boolean vef = false;
    @FXML
    private Label avisotipoingressolabel;


    @FXML
    private Label meiainteiralabel;


    @FXML
    private ChoiceBox<String> tipoingressochoicebox;


    private String[] tiposIngresso = {"Inteira", "Meia"};


    @FXML
    void btvoltartipoingresso(ActionEvent event) {
        Main.mudarTela("usuariofilme");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tipoingressochoicebox.getItems().addAll(tiposIngresso);
        tipoingressochoicebox.setOnAction(this::pegarTipo);
    }
    public void pegarTipo(ActionEvent event){
        String meiaouinteira1 = tipoingressochoicebox.getValue();
        meiainteiralabel.setText(meiaouinteira1);
        vef = true;
    }


    @FXML
    void btprosseguirtipoingresso(ActionEvent event) {
        if (vef == true){
            Main.mudarTela("pagamento");
        }
        else{
            avisotipoingressolabel.setText("Por favor, escolha o tipo de Ingresso");
        }


    }}

