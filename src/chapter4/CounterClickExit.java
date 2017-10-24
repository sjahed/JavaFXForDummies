package chapter4;

import java.util.Optional;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class CounterClickExit extends Application{

	public static void main(String []args){
		launch(args);
	}
	
	Button btn, closeBtn;
	Label lbl;
	int counter;
	Stage stage;
	@Override
	public void start(Stage primaryStage){
		stage = primaryStage;
		counter = 0;
		lbl = new Label("Clicked: "+counter);
		
		btn = new Button();
		btn.setText("Click Me Please");
		btn.setOnAction(e -> buttonClick());
		
		closeBtn = new Button("Close");
		closeBtn.setOnAction(e -> closeBtnClick());
		
		BorderPane pane = new BorderPane();
		pane.setCenter(btn);
		pane.setTop(lbl);
		pane.setBottom(closeBtn);
		
		Scene s = new Scene(pane, 300,250);
		primaryStage.setScene(s);
		primaryStage.setTitle("The Click Me App");
		primaryStage.setOnCloseRequest(e -> {
			e.consume();
			closeBtnClick();
		});
		primaryStage.show();
	}//end of start(stage)
	
	public void buttonClick(){
		++counter;
		if(btn.getText() == "Click Me Please")
			btn.setText("Button Clicked!");
		else
			btn.setText("Click Me Please");
		lbl.setText("Clicked: "+counter);
	}//end of buttonClick()
	
	public void closeBtnClick(){
		
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Exit?");
		alert.setContentText("Are you sure you want to exit?");
		alert.setHeaderText("Read the options!");
		Optional<ButtonType> result = alert.showAndWait();
		
		if(result.get() == ButtonType.OK)
			stage.close();
	}
}
