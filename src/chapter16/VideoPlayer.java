package chapter16;

import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class VideoPlayer extends Application{

	public static void main(String[] args){
		launch(args);
	}
	
	private final String PATH = "/Users/sjahed/Movies/testVideos/SampleVideoA.mp4";
	
	@Override
	public void start(Stage stage){
		File f = new File(PATH);
		Media m = new Media(f.toURI().toString());
		MediaPlayer mp = new MediaPlayer(m);
		mp.setAutoPlay(true);
		
		MediaView mView = new MediaView(mp);
		mView.setFitHeight(500);
		mView.setFitWidth(700);
		
		StackPane pane = new StackPane(mView);
		
		Scene s = new Scene(pane);
		stage.setScene(s);
		stage.show();
	}//end of start(stage)
}//end of videoApp
