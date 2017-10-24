package chapter11;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class StackPaneExample extends Application{

	public static void main(String [] args){
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Rectangle r1 = new Rectangle(100, 100);
		r1.setFill(Color.DARKGREY);
		Rectangle r2 = new Rectangle(50,50);
		r2.setFill(Color.LIGHTGREY);
		
		StackPane pane = new StackPane();
		pane.getChildren().addAll(r1,r2);
		pane.setPadding(new Insets(20));
		//pane.setMargin(r1, new Insets(50));
		
		Scene s = new Scene(pane);
		primaryStage.setScene(s);
		primaryStage.show();
		
	}

	
}
