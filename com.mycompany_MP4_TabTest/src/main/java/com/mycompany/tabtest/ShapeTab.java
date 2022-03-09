package com.mycompany.tabtest;

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
 * @author rwhitnel
 */
public class ShapeTab extends Tab {
    // ShapeTab will display by default a Shape object that is provided to it
    private Shape theShape;
    // Step 1
    private Button changeColor;
    private Random rand = new Random();

    public ShapeTab(Shape theShape, String string) {
        super(string);
        this.theShape = theShape;
        // Step 2
        changeColor = new Button("Change color");
        // Let's build the display of the tab
        // Use HBox object for the shape
//        HBox shapeBox = new HBox();
//        // Add the Shape object to the HBox list of things it displays--its children
//        shapeBox.getChildren().add(theShape);
//        // Step 3
//        shapeBox.getChildren().add(changeColor);
//        // Tell the Tab that shapeBox is its content
        BorderPane shapeBox = new BorderPane();
        shapeBox.setCenter(this.theShape);
        shapeBox.setTop(changeColor);
        setContent(shapeBox);
        
        // Step 5
        changeColor.setOnAction(this::processButtonPress);
        // The :: means the processButtonPress method in this object
   }
    // Step 4
    public void processButtonPress(ActionEvent evt) {
        Color newColor = Color.rgb(rand.nextInt(256), rand.nextInt(256),
                rand.nextInt(256));
        theShape.setFill(newColor);
    }
    
}
