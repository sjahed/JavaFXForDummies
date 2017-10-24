package chapter19;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ColorPickerExample extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage){
		
		ColorPicker picker = new ColorPicker();
		
		Circle c = new Circle(50,50,10);
		c.setFill(Color.BLACK);
		c.setStroke(Color.RED);
		c.setStrokeWidth(3);
		
		HBox pane = new HBox(10);
		pane.setPadding(new Insets(10));
		pane.getChildren().addAll(picker,c);
		
		picker.setOnAction(e -> c.setFill(picker.getValue()));
		
		Scene s = new Scene(pane);
		stage.setScene(s);
		stage.show();
	}

}
