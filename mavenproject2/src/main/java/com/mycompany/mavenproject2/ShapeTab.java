package com.mycompany.mavenproject2;

import java.util.Random;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

/**
 *
 * @author family
 */
public class ShapeTab extends Tab {
    //ShapeTab will display by default a Shape object that is provided to it
    private Shape theShape;
    //Step 1
    private Button changeColor;
    
    private Random rand = new Random();

    public ShapeTab(Shape theShape, String string) {
        super(string);
        this.theShape = theShape;
        //Step 2
        changeColor = new Button("Change color"); 
        //Let's build the display of the tab
        //Use HBox object for the shape
        BorderPane shapeBox = new BorderPane();
        //Add the Shape object to the HBox list of things it displays--its children
        shapeBox.getChildren().add(theShape); //use addAll to add multiple children
        //Step 3
        shapeBox.getChildren().add(changeColor);
        //Tell the Tab that shapeBox is its content
        setContent(shapeBox);
       
        shapeBox.setCenter(this.theShape);
        shapeBox.setTop(changeColor);
        setContent(shapeBox);
        
        
        //Step 4 set eventhandler
        changeColor.setOnAction(this::processButtonPress);
        //The :: means the processButtonPress method in this object
        
       
    }
    
    public void processButtonPress(ActionEvent evt){
        Color newColor;
//         while(true){
//            newColor = Color.rgb(rand.nextInt(256), rand.nextInt(256),
//                rand.nextInt(256));
//        theShape.setFill(newColor);
//        }
        newColor = Color.rgb(rand.nextInt(256), rand.nextInt(256),
                rand.nextInt(256));
        theShape.setFill(newColor);
    }
    
}
