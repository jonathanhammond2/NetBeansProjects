package com.mycompany.tabtest;

import java.util.LinkedList;
import java.util.Random;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Rectangle;
//import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import static com.mycompany.tabtest.SortSearchAlgs.*;
import javafx.animation.PathTransition;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.util.Duration;
//import com.mycompany.sortsearchalgs.SortSearchAlgs.*;






/**
 *
 * @author rwhitnel
 */
public class SortTab extends Tab {
    // ShapeTab will display by default a Shape object that is provided to it
//    private Shape[] sortShapes;
//    private LinkedList<sortShape> sortShapes = new LinkedList<>();
    // Step 1
    private final Button randomize;
    private final Button addElement;
    private final Button removeElement;
    private final Button quickSort;
    private final Button animate;
    private final Random rand = new Random();
    LinkedList<Text> txt = new LinkedList<>();
    sortText text = new sortText();
//    int[] nums = new int[];

    public SortTab(String string) {
        super(string);
//        this.theShape = theShape;
        // Step 2
        randomize = new Button("Randomize");
        addElement = new Button("Add Element");
        removeElement = new Button("Remove Element");
        quickSort = new Button("quickSort");
        animate = new Button("swap elements");

        // Let's build the display of the tab
        // Use HBox object for the shape
//        HBox shapeBox = new HBox();
//        // Add the Shape object to the HBox list of things it displays--its children
//        shapeBox.getChildren().add(theShape);
//        // Step 3
//        shapeBox.getChildren().add(changeColor);
//        // Tell the Tab that shapeBox is its content
        BorderPane shapeBox = new BorderPane();
//        shapeBox.setCenter(this.theShape);
        shapeBox.setTop(randomize);
        shapeBox.setCenter(quickSort);
        shapeBox.setBottom(animate);
//        shapeBox.getChildren().addAll(randomize, addElement, removeElement, quickSort);
        
//        sortShape ss = new sortShape(20,20,100,100);
        for (int i = 0; i<10; i++){
            txt.add(new Text(20.*i,150.,i+""));
            text.add(new Text(20.*i,150,i+""));
            shapeBox.getChildren().add(text.get(i));
        }
        
        
        
            
       
//        txt.setFill(Color.rgb(0,50,0));
//        txt.
        
        
//        shapeBox.getChildren().add(ss);
//        shapeBox.getChildren().add(txt);
        setContent(shapeBox);
        
//        sortShapes.add(i, ss);
//        setContent(ss);
//        for (int i = 0; i<10; i++){
//            sortShape ss = new sortShape(20,20,100 + 50*i,100);
//            sortShapes.add(i, ss);
//            setContent(ss);
            
//        }
        
//        super.setContent
        // Step 5
        randomize.setOnAction(this::processButtonPress);
        quickSort.setOnAction(this::processButtonPress);
        animate.setOnAction(this::processButtonPress);

//        animateSwitchElements(0,1);
        // The :: means the processButtonPress method in this object
        
//        for (int i = 0; i<10; i++){
//            
//        }
        
   }
   public void swapTxtElements(int i, int j){
       Text temp = txt.get(i);
       txt.set(i, txt.get(j));
       txt.set(j, temp);
//        int[] nums = new int[txt.size()];
//        for (int k = 0; k<txt.size(); k++){
//            nums[k]=Integer.parseInt(txt.get(k).getText());
//        }
//        quickSort(nums,0,txt.size());
//            
//            for (int l = 0; l<txt.size(); l++){
//            txt.get(l).setText(nums[l] + "");}
   }
    
    
    public void animateSwitchElements(LinkedList<Text> t, int i, int j){
        LinkedList<Text> txt2 = (LinkedList<Text>) txt.clone();
        
//        swapTxtElements(i, j);
        Path path = new Path();
        Path path2 = new Path();
        
        
//        int toX = (int) (txt.get(i).getX()+txt.get(j).getX())/2;
        double X = t.get(i).getX()+4;
        double Y = t.get(i).getY()-4.5;
        
        double X2 = t.get(j).getX()+4;
        double Y2 = t.get(j).getY()-4.5;
        
        double toX = (X + X2)/2;
//        toX = 100;
        
//        path.getElements().add(new MoveTo(200,300));
//        path.getElements().add(new LineTo(300,200));
        path.getElements().addAll(new MoveTo(X,Y),new LineTo(toX,125), new LineTo(X2,Y2));
        path2.getElements().addAll(new MoveTo(X2,Y2),new LineTo(toX, 125), new LineTo(X,Y));//        path.getElements().add(new CubicCurveTo(100,100,200,200,50,50));
        //build a PathTransition that has a duration, a path, and a target
//        PathTransition pathT = new PathTransition(Duration.millis(6000), path, animCircle);
        
        
        PathTransition pathT = new PathTransition(Duration.millis(2000), path, t.get(i));
        PathTransition pathT2 = new PathTransition(Duration.millis(2000), path2, t.get(j));

        pathT.setCycleCount(1);
        pathT.play();
        
        pathT2.setCycleCount(1);
        pathT2.play();
    }
    
//    public void swapTxtElements
    // Step 4
    public void processButtonPress(ActionEvent evt) {
//        Color newColor = Color.rgb(rand.nextInt(256), rand.nextInt(256),
//                rand.nextInt(256));
        
//        theShape.setFill(newColor);
        if (evt.getTarget().equals(randomize)){
            for (int i = 0; i<text.size(); i++){
            text.get(i).setText(rand.nextInt(text.size()) + "");
            }
        }
        else if (evt.getTarget().equals(animate)){
            animateSwitchElements(text,0,1);
//              swapTxtElements(0,1);
        }
        else {
            int[] nums = new int[text.size()];
            for (int i = 0; i<text.size(); i++){
                nums[i]=Integer.parseInt(text.get(i).getText());
            }
//            quickSort(nums,0,text.size());
            text.quickSortTxt(0, text.size());
            
            for (int i = 0; i<text.size(); i++){
            text.get(i).setText(nums[i] + "");
//            txt.get(i).
//            txt.get(i).applyCss();
            }
            
        }
        
    }
    
}
