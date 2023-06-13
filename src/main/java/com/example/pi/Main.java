package com.example.pi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
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

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("TelaLogin.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}