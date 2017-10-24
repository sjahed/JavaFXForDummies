package chapter3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AddSubtract3 extends Application{

	private Button addBtn,subBtn;
	private Label showResultLbl;
	private int result = 0;
	
	public static void main(String [] args){
		launch(args);
	}
	
	@Override
	public void start(Stage stage){		
		addBtn = new Button("Add");
		addBtn.setOnAction(e -> addClicked());
		subBtn = new Button("Subtract");
		subBtn.setOnAction(e -> subClicked());
		showResultLbl = new Label();
		showResultLbl.setText(Integer.toString(result));
		
		HBox pane = new HBox(10);
		pane.getChildren().addAll(showResultLbl,addBtn,subBtn);
		
		Scene s = new Scene(pane, 200, 75);
		stage.setScene(s);
		stage.setTitle("Add/Subtract3");
		stage.show();
	}
	
	private void addClicked(){
		++result;
		showResultLbl.setText(Integer.toString(result));
	}
	
	private void subClicked(){
		--result;
		showResultLbl.setText(Integer.toString(result));
	}
}
