package chapter19;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class DatePickerExample extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage){
		
		Label showDate = new Label("Date Appears Here");
		
		DatePicker dp = new DatePicker();
		dp.setOnAction( e -> showDate.setText(dp.getValue().toString()));
		
		HBox pane = new HBox(20);
		pane.setPadding(new Insets(10));
		pane.getChildren().addAll(dp, showDate);
		pane.setMinSize(400, 100);
		Scene s = new Scene(pane);
		stage.setScene(s);
		stage.show();
	}
}
