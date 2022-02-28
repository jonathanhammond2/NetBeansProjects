package com.mycompany.animationproject;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import static javafx.print.PrintColor.COLOR;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

/**
 *
 * @author family
 */
public class KeyFrameEventPane extends Pane{
    private Circle circEvent;
    private double dx = 2.0;
    private double dy = 3.0;
    
    public KeyFrameEventPane(){
        circEvent = new Circle(80, Color.BLUE);
        circEvent.relocate(400,200);
        getChildren().add(circEvent);
        
        //KeyFrame animation requires a Timeline object
        Timeline tlCirc = new Timeline();
        //Se tup a KeyFrame that fires an event every 10 milliseconds
        //and invokes its own event listener
        KeyFrame kfCirc = new KeyFrame(Duration.millis(10), new CircAnimate());
        tlCirc.getKeyFrames().add(kfCirc);
        tlCirc.setCycleCount(Timeline.INDEFINITE);
        tlCirc.play();
        
    }
    
    private class CircAnimate implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent t) {
            //get the current location
            double cx = circEvent.getLayoutX();
            double cy = circEvent.getLayoutY();
            double radius = circEvent.getRadius();
            
            //neat trick to get the boundaries of the window
            Bounds bounds = getBoundsInLocal();
            
            if(cx <= bounds.getMinX() + radius || 
                    cx >= bounds.getMaxX() - radius){
                    dx = -dx;
//                    circEvent.setLayoutX(bounds.getMinX()+1);
            }
            
            if(cy <= bounds.getMinY() + radius || 
                    cy >= bounds.getMaxY() - radius){
                dy = -dy;
//                circEvent.setLayoutY(bounds.getMinY()+1);
            }
            
            //update the position
            circEvent.setLayoutX(cx + dx);
            circEvent.setLayoutY(cy + dy);
        }
        
    }
}
