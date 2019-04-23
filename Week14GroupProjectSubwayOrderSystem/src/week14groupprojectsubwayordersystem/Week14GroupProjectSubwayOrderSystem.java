package week14groupprojectsubwayordersystem;

import java.util.ArrayList;
import java.util.Arrays;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
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
        String[] breadType = {"9-Grain Wheat", "Italian", "Italian Herbs & Cheese",
            "Honey Oat", "Jalapeno Cheese", "Monterey Cheddar",
            "Parmesan Oregano", "Roasted Garlic", "Rosemary & Sea Salt"};
        
        String[] meatType = {"Turkey Breast", "Ham", "Chicken Breast", "Roast Beef",
            "Tuna", "Salami", "Beefsteak", "Bacon", "Meatballs","Pepperoni",
            "Turkey Bologna", "Shaved Steak"};
        
        String[] cheeseType = {"American", "Monterey Cheddar", "Feta", "Mozzarella",
            "Cheddar", "Pepperjack", "Provalone", "Swiss"};
        
        String[] veggieType = {"Cucumbers", "Green Peppers", "Lettuce", "Red Onions",
            "Spinach", "Tomatoes", "Banana Peppers", "Jalapenos",
            "Black Olives", "Pickles"};
        
        String[] sauceType = {"Chipotle Southwest", "Light Mayonnaise", "Mayonnaise", "Ranch",
            "Oil", "Subway Vinaigrette", "Mustart", "Vinegar", "Sweet Onion",
            "Barbecue", "Buffalo", "Creamy Italian", "Golden Italian",
            "Savory Ceasar", "Sriracha", "Tzatziki Cucumber"};
        
        // Create Size Of Sandwich Label.
        Label sizeLbl = new Label("Size of Sandwich");
        sizeLbl.setTextFill(Color.rgb(255,203,10));
        sizeLbl.setStyle("-fx-font-weight: bold");
        
        // Create Size Radio Buttons.
        RadioButton rbSmall = new RadioButton("Small");
        RadioButton rbHalf = new RadioButton("Half");
        rbHalf.setSelected(true); // for UpdateAll purposes.
        RadioButton rbFull = new RadioButton("Full");
        // Style radio buttons and set the text fill.
        rbSmall.setStyle("-fx-font-weight: bold"); rbHalf.setStyle("-fx-font-weight: bold"); rbFull.setStyle("-fx-font-weight: bold");
        rbSmall.setTextFill(Color.WHITE); rbHalf.setTextFill(Color.WHITE); rbFull.setTextFill(Color.WHITE);
      
        // Add Radio Buttons to ToggleGroup.
        ToggleGroup sandwichSize = new ToggleGroup();
        rbSmall.setToggleGroup(sandwichSize);
        rbHalf.setToggleGroup(sandwichSize);
        rbFull.setToggleGroup(sandwichSize);
        
        // Create Bread Type ComboBox.
        Label breadTypeLbl = new Label("Bread Type:");
        breadTypeLbl.setTextFill(Color.rgb(255,203,10));
        breadTypeLbl.setStyle("-fx-font-weight: bold");
        ComboBox<String> cboBreadType = new ComboBox<>();
        cboBreadType.setValue("- Select Your Bread");
        cboBreadType.setPrefWidth(250);
        // Adding the breadType values to the bread comboBox.
        cboBreadType.getItems().addAll(Arrays.asList(breadType));
        
        // Creating the pane to hold the bread ComboBox and Label.
        BorderPane breadBox = new BorderPane();
        breadBox.setLeft(breadTypeLbl);
        breadBox.setRight(cboBreadType);
        breadBox.setPadding(new Insets(10,10,10,10));
        
        // Create Meat Type ComboBox.
        Label meatTypeLbl = new Label ("Meat Type: ");
        meatTypeLbl.setTextFill(Color.rgb(255,203,10));
        meatTypeLbl.setStyle("-fx-font-weight: bold");
        ComboBox<String> cboMeatType = new ComboBox<>();
        // Adding meatType values to meat comboBox.
        cboMeatType.getItems().addAll(Arrays.asList(meatType));
        
        // Creating a pane to hold the meat ComboBox and Label.
        cboMeatType.setValue("- Select Your Meat");
        cboMeatType.setPrefWidth(250);
        BorderPane meatBox = new BorderPane();
        meatBox.setLeft(meatTypeLbl);
        meatBox.setRight(cboMeatType);
        meatBox.setPadding(new Insets(10,10,10,10));
        
        // Creating Cheese Type ComboBox
        Label cheeseTypeLbl = new Label("Cheese Type:");
        cheeseTypeLbl.setTextFill(Color.rgb(255,203,10));
        cheeseTypeLbl.setStyle("-fx-font-weight: bold");
        ComboBox<String> cboCheeseType = new ComboBox<>();
        cboCheeseType.getItems().addAll(Arrays.asList(cheeseType));
        cboCheeseType.setValue("- Select Your Cheese");
        cboCheeseType.setPrefWidth(250);
        
        // Creating pane to hold Cheese ComboBox and Label.
        BorderPane cheeseBox = new BorderPane();
        cheeseBox.setLeft(cheeseTypeLbl);
        cheeseBox.setRight(cboCheeseType);
        cheeseBox.setPadding(new Insets(5,10,5,10));
        
        // Create Veggie Label.
        Label veggLbl = new Label("Veggies (Pick up to three)");
        veggLbl.setTextFill(Color.rgb(255,203,10));
        veggLbl.setStyle("-fx-font-weight: bold");
        
        //create Veggie Type ComboBoxes.
        ComboBox<String> cboVeggieType1 = new ComboBox<>();
        ComboBox<String> cboVeggieType2 = new ComboBox<>();
        ComboBox<String> cboVeggieType3 = new ComboBox<>();

        // Adding the values from the VeggieType Array to the ComboBoxes.
        for (String veggie: veggieType) {
            cboVeggieType1.getItems().add(veggie);
            cboVeggieType2.getItems().add(veggie);
            cboVeggieType3.getItems().add(veggie);
        }
        cboVeggieType1.setValue("- Veggie 1");
        cboVeggieType2.setValue("- Veggie 2");
        cboVeggieType3.setValue("- Veggie 3");
        
        // Creating pane to hold veggie ComboBoxes and Label.
        HBox hBoxVeggies = new HBox(5);
        hBoxVeggies.setAlignment(Pos.BASELINE_LEFT);
        hBoxVeggies.getChildren().addAll(cboVeggieType1, cboVeggieType2, cboVeggieType3);
        hBoxVeggies.setPadding(new Insets(10,10,5,10));
        
        // Create Sauce Type ComboBox
        Label sauceLbl = new Label("Sauce Type:");
        sauceLbl.setTextFill(Color.rgb(255,203,10));
        sauceLbl.setStyle("-fx-font-weight: bold");
        ComboBox<String> cboSauceType = new ComboBox<>();
        cboSauceType.setPrefWidth(250);
        cboSauceType.getItems().addAll(Arrays.asList(sauceType)); // adding values from sauceType to Sauce ComboBox

        // Creating a pane to hold the sauce ComboBox and Label.
        cboSauceType.setValue("- Pick Your Sauce");
        BorderPane sauceBox = new BorderPane();
        sauceBox.setLeft(sauceLbl);
        sauceBox.setRight(cboSauceType);
        sauceBox.setPadding(new Insets(10,10,5,10));
        
        // Create Salt & Pepper Label
        Label spLbl = new Label ("Salt & Pepper");
        spLbl.setTextFill(Color.rgb(255,203,10));
        spLbl.setStyle("-fx-font-weight: bold");
        
        // Create Salt & Pepper radio buttons
        RadioButton rbYes = new RadioButton("Yes");
        rbYes.setStyle("-fx-font-weight: bold");
        rbYes.setTextFill(Color.WHITE);
        RadioButton rbNo = new RadioButton("No");
        rbNo.setSelected(true);
        rbNo.setStyle("-fx-font-weight: bold");
        rbNo.setTextFill(Color.WHITE);
        
        //add radio buttons to toggle group
        ToggleGroup groupSaltPepper = new ToggleGroup();
        rbYes.setToggleGroup(groupSaltPepper);
        rbNo.setToggleGroup(groupSaltPepper);
        
        // Create HBox for Salt & Pepper Label and Radio Buttons.
        HBox hBoxSaltNPepper = new HBox(50);
        hBoxSaltNPepper.setAlignment(Pos.BASELINE_LEFT);
        hBoxSaltNPepper.getChildren().addAll(spLbl, rbYes, rbNo);
        hBoxSaltNPepper.setPadding(new Insets(10,10,5,10));
       
        // Create HBox for Menu Options
        HBox hbMenuOptions = new HBox(5);
        hbMenuOptions.setAlignment(Pos.BASELINE_LEFT);
        hbMenuOptions.getChildren().add(sizeLbl);
        hbMenuOptions.setPadding(new Insets(10,10,5,10));
        
        // Create Size of Sandwhich radio button HBox
        HBox hBoxSandwhichSize = new HBox(75);
        hBoxSandwhichSize.setAlignment(Pos.BASELINE_LEFT);
        hBoxSandwhichSize.getChildren().addAll(rbSmall, rbHalf, rbFull);
        hBoxSandwhichSize.setPadding(new Insets(5,25,5,25));
        
        // Create HBox for Veggies Label
        HBox hBoxtfVeggies = new HBox(5);
        hBoxtfVeggies.setAlignment(Pos.BASELINE_LEFT);
        hBoxtfVeggies.getChildren().addAll(veggLbl);
        hBoxtfVeggies.setPadding(new Insets(10,5,2,10));

        // Create VBox and add all menu options
        VBox vBoxMenu = new VBox();
        vBoxMenu.getChildren().addAll(hbMenuOptions, hBoxSandwhichSize, breadBox, 
                meatBox, cheeseBox, hBoxtfVeggies, hBoxVeggies,
                sauceBox, hBoxSaltNPepper);
        String style = "-fx-background-color: rgb(0,151,67);";
        vBoxMenu.setStyle(style);
        
        // Create subway logo
        ImageView imageView = new ImageView(new Image(
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSoWrVEYcm36WCLyYgENRhkwwIl4x9IgQqneFFoIS30vHm4_2QK"));
        HBox imageHBox = new HBox(imageView);
        imageHBox.setAlignment(Pos.BASELINE_CENTER);
        
        // Create Size Of Sandwich Text.
        Text sandwichSummary = new Text ("Your Sandwich \n\n");
        sandwichSummary.setFont(Font.font ("Verdana", 20));
        HBox yourSandwichHeader = new HBox(sandwichSummary);
        yourSandwichHeader.setAlignment(Pos.BASELINE_CENTER);
        
        Text sandwichInfo = new Text(); // This is the text with the sandwich info.
        sandwichInfo.setFont(Font.font ("Verdana", 15));
        
        VBox completeSandwichInfo = new VBox(yourSandwichHeader, sandwichInfo); // Combining nodes to make a VBox with the complete info.
        completeSandwichInfo.setAlignment(Pos.CENTER);
        
        // Creating the order Button.
        Button orderBtn = new Button("Order");
        orderBtn.setStyle(style + "-fx-text-fill: white;"); orderBtn.setMinSize(80, 40);
        orderBtn.setDisable(true);
        HBox orderHbox = new HBox(orderBtn);
        orderHbox.setAlignment(Pos.CENTER);

        // Create vbox for subway logo, Text, and Text.
        VBox rightSideVBox = new VBox();
        rightSideVBox.getChildren().addAll(imageHBox, completeSandwichInfo, orderHbox);
        String rightBackground = "-fx-background-color: rgb(255,255,255);";
        rightSideVBox.setStyle(rightBackground);
        rightSideVBox.prefWidthProperty().bind(primaryStage.widthProperty());
        
        // Create HBox for vBox Right
        HBox RightHBoxForVBox = new HBox(5);
        RightHBoxForVBox.getChildren().addAll(rightSideVBox);
        
        // Create HBox for vBox Left
        HBox LeftHBoxForVBox = new HBox(5);
        LeftHBoxForVBox.getChildren().addAll(vBoxMenu);
        
        HBox root = new HBox(5); //create root hBox to house everything
        root.getChildren().addAll(LeftHBoxForVBox,RightHBoxForVBox);

        Scene scene = new Scene(root, 875, 600); //create scene
        primaryStage.setTitle("Subway: Eat Fresh");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        // ADD LISTENERS TO EACH PROPERTY.
        sandwichSize.selectedToggleProperty().addListener(e -> {
            updateAll(sandwichInfo, orderBtn, sandwichSize, cboBreadType, cboMeatType, cboCheeseType, cboVeggieType1, cboVeggieType2, cboVeggieType3, cboSauceType, groupSaltPepper);
        });
        
        cboBreadType.getSelectionModel().selectedItemProperty().addListener(e -> {
            updateAll(sandwichInfo, orderBtn, sandwichSize, cboBreadType, cboMeatType, cboCheeseType, cboVeggieType1, cboVeggieType2, cboVeggieType3, cboSauceType, groupSaltPepper);
        });
        
        cboMeatType.getSelectionModel().selectedItemProperty().addListener(e -> {
            updateAll(sandwichInfo, orderBtn, sandwichSize, cboBreadType, cboMeatType, cboCheeseType, cboVeggieType1, cboVeggieType2, cboVeggieType3, cboSauceType, groupSaltPepper);
        });
        
        cboCheeseType.getSelectionModel().selectedItemProperty().addListener(e -> {
            updateAll(sandwichInfo, orderBtn, sandwichSize, cboBreadType, cboMeatType, cboCheeseType, cboVeggieType1, cboVeggieType2, cboVeggieType3, cboSauceType, groupSaltPepper);
        });
        
        cboVeggieType1.getSelectionModel().selectedItemProperty().addListener(e -> {
            updateAll(sandwichInfo, orderBtn, sandwichSize, cboBreadType, cboMeatType, cboCheeseType, cboVeggieType1, cboVeggieType2, cboVeggieType3, cboSauceType, groupSaltPepper);
        });
        
        cboVeggieType2.getSelectionModel().selectedItemProperty().addListener(e -> {
            updateAll(sandwichInfo, orderBtn, sandwichSize, cboBreadType, cboMeatType, cboCheeseType, cboVeggieType1, cboVeggieType2, cboVeggieType3, cboSauceType, groupSaltPepper);
        });
        
        cboVeggieType3.getSelectionModel().selectedItemProperty().addListener(e -> {
            updateAll(sandwichInfo, orderBtn, sandwichSize, cboBreadType, cboMeatType, cboCheeseType, cboVeggieType1, cboVeggieType2, cboVeggieType3, cboSauceType, groupSaltPepper);
        });
        
        cboSauceType.getSelectionModel().selectedItemProperty().addListener(e -> {
            updateAll(sandwichInfo, orderBtn, sandwichSize, cboBreadType, cboMeatType, cboCheeseType, cboVeggieType1, cboVeggieType2, cboVeggieType3, cboSauceType, groupSaltPepper);
        });
        
        groupSaltPepper.selectedToggleProperty().addListener(e -> {
            updateAll(sandwichInfo, orderBtn, sandwichSize, cboBreadType, cboMeatType, cboCheeseType, cboVeggieType1, cboVeggieType2, cboVeggieType3, cboSauceType, groupSaltPepper);
        });
    }//end public void start(Stage primaryStage)
    
    public static void main(String[] args) {
        launch(args);   
    }
    
    /**
     * This method takes in all of the ComboBoxes and ToggleGroups, and one Text Node. It takes the
     * selected value from each and checks to see if it has a value. If it does have a value
     * display the value to the 'Your Sandwich' area. It starts with the Text Node and button, and then goes in order from
     * the menu.
     * @param sandwichInfo
     * @param orderBtn
     * @param sandwichSize
     * @param cboBreadType
     * @param cboMeatType
     * @param cboCheeseType
     * @param cboVeggieType1
     * @param cboVeggieType2
     * @param cboVeggieType3
     * @param cboSauceType
     * @param groupSaltPepper 
     */
    private static void updateAll(Text sandwichInfo, Button orderBtn, ToggleGroup sandwichSize, ComboBox<String> cboBreadType, ComboBox<String> cboMeatType, ComboBox<String> cboCheeseType, 
            ComboBox<String> cboVeggieType1, ComboBox<String> cboVeggieType2, ComboBox<String> cboVeggieType3, ComboBox<String> cboSauceType, ToggleGroup groupSaltPepper) {
        StringBuilder text = new StringBuilder(); // text that we will add to the Text Node.
        
        // Getting selected options.
        RadioButton size = (RadioButton)sandwichSize.getSelectedToggle();
        String bread = cboBreadType.getSelectionModel().getSelectedItem();
        String meat = cboMeatType.getSelectionModel().getSelectedItem();
        String cheese = cboCheeseType.getSelectionModel().getSelectedItem();
        String veggie1 = cboVeggieType1.getSelectionModel().getSelectedItem();
        String veggie2 = cboVeggieType2.getSelectionModel().getSelectedItem();
        String veggie3 = cboVeggieType3.getSelectionModel().getSelectedItem();
        String sauce = cboSauceType.getSelectionModel().getSelectedItem();
        RadioButton saltPepper = (RadioButton)groupSaltPepper.getSelectedToggle();
        
        // Adding options to an array. 0 - size, 1 - bread, 2 - meat, 3 - cheese, 4 - 6 Veggies, 7 - sauce, 8 - salt&pepper.
        String[] uncheckedOptions = {size.getText(), bread, meat, cheese, veggie1, veggie2, veggie3, sauce, saltPepper.getText()};
        ArrayList<String> checkedOptions = new ArrayList<>(); // to put the checked values in.
        for (String value: uncheckedOptions) {
            if (value.startsWith("-")) { // If nothing was selected, set that value to "".
                value = "";
            }
            checkedOptions.add(value); // add the value to the checked values.
        }
        
        text.append("Size:  ").append(checkedOptions.get(0)).append("\n"); // adding bread size.
        text.append("Bread:  ").append(checkedOptions.get(1)).append("\n"); // adding bread.
        text.append("Meat:  ").append(checkedOptions.get(2)).append("\n"); // adding meat.
        text.append("Cheese:  ").append(checkedOptions.get(3)).append("\n"); // adding cheese.
        
        StringBuilder veggieString = new StringBuilder(); // StringBuilder for the Veggies.
        veggieString.append("Veggies: ");
        for (int i = 4; i < 7; i++) { // checking to see how many veggies were actually filled out.
            if (!checkedOptions.get(i).equalsIgnoreCase("") && i < 6) { // If the veggie isn't "" and isn't the last veggie.
                veggieString.append(checkedOptions.get(i)).append(", ");
            } else if (!checkedOptions.get(i).equalsIgnoreCase("") && i == 6) { // If the veggie isn't "" and it is the last veggie.
                veggieString.append(checkedOptions.get(i)).append(" ");
            }
        }
        text.append(veggieString); // append the veggie string.
        text.append("\nSauce: ").append(checkedOptions.get(7)); // adding the sauce.
        text.append("\nSalt & Pepper? ").append(checkedOptions.get(8)).append("\n\n"); // adding the salt&pepper.
        sandwichInfo.setText(text.toString()); // Setting the text in textarea.
        sandwichInfo.setStyle("-fx-font-weight: 500;"); // Setting the text's font-weight.
        
        if (checkedOptions.get(0) != "" && checkedOptions.get(1) != "" && checkedOptions.get(2) != "") {
            orderBtn.setDisable(false);
        }
    }
}//end public class Week14GroupProjectSubwayOrderSystem extends Application
