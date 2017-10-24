package chapter16;

import java.io.File;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class AudioApp extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	private final String PATH = "/Users/sjahed/Movies/testVideos/SampleAudioB.mp3";
	
	@Override
	public void start(Stage stage){
		Button btn = new Button("Play");
		btn.setOnAction(e -> playMedia());
		
		Button stopBtn = new Button("Stop");
		stopBtn.setOnAction( e -> playMedia());
		
		HBox box = new HBox(20,btn,stopBtn);
		box.setPadding(new Insets(20));
		
		Scene s = new Scene(box);
		stage.setScene(s);
		stage.show();
	}//end of start(stage)
	
	private void playMedia(){
		File f = new File(PATH);
		Media media = new Media(f.toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		if(!mediaPlayer.isAutoPlay())
			mediaPlayer.setAutoPlay(true);
		else
			mediaPlayer.setAutoPlay(false);
	}	
}//end of AudioApp()
