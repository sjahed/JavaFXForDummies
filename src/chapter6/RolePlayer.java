package chapter6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RolePlayer extends Application{

	public static void main(String []args){
		launch(args);
	}
	
	TextField charTxtField, actorTxtField;
	@Override
	public void start(Stage stage){
		Label charLbl = new Label("Character's Name:");
		charLbl.setMinWidth(100);
		charLbl.setAlignment(Pos.BOTTOM_RIGHT);
		
		charTxtField = new TextField();
		charTxtField.setMinWidth(200);
		charTxtField.setMaxWidth(200);
		charTxtField.setPromptText("Enter name of character");
		
		Label actorLbl = new Label("Actor's Name:");
		actorLbl.setMinWidth(100);
		actorLbl.setAlignment(Pos.BOTTOM_RIGHT);
		
		actorTxtField = new TextField();
		actorTxtField.setMinWidth(200);
		actorTxtField.setMaxWidth(200);
		actorTxtField.setPromptText("Enter Name of Actor here");
		
		Button okBtn = new Button("Ok");
		okBtn.setMinWidth(75);
		okBtn.setOnAction(e -> okBtnClick());
		
		HBox paneCharacter = new HBox(20, charLbl, charTxtField);
		paneCharacter.setPadding(new Insets(10));
		
		HBox paneActor = new HBox(20, actorLbl, actorTxtField);
		paneActor.setPadding(new Insets(10));
		
		HBox paneButton = new HBox(20, okBtn);
		paneButton.setPadding(new Insets(10));
		paneButton.setAlignment(Pos.BOTTOM_RIGHT);
		
		VBox pane = new VBox(10, paneCharacter, paneActor, paneButton);
		
		Scene s = new Scene(pane);
		stage.setScene(s);
		stage.show();
	}//end of start()
	
	public void okBtnClick(){
		String errorMsg = "";
		if(charTxtField.getText().length() == 0 || actorTxtField.getText().length() == 0)
			errorMsg += "\nCharacter is required field.";
		if(errorMsg.length() != 0){
			String msg = "The role of "+ charTxtField.getText() + " will be played by "+actorTxtField.getText()+".";
			System.out.println(msg);
		}
	}
}
