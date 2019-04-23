/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week14groupprojectsubwayordersystem;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Version 1: This GUI is comprised of an HBox to the left that contains menu 
 * options and an HBox to the right that contains the logo and sandwich info.
 * Both the left and right HBoxes have been combined into one HBox for the scene.
 * @author Brentlee
 */
public class Week14GroupProjectSubwayOrderSystem extends Application {    
    @Override
    public void start(Stage primaryStage) {
        //create Size Of Sandwich TextField
        TextField tfSandwichSize = new TextField("Size Of Sandwich");
        tfSandwichSize.setAlignment(Pos.BASELINE_CENTER);
        tfSandwichSize.setPrefColumnCount(30);
        tfSandwichSize.setEditable(false);
        
        //create Bread Type drop menu
        ComboBox<String> cboBreadType = new ComboBox<>();
        cboBreadType.getItems().addAll("Bread Type:----"
                + "                                                                     ",
                "Bread 1", "Bread 2", "Bread 3");
        cboBreadType.setValue("Bread Type:----");
        
        //create Bread Type drop menu
        ComboBox<String> cboMeatType = new ComboBox<>();
        cboMeatType.getItems().addAll("Meat Type:----"
                + "                                                                      ",
                "Meat 1", "Meat 2", "Meat 3");
        cboMeatType.setValue("Meat Type:----");
        
        //create Bread Type drop menu
        ComboBox<String> cboCheeseType = new ComboBox<>();
        cboCheeseType.getItems().addAll("Cheese Type:----"
                + "                                                                  ",
                "Cheese 1", "Cheese 2", "Cheese 3");
        cboCheeseType.setValue("Cheese Type:----");

        //create size radio buttons
        RadioButton rbSmall = new RadioButton("Small");
        RadioButton rbHalf = new RadioButton("Half");
        RadioButton rbFull = new RadioButton("Full");
        
        //add radio buttons to toggle group
        ToggleGroup group = new ToggleGroup();
        rbSmall.setToggleGroup(group);
        rbHalf.setToggleGroup(group);
        rbFull.setToggleGroup(group);
        
        //create Veggie text field
        TextField tfVeggies = new TextField("Veggies (Pick Up to Three)");
        tfVeggies.setAlignment(Pos.BASELINE_CENTER);
        tfVeggies.setPrefColumnCount(30);
        tfVeggies.setEditable(false);
        
        //create Veggie Type 1 drop menu
        ComboBox<String> cboVeggieType1 = new ComboBox<>();
        cboVeggieType1.getItems().addAll("Veggie 1:----", "Veggie 1", "Veggie 2", "Veggie 3");
        cboVeggieType1.setValue("Veggie 1:----");
        
        //create Veggie Type 2 drop menu
        ComboBox<String> cboVeggieType2 = new ComboBox<>();
        cboVeggieType2.getItems().addAll("Veggie 2:----", "Veggie 1", "Veggie 2", "Veggie 3");
        cboVeggieType2.setValue("Veggie 2:----");
        
        //create Veggie Type 3 drop menu
        ComboBox<String> cboVeggieType3 = new ComboBox<>();
        cboVeggieType3.getItems().addAll("Veggie 3:----", "Veggie 1", "Veggie 2", "Veggie 3");
        cboVeggieType3.setValue("Veggie 3:----");
        
        //create Veggie Type 3 drop menu
        ComboBox<String> cboSauceType = new ComboBox<>();
        cboSauceType.getItems().addAll("Sauce Type:----"
                + "                                                                    ",
                "Sauce 1", "Sauce 2", "Sauce 3");
        cboSauceType.setValue("Sauce Type:----");
        
        //create Salt & Pepper TextField
        TextField tfSaltNPepper = new TextField("Salt & Pepper");
        tfSaltNPepper.setAlignment(Pos.BASELINE_CENTER);
        tfSaltNPepper.setPrefColumnCount(16);
        tfSaltNPepper.setEditable(false);
        
        //create Salt & Pepper radio buttons
        RadioButton rbYes = new RadioButton("Yes");
        RadioButton rbNo = new RadioButton("No");
        
        //add radio buttons to toggle group
        ToggleGroup grpSaltNPepper = new ToggleGroup();
        rbYes.setToggleGroup(grpSaltNPepper);
        rbNo.setToggleGroup(grpSaltNPepper);
        
        //create HBox for Salt & Pepper tf and rb's.
        HBox hBoxSaltNPepper = new HBox(5);
        hBoxSaltNPepper.setAlignment(Pos.BASELINE_LEFT);
        hBoxSaltNPepper.getChildren().addAll(tfSaltNPepper, rbYes, rbNo);
        
        //create HBox for Veggie Types
        HBox hBoxVeggies = new HBox(5);
        hBoxVeggies.setAlignment(Pos.BASELINE_LEFT);
        hBoxVeggies.getChildren().addAll(cboVeggieType1, cboVeggieType2, cboVeggieType3);

        //create HBox for Menu Options
        HBox hbMenuOptions = new HBox(5);
        hbMenuOptions.setAlignment(Pos.BASELINE_LEFT);
        hbMenuOptions.getChildren().add(tfSandwichSize);
        
        //create Size of Sandwhich radio button HBox
        HBox hBoxSandwhichSize = new HBox(5);
        hBoxSandwhichSize.setAlignment(Pos.BASELINE_LEFT);
        hBoxSandwhichSize.getChildren().addAll(rbSmall, rbHalf, rbFull);
        
        //create HBox for tfVeggies
        HBox hBoxtfVeggies = new HBox(5);
        hBoxtfVeggies.setAlignment(Pos.BASELINE_LEFT);
        hBoxtfVeggies.getChildren().addAll(tfVeggies);

        //create VBox and add all menu options
        VBox vBoxMenu = new VBox();
        vBoxMenu.getChildren().addAll(hbMenuOptions, hBoxSandwhichSize, cboBreadType, 
                cboMeatType, cboCheeseType, hBoxtfVeggies, hBoxVeggies,
                cboSauceType, hBoxSaltNPepper);
        
        //create subway logo
        ImageView imageView = new ImageView(new Image(
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSoWrVEYcm36WCLyYgENRhkwwIl4x9IgQqneFFoIS30vHm4_2QK"));
        
        //create Size Of Sandwich TextField
        TextField tfYourSandwich = new TextField("Your Sandwich");
        tfYourSandwich.setAlignment(Pos.BASELINE_CENTER);
        tfYourSandwich.setPrefColumnCount(30);
        tfYourSandwich.setEditable(false);
        
        //create text area 
        //(Should probably be added to a scrollpane)
        TextArea taSandwichInfo = new TextArea("Sandwich info will populate here"
                + " when the user selects an option. Along with the total/subtotal.");
        taSandwichInfo.setPrefColumnCount(30);
        taSandwichInfo.setPrefRowCount(15);
        taSandwichInfo.setWrapText(true);
        taSandwichInfo.setStyle("-fx-text-fill: black");
        taSandwichInfo.setFont(Font.font("Times", 14));
        
        //create vbox for subway logo, text feild, and text area.
        VBox rightSideVBox = new VBox();
        rightSideVBox.getChildren().addAll(imageView, tfYourSandwich, taSandwichInfo);
        
        //create HBox for vBox Right
        HBox RightHBoxForVBox = new HBox(5);
        RightHBoxForVBox.getChildren().addAll(rightSideVBox);
        
        //create HBox for vBox Left
        HBox LeftHBoxForVBox = new HBox(5);
        LeftHBoxForVBox.getChildren().addAll(vBoxMenu);
        
        //create hBox to house everything
        HBox LeftAndRightHBoxes = new HBox(5);
        LeftAndRightHBoxes.getChildren().addAll(LeftHBoxForVBox,RightHBoxForVBox);

        //create scene
        Scene scene = new Scene(LeftAndRightHBoxes, 775, 500);
        primaryStage.setTitle("Week 14 Group Project: Subway Order System");
        primaryStage.setScene(scene);
        primaryStage.show();

        //set radio button actions 
        //(NOT PERMANENT)
        rbSmall.setOnAction(e -> tfSandwichSize.setAlignment(Pos.BASELINE_LEFT));
        rbHalf.setOnAction(e -> tfSandwichSize.setAlignment(Pos.BASELINE_CENTER));
        rbFull.setOnAction(e -> tfSandwichSize.setAlignment(Pos.BASELINE_RIGHT));
        rbYes.setOnAction(e -> tfSaltNPepper.setAlignment(Pos.BASELINE_LEFT));
        rbNo.setOnAction(e -> tfSaltNPepper.setAlignment(Pos.BASELINE_RIGHT));
    }//end public void start(Stage primaryStage)
    
    public static void main(String[] args) {
        launch(args);   
    }
}//end public class Week14GroupProjectSubwayOrderSystem extends Application
