package com.example.pi;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;


import java.net.URL;
import java.util.ResourceBundle;



public class PagTipoIngressoController {



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
    private Label valor_total_pago;

    @FXML
    private Label valoringresso;

    public void valor_que_foi_comprado(String valor){
        valor_total_pago.setText(valor);
    }

    public void imprimir_ingresso( String poltrona_compradas,String nome_do_filme_comprado, String data_do_filme_comprado,String horas_do_filme_comprado, String numero_da_sala){
        nomeingresso.setText(nome_do_filme_comprado);
        dataingresso.setText(data_do_filme_comprado);
        cadeirasingresso.setText(poltrona_compradas);
        horarioingresso.setText(horas_do_filme_comprado);
        salaingresso.setText(numero_da_sala);
    }




    @FXML
    void btvoltartipoingresso(ActionEvent event) {
        Main.mudarTela("filmecomprar");
    }





    @FXML
    void btprosseguirtipoingresso(ActionEvent event) {

            Main.mudarTela("usuariofilme");


    }}

