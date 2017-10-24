package chapter10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MenuBarExample extends Application{

	public static void main(String []args){
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		MenuItem menuItemNewGame = new MenuItem("_New Game");
		menuItemNewGame.setOnAction(e -> startNewGame());
		
		MenuItem menuItemPauseGame = new MenuItem("_Pause Game");
		menuItemPauseGame.setOnAction(e -> pauseGame());
		
		MenuItem menuItemQuitGame = new MenuItem("_Quit Game");
		menuItemQuitGame.setOnAction(e -> QuitGame());
		
		MenuItem menuItemExit = new MenuItem("E_xit");
		menuItemExit.setOnAction(e -> ExitProgram());
		
		Menu menuGame = new Menu("_Game");
		menuGame.getItems().addAll(menuItemNewGame, menuItemPauseGame, 
				menuItemQuitGame,new SeparatorMenuItem(), menuItemExit);
		
		CheckMenuItem soundCheckMenuItem = new CheckMenuItem("_Sound");
		soundCheckMenuItem.setSelected(true);
		
		CheckMenuItem musicCheckMenuItem = new CheckMenuItem("_Music");
		musicCheckMenuItem.setSelected(true);
		
		RadioMenuItem easyRadioMenuItem = new RadioMenuItem("Easy");
		easyRadioMenuItem.setSelected(true);
		RadioMenuItem mediumRadioMenuItem = new RadioMenuItem("Medium");
		RadioMenuItem hardRadioMenuItem = new RadioMenuItem("Hard");
		ToggleGroup levelGroup = new ToggleGroup();
		easyRadioMenuItem.setToggleGroup(levelGroup);
		mediumRadioMenuItem.setToggleGroup(levelGroup);
		hardRadioMenuItem.setToggleGroup(levelGroup);
		
		
		Menu menuOption = new Menu("_Options");
		menuOption.getItems().addAll(soundCheckMenuItem,musicCheckMenuItem, new SeparatorMenuItem(),
				easyRadioMenuItem,mediumRadioMenuItem,hardRadioMenuItem);
		
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().addAll(menuGame,menuOption);
		
		HBox pane = new HBox(menuBar);
		Scene s = new Scene(pane);
		primaryStage.setScene(s);
		primaryStage.show();
		
	}

	private Object ExitProgram() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object QuitGame() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object pauseGame() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object startNewGame() {
		// TODO Auto-generated method stub
		return null;
	}

}
