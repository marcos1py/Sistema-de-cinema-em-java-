package com.example.pi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import com.example.pi.ResetarArquivos;
public class Main extends Application {

    private static Stage stage;
    private static Scene telaLogin;
    private static Scene pagUsuarioFilme;
    private static Scene pagFilmeComprar;
    private static Scene pagTipoIngresso;

    private static Scene pagCadastro;
    private static Scene pagEstatisticas;

    private PagUsuarioFilmeController usuarioFilmeController;
    private PagFilmeComprarController filmeComprarController;
    private PagTipoIngressoController tipoIngressoController;
    private PagEstatisticasController estatisticasController;


    @Override
    public void start(Stage primaryStage) throws IOException {
        stage = primaryStage;

        Parent fxmlLogin = FXMLLoader.load(getClass().getResource("TelaLogin.fxml"));
        telaLogin = new Scene(fxmlLogin, 1400, 800);

        FXMLLoader loaderUsuarioFilme = new FXMLLoader(getClass().getResource("PagUsuarioFilme.fxml"));
        Parent fxmlPagUsuarioFilme = loaderUsuarioFilme.load();
        usuarioFilmeController = loaderUsuarioFilme.getController();

        FXMLLoader loaderFilmeComprar = new FXMLLoader(getClass().getResource("PagFilmeComprar.fxml"));
        Parent fxmlPagFilmeComprar = loaderFilmeComprar.load();
        filmeComprarController = loaderFilmeComprar.getController();
        usuarioFilmeController.setFilmeComprarController(filmeComprarController);

        pagUsuarioFilme = new Scene(fxmlPagUsuarioFilme, 1400, 800);
        pagFilmeComprar = new Scene(fxmlPagFilmeComprar, 1400, 800);

        FXMLLoader loaderPagTipoIngresso = new FXMLLoader(getClass().getResource("PagTipoIngresso.fxml"));
        Parent fxmlPagTipoIngresso = loaderPagTipoIngresso.load();
        tipoIngressoController = loaderPagTipoIngresso.getController();
        filmeComprarController.setPagTipoIngressoController(tipoIngressoController);
        pagTipoIngresso = new Scene(fxmlPagTipoIngresso, 1400, 800);

        FXMLLoader loaderPagCadastro = new FXMLLoader(getClass().getResource("PagCadastro.fxml"));
        Parent fxmlPagCadastro = loaderPagCadastro.load();

        PagCadastroController cadastroController = loaderPagCadastro.getController();
        cadastroController.setUsuarioFilmeController(usuarioFilmeController);
        pagCadastro = new Scene(fxmlPagCadastro, 1400, 800);

        FXMLLoader loaderPagEstatisticas = new FXMLLoader(getClass().getResource("PagEstatisticas.fxml"));
        Parent fxmlPagEstatisticas = loaderPagEstatisticas.load();
        estatisticasController = loaderPagEstatisticas.getController();

        pagEstatisticas = new Scene(fxmlPagEstatisticas, 1400, 800);

        filmeComprarController.setPagEstatisticasController(estatisticasController);

        ResetarArquivos.resetar_tudo();
        primaryStage.setScene(pagUsuarioFilme);
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
            case "cadastro":
                stage.setScene(pagCadastro);
                break;
            case "estatisticas":
                stage.setScene(pagEstatisticas);
                break;
        }
    }

    public void setPagEstatisticasController(PagEstatisticasController controller) {
        this.estatisticasController = controller;
    }
}
