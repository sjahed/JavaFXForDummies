package chapter15;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class BindingCircles extends Application {

	public static void main(String []args){
		launch(args);
	}
	
	@Override
	public void start(Stage stage){
		Circle c1 = new Circle(50, 50, 50);
		Circle c2 = new Circle(250, 250, 100);
		
		c1.radiusProperty().bind(c2.radiusProperty());
		
		Group sp = new Group(c1,c2);
		Scene s = new Scene(sp);
		s.widthProperty().addListener((e,oldV,newV) -> c2.setRadius((double)newV/8));
		stage.setScene(s);
		stage.show();
	}
}
