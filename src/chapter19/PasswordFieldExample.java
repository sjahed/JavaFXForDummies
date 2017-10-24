package chapter19;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PasswordFieldExample extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage){
		Label userNameLbl = new Label("User Name:");
		Label passwordLbl = new Label("Password:");
		
		userNameLbl.setMinWidth(30);
		passwordLbl.setMinWidth(30);
		userNameLbl.setAlignment(Pos.BASELINE_RIGHT);
		passwordLbl.setAlignment(Pos.BASELINE_RIGHT);
		
		TextField userNameTxtFld = new TextField();
		userNameTxtFld.setMinWidth(100);
		PasswordField passwordFld = new PasswordField();
		passwordFld.setMinWidth(80);
		
		HBox r1 = new HBox(10);
		r1.setPadding(new Insets(10));
		r1.getChildren().addAll(userNameLbl,userNameTxtFld);
		HBox r2 = new HBox(10);
		r2.setPadding(new Insets(10));
		r2.getChildren().addAll(passwordLbl, passwordFld);
		
		VBox pane = new VBox(10);
		pane.getChildren().addAll(r1,r2);
		
		Scene s = new Scene(pane);
		stage.setScene(s);
		stage.show();
	}

}
