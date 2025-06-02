package com.example.grocerydeliveryapplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author : GadsdenS123
 * @Description :
 * @created : 2025-05-20, Tuesday
 **/

public class GroceryApplication extends Application
{
    @Override
    public void start(Stage stage) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(GroceryApplication.class.getResource("GroceryAccount.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(getClass().getResource("moderna.css").toExternalForm());
        stage.setTitle("Grocery Delivery");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch();
    }
}
