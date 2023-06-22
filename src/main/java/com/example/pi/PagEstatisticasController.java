package com.example.pi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PagEstatisticasController {

    @FXML
    private Label horario_Mais_Comprado;

    @FXML
    private Label horario_Menos_Comprado;

    @FXML
    private Label filme_mais_vendido;

    @FXML
    private Label filme_menos_vendido;


    public void muda_as_sessoes(String sessao_mais1, String sessao_menos1,String sessao_mais2, String sessao_menos2){

        horario_Mais_Comprado.setText(sessao_mais1);
        horario_Menos_Comprado.setText(sessao_menos1);
        filme_mais_vendido.setText(sessao_mais2);
        filme_menos_vendido.setText(sessao_menos2);
    }
    @FXML
    void btcadastroestatistica(ActionEvent event) {

        Main.mudarTela("cadastro");
    }
    @FXML
    void btdeletar(ActionEvent event) {

    }

    @FXML
    void btsair(ActionEvent event) {
        Main.mudarTela("usuariofilme");
    }

}
