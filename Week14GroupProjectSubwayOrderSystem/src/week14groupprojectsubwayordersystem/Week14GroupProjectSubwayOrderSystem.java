/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week14groupprojectsubwayordersystem;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
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
        Label sizeLbl = new Label("Size of Sandwich");
        sizeLbl.setTextFill(Color.rgb(255,203,10));
        sizeLbl.setStyle("-fx-font-weight: bold");
        
        //create Bread Type drop menu
        Label breadTypeLbl = new Label("Bread Type:");
        breadTypeLbl.setTextFill(Color.rgb(255,203,10));
        breadTypeLbl.setStyle("-fx-font-weight: bold");
        ComboBox<String> cboBreadType = new ComboBox<>();
        cboBreadType.setValue("Select Your Bread");
        cboBreadType.setPrefWidth(250);
        cboBreadType.getItems().addAll(
            "9-Grain Wheat", "Italian", "Italian Herbs & Cheese",
            "Honey Oat", "Jalapeno Cheese", "Monterey Cheddar",
            "Parmesan Oregano", "Roasted Garlic", "Rosemary & Sea Salt");
        BorderPane breadBox = new BorderPane();
        breadBox.setLeft(breadTypeLbl);
        breadBox.setRight(cboBreadType);
        breadBox.setPadding(new Insets(10,10,10,10));
        
        //create Meat Type drop menu
        Label meatTypeLbl = new Label ("Meat Type: ");
        meatTypeLbl.setTextFill(Color.rgb(255,203,10));
        meatTypeLbl.setStyle("-fx-font-weight: bold");
        ComboBox<String> cboMeatType = new ComboBox<>();
        cboMeatType.getItems().addAll(
            "Turkey Breast", "Ham", "Chicken Breast", "Roast Beef",
            "Tuna", "Salami", "Beefsteak", "Bacon", "Meatballs","Pepperoni",
            "Turkey Bologna", "Shaved Steak");
        cboMeatType.setValue("Select Your Meat");
        cboMeatType.setPrefWidth(250);
        BorderPane meatBox = new BorderPane();
        meatBox.setLeft(meatTypeLbl);
        meatBox.setRight(cboMeatType);
        meatBox.setPadding(new Insets(10,10,10,10));
        
        //create Cheese Type drop menu
        Label cheeseTypeLbl = new Label("Cheese Type:");
        cheeseTypeLbl.setTextFill(Color.rgb(255,203,10));
        cheeseTypeLbl.setStyle("-fx-font-weight: bold");
        ComboBox<String> cboCheeseType = new ComboBox<>();
        cboCheeseType.getItems().addAll(
            "American", "Monterey Cheddar", "Feta", "Mozzarella",
            "Cheddar", "Pepperjack", "Provalone", "Swiss");
       cboCheeseType.setValue("Select Your Cheese");
       cboCheeseType.setPrefWidth(250);
       BorderPane cheeseBox = new BorderPane();
       cheeseBox.setLeft(cheeseTypeLbl);
       cheeseBox.setRight(cboCheeseType);
       cheeseBox.setPadding(new Insets(5,10,5,10));
       
        //create size radio buttons
        RadioButton rbSmall = new RadioButton("Small");
        rbSmall.setStyle("-fx-font-weight: bold");
        rbSmall.setTextFill(Color.WHITE);
        RadioButton rbHalf = new RadioButton("Half");
        rbHalf.setStyle("-fx-font-weight: bold");
        rbHalf.setTextFill(Color.WHITE);
        RadioButton rbFull = new RadioButton("Full");
        rbFull.setStyle("-fx-font-weight: bold");
        rbFull.setTextFill(Color.WHITE);
        
        //add radio buttons to toggle group
        ToggleGroup group = new ToggleGroup();
        rbSmall.setToggleGroup(group);
        rbHalf.setToggleGroup(group);
        rbFull.setToggleGroup(group);
        
        //create Veggie text field
        Label veggLbl = new Label("Veggies (Pick up to three)");
        veggLbl.setTextFill(Color.rgb(255,203,10));
        veggLbl.setStyle("-fx-font-weight: bold");
        
        //create Veggie Type 1 drop menu
        ComboBox<String> cboVeggieType1 = new ComboBox<>();
        cboVeggieType1.getItems().addAll(
            "Cucumbers", "Green Peppers", "Lettuce", "Red Onions",
            "Spinach", "Tomatoes", "Banana Peppers", "Jalapenos",
            "Black Olives", "Pickles");
        cboVeggieType1.setValue("Veggie 1");
        
        
        //create Veggie Type 2 drop menu
        ComboBox<String> cboVeggieType2 = new ComboBox<>();
        cboVeggieType2.getItems().addAll(
            "Cucumbers", "Green Peppers", "Lettuce", "Red Onions",
            "Spinach", "Tomatoes", "Banana Peppers", "Jalapenos",
            "Black Olives", "Pickles");
        cboVeggieType2.setValue("Veggie 2");
        
        //create Veggie Type 3 drop menu
        ComboBox<String> cboVeggieType3 = new ComboBox<>();
        cboVeggieType3.getItems().addAll(
            "Cucumbers", "Green Peppers", "Lettuce", "Red Onions",
            "Spinach", "Tomatoes", "Banana Peppers", "Jalapenos",
            "Black Olives", "Pickles");
        cboVeggieType3.setValue("Veggie 3");
        HBox hBoxVeggies = new HBox(5);
        hBoxVeggies.setAlignment(Pos.BASELINE_LEFT);
        hBoxVeggies.getChildren().addAll(cboVeggieType1, cboVeggieType2, cboVeggieType3);
        hBoxVeggies.setPadding(new Insets(10,10,5,10));
        
        //create Sauce Type drop menu
        Label sauceLbl = new Label("Sauce Type:");
        sauceLbl.setTextFill(Color.rgb(255,203,10));
        sauceLbl.setStyle("-fx-font-weight: bold");
        ComboBox<String> cboSauceType = new ComboBox<>();
        cboSauceType.setPrefWidth(250);
        cboSauceType.getItems().addAll(
            "Chipotle Southwest", "Light Mayonnaise", "Mayonnaise", "Ranch",
            "Oil", "Subway Vinaigrette", "Mustart", "Vinegar", "Sweet Onion",
            "Barbecue", "Buffalo", "Creamy Italian", "Golden Italian",
            "Savory Ceasar", "Sriracha", "Tzatziki Cucumber");
        cboSauceType.setValue("Pick Your Sauce");
        BorderPane sauceBox = new BorderPane();
        sauceBox.setLeft(sauceLbl);
        sauceBox.setRight(cboSauceType);
        sauceBox.setPadding(new Insets(10,10,5,10));
        
        //create Salt & Pepper TextField
        Label spLbl = new Label ("Salt & Pepper");
        spLbl.setTextFill(Color.rgb(255,203,10));
        spLbl.setStyle("-fx-font-weight: bold");
        
        //create Salt & Pepper radio buttons
        RadioButton rbYes = new RadioButton("Yes");
        rbYes.setStyle("-fx-font-weight: bold");
        rbYes.setTextFill(Color.WHITE);
        RadioButton rbNo = new RadioButton("No");
        rbNo.setStyle("-fx-font-weight: bold");
        rbNo.setTextFill(Color.WHITE);
        
        //add radio buttons to toggle group
        ToggleGroup grpSaltNPepper = new ToggleGroup();
        rbYes.setToggleGroup(grpSaltNPepper);
        rbNo.setToggleGroup(grpSaltNPepper);
        
        //create HBox for Salt & Pepper tf and rb's.
        HBox hBoxSaltNPepper = new HBox(50);
        hBoxSaltNPepper.setAlignment(Pos.BASELINE_LEFT);
        hBoxSaltNPepper.getChildren().addAll(spLbl, rbYes, rbNo);
        hBoxSaltNPepper.setPadding(new Insets(10,10,5,10));
       
        //create HBox for Menu Options
        HBox hbMenuOptions = new HBox(5);
        hbMenuOptions.setAlignment(Pos.BASELINE_LEFT);
        hbMenuOptions.getChildren().add(sizeLbl);
        hbMenuOptions.setPadding(new Insets(10,10,5,10));
        
        //create Size of Sandwhich radio button HBox
        HBox hBoxSandwhichSize = new HBox(75);
        hBoxSandwhichSize.setAlignment(Pos.BASELINE_LEFT);
        hBoxSandwhichSize.getChildren().addAll(rbSmall, rbHalf, rbFull);
        hBoxSandwhichSize.setPadding(new Insets(5,25,5,25));
        
        //create HBox for Veggies Label
        HBox hBoxtfVeggies = new HBox(5);
        hBoxtfVeggies.setAlignment(Pos.BASELINE_LEFT);
        hBoxtfVeggies.getChildren().addAll(veggLbl);
        hBoxtfVeggies.setPadding(new Insets(10,5,2,10));

        //create VBox and add all menu options
        VBox vBoxMenu = new VBox();
        vBoxMenu.getChildren().addAll(hbMenuOptions, hBoxSandwhichSize, breadBox, 
                meatBox, cheeseBox, hBoxtfVeggies, hBoxVeggies,
                sauceBox, hBoxSaltNPepper);
        String style = "-fx-background-color: rgb(0,151,67);";
        vBoxMenu.setStyle(style);
        
        //create subway logo
        ImageView imageView = new ImageView(new Image(
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSoWrVEYcm36WCLyYgENRhkwwIl4x9IgQqneFFoIS30vHm4_2QK"));
        HBox imageHBox = new HBox(imageView);
        imageHBox.setAlignment(Pos.BASELINE_CENTER);
        
        //create Size Of Sandwich TextField
        Label sandwichSummaryLbl = new Label("Your Sandwich");        
        HBox yourSandwichHeader = new HBox(sandwichSummaryLbl);
        yourSandwichHeader.setAlignment(Pos.BASELINE_CENTER);
        
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
        rightSideVBox.getChildren().addAll(imageHBox, yourSandwichHeader, taSandwichInfo);
        String rightBackground = "-fx-background-color: rgb(255,255,255);";
        rightSideVBox.setStyle(rightBackground);
        
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
        primaryStage.setTitle("Subway: Eat Fresh");
        primaryStage.setScene(scene);
        primaryStage.show();


        //set radio button actions 
        //(NOT PERMANENT)
//        rbSmall.setOnAction(e -> tfSandwichSize.setAlignment(Pos.BASELINE_LEFT));
//        rbHalf.setOnAction(e -> tfSandwichSize.setAlignment(Pos.BASELINE_CENTER));
//        rbFull.setOnAction(e -> tfSandwichSize.setAlignment(Pos.BASELINE_RIGHT));
//        rbYes.setOnAction(e -> tfSaltNPepper.setAlignment(Pos.BASELINE_LEFT));
//        rbNo.setOnAction(e -> tfSaltNPepper.setAlignment(Pos.BASELINE_RIGHT));
    }//end public void start(Stage primaryStage)
    
    public static void main(String[] args) {
        launch(args);   
    }
}//end public class Week14GroupProjectSubwayOrderSystem extends Application
