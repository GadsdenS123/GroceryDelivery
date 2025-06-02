package com.example.grocerydeliveryapplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author : GadsdenS123
 * @Description :
 * @created : 2025-06-01, Sunday
**/

public class GroceryApplication2 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GroceryApplication2.class.getResource("GroceryMarket.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(getClass().getResource("moderna.css").toExternalForm());
        stage.setTitle("Grocery Market");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch();
    }
}

