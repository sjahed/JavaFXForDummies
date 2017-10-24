package chapter20;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.PointLight;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ThreeDExample extends Application{

	
	public static void main(String[] args){
		launch(args);
	}
	
	@Override
	public void start(Stage stage){
		
		Cylinder cylinder = new Cylinder(100,100);
		PhongMaterial blueStuff = new PhongMaterial();
		blueStuff.setDiffuseColor(Color.LIGHTBLUE);
		blueStuff.setSpecularColor(Color.BLUE);
		cylinder.setMaterial(blueStuff);
		cylinder.setTranslateX(-200);
		cylinder.setTranslateY(200);
		cylinder.setTranslateZ(200);
		
		
		Box box = new Box(100, 100, 100); 
		box.setMaterial(blueStuff); 
		box.setTranslateX(150); 
		box.setTranslateY(-100); 
		box.setTranslateZ(-100); 
		
		Rotate rxBox = new Rotate(0, 0, 0, 0, Rotate.X_AXIS); 
		Rotate ryBox = new Rotate(0, 0, 0, 0, Rotate.Y_AXIS); 
		Rotate rzBox = new Rotate(0, 0, 0, 0, Rotate.Z_AXIS); 
		rxBox.setAngle(30);
		ryBox.setAngle(50);
		rzBox.setAngle(30); 
		box.getTransforms().addAll(rxBox, ryBox, rzBox);
		
		RotateTransition rt1 = new RotateTransition(); 
		rt1.setNode(box); 
		rt1.setDuration(Duration.millis(3000)); 
		rt1.setAxis(Rotate.Z_AXIS); 
		rt1.setByAngle(360); 
		rt1.setCycleCount(Animation.INDEFINITE); 
		rt1.setInterpolator(Interpolator.LINEAR); 
		rt1.play();
		
		PointLight light = new PointLight(Color.WHITE); 
		light.setTranslateX(-1000); 
		light.setTranslateY(100); 
		light.setTranslateZ(-1000); 
		
		Group root = new Group();
		root.getChildren().addAll(cylinder,box,light);
		Scene s = new Scene(root, 800,800);
		
		PerspectiveCamera camera = new PerspectiveCamera(true);
		camera.setTranslateZ(-1000);
		camera.setNearClip(0.1);
		camera.setFarClip(2000);
		camera.setFieldOfView(35);
		s.setCamera(camera);
		
		stage.setScene(s);
		stage.show();
		
	}//end of start(stage)
	
}//end of ThreeDExample
