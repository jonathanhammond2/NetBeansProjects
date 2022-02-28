
package com.mycompany.mavenproject2;

import javafx.scene.control.TabPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author family
 */
public class ShapePane extends TabPane {
    
    //A TabPane object needs Tab objects
    //Before we go on, let's build a ShapeTab class for our tabs
    //Once that's done, let's have an array of ShapeTab objects
    
    private ShapeTab[] theTabs;
    private int nTabs;
    
    public ShapePane(int nTabs){
        this.nTabs = nTabs;
        theTabs = new ShapeTab[nTabs];
        //instantiate a JavaFX Circle for each ShapeTab
        for (int i = 0; i<nTabs; i++){
            double radius = (i+3)*30;
            Circle circle = new Circle(radius);
            circle.setFill(Color.rgb(255-50*i,0,i*50));
            //build a ShapeTab object with that Circle object
            theTabs[i] = new ShapeTab(circle, "Tab " + i);
            getTabs().add(theTabs[i]);
        }
    }
    
}
