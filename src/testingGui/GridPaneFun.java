package testingGui;

/**
 * GridPane
 * @author: Lance Pereira
 * @course: ICS4U1
 * @date: Apr 23, 2017
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneFun extends Application {

	Stage window;

	public static void main(String[] args) {
		launch(args);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Lance Random Project");

		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(8);
		grid.setHgap(8);

		// Name label
		Label label = new Label("Username");
		GridPane.setConstraints(label, 0, 0);

		// Name Input
		TextField text = new TextField("Username");
		GridPane.setConstraints(text, 1, 0);

		// Password Label
		Label passlabel = new Label("Password");
		GridPane.setConstraints(passlabel, 0, 1);

		// Password Input
		PasswordField passtext = new PasswordField();
		passtext.setPromptText("Password");
		GridPane.setConstraints(passtext, 1, 1);

		Button loginButton = new Button("Loign");
		GridPane.setConstraints(loginButton, 1, 2);
		
		grid.getChildren().addAll(label,text,passlabel,passtext,loginButton);
		
		Scene scene = new Scene(grid,300,300);
		
		window.setScene(scene);
		window.show();
	}
}










