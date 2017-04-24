package testingGui;

import javafx.event.ActionEvent;

import com.sun.scenario.effect.impl.prism.PrImage;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class PopupBox extends Application {

	Stage window;
	Button button;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		window = primaryStage;
		window.setTitle("Testing Pop ups");
		
		button = new Button("click me");
		button.setOnAction(e -> {
			boolean answer = ConfirmationBox.display("Warning","Virus Detected");
			System.out.println(answer);
		});
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
		
	}
}
