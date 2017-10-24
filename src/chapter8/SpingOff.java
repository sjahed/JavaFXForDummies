package chapter8;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SpingOff extends Application{
	
	public static void main(String []args){
		launch(args);
	}
	
	TreeView<String> tree;
	Label lblShowName;
	
	@Override
	public void start(Stage stage){
		
		TreeItem<String> root, andy, archie, happy, george, maude;
		
		root = new TreeItem<String>("Sping Offs");
		root.setExpanded(true);
		andy = makeShow("The Andy Grifth Show", root);
		makeShow("Gomer Pyle, U.S.M.C.", andy);
		makeShow("Merry Berry R.F.D.", andy);
		
		archie = makeShow("All in the Family", root);
		george = makeShow("The Jeffersons", root);
		makeShow("Checking In", george);
		maude = makeShow("Maude", archie);
		makeShow("Good Times", maude);
		makeShow("Gloria", maude);
		makeShow("Archie Bunker's Place",archie);
		
		happy = makeShow("Happy Days",root);
		makeShow("Mork And Mindy", happy);
		makeShow("Laverene and Shirley", happy);
		
		tree = new TreeView<String>(root);
		tree.setShowRoot(false);
		tree.getSelectionModel().selectedItemProperty().addListener((v, oldV, newV) -> treeSelectionChanged(newV));
		
		lblShowName = new Label();
		VBox pane = new VBox(10);
		pane.setPadding(new Insets(20));
		pane.getChildren().addAll(tree,lblShowName);
		
		Scene s = new Scene(pane);
		
		stage.setScene(s);
		stage.show();
	}//end of start(stage)

	public TreeItem<String> makeShow(String title, TreeItem<String> parent){
		TreeItem<String> show = new TreeItem<String>(title);
		show.setExpanded(true);
		parent.getChildren().add(show);
		return show;
	}
	public void treeSelectionChanged(TreeItem<String> item){
		if(item != null)
			lblShowName.setText(item.getValue());
	}
}
