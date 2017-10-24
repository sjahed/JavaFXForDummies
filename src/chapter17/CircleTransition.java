package chapter17;

import javafx.animation.FillTransition;
import javafx.animation.Interpolator;
import javafx.animation.ParallelTransition;
import javafx.animation.Transition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class CircleTransition extends Application {

	public static void main(String[] args){
		launch(args);
	}
	
	@Override
	public void start(Stage stage){
	
		Circle c = new Circle(50);
		c.setFill(Color.LIGHTGRAY);
		c.setStroke(Color.BLACK);
		c.setStrokeWidth(4);

		Group pane = new Group(c);
		Scene s = new Scene(pane);
		stage.setScene(s);
		stage.show();
		
		FillTransition ft = new FillTransition(Duration.millis(900), c);
		ft.setFromValue(Color.LIGHTGRAY);
		ft.setToValue(Color.BLACK);
		ft.setAutoReverse(true);
		ft.setCycleCount(Transition.INDEFINITE);
		
		TranslateTransition t = new TranslateTransition(Duration.millis(900), c);
		t.setFromX(0);
		t.setFromY(0);
		t.setToX(300);
		t.setToY(300);
		t.setCycleCount(Transition.INDEFINITE);
		t.setAutoReverse(true);
		t.setInterpolator(Interpolator.LINEAR);
		
		ParallelTransition p = new ParallelTransition(t,ft);
		p.play();
		
		
	}
}
