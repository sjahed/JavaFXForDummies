package chapter13;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DrawingShapes extends Application {

	public static void main(String [] args){
		launch(args);
	}
	
	@Override
	public void start(Stage stage){
		Group group1 = new Group();
		for(int i = 0; i < 600; i+=10){
			Line line1 = new Line(i,0,i,600);
			line1.setStroke(Color.LIGHTGREY);
			Line line2 = new Line(0,i,600,i);
			line2.setStroke(Color.LIGHTGRAY);
			group1.getChildren().addAll(line1, line2);
		}//end of for(line)
		
		Rectangle r1 = new Rectangle(50,25,100,140);
		r1.setStroke(Color.BLACK);
		r1.setFill(null);
		r1.setStrokeWidth(3);
		group1.getChildren().add(r1);
		
		Rectangle r2 = new Rectangle(250,25,100,140); 
		r2.setStroke(Color.BLACK);
		r2.setFill(null);
		r2.setStrokeWidth(3);
		r2.setArcWidth(25);
		r2.setArcHeight(25); 
		group1.getChildren().add(r2);
		
		Rectangle r3 = new Rectangle(450,25,100,140); 
		r3.setStroke(Color.BLUE);
		r3.setFill(Color.rgb(255, 0, 0, 0.2));
		r3.setStrokeWidth(10);
		r3.setArcWidth(75);
		r3.setArcHeight(125);
		group1.getChildren().add(r3);
		
		Circle c1 = new Circle(100, 300, 75); 
		c1.setStroke(Color.BLACK); 
		c1.setFill(null); 
		c1.setStrokeWidth(3); 
		group1.getChildren().add(c1);
		
		Ellipse e1 = new Ellipse(300, 300, 75, 40); 
		e1.setStroke(Color.BLACK); 
		e1.setFill(null);
		e1.setStrokeWidth(3); 
		group1.getChildren().add(e1);
		
		Ellipse e2 = new Ellipse(500,300,40,75);
		e2.setFill(null);
		e2.setStroke(Color.BLACK);
		e2.setStrokeWidth(3);
		group1.getChildren().add(e2);
		
		Arc a1 = new Arc(150, 550,100,100,90,90);
		a1.setType(ArcType.ROUND);
		a1.setStroke(Color.BLACK);
		a1.setFill(null);
		a1.setStrokeWidth(3);
		group1.getChildren().add(a1);
		
		Arc a2 = new Arc(300, 550, 100, 100, 45, 90); 
		a2.setType(ArcType.CHORD); 
		a2.setStroke(Color.BLACK);
		a2.setFill(null);
		a2.setStrokeWidth(3); 
		a2.setFill(Color.rgb(0, 0, 0, 0.2));
		group1.getChildren().add(a2);
		
		LinearGradient gradient1 = new LinearGradient(
				0, 0,
				0, 1,
				true,
				CycleMethod.NO_CYCLE,
				new Stop(0.2, Color.WHITE), 
				new Stop(0.8, Color.BLACK)
				);
		
		Text text1 = new Text(100,50,"Hello World!");
		text1.setStrokeWidth(1);
		text1.setStroke(Color.BLACK);
		text1.setFont(new Font("Times New Roman",60));
		text1.setFill(gradient1);
		group1.getChildren().add(text1);
		
		group1.setRotate(30);
		group1.setTranslateX(110);
		group1.setTranslateY(110);
		//group1.setScale();
		Scene s = new Scene(new ScrollPane(group1));
		stage.setScene(s);
		stage.show();
	}//end of start(stage)
}
