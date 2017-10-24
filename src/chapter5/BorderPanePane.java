package chapter5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class BorderPanePane extends Application{

	public static void main(String []args){
		launch(args);
	}
	
	Button b1, b2, b3, b4, b5;
	public void start(Stage stage){
		
		b1 = new Button("Button One");
		b1.setMaxWidth(Double.MAX_VALUE);
		b2 = new Button("Button Two");
		b2.setMaxHeight(Double.MAX_VALUE);
		b3 = new Button("Button Three");
		b3.setMaxHeight(Double.MAX_VALUE);
		b4 = new Button("Button Four");
		b4.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b5 = new Button("Button Five");
		b5.setMaxWidth(Double.MAX_VALUE);
		
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(10));
		root.setMargin(b1, new Insets(10));
		root.setMargin(b2, new Insets(10));
		root.setMargin(b3, new Insets(10));
		root.setMargin(b4, new Insets(10));
		root.setMargin(b5, new Insets(10));
		root.setTop(b1);
		root.setLeft(b2);
		root.setRight(b3);
		root.setCenter(b4);
		root.setBottom(b5);
		Scene s = new Scene(root);
		stage.setScene(s);
		stage.show();
	}
}
