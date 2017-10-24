package chapter14;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Shadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RectangleWithShadow extends Application{

	public static void main(String [] args){
		launch(args);
	}
	
	@Override
	public void start(Stage stage){
		
		Rectangle r1  = new Rectangle(50, 50, 100, 100);
		r1.setFill(Color.BLACK);
		r1.setStroke(Color.BLACK);
		r1.setStrokeWidth(2);
		
		Rectangle r2  = new Rectangle(170, 50, 100, 100);
		r2.setFill(Color.BLACK);
		r2.setStroke(Color.BLACK);
		r2.setStrokeWidth(2);
		
		Shadow shadow2 = new Shadow();
		DropShadow shadow1 = new DropShadow();
		shadow1.setOffsetX(10);
		shadow1.setOffsetY(10);
		r1.setEffect(shadow1);
		r2.setEffect(shadow2);
		Scene s = new Scene(new Group(r1,r2));
		stage.setScene(s);
		stage.show();
	}
	
}
