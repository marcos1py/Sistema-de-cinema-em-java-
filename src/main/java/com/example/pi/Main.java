package com.example.pi;

import javafx.application.Application;
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

    private PagUsuarioFilmeController usuarioFilmeController;

    @Override
    public void start(Stage primaryStage) throws IOException {
        stage = primaryStage;

        Parent fxmlLogin = FXMLLoader.load(getClass().getResource("TelaLogin.fxml"));
        telaLogin = new Scene(fxmlLogin, 1200, 600);

        FXMLLoader loaderUsuarioFilme = new FXMLLoader(getClass().getResource("PagUsuarioFilme.fxml"));
        Parent fxmlPagUsuarioFilme = loaderUsuarioFilme.load();
        usuarioFilmeController = loaderUsuarioFilme.getController();

        pagUsuarioFilme = new Scene(fxmlPagUsuarioFilme, 1200, 600);

        Parent fxmlPagFilmeComprar = FXMLLoader.load(getClass().getResource("PagFilmeComprar.fxml"));
        pagFilmeComprar = new Scene(fxmlPagFilmeComprar, 1200, 600);

        Parent fxmlPagTipoIngresso = FXMLLoader.load(getClass().getResource("PagTipoIngresso.fxml"));
        pagTipoIngresso = new Scene(fxmlPagTipoIngresso, 1200, 600);

        Parent fxmlPagTipoPagamento = FXMLLoader.load(getClass().getResource("PagTipoPagamento.fxml"));
        pagTipoPagamento = new Scene(fxmlPagTipoPagamento, 1200, 600);

        FXMLLoader loaderPagCadastro = new FXMLLoader(getClass().getResource("PagCadastro.fxml"));
        Parent fxmlPagCadastro = loaderPagCadastro.load();

        PagCadastroController cadastroController = loaderPagCadastro.getController();
        cadastroController.setUsuarioFilmeController(usuarioFilmeController);

        pagCadastro = new Scene(fxmlPagCadastro, 1200, 600);

        Parent fxmlPagEstatisticas = FXMLLoader.load(getClass().getResource("PagEstatisticas.fxml"));
        pagEstatisticas = new Scene(fxmlPagEstatisticas, 1200, 600);

        primaryStage.setScene(pagCadastro);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }



    public static void mudarTela(String scr) {
        switch (scr) {
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


}
