package chapter15;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RolePlayer extends Application {

	public static void main(String[] args){
		launch(args);
	}

	TextField txtCharacter, txtActor;
	@Override
	public void start(Stage stage){
		
		Label lblCharacter = new Label("Character");
		lblCharacter.setMinWidth(100);
		lblCharacter.setAlignment(Pos.BOTTOM_RIGHT);
		
		txtCharacter = new TextField();
		txtCharacter.setMinWidth(200);
		txtCharacter.setMaxWidth(200);
		
		Label lblActor = new Label("Actor");
		lblActor.setMinWidth(100);
		lblActor.setAlignment(Pos.BOTTOM_RIGHT);
		
		txtActor = new TextField();
		txtActor.setMinWidth(200);
		txtActor.setMaxWidth(200);
		
		Label lblR1 = new Label("The role of ");
		Label lblR2 = new Label();
		Label lblR3 = new Label( " will be played by ");
		Label lblR4 = new Label();
		
		HBox paneChar = new HBox(20, lblCharacter, txtCharacter);
		paneChar.setPadding(new Insets(10));
		
		HBox paneActor = new HBox(20, lblActor, txtActor);
		paneActor.setPadding(new Insets(10));
		
		HBox paneRole = new HBox(lblR1, lblR2, lblR3, lblR4);
		paneRole.setPadding(new Insets(10));
		
		VBox pane = new VBox(10, paneChar, paneActor, paneRole);
		
		lblR2.textProperty().bind(txtCharacter.textProperty());
		lblR4.textProperty().bind(txtActor.textProperty());
		
		Scene s = new Scene(pane);
		stage.setScene(s);
		stage.show();
	}

}
