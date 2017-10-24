package chapter17;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
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

public class BouncingBallHard extends Application {

	public static void main(String[] args){
		launch(args);
	}
	
	private Circle ball;
	private double xSpeed = 2;
	private double ySpeed = 3;
	private int WIDTH = 600;
	private int HEIGHT = 500;
	private final int BALL_SIZE = 20;
	
	@Override
	public void start(Stage stage){
		Group root = new Group();
		RadialGradient g = new RadialGradient(
				0,0,
				0.35,0.35,
				0.5,
				true,
				CycleMethod.NO_CYCLE,
				new Stop(0.0, Color.WHITE),
				new Stop(1.0, Color.RED)
				);
		ball = new Circle(BALL_SIZE, g);
		ball.setCenterX(BALL_SIZE);
		ball.setCenterX(BALL_SIZE);
		
		root.getChildren().addAll(ball);
		Scene s = new Scene(root, WIDTH, HEIGHT);
		stage.setScene(s);
		stage.setTitle("Bouncing Balls");
		stage.show();
		
		KeyFrame k = new KeyFrame(Duration.millis(100),
				e-> {
					
					ball.setCenterX(ball.getCenterX() + xSpeed);
					ball.setCenterY(ball.getCenterY() + ySpeed);
					
					if(ball.getCenterX() <= BALL_SIZE ||
							ball.getCenterX() >= WIDTH - BALL_SIZE)
						xSpeed = -xSpeed;
					
					if(ball.getCenterY() <= BALL_SIZE ||
							ball.getCenterY() >= HEIGHT - BALL_SIZE)
						ySpeed = -ySpeed;
				});
		Timeline t = new Timeline(k);
		t.setCycleCount(Timeline.INDEFINITE);
		t.play();
	}//end of start(stage)
}
