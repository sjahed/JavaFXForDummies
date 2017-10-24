package chapter6;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextFieldTest extends Application {

	public static void main(String []args){
		launch(args);
	}
	
	public void start(Stage stage){
		Label nameLbl = new Label("Name:");
		nameLbl.setMinWidth(75);
		TextField txtField = new TextField();
		txtField.setMinWidth(200);
		txtField.setPromptText("Enter name here");
		
		HBox pane = new HBox(10, nameLbl, txtField);
		Scene s = new Scene(pane);
		stage.setScene(s);
		stage.show();
	}
}
