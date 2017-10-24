package chapter13;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ShapeCombiner extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	@Override
	public void start(Stage stage){
		Group group = new Group();
		
		Circle c1 = new Circle(110, 110, 100);
		Circle c2 = new Circle(210, 110, 100);
		Circle c3 = new Circle(440, 110, 100);
		Circle c4 = new Circle(540, 110, 100);
		Circle c5 = new Circle(110, 340, 100);
		Circle c6 = new Circle(210, 340, 100);
		Circle c7 = new Circle(440, 340, 100);
		Circle c8 = new Circle(540, 340, 100);
		
		
		Shape union = Shape.union(c3, c4);
		Shape intersect = Shape.intersect(c5, c6);
		Shape subtract = Shape.subtract(c7, c8);
		
		c1.setFill(null);
		c1.setStroke(Color.BLACK);
		
		c2.setFill(null);
		c2.setStroke(Color.BLACK);
		
		union.setStroke(Color.BLACK);
		union.setFill(Color.LIGHTGRAY);
		
		intersect.setStroke(Color.BLACK);
		intersect.setFill(Color.LIGHTCYAN);
		
		subtract.setStroke(Color.BLACK);
		subtract.setFill(Color.ANTIQUEWHITE);
		
		group.getChildren().addAll(c1,c2,union, intersect, subtract);
		Scene s = new Scene(group);
		stage.setScene(s);
		
		stage.show();
	}

}
