package testingGui;

/**
 * ExtractAndValidate
 * @author: Lance Pereira
 * @course: ICS4U1
 * @date: Apr 23, 2017
 */

import java.io.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ExtractAndValidate extends Application {

	Stage window;

	public static void main(String[] args) {
		launch(args);
	}

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

		// Password Label
		Label ageField = new Label("Age");
		GridPane.setConstraints(ageField, 0, 2);

		// Password Input
		TextField ageText = new TextField();
		ageText.setPromptText("Age");
		GridPane.setConstraints(ageText, 1, 2);

		Button loginButton = new Button("Loign");
		GridPane.setConstraints(loginButton, 1, 3);

		loginButton.setOnAction(e -> {
			if (convertAndCheck(ageText,ageText.getText())) {
				System.out.println("Name: " + text.getText());
				System.out.println("Password: " + passtext.getText());
				System.out.println(" ");
			}
			

		});

		grid.getChildren()
				.addAll(label, text, passlabel, passtext, loginButton, ageField,ageText);

		Scene scene = new Scene(grid, 300, 300);

		window.setScene(scene);

		window.show();

	}

	public boolean convertAndCheck(TextField text, String supposedNumber) {
		try {
			Integer.parseInt(supposedNumber);
		} catch (Exception e) {
			System.out.println(text.getText() + " is not a number");
			return false;
		}
		return true;
	}
}