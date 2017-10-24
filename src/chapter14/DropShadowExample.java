package chapter14;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Shadow;
import javafx.stage.Stage;

public class DropShadowExample extends Application{

	public static void main(String [] args){
		launch(args);
	}
	
	@Override
	public void start(Stage stage){
		Rectangle r1 = createShadowedBox(100, 10, 10, 5, 5, 10);
		r1.setX(100);
		r1.setY(50);
		Rectangle r2 = createShadowedBox(100, 20, 20, 10, 10, 10); 
		r2.setX(250);
		r2.setY(50);
		Rectangle r3 = createShadowedBox(100, 30, 30, 15, 15, 10);
		r3.setX(400);
		r3.setY(50);
		Rectangle r4 = createShadowedBox(100, 20, 20, 0, 0, 10);
		r4.setX(550);
		r4.setY(50);
		Rectangle r5 = createShadowedBox(100, 20, 20, 0, 10, 10); 
		Rectangle r6 = createShadowedBox(100, 20, 20, 10, 0, 10);
		Rectangle r7 = createShadowedBox(100, 20, 20, 10, 10, 0); 
		Rectangle r8 = createShadowedBox(100, 20, 20, 10, 10, 20); 
		Rectangle r9 = createShadowedBox(100, 20, 20, 10, 10, 50);
		
		Scene s = new Scene(new Group(r1,r2,r3,r4,r5,r6,r7,r8,r9));
		stage.setScene(s);
		stage.show();
	}
	
	Rectangle createShadowedBox(double size, double shadowWidth, double shadowHeight, double offsetX, double offsetY,
			double radius){
			Rectangle r = new Rectangle(size, size); 
			r.setFill(Color.LIGHTGRAY); 
			r.setStroke(Color.BLACK); 
			r.setStrokeWidth(2);
			
			DropShadow e = new DropShadow(); 
			e.setWidth(shadowWidth); 
			e.setHeight(shadowHeight); 
			e.setOffsetX(offsetX); 
			e.setOffsetY(offsetY); 
			e.setRadius(radius); 
			r.setEffect(e);
			
			return r; 
	}
}
