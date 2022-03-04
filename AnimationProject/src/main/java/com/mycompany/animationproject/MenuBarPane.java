package com.mycompany.animationproject;

import javafx.event.ActionEvent;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

/**
 *
 * @author family
 */
public class MenuBarPane extends BorderPane{
    private MenuBar menuBar;
    private Menu paneMenu;
    private MenuItem exitItem;
    private RadioMenuItem apItem, kfItem, kfeItem;
    private AnimationPane apPane;
    private KeyFramePane kfPane;
    private KeyFrameEventPane kfePane;
    
    public MenuBarPane(){
        apPane = new AnimationPane();
        kfPane = new KeyFramePane();
        kfePane = new KeyFrameEventPane();
        
        //StackPane is a layout manager that puts each node that it contains
        //on top of each other...in a stack
        StackPane sp = new StackPane();
        sp.getChildren().addAll(apPane, kfPane, kfePane);
        
        setCenter(sp);
        
        apPane.setVisible(false);
        kfPane.setVisible(false);
        
        menuBar = new MenuBar();
        paneMenu = new Menu("Pane select");
        menuBar.getMenus().add(paneMenu);
        
        exitItem = new MenuItem("Exit");
        
        
        apItem = new RadioMenuItem("Animation");
        kfItem = new RadioMenuItem("KeyFrame");
        kfeItem = new RadioMenuItem("KeyFrameEvent");
        paneMenu.getItems().addAll(apItem, kfItem, kfeItem, exitItem);
        
        //Use a ToggleGroup to tell the program that only one of the pane menus should be selected
        
        ToggleGroup paneItemToggle = new ToggleGroup();
        apItem.setToggleGroup(paneItemToggle);
        kfItem.setToggleGroup(paneItemToggle);
        kfeItem.setToggleGroup(paneItemToggle);
        kfeItem.setSelected(true);
        
        exitItem.setOnAction(this::processMenu);
        kfItem.setOnAction(this::processMenu);
        kfeItem.setOnAction(this::processMenu);
        apItem.setOnAction(this::processMenu);
        setTop(menuBar);
    }
    
    public void processMenu(ActionEvent evt){
        //Get the specific menu item that generated the event
        MenuItem item = (MenuItem)evt.getSource();
        
        //set all the pane visiblities to false, then choose one to maek visible
        //based on evt
        
        apPane.setVisible(false);
        kfPane.setVisible(false);
        kfePane.setVisible(false);

        
        // switch (item){
        //     case (item==exitItem):
        //         break;
        // }
        if (item==exitItem){System.exit(0);}
        if (item==kfItem){kfPane.setVisible(true);}
        if (item==kfeItem){kfePane.setVisible(true);}
        if (item==apItem){apPane.setVisible(true);}
            
        
    }
}
