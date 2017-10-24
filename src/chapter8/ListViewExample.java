package chapter8;



import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.SelectionModel;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ListViewExample extends Application{

	public static void main(String []args){
		launch(args);
	}
	
	@Override
	public void start(Stage stage){
		String[] list = {"Abdul","Boby","Charlie","Dickenson","Ephilia","Frank","John","Howard"};
		ListView<String> lv = new ListView<String>();
		lv.getItems().addAll(list);
		//lv.setOrientation(Orientation.HORIZONTAL);
		lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		HBox hb = new HBox();
		hb.getChildren().add(lv);
		Scene s = new Scene(hb,100,100);
		stage.setScene(s);
		stage.show();
		
	}
}
