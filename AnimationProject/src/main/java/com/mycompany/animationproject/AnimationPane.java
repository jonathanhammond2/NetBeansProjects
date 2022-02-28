package com.mycompany.animationproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.SequentialTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.util.Duration;

/**
 *
 * @author family
 */
//We choose Pane because we want to place each individual object
public class AnimationPane extends Pane {
    private Circle animCircle;
    
    public AnimationPane(){
        Image image = null;
        try {
            image = new Image(new FileInputStream("src/images/recursiveTrump.gif"));
                    
                    
                    } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
        //Image is the image data; ImageView is a powerful object that contains
        //and displays (and manipulates) image data
        ImageView imageViewDJT = new ImageView(image);
        getChildren().add(imageViewDJT);
        imageViewDJT.setPreserveRatio(true);
        imageViewDJT.setFitHeight(320);
        
        
        animCircle = new Circle(100,100,50);
        animCircle.setFill(Color.BLUE);
        getChildren().add(animCircle);
        
        //fade an object in and out using a FadeTransition object
        //transitions have a duration and a target
//        FadeTransition fadeT = new FadeTransition(Duration.millis(1000), animCircle);
//        fadeT.setFromValue(1.0); //fully opaque
//        fadeT.setToValue(0); //mostly transparent
//        fadeT.setCycleCount(80000);
//        fadeT.setAutoReverse(true);
//        fadeT.play();
        
        //path transition moves the object
        //create a path object and add element objects to it that 
        //can move the object to a location, have the object travel along a path,
        //a stragiht line, or along curved lines
        Path path = new Path();
        //add to the list of stopping points for the path
        path.getElements().add(new MoveTo(200,300));
        path.getElements().add(new LineTo(300,200));
        path.getElements().add(new CubicCurveTo(100,100,200,200,50,50));
        //build a PathTransition that has a duration, a path, and a target
        PathTransition pathT = new PathTransition(Duration.millis(6000), path, animCircle);
        
        pathT.setCycleCount(2);
        pathT.setAutoReverse(true);
        pathT.play();
        
        SequentialTransition seqT = new SequentialTransition();
        seqT.getChildren().addAll(pathT);
        seqT.play();
      
    }
}
