package chapter9;



import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MovieDatabase extends Application{

	public static void main(String [] args){
		launch(args);
	}
	@Override
	public void start(Stage primaryStage){
		
		Label lblHeading = new Label("Movie Inventory");
		lblHeading.setFont(new Font("Arial",20));
		
		TableView<Movie> table = new TableView<Movie>();
		table.setItems(loadData());
		
		TableColumn<Movie, String> colTitle = new TableColumn("Title");
		colTitle.setMinWidth(300);
		colTitle.setCellValueFactory( new PropertyValueFactory<Movie, String>("Title"));
		
		TableColumn<Movie, Integer> colYear = new TableColumn("Year");
		colYear.setMinWidth(80);
		colYear.setStyle("-fx-alignment: CENTER-RIGHT;");
		colYear.setCellValueFactory( new PropertyValueFactory<Movie, Integer>("Year"));
		
		TableColumn<Movie, Double> colPrice = new TableColumn("Price");
		colPrice.setMinWidth(80);
		colPrice.setCellValueFactory( new PropertyValueFactory<Movie, Double>("Price"));
		
		table.getColumns().addAll(colTitle, colYear, colPrice);
		VBox pane = new VBox();
		pane.setSpacing(10);
		pane.setPadding(new Insets(10));
		pane.getChildren().addAll(lblHeading, table);
		
		Scene s = new Scene(pane);
		primaryStage.setScene(s);
		primaryStage.show();
	}

	public ObservableList<Movie> loadData(){
		ObservableList<Movie> data = FXCollections.observableArrayList();
		data.add(new Movie("It's wonderful life",1946,10.99));
		data.add(new Movie("Casablanca",1943,12.99));
		data.add(new Movie("The Terminator",1987,8.99));
		data.add(new Movie("Gangs of New York",1999,10.99));
		data.add(new Movie("There will be blood",2000,15.99));
		data.add(new Movie("La La Land",2016,20.99));
		data.add(new Movie("The King's Speech",2010,10.99));
		return data;
	}
}

