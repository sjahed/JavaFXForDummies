package chapter5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class HBoxSpacer extends Application{

	public static void main(String [] args){
		launch();
	}
	
	public void start(Stage stage){
		Button b1, b2, b3;
		Region spacer;
		
		b1 = new Button("Button One");
		b2 = new Button("Button Two");
		b3 = new Button("Button Three");
		spacer = new Region();
		HBox.setMargin(b1,new Insets(10));
		HBox.setMargin(b2, new Insets(10));
		HBox.setMargin(b3, new Insets(10));
		HBox.setHgrow(spacer, Priority.ALWAYS);
		
		HBox root = new HBox(10, b1,b2, spacer,b3);
		Scene s = new Scene(root);
		stage.setScene(s);
		stage.show();
	}
}
