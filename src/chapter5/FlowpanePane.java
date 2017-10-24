package chapter5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class FlowpanePane extends Application{

	public static void main(String []args){
		launch(args);
	}
	
	Button b1, b2, b3, b4, b5;
	public void start(Stage stage){
		
		b1 = new Button("Button One");
		b2 = new Button("Button Two");
		b3 = new Button("Button Three");
		b4 = new Button("Button Four");
		b5 = new Button("Button Five");
		
		FlowPane root = new FlowPane(5, 5);
		root.getChildren().addAll(b1,b2,b3,b4,b5);
		Scene s = new Scene(root,200,200);
		stage.setScene(s);
		stage.show();
	}
}
