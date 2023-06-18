package com.example.pi;
import java.io.BufferedReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.util.converter.IntegerStringConverter;

import java.util.List;



public class PagFilmeComprarController {
    private Scene scene;

    // Method to set the scene
    public void setScene(Scene scene) {
        this.scene = scene;
    }
    private Main main;

    public void setMain(Main main) {
        this.main = main;
    }
    @FXML
    Label nomeFilmeComprarLabel;
    @FXML
    private Label nomeFilmeComprar;

    public void setAtualiza_dados(String text) {

        nomeFilmeComprar.setText(text);

    }

    public void setAtualizar_Img(String caminho) {
        Image imagem = new Image(caminho);
        ImageView imageView = new ImageView(imagem);
        imageView.setFitWidth(144); // Defina a largura desejada da imagem
        imageView.setFitHeight(216); // Defina a altura desejada da imagem
        img_ta_select_cadeira.setGraphic(imageView);
    }

    public void setAtualizar_Data(LocalDate data) {
        if (data != null) {
            data_do_filme.setText(data.toString());
        } else {
            data_do_filme.setText("A data do filme não está disponível.");
        }
    }

    public void setAtualizar_Horas(String horario){
        if (horario != null) {
            horario_filme_comprar.setText(horario);
        } else {
            horario_filme_comprar.setText("Filme não encontrado");
        }
    }

    @FXML
    private Label horario_filme_comprar;

    @FXML
    private ImageView imgqrcode;
    @FXML
    private Label data_do_filme;

    @FXML
    private Button img_ta_select_cadeira;

    @FXML
    private Label labelcomprar;

    @FXML
    public void btpix(ActionEvent event){
        labelcomprar.setText("Por favor, escaneie o Qrcode a seguir:");
        imgqrcode.setVisible(true);
    }
    @FXML
    public void btdebito(ActionEvent event){
        labelcomprar.setText("Por favor, insira ou aproxime o cartão de débito:");
        imgqrcode.setVisible(false);
    }
    @FXML
    public void btcredito(ActionEvent event){
        labelcomprar.setText("Por favor, insira ou aproxime o cartão de crédito:");
        imgqrcode.setVisible(false);
    }
    @FXML
    public void btdinheiro(ActionEvent event){
        labelcomprar.setText("Por favor, entregue o dinheiro ao caixa:");
        imgqrcode.setVisible(false);
    }


    private static PagFilmeComprarController instance;

    public PagFilmeComprarController() {
        instance = this;
    }

    public static PagFilmeComprarController getInstance() {
        return instance;
    }

    @FXML
    private Button A1;

    @FXML
    private Button A2;

    @FXML
    private Button A3;

    @FXML
    private Button A4;

    @FXML
    private Button A5;

    @FXML
    private Button A6;

    @FXML
    private Button A7;

    @FXML
    private Button A8;

    @FXML
    private Button B1;

    @FXML
    private Button B2;

    @FXML
    private Button B3;

    @FXML
    private Button B4;

    @FXML
    private Button B5;

    @FXML
    private Button B6;

    @FXML
    private Button B7;

    @FXML
    private Button B8;

    @FXML
    private Button C1;

    @FXML
    private Button C2;

    @FXML
    private Button C3;

    @FXML
    private Button C4;

    @FXML
    private Button C5;

    @FXML
    private Button C6;

    @FXML
    private Button C7;

    @FXML
    private Button C8;

    @FXML
    private Button D1;

    @FXML
    private Button D2;

    @FXML
    private Button D3;

    @FXML
    private Button D4;

    @FXML
    private Button D5;

    @FXML
    private Button D6;

    @FXML
    private Button D7;

    @FXML
    private Button D8;

    @FXML
    private Button E1;

    @FXML
    private Button E2;

    @FXML
    private Button E3;

    @FXML
    private Button E4;

    @FXML
    private Button E5;

    @FXML
    private Button E6;

    @FXML
    private Button E7;

    @FXML
    private Button E8;

    @FXML
    private Button F1;

    @FXML
    private Button F2;

    @FXML
    private Button F3;

    @FXML
    private Button F4;

    @FXML
    private Button F5;

    @FXML
    private Button F6;

    @FXML
    private Button F7;

    @FXML
    private Button F8;

    @FXML
    private Button G1;

    @FXML
    private Button G2;

    @FXML
    private Button G3;

    @FXML
    private Button G4;

    @FXML
    private Button G5;

    @FXML
    private Button G6;

    @FXML
    private Button G7;

    @FXML
    private Button G8;

    @FXML
    private Label totalSelecionado;


    private int contadorPoltronas = 0; // Variável para contar as poltronas selecionadas

    private List<String> cadeirasVerdes = new ArrayList<>(); // Lista para armazenar os IDs das cadeiras verdes



    @FXML
    void handleButtonClick(Button button) {
        Color currentColor = (Color) button.getBackground().getFills().get(0).getFill();
        String cadeiraID = button.getId();

        if (currentColor.equals(Color.GREEN)) {
            button.setStyle("-fx-background-color: white;");
            contadorPoltronas--;
            totalSelecionado.setText(Integer.toString(contadorPoltronas));
            cadeirasVerdes.remove(cadeiraID);
        } else {
            button.setStyle("-fx-background-color: green;");
            contadorPoltronas++;
            totalSelecionado.setText(Integer.toString(contadorPoltronas));
            cadeirasVerdes.add(cadeiraID);
        }

        Repositorio.salvarValores(contadorPoltronas, cadeirasVerdes);

        System.out.println("Contagem de poltronas: " + contadorPoltronas);
        System.out.println("Cadeiras verdes: " + cadeirasVerdes);
    }

    @FXML
    void A1(ActionEvent event) {
        handleButtonClick(A1);
    }

    // Evento de clique para o botão A2
    @FXML
    void A2(ActionEvent event) {
        handleButtonClick(A2);
    }

    // Restante dos eventos de clique para os outros botões

    // Evento de clique para o botão A3
    @FXML
    void A3(ActionEvent event) {
        handleButtonClick(A3);
    }

    // Evento de clique para o botão A4
    @FXML
    void A4(ActionEvent event) {
        handleButtonClick(A4);
    }

    // Evento de clique para o botão A5
    @FXML
    void A5(ActionEvent event) {
        handleButtonClick(A5);
    }
    public void setNomeFilme(String nomeFilme) {
        nomeFilmeComprarLabel.setText(nomeFilme);
    }
    // Evento de clique para o botão A6

    @FXML
    void A6(ActionEvent event) {
        handleButtonClick(A6);
    }

    // Evento de clique para o botão A7
    @FXML
    void A7(ActionEvent event) {

        handleButtonClick(A7);
    }

    // Evento de clique para o botão A8
    @FXML
    void A8(ActionEvent event) {
        handleButtonClick(A8);
    }
    @FXML
    void B1(ActionEvent event) {
        handleButtonClick(B1);
    }

    @FXML
    void B2(ActionEvent event) {
        handleButtonClick(B2);
    }

    @FXML
    void B3(ActionEvent event) {
        handleButtonClick(B3);
    }

    @FXML
    void B4(ActionEvent event) {
        handleButtonClick(B4);
    }

    @FXML
    void B5(ActionEvent event) {
        handleButtonClick(B5);
    }

    @FXML
    void B6(ActionEvent event) {
        handleButtonClick(B6);
    }

    @FXML
    void B7(ActionEvent event) {
        handleButtonClick(B7);
    }

    @FXML
    void B8(ActionEvent event) {
        handleButtonClick(B8);
    }
    @FXML
    void C1(ActionEvent event) {
        handleButtonClick(C1);
    }

    @FXML
    void C2(ActionEvent event) {
        handleButtonClick(C2);
    }

    @FXML
    void C3(ActionEvent event) {
        handleButtonClick(C3);
    }

    @FXML
    void C4(ActionEvent event) {
        handleButtonClick(C4);
    }

    @FXML
    void C5(ActionEvent event) {
        handleButtonClick(C5);
    }

    @FXML
    void C6(ActionEvent event) {
        handleButtonClick(C6);
    }

    @FXML
    void C7(ActionEvent event) {
        handleButtonClick(C7);
    }

    @FXML
    void C8(ActionEvent event) {
        handleButtonClick(C8);
    }

    @FXML
    void D1(ActionEvent event) {
        handleButtonClick(D1);
    }

    @FXML
    void D2(ActionEvent event) {
        handleButtonClick(D2);
    }

    @FXML
    void D3(ActionEvent event) {
        handleButtonClick(D3);
    }

    @FXML
    void D4(ActionEvent event) {
        handleButtonClick(D4);
    }

    @FXML
    void D5(ActionEvent event) {
        handleButtonClick(D5);
    }

    @FXML
    void D6(ActionEvent event) {
        handleButtonClick(D6);
    }

    @FXML
    void D7(ActionEvent event) {
        handleButtonClick(D7);
    }

    @FXML
    void D8(ActionEvent event) {
        handleButtonClick(D8);
    }

    @FXML
    void E1(ActionEvent event) {
        handleButtonClick(E1);
    }

    @FXML
    void E2(ActionEvent event) {
        handleButtonClick(E2);
    }

    @FXML
    void E3(ActionEvent event) {
        handleButtonClick(E3);
    }

    @FXML
    void E4(ActionEvent event) {
        handleButtonClick(E4);
    }

    @FXML
    void E5(ActionEvent event) {
        handleButtonClick(E5);
    }

    @FXML
    void E6(ActionEvent event) {
        handleButtonClick(E6);
    }

    @FXML
    void E7(ActionEvent event) {
        handleButtonClick(E7);
    }

    @FXML
    void E8(ActionEvent event) {
        handleButtonClick(E8);
    }

    @FXML
    void F1(ActionEvent event) {
        handleButtonClick(F1);
    }

    @FXML
    void F2(ActionEvent event) {
        handleButtonClick(F2);
    }

    @FXML
    void F3(ActionEvent event) {
        handleButtonClick(F3);
    }

    @FXML
    void F4(ActionEvent event) {
        handleButtonClick(F4);
    }

    @FXML
    void F5(ActionEvent event) {
        handleButtonClick(F5);
    }

    @FXML
    void F6(ActionEvent event) {
        handleButtonClick(F6);
    }

    @FXML
    void F7(ActionEvent event) {

        handleButtonClick(F7);
    }

    @FXML
    void F8(ActionEvent event) {
        handleButtonClick(F8);
    }

    @FXML
    void G1(ActionEvent event) {
        handleButtonClick(G1);
    }

    @FXML
    void G2(ActionEvent event) {
        handleButtonClick(G2);
    }

    @FXML
    void G3(ActionEvent event) {
        handleButtonClick(G3);
    }

    @FXML
    void G4(ActionEvent event) {
        handleButtonClick(G4);
    }

    @FXML
    void G5(ActionEvent event) {
        handleButtonClick(G5);
    }

    @FXML
    void G6(ActionEvent event) {
        handleButtonClick(G6);
    }

    @FXML
    void G7(ActionEvent event) {
        handleButtonClick(G7);
    }

    @FXML
    void G8(ActionEvent event) {
        handleButtonClick(G8);
    }


    @FXML
    private Label msg_de_erro;

    @FXML
    private Label msg_erro2;
    @FXML
    void btprosseguircompra(ActionEvent event) {
        msg_de_erro.setOpacity(0);
        msg_erro2.setOpacity(0);
        try {
            int totalMeias = Integer.parseInt(total_de_meias.getText());

            if (totalMeias > contadorPoltronas) {
                System.out.println("Tem mais meias do que ingressos.");
                msg_erro2.setOpacity(1);
            } else {
                msg_de_erro.setOpacity(0);
                msg_erro2.setOpacity(0);
                Repositorio.lerValores(); // salvar no arquivo poltronas
                //marcarCadeirasVermelhas(); ta dano erro
                //desabilitarCadeiras(); ta dano erro
                Main.mudarTela("tipoingresso");
            }
        } catch (NumberFormatException e) {
            msg_de_erro.setOpacity(1);
            System.out.println("Erro ao converter o valor das meias para um número inteiro.");
        }
    }


    public void marcarCadeirasVermelhas() {
        try (BufferedReader reader = new BufferedReader(new FileReader("poltronas.txt"))) {
            String linha = reader.readLine();
            String[] poltronas = linha.substring(1, linha.length() - 1).split(",");

            for (String poltrona : poltronas) {
                System.out.println("teste");
                System.out.println(poltrona);
                Node node = scene.lookup("#" + poltrona.trim());
                if (node instanceof Button) {
                    Button button = (Button) node;
                    button.setStyle("-fx-background-color: red;");
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler as poltronas: " + e.getMessage());
        }
    }

    private void desabilitarCadeiras() {
        List<Node> nodes = new ArrayList<>(scene.getRoot().lookupAll(".button"));
        for (Node node : nodes) {
            Button button = (Button) node;
            if (button.getStyle().contains("-fx-background-color: red;")) {
                button.setDisable(true);
            }
        }
    }


    @FXML
    void btvoltarcompra(ActionEvent event) {
        Repositorio.resetarValores();
        cadeirasVerdes = new ArrayList<>();
        contadorPoltronas = 0;

        totalSelecionado.setText(Integer.toString(contadorPoltronas));
        // Defina a cor branca para todas as poltronas
        A1.setStyle("-fx-background-color: white;");
        A2.setStyle("-fx-background-color: white;");
        A3.setStyle("-fx-background-color: white;");
        A4.setStyle("-fx-background-color: white;");
        A5.setStyle("-fx-background-color: white;");
        A6.setStyle("-fx-background-color: white;");
        A7.setStyle("-fx-background-color: white;");
        A8.setStyle("-fx-background-color: white;");
        B1.setStyle("-fx-background-color: white;");
        B2.setStyle("-fx-background-color: white;");
        B3.setStyle("-fx-background-color: white;");
        B4.setStyle("-fx-background-color: white;");
        B5.setStyle("-fx-background-color: white;");
        B6.setStyle("-fx-background-color: white;");
        B7.setStyle("-fx-background-color: white;");
        B8.setStyle("-fx-background-color: white;");
        C1.setStyle("-fx-background-color: white;");
        C2.setStyle("-fx-background-color: white;");
        C3.setStyle("-fx-background-color: white;");
        C4.setStyle("-fx-background-color: white;");
        C5.setStyle("-fx-background-color: white;");
        C6.setStyle("-fx-background-color: white;");
        C7.setStyle("-fx-background-color: white;");
        C8.setStyle("-fx-background-color: white;");
        D1.setStyle("-fx-background-color: white;");
        D2.setStyle("-fx-background-color: white;");
        D3.setStyle("-fx-background-color: white;");
        D4.setStyle("-fx-background-color: white;");
        D5.setStyle("-fx-background-color: white;");
        D6.setStyle("-fx-background-color: white;");
        D7.setStyle("-fx-background-color: white;");
        D8.setStyle("-fx-background-color: white;");
        E1.setStyle("-fx-background-color: white;");
        E2.setStyle("-fx-background-color: white;");
        E3.setStyle("-fx-background-color: white;");
        E4.setStyle("-fx-background-color: white;");
        E5.setStyle("-fx-background-color: white;");
        E6.setStyle("-fx-background-color: white;");
        E7.setStyle("-fx-background-color: white;");
        E8.setStyle("-fx-background-color: white;");
        F1.setStyle("-fx-background-color: white;");
        F2.setStyle("-fx-background-color: white;");
        F3.setStyle("-fx-background-color: white;");
        F4.setStyle("-fx-background-color: white;");
        F5.setStyle("-fx-background-color: white;");
        F6.setStyle("-fx-background-color: white;");
        F7.setStyle("-fx-background-color: white;");
        F8.setStyle("-fx-background-color: white;");
        G1.setStyle("-fx-background-color: white;");
        G2.setStyle("-fx-background-color: white;");
        G3.setStyle("-fx-background-color: white;");
        G4.setStyle("-fx-background-color: white;");
        G5.setStyle("-fx-background-color: white;");
        G6.setStyle("-fx-background-color: white;");
        G7.setStyle("-fx-background-color: white;");
        G8.setStyle("-fx-background-color: white;");

        Main.mudarTela("usuariofilme");
    }
    @FXML
    private TextField total_de_meias;


    // Resto do seu código...
}

