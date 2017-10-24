package chapter16;

import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class SampleImageLoading extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage){
		File f = new File("/Users/sjahed/Desktop/reservation.png");
		Image img = new Image(f.toURI().toString(), 400, 400, false , true);
		ImageView imgV = new ImageView(img);
		imgV.setFitHeight(400);
		imgV.setFitWidth(400);
		//imgV.setPreserveRatio(true);
		
		TilePane pane = new TilePane(10, 10);
		pane.getChildren().add(imgV);
		
		Scene s = new Scene(pane);
		stage.setScene(s);
		stage.show();
	}

}
