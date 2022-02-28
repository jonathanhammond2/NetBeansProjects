package com.mycompany.animationproject;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        AnimationPane animPane = new AnimationPane();
        Scene scene = new Scene(animPane, 640, 480);
        stage.setScene(scene);
        scene.setFill(Color.BLACK);
//        stage.show();
        
        KeyFramePane kfPane = new KeyFramePane();
        Scene kfScene = new Scene(kfPane, 640, 480);
        Stage kfStage = new Stage();
        kfStage.setScene(kfScene);
//        kfStage.show();
        kfStage.setX(640);
        kfStage.setY(30);
        stage.setScene(scene);
        scene.setFill(Color.BLACK);
        kfScene.setFill(Color.BLACK);
//        kfStage.show();
//        stage.show();
        
        KeyFrameEventPane kfePane = new KeyFrameEventPane();
        Scene kfeScene = new Scene(kfePane, 640,480);
        Stage kfeStage = new Stage();
        kfeStage.setScene(kfeScene);
//        kfeStage.show();
        kfeStage.setX(0);
        kfeStage.setX(511);
        
        MenuBarPane mbPane = new MenuBarPane();
        Scene mbScene = new Scene(mbPane);
//        Scene mbScene = new Scene(mbPane, 640, 480);
        Stage mbStage = new Stage();
        mbStage.setScene(mbScene);
        mbStage.show();
        mbStage.setX(640);
        mbStage.setY(30);
        stage.setScene(mbScene);
        mbScene.setFill(Color.BLACK);
        mbScene.setFill(Color.BLACK);
        stage.show();
        
    }

    public static void main(String[] args) {
        launch();
    }

}