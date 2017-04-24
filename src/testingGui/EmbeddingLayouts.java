package testingGui;

/**
 * EmbeddingLayouts
 * @author: Lance Pereira
 * @course: ICS4U1
 * @date: Apr 23, 2017
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class EmbeddingLayouts extends Application {

	Stage window;
	Button button;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Lance Random Project");
		button = new Button("Click me");

		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 300, 250);

		window.setScene(scene);
		window.show();
	}

}
