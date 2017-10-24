package chapter17;


import javafx.animation.Interpolator;
import javafx.animation.Transition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class BouncingBall extends Application{

	public static void main(String []args){
		launch(args);
	}
	
	@Override
	public void start(Stage stage){
		RadialGradient g = new RadialGradient(
				0,0,
				0.35,0.35,
				0.5, true,
				CycleMethod.NO_CYCLE,
				new Stop(0.0, Color.WHITE),
				new Stop(1.0, Color.RED)
				);
		Circle ball = new Circle(0,0,20);
		ball.setFill(g);
		
		Group root = new Group();
		root.getChildren().add(ball);
		Scene s = new Scene(root, 600,600);
		stage.setScene(s);
		stage.show();
		
		TranslateTransition t = new TranslateTransition(
				Duration.millis(1500), ball);
		t.setFromX(ball.getRadius());
		t.setToX(s.getWidth() - ball.getRadius());
		t.setFromY(s.getHeight()/2);
		t.setToY(s.getHeight()/2);
		t.setCycleCount(Transition.INDEFINITE);
		t.setAutoReverse(true);
		t.setInterpolator(Interpolator.LINEAR);
		t.play();
		
	}//end of start(stage)
}
