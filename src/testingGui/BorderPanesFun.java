package testingGui;

/**
 * BankGui
 * @author: Lance Pereira
 * @course: ICS4U1
 * @date: Apr 23, 2017
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BorderPanesFun extends Application {

	Stage window;
	Button button;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Lance Random Project");

		HBox topMenu = new HBox();
		Button buttonA = new Button("File");
		Button buttonB = new Button("Edit");
		Button buttonC = new Button("Source");
		topMenu.getChildren().addAll(buttonA, buttonB, buttonC);

		VBox sideMenu = new VBox();
		Button buttonD = new Button("A");
		Button buttonE = new Button("B");
		Button buttonF = new Button("C");
		sideMenu.getChildren().addAll(buttonD, buttonE, buttonF);
		
		BorderPane borderPane = new BorderPane();
		
		borderPane.setTop(topMenu);
		borderPane.setLeft(sideMenu);

		
		StackPane layout = new StackPane();
		layout.getChildren().add(borderPane);
		Scene scene = new Scene(layout, 300, 250);

		window.setScene(scene);
		window.show();
	}
}
