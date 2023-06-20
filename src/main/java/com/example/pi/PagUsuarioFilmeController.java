package com.example.pi;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import logica.untitled2.src.Filme;
import com.example.pi.FilmeRepository;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class PagUsuarioFilmeController {
    private PagFilmeComprarController filmeComprarController;


    @FXML
    public Label foda;

    @FXML
    public Button btus1; // Alterado para visibilidade pública



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
    void btus1(ActionEvent event) {
        int id = 0;

        String caminhoImagem = FilmeRepository.getCaminhoDaImagem(id);
        if (caminhoImagem != null){
            filmeComprarController.setAtualizar_Img(caminhoImagem);
        }
        String sala = FilmeRepository.pegarSala(id);
        filmeComprarController.setAtualizar_Sala(sala);


        String atualiza_Nome = FilmeRepository.nome_do_filme(id);
        filmeComprarController.setAtualiza_dados(atualiza_Nome,id);

        LocalDate dataFilme = FilmeRepository.getDataDoFilme(id);
        filmeComprarController.setAtualizar_Data(dataFilme);

        String horas_do_filme = FilmeRepository.getHorarioDoFilme(id);
        filmeComprarController.setAtualizar_Horas(horas_do_filme);

        String valorInteira = FilmeRepository.pegarValorInteira(id);
        filmeComprarController.setAtualizar_Inteira(valorInteira);

        String valorMeia = FilmeRepository.pegarValorMeia(id);
        filmeComprarController.setAtualizar_Meia(valorMeia);

        Main.mudarTela("filmecomprar");
    }

    @FXML
    void btus2(ActionEvent event) {

        int id = 1;

        String caminhoImagem = FilmeRepository.getCaminhoDaImagem(id);
        if (caminhoImagem != null){
            filmeComprarController.setAtualizar_Img(caminhoImagem);
        }
        String sala = FilmeRepository.pegarSala(id);
        filmeComprarController.setAtualizar_Sala(sala);

        String atualiza_Nome = FilmeRepository.nome_do_filme(id);
        filmeComprarController.setAtualiza_dados(atualiza_Nome,id);

        LocalDate dataFilme = FilmeRepository.getDataDoFilme(id);
        filmeComprarController.setAtualizar_Data(dataFilme);

        String horas_do_filme = FilmeRepository.getHorarioDoFilme(id);
        filmeComprarController.setAtualizar_Horas(horas_do_filme);

        String valorInteira = FilmeRepository.pegarValorInteira(id);
        filmeComprarController.setAtualizar_Inteira(valorInteira);

        String valorMeia = FilmeRepository.pegarValorMeia(id);
        filmeComprarController.setAtualizar_Meia(valorMeia);

        Main.mudarTela("filmecomprar");
    }

    @FXML
    void btus3(ActionEvent event) {
        int id = 2;


        String caminhoImagem = FilmeRepository.getCaminhoDaImagem(id);
        if (caminhoImagem != null){
            filmeComprarController.setAtualizar_Img(caminhoImagem);
        }

        String atualiza_Nome = FilmeRepository.nome_do_filme(id);
        filmeComprarController.setAtualiza_dados(atualiza_Nome,id);

        LocalDate dataFilme = FilmeRepository.getDataDoFilme(id);
        filmeComprarController.setAtualizar_Data(dataFilme);

        String horas_do_filme = FilmeRepository.getHorarioDoFilme(id);
        filmeComprarController.setAtualizar_Horas(horas_do_filme);

        String valorInteira = FilmeRepository.pegarValorInteira(id);
        filmeComprarController.setAtualizar_Inteira(valorInteira);

        String valorMeia = FilmeRepository.pegarValorMeia(id);
        filmeComprarController.setAtualizar_Meia(valorMeia);

        Main.mudarTela("filmecomprar");
    }

    @FXML
    void btus4(ActionEvent event) {

        int id = 3;


        String caminhoImagem = FilmeRepository.getCaminhoDaImagem(id);
        if (caminhoImagem != null){
            filmeComprarController.setAtualizar_Img(caminhoImagem);
        }

        String atualiza_Nome = FilmeRepository.nome_do_filme(id);
        filmeComprarController.setAtualiza_dados(atualiza_Nome,id);

        LocalDate dataFilme = FilmeRepository.getDataDoFilme(id);
        filmeComprarController.setAtualizar_Data(dataFilme);

        String horas_do_filme = FilmeRepository.getHorarioDoFilme(id);
        filmeComprarController.setAtualizar_Horas(horas_do_filme);

        String valorInteira = FilmeRepository.pegarValorInteira(id);
        filmeComprarController.setAtualizar_Inteira(valorInteira);

        String valorMeia = FilmeRepository.pegarValorMeia(id);
        filmeComprarController.setAtualizar_Meia(valorMeia);



        Main.mudarTela("filmecomprar");
    }

    @FXML
    void btus5(ActionEvent event) {
        int id = 4;
        String caminhoImagem = FilmeRepository.getCaminhoDaImagem(id);
        if (caminhoImagem != null){
            filmeComprarController.setAtualizar_Img(caminhoImagem);
        }

        String atualiza_Nome = FilmeRepository.nome_do_filme(id);
        filmeComprarController.setAtualiza_dados(atualiza_Nome,id);

        LocalDate dataFilme = FilmeRepository.getDataDoFilme(id);
        filmeComprarController.setAtualizar_Data(dataFilme);

        String horas_do_filme = FilmeRepository.getHorarioDoFilme(id);
        filmeComprarController.setAtualizar_Horas(horas_do_filme);

        String valorInteira = FilmeRepository.pegarValorInteira(id);
        filmeComprarController.setAtualizar_Inteira(valorInteira);

        String valorMeia = FilmeRepository.pegarValorMeia(id);
        filmeComprarController.setAtualizar_Meia(valorMeia);

        Main.mudarTela("filmecomprar");
    }

    @FXML
    void btus6(ActionEvent event) {
        int id = 5;
        String caminhoImagem = FilmeRepository.getCaminhoDaImagem(id);
        if (caminhoImagem != null){
            filmeComprarController.setAtualizar_Img(caminhoImagem);
        }
        String atualiza_Nome = FilmeRepository.nome_do_filme(id);
        filmeComprarController.setAtualiza_dados(atualiza_Nome,id);

        LocalDate dataFilme = FilmeRepository.getDataDoFilme(id);
        filmeComprarController.setAtualizar_Data(dataFilme);

        String horas_do_filme = FilmeRepository.getHorarioDoFilme(id);
        filmeComprarController.setAtualizar_Horas(horas_do_filme);

        String valorInteira = FilmeRepository.pegarValorInteira(id);
        filmeComprarController.setAtualizar_Inteira(valorInteira);

        String valorMeia = FilmeRepository.pegarValorMeia(id);
        filmeComprarController.setAtualizar_Meia(valorMeia);

        Main.mudarTela("filmecomprar");
    }

    @FXML
    void btus7(ActionEvent event) {

        int id = 6;

        String caminhoImagem = FilmeRepository.getCaminhoDaImagem(id);
        if (caminhoImagem != null){
            filmeComprarController.setAtualizar_Img(caminhoImagem);
        }

        String atualiza_Nome = FilmeRepository.nome_do_filme(id);
        filmeComprarController.setAtualiza_dados(atualiza_Nome,id);

        LocalDate dataFilme = FilmeRepository.getDataDoFilme(id);
        filmeComprarController.setAtualizar_Data(dataFilme);

        String horas_do_filme = FilmeRepository.getHorarioDoFilme(id);
        filmeComprarController.setAtualizar_Horas(horas_do_filme);

        String valorInteira = FilmeRepository.pegarValorInteira(id);
        filmeComprarController.setAtualizar_Inteira(valorInteira);

        String valorMeia = FilmeRepository.pegarValorMeia(id);
        filmeComprarController.setAtualizar_Meia(valorMeia);

        Main.mudarTela("filmecomprar");
    }

    @FXML
    void btus8(ActionEvent event) {
        int id = 7;
        String caminhoImagem = FilmeRepository.getCaminhoDaImagem(id);
        if (caminhoImagem != null){
            filmeComprarController.setAtualizar_Img(caminhoImagem);
        }

        String atualiza_Nome = FilmeRepository.nome_do_filme(id);
        filmeComprarController.setAtualiza_dados(atualiza_Nome,id);

        LocalDate dataFilme = FilmeRepository.getDataDoFilme(id);
        filmeComprarController.setAtualizar_Data(dataFilme);

        String horas_do_filme = FilmeRepository.getHorarioDoFilme(id);
        filmeComprarController.setAtualizar_Horas(horas_do_filme);

        String valorInteira = FilmeRepository.pegarValorInteira(id);
        filmeComprarController.setAtualizar_Inteira(valorInteira);

        String valorMeia = FilmeRepository.pegarValorMeia(id);
        filmeComprarController.setAtualizar_Meia(valorMeia);

        Main.mudarTela("filmecomprar");
    }

    @FXML
    void btus9(ActionEvent event) {
        int id = 8;
        String caminhoImagem = FilmeRepository.getCaminhoDaImagem(id);
        if (caminhoImagem != null){
            filmeComprarController.setAtualizar_Img(caminhoImagem);
        }

        String atualiza_Nome = FilmeRepository.nome_do_filme(id);
        filmeComprarController.setAtualiza_dados(atualiza_Nome,id);

        LocalDate dataFilme = FilmeRepository.getDataDoFilme(id);
        filmeComprarController.setAtualizar_Data(dataFilme);

        String horas_do_filme = FilmeRepository.getHorarioDoFilme(id);
        filmeComprarController.setAtualizar_Horas(horas_do_filme);

        String valorInteira = FilmeRepository.pegarValorInteira(id);
        filmeComprarController.setAtualizar_Inteira(valorInteira);

        String valorMeia = FilmeRepository.pegarValorMeia(id);
        filmeComprarController.setAtualizar_Meia(valorMeia);

        Main.mudarTela("filmecomprar");
    }

    @FXML
    void btus10(ActionEvent event) {
        int id = 9;
        String caminhoImagem = FilmeRepository.getCaminhoDaImagem(id);
        if (caminhoImagem != null){
            filmeComprarController.setAtualizar_Img(caminhoImagem);
        }

        String atualiza_Nome = FilmeRepository.nome_do_filme(id);
        filmeComprarController.setAtualiza_dados(atualiza_Nome,id);

        LocalDate dataFilme = FilmeRepository.getDataDoFilme(id);
        filmeComprarController.setAtualizar_Data(dataFilme);

        String horas_do_filme = FilmeRepository.getHorarioDoFilme(id);
        filmeComprarController.setAtualizar_Horas(horas_do_filme);

        String valorInteira = FilmeRepository.pegarValorInteira(id);
        filmeComprarController.setAtualizar_Inteira(valorInteira);

        String valorMeia = FilmeRepository.pegarValorMeia(id);
        filmeComprarController.setAtualizar_Meia(valorMeia);

        Main.mudarTela("filmecomprar");
    }

    @FXML
    void btus11(ActionEvent event) {
        int id = 10;
        String caminhoImagem = FilmeRepository.getCaminhoDaImagem(id);
        if (caminhoImagem != null){
            filmeComprarController.setAtualizar_Img(caminhoImagem);
        }

        String atualiza_Nome = FilmeRepository.nome_do_filme(id);
        filmeComprarController.setAtualiza_dados(atualiza_Nome,id);

        LocalDate dataFilme = FilmeRepository.getDataDoFilme(id);
        filmeComprarController.setAtualizar_Data(dataFilme);

        String horas_do_filme = FilmeRepository.getHorarioDoFilme(id);
        filmeComprarController.setAtualizar_Horas(horas_do_filme);

        String valorInteira = FilmeRepository.pegarValorInteira(id);
        filmeComprarController.setAtualizar_Inteira(valorInteira);

        String valorMeia = FilmeRepository.pegarValorMeia(id);
        filmeComprarController.setAtualizar_Meia(valorMeia);

        Main.mudarTela("filmecomprar");
    }

    @FXML
    void btus12(ActionEvent event) {
        int id = 11;
        String caminhoImagem = FilmeRepository.getCaminhoDaImagem(id);
        if (caminhoImagem != null){
            filmeComprarController.setAtualizar_Img(caminhoImagem);
        }

        String atualiza_Nome = FilmeRepository.nome_do_filme(id);
        filmeComprarController.setAtualiza_dados(atualiza_Nome,id);

        LocalDate dataFilme = FilmeRepository.getDataDoFilme(id);
        filmeComprarController.setAtualizar_Data(dataFilme);

        String horas_do_filme = FilmeRepository.getHorarioDoFilme(id);
        filmeComprarController.setAtualizar_Horas(horas_do_filme);

        String valorInteira = FilmeRepository.pegarValorInteira(id);
        filmeComprarController.setAtualizar_Inteira(valorInteira);

        String valorMeia = FilmeRepository.pegarValorMeia(id);
        filmeComprarController.setAtualizar_Meia(valorMeia);

        Main.mudarTela("filmecomprar");
    }

    @FXML
    void btus13(ActionEvent event) {
        int id = 12;
        String caminhoImagem = FilmeRepository.getCaminhoDaImagem(id);
        if (caminhoImagem != null){
            filmeComprarController.setAtualizar_Img(caminhoImagem);
        }

        String atualiza_Nome = FilmeRepository.nome_do_filme(id);
        filmeComprarController.setAtualiza_dados(atualiza_Nome,id);

        LocalDate dataFilme = FilmeRepository.getDataDoFilme(id);
        filmeComprarController.setAtualizar_Data(dataFilme);

        String horas_do_filme = FilmeRepository.getHorarioDoFilme(id);
        filmeComprarController.setAtualizar_Horas(horas_do_filme);

        String valorInteira = FilmeRepository.pegarValorInteira(id);
        filmeComprarController.setAtualizar_Inteira(valorInteira);

        String valorMeia = FilmeRepository.pegarValorMeia(id);
        filmeComprarController.setAtualizar_Meia(valorMeia);

        Main.mudarTela("filmecomprar");
    }

    @FXML
    void btus14(ActionEvent event) {
        int id = 13;
        String caminhoImagem = FilmeRepository.getCaminhoDaImagem(13);
        if (caminhoImagem != null){
            filmeComprarController.setAtualizar_Img(caminhoImagem);
        }

        String atualiza_Nome = FilmeRepository.nome_do_filme(13);
        filmeComprarController.setAtualiza_dados(atualiza_Nome,id);

        LocalDate dataFilme = FilmeRepository.getDataDoFilme(id);
        filmeComprarController.setAtualizar_Data(dataFilme);

        String horas_do_filme = FilmeRepository.getHorarioDoFilme(id);
        filmeComprarController.setAtualizar_Horas(horas_do_filme);

        String valorInteira = FilmeRepository.pegarValorInteira(id);
        filmeComprarController.setAtualizar_Inteira(valorInteira);

        String valorMeia = FilmeRepository.pegarValorMeia(id);
        filmeComprarController.setAtualizar_Meia(valorMeia);

        Main.mudarTela("filmecomprar");
    }



    public void atualizarImagemBotao(int indice, ImageView imageView) {
        switch (indice) {
            case 1:
                btus1.setGraphic(imageView);
                btus1.setOpacity(1);
                btus1.setDisable(false);
                break;
            case 2:
                btus2.setGraphic(imageView);
                btus2.setOpacity(1);
                btus2.setDisable(false);
                break;
            case 3:
                btus3.setGraphic(imageView);
                btus3.setOpacity(1);
                btus3.setDisable(false);
                break;
            case 4:
                btus4.setGraphic(imageView);
                btus4.setOpacity(1);
                btus4.setDisable(false);
                break;
            case 5:
                btus5.setGraphic(imageView);
                btus5.setOpacity(1);
                btus5.setDisable(false);
                break;
            case 6:
                btus6.setGraphic(imageView);
                btus6.setOpacity(1);
                btus6.setDisable(false);
                break;
            case 7:
                btus7.setGraphic(imageView);
                btus7.setOpacity(1);
                btus7.setDisable(false);
                break;
            case 8:
                btus8.setGraphic(imageView);
                btus8.setOpacity(1);
                btus8.setDisable(false);
                break;
            case 9:
                btus9.setGraphic(imageView);
                btus9.setOpacity(1);
                btus9.setDisable(false);
                break;
            case 10:
                btus10.setGraphic(imageView);
                btus10.setOpacity(1);
                btus10.setDisable(false);
                break;
            case 11:
                btus11.setGraphic(imageView);
                btus11.setOpacity(1);
                btus11.setDisable(false);
                break;
            case 12:
                btus12.setGraphic(imageView);
                btus12.setOpacity(1);
                btus12.setDisable(false);
                break;
            case 13:
                btus13.setGraphic(imageView);
                btus13.setOpacity(1);
                btus13.setDisable(false);
                break;
            case 14:
                btus14.setGraphic(imageView);
                btus14.setOpacity(1);
                btus14.setDisable(false);
                break;
        }
    }

    public void  atualizarFODA(String texto){
        foda.setText(texto);
    }
    public void setFilmeComprarController(PagFilmeComprarController controller) {
        this.filmeComprarController = controller;
    }
}
