package chapter16;

import java.io.File;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ImageViewerProgram extends Application{

	public static void main(String[] args){
		launch(args);
	}
	
	private final String PATH = "/Users/sjahed/Pictures/testPics/";
	@Override
	public void start(Stage stage){
		TilePane tile = new TilePane(20,20);
		tile.setPadding(new Insets(20));
		tile.setPrefColumns(4);
		
		File dir = new File(PATH);
		File[] files = dir.listFiles();
		
		for(File f: files){
			
			Image img = new Image(f.toURI().toString(), 200, 200, true, true);
			
			ImageView iView = new ImageView(img);
			iView.setFitWidth(200);
			iView.setFitHeight(200);
			iView.setPreserveRatio(true);
			
			Text txt = new Text(f.getName());
			System.out.println(f.getName());
			txt.setFont(new Font("Times New Roman",16));
			
			Region spacer = new Region();
			
			VBox box = new VBox(10, iView, spacer, txt);
			box.setVgrow(spacer, Priority.ALWAYS);
			box.setAlignment(Pos.CENTER);
			tile.getChildren().add(box);
			
		}//end of for(file in files)
		
		ScrollPane scroll = new ScrollPane(tile);
		scroll.setMinWidth(920);
		scroll.setMinHeight(450);
		
		Scene s = new Scene(scroll);
		stage.setScene(s);
		stage.show();
	}//end of start(stage)
}//end of ImageViewerProgram
