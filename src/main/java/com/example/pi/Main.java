package com.example.pi;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
   private static Stage stage;
   private static Scene telaLogin;
   private static Scene pagUsuarioFilme;
   private static Scene pagFilmeComprar;
   private static Scene pagTipoIngresso;
   private static Scene pagTipoPagamento;
   private static Scene pagTipoPagamentoPainel;

   private static Scene pagCadastro;

   private static Scene pagEstatisticas;

    @Override
    public void start(Stage estagioPrimario) throws IOException {
        stage = estagioPrimario;

        Parent fxmlLogin = FXMLLoader.load(getClass().getResource("TelaLogin.fxml"));
        telaLogin = new Scene(fxmlLogin, 1200, 600);

        Parent fxmlPagUsuarioFilme = FXMLLoader.load(getClass().getResource("PagUsuarioFilme.fxml"));
        pagUsuarioFilme = new Scene(fxmlPagUsuarioFilme, 1200, 600);

        Parent fxmlPagFilmeComprar = FXMLLoader.load(getClass().getResource("PagFilmeComprar.fxml"));
        pagFilmeComprar = new Scene(fxmlPagFilmeComprar, 1200, 600);

        Parent fxmlPagTipoIngresso = FXMLLoader.load(getClass().getResource("PagTipoIngresso.fxml"));
        pagTipoIngresso = new Scene(fxmlPagTipoIngresso, 1200, 600);

        Parent fxmlPagTipoPagamento = FXMLLoader.load(getClass().getResource("PagTipoPagamento.fxml"));
        pagTipoPagamento = new Scene(fxmlPagTipoPagamento, 1200, 600);

        Parent fxmlPagTipoPagamentoPainel = FXMLLoader.load(getClass().getResource("PagTipoPagamentoPainel.fxml"));
        pagTipoPagamentoPainel = new Scene(fxmlPagTipoPagamentoPainel, 1200, 600);

        Parent fxmlPagCadastro = FXMLLoader.load(getClass().getResource("PagCadastro.fxml"));
        pagCadastro = new Scene(fxmlPagCadastro, 1200, 600);

        Parent fxmlPagEstatisticas = FXMLLoader.load(getClass().getResource("PagEstatisticas.fxml"));
        pagEstatisticas = new Scene(fxmlPagEstatisticas, 1200, 600);

        estagioPrimario.setScene(pagUsuarioFilme);
        stage.show();

    }
    public static void mudarTela (String scr){
        switch (scr){
            case "login":
                stage.setScene(telaLogin);
                break;
            case "usuariofilme":
                stage.setScene(pagUsuarioFilme);
                break;
            case "filmecomprar":
                stage.setScene(pagFilmeComprar);
                break;
            case "tipoingresso":
                stage.setScene(pagTipoIngresso);
                break;
            case "pagamento":
                stage.setScene(pagTipoPagamento);
                break;
            case "pagamentopainel":
                stage.setScene(pagTipoPagamentoPainel);
                break;
            case "cadastro":
                stage.setScene(pagCadastro);
                break;
            case "estatisticas":
                stage.setScene(pagEstatisticas);
                break;
        }
    }
    public static void main(String[] args) {
        launch();
    }
}