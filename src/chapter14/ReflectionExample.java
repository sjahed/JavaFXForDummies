package chapter14;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.MotionBlur;
import javafx.scene.effect.Reflection;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ReflectionExample extends Application{

	public static void main(String []args){
		launch(args);
	}
	@Override
	public void start(Stage primaryStage){
		Text t = new Text(100,100,"Hello World");
		t.setFont(new Font("Times New Roman",100));
		t.setFill(Color.LIGHTGRAY);
		t.setStroke(Color.BLACK);
		t.setEffect(new Reflection());
		
		Circle c = new Circle(250, 250, 50);
		c.setFill(Color.LIGHTBLUE);
		c.setStroke(Color.BLACK);
		c.setEffect(new MotionBlur());
		
		Scene s = new Scene(new Group(t,c));
		primaryStage.setScene(s);
		primaryStage.show();
	}

}
