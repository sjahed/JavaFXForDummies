package chapter19;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TitledPaneExample extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage){
		RadioButton rbSmall = new RadioButton("Small");
		RadioButton rbMedium = new RadioButton("Medium");
		RadioButton rbLarge = new RadioButton("Large");
		ToggleGroup sizeGroup = new ToggleGroup();
		rbSmall.setToggleGroup(sizeGroup);
		rbMedium.setToggleGroup(sizeGroup);
		rbLarge.setToggleGroup(sizeGroup);
		VBox boxPane = new VBox(10);
		boxPane.setPadding(new Insets(10));
		boxPane.getChildren().addAll(rbSmall,rbMedium, rbLarge);
		TitledPane tPane = new TitledPane("Size",boxPane);
		//tPane.setCollapsible(false);
		
		
		RadioButton rbThin = new RadioButton("Thin");
		RadioButton rbThick = new RadioButton("Thick");
		ToggleGroup crustGroup = new ToggleGroup();
		rbThin.setToggleGroup(crustGroup);
		rbThick.setToggleGroup(crustGroup);
		VBox crustPane = new VBox(10);
		crustPane.setPadding(new Insets(10));
		crustPane.getChildren().addAll(rbThin,rbThick);
		TitledPane crustTPane = new TitledPane("Crust", crustPane);
		
		CheckBox cbPepproni = new CheckBox("Pepperoni");
		CheckBox cbSausage = new CheckBox("Sausage");
		CheckBox cbOlives = new CheckBox("Olives");
		CheckBox cbMashroom = new CheckBox("Mashrooms");
		VBox toppingsPane = new VBox(10);
		toppingsPane.setPadding(new Insets(10));
		toppingsPane.getChildren().addAll(cbPepproni,cbSausage, cbOlives,cbMashroom);
		TitledPane toppingsTPane = new TitledPane("Toppings",toppingsPane);
		
		Accordion acc = new Accordion();
		acc.getPanes().addAll(tPane, crustTPane, toppingsTPane);
		Scene s = new Scene(acc);
		stage.setScene(s);
		stage.show();
		
	}

}
