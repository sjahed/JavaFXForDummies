package chapter4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SceneSwitcher extends Application{

	public static void main(String [] args){
		launch(args);
	}
	
	int clickCounter = 0;
	Label lblClicks;
	Button clickMeBtn, switchToScene2Btn;
	Scene scene1;
	
	int counter = 0;
	Label lblCounter;
	Button addBtn, subBtn, switchToScene1Btn;
	Scene scene2;
	
	Stage stage;
	
	@Override
	public void start(Stage primaryStage){
		stage = primaryStage;
		
		lblClicks = new Label();
		lblClicks.setText("You have not clicked the button");
		
		clickMeBtn = new Button("Click Me Please");
		clickMeBtn.setOnAction(e -> clickMeBtnClick());
		
		switchToScene2Btn = new Button("Switch!");
		switchToScene2Btn.setOnAction(e -> switchToScene2BtnClick());
		
		VBox panel = new VBox(10);
		panel.getChildren().addAll(lblClicks, clickMeBtn,switchToScene2Btn);
		scene1 = new Scene(panel, 250,150);
		
		lblCounter = new Label(Integer.toString(counter));
		addBtn = new Button("Add");
		addBtn.setOnAction(e -> addBtnClick());
		
		subBtn = new Button("Subtract");
		subBtn.setOnAction(e -> subBtnClick());
		
		switchToScene1Btn = new Button("Switch");
		switchToScene1Btn.setOnAction(e -> swithToScene1BtnClick());
		
		HBox panel2 = new HBox(10);
		panel2.getChildren().addAll(lblCounter, addBtn, subBtn, switchToScene1Btn);
		scene2 = new Scene(panel2, 300,75);
		
		primaryStage.setScene(scene1);
		primaryStage.setTitle("Switch Program");
		primaryStage.show();
	}//end of start(stage)

	private void swithToScene1BtnClick() {
		stage.setScene(scene1);
	}

	private void subBtnClick() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Hello");
		alert.setHeaderText("Header Text");
		alert.setContentText("some content");
		alert.showAndWait();
	}

	private void addBtnClick() {
		
	}

	private void switchToScene2BtnClick() {
		stage.setScene(scene2);
	}

	private void clickMeBtnClick() {
		++counter;
		lblClicks.setText("You have clicked "+counter+" times.");
	}
}//end of SceneSwitcher
