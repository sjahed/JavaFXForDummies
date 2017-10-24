package chapter19;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SliderExample extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	
	@Override
	public void start(Stage stage){
	
		VBox s1 = makeSlider(10);
		VBox s2 = makeSlider(20);
		VBox s3 = makeSlider(90);
		VBox s4 = makeSlider(30);
		VBox s5 = makeSlider(12);
		TilePane pane  = new TilePane(10, 10);
		pane.getChildren().addAll(s1,s2,s3,s4,s5);
		pane.setPrefColumns(5);
		pane.setPadding(new Insets(20));
		Scene s = new Scene(pane);
		stage.setScene(s);
		stage.show();
	}
	
	private VBox makeSlider(int value){
		Text text = new Text();
		text.setFont(new Font("sans-serif",10));
		text.setText(Integer.toString(value));
		Slider s = new Slider();
		s.setOrientation(Orientation.VERTICAL);
		s.setPrefHeight(150);
		s.setShowTickMarks(true);
		s.setMajorTickUnit(10);
		s.setMin(0);
		s.setShowTickLabels(false);
		s.setValue(value);
		s.valueProperty().addListener((e, oldV, newV) -> 
			{
				
				text.setText(Integer.toString(newV.intValue()));
			}	
				);
		
		VBox box = new VBox(10, s, text);
		box.setPadding(new Insets(10));
		box.setAlignment(Pos.CENTER);
		box.setMinWidth(30);
		box.setMaxWidth(30);
		box.setPrefWidth(30);
		return box;
	}//end of makeSlider(value)
}
