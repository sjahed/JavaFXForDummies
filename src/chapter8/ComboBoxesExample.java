package chapter8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ComboBoxesExample extends Application{

	public static void main(String []args){
		launch(args);
	}
	
	@Override
	public void start(Stage stage){
		ComboBox<String> cb = new ComboBox<String>();
		String[] list = {"A","B","C","D"};
		
		cb.getItems().addAll(list);
		cb.setEditable(true);
		cb.setVisibleRowCount(2);
		cb.setPromptText("Enter Value here");
		
		Label lbl = new Label(cb.getValue());
		cb.setOnAction(e -> lbl.setText(cb.getValue()));
		HBox hb = new HBox();
		hb.getChildren().addAll(lbl,cb);
		Scene s = new Scene(hb,100,100);
		stage.setScene(s);
		stage.show();
		
	}
}
