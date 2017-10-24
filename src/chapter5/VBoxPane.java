package chapter5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxPane extends Application {

	public static void main(String []args){
		launch(args);
	}
	
	Button b1, b2, b3, b4, b5;
	public void start(Stage stage){
		
		b1 = new Button("Button One");
		b1.setMaxWidth(Double.MAX_VALUE);
		b2 = new Button("Button Two");
		b2.setMaxWidth(Double.MAX_VALUE);
		b3 = new Button("Button Three");
		b3.setMaxWidth(Double.MAX_VALUE);
		b4 = new Button("Button Four");
		b5 = new Button("Button Five");
		
		VBox root = new VBox(5);
		root.getChildren().addAll(b1,b2,b3,b4,b5);
		root.setPadding(new Insets(20));
		root.setAlignment(Pos.BASELINE_CENTER);
		Scene s = new Scene(root);
		stage.setScene(s);
		stage.show();
	}
}
