package chapter19;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ProgressIndicatorExample extends Application{

	public static void main(String[] args){
		launch(args);
	}
	
	@Override
	public void start(Stage stage){

			Label progressIndicatorLbl = new Label("Progress Indicator");
			Label progressBarLbl = new Label("Progress Bar");
			
			ProgressIndicator indeterminatePI = new ProgressIndicator();
			ProgressIndicator determinatePI = new ProgressIndicator();
			determinatePI.setProgress(0.50);
			ProgressBar indeterminatePB = new ProgressBar();
			ProgressBar determinatePB = new ProgressBar();
			determinatePB.setProgress(0.75);
			
			HBox fRow = new HBox(20);
			fRow.setPadding(new Insets(10));
			fRow.getChildren().addAll(progressIndicatorLbl, indeterminatePI,determinatePI);
			
			HBox sRow = new HBox(20);
			sRow.setPadding(new Insets(10));
			sRow.getChildren().addAll(progressBarLbl, indeterminatePB, determinatePB);
			
			VBox pane = new VBox(10);
			pane.setPadding(new Insets(10));
			pane.getChildren().addAll(fRow,sRow);
			
			Scene s = new Scene(pane);
			stage.setScene(s);
			stage.show();
			
	}
}
