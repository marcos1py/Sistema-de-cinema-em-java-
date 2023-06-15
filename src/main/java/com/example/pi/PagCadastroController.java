package com.example.pi;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.FileChooser.ExtensionFilter;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PagCadastroController {

    @FXML
    private Button btnOpenFile;

    @FXML
    private TextArea SinopseCadastro;

    @FXML
    private Label avisocadastrolabel;

    @FXML
    private Button btnSalvar;

    @FXML
    private ChoiceBox<String> choiceboxhorario;

    @FXML
    private ChoiceBox<String> choiceboxsala;

    @FXML
    private Label datacadastrolabel;

    @FXML
    private DatePicker datepicker;

    @FXML
    private TextField duraçaoDoFilmeCadastro;

    @FXML
    private Label horariocadastrolabel;

    @FXML
    private TextField nomeFilmeCadastro;

    @FXML
    private Label salacadastrolabel;

    @FXML
    private TextField textGenero;

    @FXML
    private TextField valorDaInteiraCadastro;

    @FXML
    private TextField valorDaMeiaCadastro;

    @FXML
    private Button img_do_filme_tela_de_cadastro;

    @FXML
    void img_do_filme(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Selecionar imagem");
        fileChooser.getExtensionFilters().addAll(
                new ExtensionFilter("Imagens", "*.png", "*.jpg", "*.jpeg")
        );

        Stage stage = (Stage) btnOpenFile.getScene().getWindow();
        File selectedFile = fileChooser.showOpenDialog(stage);

        if (selectedFile != null) {
            String caminhoImagem = selectedFile.getAbsolutePath();
            System.out.println("Caminho da imagem: " + caminhoImagem);

            // Criar uma nova imagem com base no caminho do arquivo selecionado
            Image novaImagem = new Image("file:" + caminhoImagem);


            ImageView imageView = new ImageView(novaImagem);
            imageView.setFitWidth(144);
            imageView.setFitHeight(216);
            img_do_filme_tela_de_cadastro.setGraphic(imageView);
        }
    }

    @FXML
    void btsalvar(ActionEvent event) {
        String sinopse = SinopseCadastro.getText();
        LocalDate data = datepicker.getValue();
        String duracao = duraçaoDoFilmeCadastro.getText();
        String nomeFilme = nomeFilmeCadastro.getText();
        String sala = choiceboxsala.getValue();
        String horario = choiceboxhorario.getValue();
        String valorInteira = valorDaInteiraCadastro.getText();
        String valorMeia = valorDaMeiaCadastro.getText();

        // Faça o que for necessário com as variáveis obtidas
        System.out.println("Sinopse: " + sinopse);
        System.out.println("Data: " + data);
        System.out.println("Duração do Filme: " + duracao);
        System.out.println("Nome do Filme: " + nomeFilme);
        System.out.println("Sala: " + sala);
        System.out.println("Horário: " + horario);
        System.out.println("Valor da Inteira: " + valorInteira);
        System.out.println("Valor da Meia: " + valorMeia);
    }

    @FXML
    void btvoltarcadastro(ActionEvent event) {
        Main.mudarTela("usuariofilme");
    }

    @FXML
    void pegarData(ActionEvent event) {
        LocalDate dataCine = datepicker.getValue();
        String dataFormatada = dataCine.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        datacadastrolabel.setText(dataFormatada);
    }

    @FXML
    public void initialize() {
        // Adicione os valores das salas ao ChoiceBox das salas
        choiceboxsala.getItems().addAll("Sala 1", "Sala 2", "Sala 3");
        // Adicione os valores dos horários ao ChoiceBox dos horários
        choiceboxhorario.getItems().addAll("12:00", "15:00", "18:00");
    }
}
