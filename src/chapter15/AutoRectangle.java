package chapter15;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class AutoRectangle extends Application {

	public static void main(String []args){
		launch();
	}

	@Override
	public void start(Stage stage){
		
		Rectangle r = new Rectangle(100, 100, Color.LIGHTGRAY);
		r.setStroke(Color.BLACK);
		r.setStrokeWidth(4);
		
		StackPane sp = new StackPane(r);
		sp.setMinHeight(150);
		sp.setMinWidth(150);
		sp.widthProperty().addListener((e,oldV,newV) -> r.setWidth((double)newV-20));
		sp.heightProperty().addListener((e,oldV,newV) -> r.setHeight((double)newV-20));
		
		Scene s = new Scene(sp);
		stage.setScene(s);
		
		stage.setTitle("Fluid Circle");
		stage.show();
	}

	

}
