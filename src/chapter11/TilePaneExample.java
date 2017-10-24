package chapter11;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TilePaneExample extends Application{

	public static void main(String []args){
		launch();
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		TilePane pane = new TilePane();
		pane.setHgap(10);
		pane.setVgap(10);
		pane.setPadding(new Insets(10));
		
		for(int i = 0; i < 13;i++){
			Rectangle r = new Rectangle(100,100);
			r.setFill(Color.LIGHTBLUE);
			Label l = new Label("A-"+i);
			StackPane s = new StackPane(r,l);
			pane.getChildren().add(s);
		}
		ScrollPane scrollPane = new ScrollPane(pane);
		Scene scene = new Scene(scrollPane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	
}
