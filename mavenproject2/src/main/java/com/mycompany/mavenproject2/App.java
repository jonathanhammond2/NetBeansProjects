package com.mycompany.mavenproject2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        //The start method provides us a Stage object, and we can create more
        //We need to decide what goes in the Scene
        //Let's build a ShapePane
        ShapePane theShapes = new ShapePane(5);
        
        Scene scene = new Scene(theShapes, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}