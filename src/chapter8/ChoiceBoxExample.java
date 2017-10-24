package chapter8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ChoiceBoxExample extends Application{

	public static void main(String []args){
		launch(args);
	}
	
	@Override
	public void start(Stage stage){
		ChoiceBox<String> cb = new ChoiceBox<String>();
		String[] list = {"A","B","C","D"};
		
		cb.getItems().addAll(list);
		cb.setValue("C");
		Label lbl = new Label(cb.getSelectionModel().getSelectedItem());
		cb.getSelectionModel().selectedItemProperty().addListener((v,oldV,newV) ->lbl.setText(newV));
		HBox hb = new HBox();
		hb.getChildren().addAll(lbl,cb);
		Scene s = new Scene(hb,100,100);
		stage.setScene(s);
		stage.show();
		
	}
}
