package testingGui;

import com.sun.scenario.effect.impl.prism.PrImage;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class Main extends Application{
	
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub ASas
		arg0.setTitle("Banking System");
		button = new Button();
		button.setText("Create New user");
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout,300,250);
		arg0.setScene(scene);
		
		arg0.show();
	}
}
