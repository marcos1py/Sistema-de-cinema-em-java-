package com.example.pi;
import java.io.BufferedReader;
import java.time.LocalDate;
import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import java.io.FileReader;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.util.converter.IntegerStringConverter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.example.pi.PagTipoIngressoController;

public class PagFilmeComprarController {
    private PagTipoIngressoController pagTipoIngressoController;
    public void setPagTipoIngressoController(PagTipoIngressoController controller) {
        this.pagTipoIngressoController = controller;
    }
    private void adicionarHorarioNoArquivo(String horario) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("horarios.txt", true))) {
            writer.write(horario);

            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


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

    public void setAtualiza_dados(String text,int id) {
        id_filme.setText(String.valueOf(id));
        marcarCadeirasVermelhas();
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
        handleButtonClick(A1a);
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
    private Label id_filme;

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

                String idText = id_filme.getText();
                int id_do_arquivo = Integer.parseInt(idText);

                Repositorio.lerValores(id_do_arquivo); // salvar no arquivo poltronas
                marcarCadeirasVermelhas();

                //vai salvar no arquivo o horario tanto de poutrona comprados
                for (int adicionar_tantos_que_comprou = 0; adicionar_tantos_que_comprou < contadorPoltronas; adicionar_tantos_que_comprou++){
                    adicionarHorarioNoArquivo(horario_filme_comprar.getText());
                }

                String valor_total_pago = "0000";
                pagTipoIngressoController.valor_que_foi_comprado(valor_total_pago);

                Main.mudarTela("tipoingresso");
            }
        } catch (NumberFormatException e) {
            msg_de_erro.setOpacity(1);
            System.out.println("Erro ao converter o valor das meias para um número inteiro.");
        }
    }


    @FXML
    private Button A1a;

    public void marcarCadeirasVermelhas() {
        Map<String, Button> mapaPoltronas = new HashMap<>();
        String idText = id_filme.getText();
        int id = Integer.parseInt(idText);
        String nomeArquivo = "poltoronas_" + id + ".txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha = reader.readLine();
            String[] poltronas = linha.substring(1, linha.length() - 1).split(",");
            String poltrona_compradas = ""; // Variável para armazenar o conteúdo do arquivo


            for (String poltrona : poltronas) {
                Button botao = new Button("");; // Obtém o botão correspondente do mapa

                botao.setId(poltrona);


                if (botao != null){

                    poltrona_compradas += poltrona + " "; // Adiciona a poltrona à variável str
                    String nome_do_filme_comprado = nomeFilmeComprar.getText();
                    String data_do_filme_comprado = data_do_filme.getText();
                    String horas_do_filme_comprado = horario_filme_comprar.getText();

                    pagTipoIngressoController.imprimir_ingresso(poltrona_compradas,nome_do_filme_comprado,data_do_filme_comprado,horas_do_filme_comprado);

                }

                if (botao.getId().equals("A1a"))  {
                    A1a.setStyle("-fx-background-color: red;");
                    A1a.setDisable(true);
                }
                if (botao.getId().equals("A2")) {
                    A2.setStyle("-fx-background-color: red;");
                    A2.setDisable(true);
                }
                if (botao.getId().equals("A3")) {
                    A3.setStyle("-fx-background-color: red;");
                    A3.setDisable(true);
                }
                if (botao.getId().equals("A4")) {
                    A4.setStyle("-fx-background-color: red;");
                    A4.setDisable(true);
                }
                if (botao.getId().equals("A5")) {
                    A5.setStyle("-fx-background-color: red;");
                    A5.setDisable(true);
                }
                if (botao.getId().equals("A6")) {
                    A6.setStyle("-fx-background-color: red;");
                    A6.setDisable(true);
                }
                if (botao.getId().equals("A7")) {
                    A7.setStyle("-fx-background-color: red;");
                    A7.setDisable(true);
                }
                if (botao.getId().equals("A8")) {
                    A8.setStyle("-fx-background-color: red;");
                    A8.setDisable(true);
                }
                if (botao.getId().equals("B1")) {
                    B1.setStyle("-fx-background-color: red;");
                    B1.setDisable(true);
                }
                if (botao.getId().equals("B2")) {
                    B2.setStyle("-fx-background-color: red;");
                    B2.setDisable(true);
                }
                if (botao.getId().equals("B3")) {
                    B3.setStyle("-fx-background-color: red;");
                    B3.setDisable(true);
                }
                if (botao.getId().equals("B4")) {
                    B4.setStyle("-fx-background-color: red;");
                    B4.setDisable(true);
                }
                if (botao.getId().equals("B5")) {
                    B5.setStyle("-fx-background-color: red;");
                    B5.setDisable(true);
                }
                if (botao.getId().equals("B6")) {
                    B6.setStyle("-fx-background-color: red;");
                    B6.setDisable(true);
                }
                if (botao.getId().equals("B7")) {
                    B7.setStyle("-fx-background-color: red;");
                    B7.setDisable(true);
                }
                if (botao.getId().equals("B8")) {
                    B8.setStyle("-fx-background-color: red;");
                    B8.setDisable(true);
                }
                if (botao.getId().equals("C1")) {
                    C1.setStyle("-fx-background-color: red;");
                    C1.setDisable(true);
                }
                if (botao.getId().equals("C2")) {
                    C2.setStyle("-fx-background-color: red;");
                    C2.setDisable(true);
                }
                if (botao.getId().equals("C3")) {
                    C3.setStyle("-fx-background-color: red;");
                    C3.setDisable(true);
                }
                if (botao.getId().equals("C4")) {
                    C4.setStyle("-fx-background-color: red;");
                    C4.setDisable(true);
                }
                if (botao.getId().equals("C5")) {
                    C5.setStyle("-fx-background-color: red;");
                    C5.setDisable(true);
                }
                if (botao.getId().equals("C6")) {
                    C6.setStyle("-fx-background-color: red;");
                    C6.setDisable(true);
                }
                if (botao.getId().equals("C7")) {
                    C7.setStyle("-fx-background-color: red;");
                    C7.setDisable(true);
                }
                if (botao.getId().equals("C8")) {
                    C8.setStyle("-fx-background-color: red;");
                    C8.setDisable(true);
                }
                if (botao.getId().equals("D1")) {
                    D1.setStyle("-fx-background-color: red;");
                    D1.setDisable(true);
                }
                if (botao.getId().equals("D2")) {
                    D2.setStyle("-fx-background-color: red;");
                    D2.setDisable(true);
                }
                if (botao.getId().equals("D3")) {
                    D3.setStyle("-fx-background-color: red;");
                    D3.setDisable(true);
                }
                if (botao.getId().equals("D4")) {
                    D4.setStyle("-fx-background-color: red;");
                    D4.setDisable(true);
                }
                if (botao.getId().equals("D5")) {
                    D5.setStyle("-fx-background-color: red;");
                    D5.setDisable(true);
                }
                if (botao.getId().equals("D6")) {
                    D6.setStyle("-fx-background-color: red;");
                    D6.setDisable(true);
                }
                if (botao.getId().equals("D7")) {
                    D7.setStyle("-fx-background-color: red;");
                    D7.setDisable(true);
                }
                if (botao.getId().equals("D8")) {
                    D8.setStyle("-fx-background-color: red;");
                    D8.setDisable(true);
                }
                if (botao.getId().equals("E1")) {
                    E1.setStyle("-fx-background-color: red;");
                    E1.setDisable(true);
                }
                if (botao.getId().equals("E2")) {
                    E2.setStyle("-fx-background-color: red;");
                    E2.setDisable(true);
                }
                if (botao.getId().equals("E3")) {
                    E3.setStyle("-fx-background-color: red;");
                    E3.setDisable(true);
                }
                if (botao.getId().equals("E4")) {
                    E4.setStyle("-fx-background-color: red;");
                    E4.setDisable(true);
                }
                if (botao.getId().equals("E5")) {
                    E5.setStyle("-fx-background-color: red;");
                    E5.setDisable(true);
                }
                if (botao.getId().equals("E6")) {
                    E6.setStyle("-fx-background-color: red;");
                    E6.setDisable(true);
                }
                if (botao.getId().equals("E7")) {
                    E7.setStyle("-fx-background-color: red;");
                    E7.setDisable(true);
                }
                if (botao.getId().equals("E8")) {
                    E8.setStyle("-fx-background-color: red;");
                    E8.setDisable(true);
                }
                if (botao.getId().equals("F1")) {
                    F1.setStyle("-fx-background-color: red;");
                    F1.setDisable(true);
                }
                if (botao.getId().equals("F2")) {
                    F2.setStyle("-fx-background-color: red;");
                    F2.setDisable(true);
                }
                if (botao.getId().equals("F3")) {
                    F3.setStyle("-fx-background-color: red;");
                    F3.setDisable(true);
                }
                if (botao.getId().equals("F4")) {
                    F4.setStyle("-fx-background-color: red;");
                    F4.setDisable(true);
                }
                if (botao.getId().equals("F5")) {
                    F5.setStyle("-fx-background-color: red;");
                    F5.setDisable(true);
                }
                if (botao.getId().equals("F6")) {
                    F6.setStyle("-fx-background-color: red;");
                    F6.setDisable(true);
                }
                if (botao.getId().equals("F7")) {
                    F7.setStyle("-fx-background-color: red;");
                    F7.setDisable(true);
                }
                if (botao.getId().equals("F8")) {
                    F8.setStyle("-fx-background-color: red;");
                    F8.setDisable(true);
                }
                if (botao.getId().equals("G1")) {
                    G1.setStyle("-fx-background-color: red;");
                    G1.setDisable(true);
                }
                if (botao.getId().equals("G2")) {
                    G2.setStyle("-fx-background-color: red;");
                    G2.setDisable(true);
                }
                if (botao.getId().equals("G3")) {
                    G3.setStyle("-fx-background-color: red;");
                    G3.setDisable(true);
                }
                if (botao.getId().equals("G4")) {
                    G4.setStyle("-fx-background-color: red;");
                    G4.setDisable(true);
                }
                if (botao.getId().equals("G5")) {
                    G5.setStyle("-fx-background-color: red;");
                    G5.setDisable(true);
                }
                if (botao.getId().equals("G6")) {
                    G6.setStyle("-fx-background-color: red;");
                    G6.setDisable(true);
                }
                if (botao.getId().equals("G7")) {
                    G7.setStyle("-fx-background-color: red;");
                    G7.setDisable(true);
                }
                if (botao.getId().equals("G8")) {
                    G8.setStyle("-fx-background-color: red;");
                    G8.setDisable(true);
                }

            }
        } catch (IOException e) {
            System.out.println("Erro ao ler as poltronas: " + e.getMessage());
        }
    }


    @FXML
    void btvoltarcompra(ActionEvent event) {
        Repositorio.resetarValores();
        cadeirasVerdes = new ArrayList<>();
        contadorPoltronas = 0;

        totalSelecionado.setText(Integer.toString(contadorPoltronas));
        // Defina a cor branca para todas as poltronas
        A1a.setDisable(false);
        A2.setDisable(false);
        A3.setDisable(false);
        A4.setDisable(false);
        A5.setDisable(false);
        A6.setDisable(false);
        A7.setDisable(false);
        A8.setDisable(false);
        B1.setDisable(false);
        B2.setDisable(false);
        B3.setDisable(false);
        B4.setDisable(false);
        B5.setDisable(false);
        B6.setDisable(false);
        B7.setDisable(false);
        B8.setDisable(false);
        C1.setDisable(false);
        C2.setDisable(false);
        C3.setDisable(false);
        C4.setDisable(false);
        C5.setDisable(false);
        C6.setDisable(false);
        C7.setDisable(false);
        C8.setDisable(false);
        D1.setDisable(false);
        D2.setDisable(false);
        D3.setDisable(false);
        D4.setDisable(false);
        D5.setDisable(false);
        D6.setDisable(false);
        D7.setDisable(false);
        D8.setDisable(false);
        E1.setDisable(false);
        E2.setDisable(false);
        E3.setDisable(false);
        E4.setDisable(false);
        E5.setDisable(false);
        E6.setDisable(false);
        E7.setDisable(false);
        E8.setDisable(false);
        F1.setDisable(false);
        F2.setDisable(false);
        F3.setDisable(false);
        F4.setDisable(false);
        F5.setDisable(false);
        F6.setDisable(false);
        F7.setDisable(false);
        F8.setDisable(false);
        G1.setDisable(false);
        G2.setDisable(false);
        G3.setDisable(false);
        G4.setDisable(false);
        G5.setDisable(false);
        G6.setDisable(false);
        G7.setDisable(false);
        G8.setDisable(false);
        A1a.setStyle("-fx-background-color: white;");
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
}

