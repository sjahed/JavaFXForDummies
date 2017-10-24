package chapter12;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PizzaOrderCaspian extends Application{

	public static void main(String []args){
		launch(args);
	}
	
	Stage stage;
	TextField txtName, txtPhone, txtAddress;
	RadioButton rdoSmall, rdoMedium, rdoLarge;
	RadioButton rdoThin, rdoThick;
	CheckBox chkPepperoni, chkSausage, chkLinguica, chkOlives, chkMushrooms, chkAnchovies;
	private CheckBox chkTomatoes;
	
	@Override
	public void start(Stage primaryStage){
		stage = primaryStage;
		
		Text txtHeading = new Text("Order Your Pizza Now!");
		txtHeading.setFont(new Font(20));
		HBox paneTop = new HBox(txtHeading);
		paneTop.setPadding(new Insets(20,10,20,10));
		
		Label lblName = new Label("Name:");
		lblName.setPrefWidth(100);
		txtName = new TextField();
		txtName.setPrefColumnCount(20);
		txtName.setMaxWidth(Double.MAX_VALUE);
		HBox paneName = new HBox(lblName, txtName);
		
		Label lblPhone = new Label("Phone:");
		lblPhone.setPrefWidth(100);
		txtPhone = new TextField();
		txtPhone.setPrefColumnCount(20);
		txtPhone.setMaxWidth(Double.MAX_VALUE);
		HBox panePhone = new HBox(lblPhone, txtPhone);
		
		Label lblAddress = new Label("Address");
		lblAddress.setPrefWidth(100);
		txtAddress = new TextField();
		txtAddress.setPrefColumnCount(20);
		txtAddress.setMaxWidth(Double.MAX_VALUE);
		HBox paneAddress = new HBox(lblAddress, txtAddress);
		
		VBox paneCustomer = new VBox(10, paneName, panePhone, paneAddress);
		
		Label lblSize = new Label("Size");
		rdoSmall = new RadioButton("Small");
		rdoMedium = new RadioButton("Medium");
		rdoLarge = new RadioButton("Large");
		rdoMedium.setSelected(true);
		ToggleGroup groupSize = new ToggleGroup();
		rdoSmall.setToggleGroup(groupSize);
		rdoMedium.setToggleGroup(groupSize);
		rdoLarge.setToggleGroup(groupSize);
		
		VBox paneSize = new VBox(lblSize, rdoSmall, rdoMedium, rdoLarge);
		paneSize.setSpacing(10);
		
		Label lblCrust = new Label("Crust");
		rdoThin = new RadioButton("Thin");
		rdoThick = new RadioButton("Thick");
		rdoThin.setSelected(true);
		ToggleGroup groupCurst = new ToggleGroup();
		rdoThin.setToggleGroup(groupCurst);
		rdoThick.setToggleGroup(groupCurst);
		VBox paneCrust = new VBox(lblCrust, rdoThin, rdoThick);
		paneCrust.setSpacing(10);
		
		Label lblToppings = new Label("Toppings"); 
		chkPepperoni = new CheckBox("Pepperoni"); 
		chkSausage = new CheckBox("Sausage"); 
		chkLinguica = new CheckBox("Linguica"); 
		chkOlives = new CheckBox("Olives");
		chkMushrooms = new CheckBox("Mushrooms"); 
		chkTomatoes = new CheckBox("Tomatoes"); 
		chkAnchovies = new CheckBox("Anchovies");
		
		FlowPane paneToppings = new FlowPane(Orientation.VERTICAL,
				chkPepperoni, chkSausage, chkLinguica, chkOlives, chkMushrooms, chkTomatoes, chkAnchovies);
		paneToppings.setPadding(new Insets(10, 0, 10, 0)); 
		paneToppings.setHgap(20); paneToppings.setVgap(10); 
		paneToppings.setPrefWrapLength(100);
		
		VBox paneTopping = new VBox(lblToppings, paneToppings);
		
		HBox paneOrder = new HBox(50, paneSize, paneCrust, paneTopping);
		
		VBox paneCenter = new VBox(20, paneCustomer, paneOrder); 
		paneCenter.setPadding(new Insets(0,10, 0, 10));
		
		Button btnOK = new Button("OK"); 
		btnOK.setPrefWidth(80); 
		btnOK.setOnAction(e -> btnOK_Click() );
		btnOK.setId("btn-ok");
		
		Button btnCancel = new Button("Cancel"); 
		btnCancel.setPrefWidth(80); 
		btnCancel.setOnAction(e -> btnCancel_Click() );
		
		Region spacer = new Region();
		
		HBox paneBottom = new HBox(10, spacer, btnOK, btnCancel); 
		paneBottom.setHgrow(spacer, Priority.ALWAYS); 
		paneBottom.setPadding(new Insets(20, 10, 20, 10));

		ToggleGroup groupTheme = new ToggleGroup();
		RadioButton rdoModena = new RadioButton("Modena");
		rdoModena.setToggleGroup(groupTheme);
		rdoModena.setSelected(true);
		rdoModena.setOnAction(e -> 
			{ setUserAgentStylesheet(STYLESHEET_MODENA); 
			});
		RadioButton rdoCaspian = new RadioButton("Caspian");
		rdoCaspian.setToggleGroup(groupTheme);
		rdoCaspian.setOnAction(e -> {
			setUserAgentStylesheet(STYLESHEET_CASPIAN);
		});
		HBox paneTheme = new HBox(10, rdoModena, rdoCaspian);
		paneBottom.getChildren().add(paneTheme);
		
		BorderPane paneMain = new BorderPane(); 
		paneMain.setTop(paneTop); 
		paneMain.setCenter(paneCenter); 
		paneMain.setBottom(paneBottom);
		
		Scene scene = new Scene(paneMain); 
		scene.getStylesheets().add(getClass().getResource("/css/Simple.css").toExternalForm());
		primaryStage.setScene(scene); 
		primaryStage.setTitle("Pizza Order"); 
		primaryStage.show();
		
		
	}//end of start(stage)

	private Object btnCancel_Click() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object btnOK_Click() {
		// TODO Auto-generated method stub
		return null;
	}
	
}//end of PizzaOrder
