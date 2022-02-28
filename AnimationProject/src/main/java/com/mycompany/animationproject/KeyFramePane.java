package com.mycompany.animationproject;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

/**
 *
 * @author family
 */
public class KeyFramePane extends Pane{
    private Circle circTimeLine;
    
    public KeyFramePane() {
        circTimeLine = new Circle(100,50,100);
        circTimeLine.setFill(Color.BLUE);
        getChildren().add(circTimeLine);
        
        //A timeline object contains a serises of KeyFrames.
        //A keyfFrame object ahs a duration and a KeyValue
        //A KeyValue object has a target, a value to be affected, and a target value
        
        Timeline timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);
        KeyValue kvx = new KeyValue(circTimeLine.centerXProperty(), 300);
        KeyValue kvy = new KeyValue(circTimeLine.centerYProperty(), 400);
        KeyFrame kf = new KeyFrame(Duration.millis(100), kvx, kvy);
        KeyValue kvr = new KeyValue(circTimeLine.radiusProperty(), 300);
        KeyFrame kfr = new KeyFrame(Duration.millis(50), kvr);
        timeline.getKeyFrames().addAll(kf, kfr);
        timeline.play();
        


        
                
    }
}
