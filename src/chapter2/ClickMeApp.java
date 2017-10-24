package chapter2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClickMeApp extends Application{

	public static void main(String []args){
		launch(args);
	}
	
	Button btn;
	Label lbl;
	int counter;
	@Override
	public void start(Stage stage){
		counter = 0;
		lbl = new Label("Clicked: "+counter);
		
		btn = new Button();
		btn.setText("Click Me Please");
		btn.setOnAction(e -> buttonClick());
		
		BorderPane pane = new BorderPane();
		pane.setCenter(btn);
		pane.setTop(lbl);
		
		Scene s = new Scene(pane, 300,250);
		stage.setScene(s);
		stage.setTitle("The Click Me App");
		stage.show();
	}//end of start(stage)
	
	public void buttonClick(){
		++counter;
		if(btn.getText() == "Click Me Please")
			btn.setText("Button Clicked!");
		else
			btn.setText("Click Me Please");
		lbl.setText("Clicked: "+counter);
	}//end of buttonClick()
}//end of ClickMeApp
