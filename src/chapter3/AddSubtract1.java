package chapter3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AddSubtract1 extends Application implements EventHandler<ActionEvent> {

	private Button addBtn,subBtn;
	private Label showResultLbl;
	private int result = 0;
	public static void main(String []args){
		launch(args);
	}

	@Override
	public void start(Stage stage){
		addBtn = new Button("Add");
		addBtn.setOnAction(this);
		subBtn = new Button("Subtract");
		subBtn.setOnAction(this);
		showResultLbl = new Label();
		showResultLbl.setText(Integer.toString(result));
		
		HBox pane = new HBox(10);
		pane.getChildren().addAll(showResultLbl,addBtn,subBtn);
		
		Scene s = new Scene(pane, 200, 75);
		stage.setScene(s);
		stage.setTitle("Add/Subtract");
		stage.show();
		
		
	}
	@Override
	public void handle(ActionEvent event) {
		
		if(event.getSource() == addBtn)
			++result;
		else if(event.getSource() == subBtn)
			--result;
		showResultLbl.setText(Integer.toString(result));
		
	}

}
