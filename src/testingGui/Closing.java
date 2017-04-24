package testingGui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Closing extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("thenewboston - JavaFX");
        button = new Button("Click me");
        button.setOnAction(e -> closeProgram());

        window.setOnCloseRequest(e -> 
        {
        	//tells java to ignore event and let us take care of it
        	e.consume();
        	closeProgram();        	
        });
        
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);

        window.setScene(scene);
        window.show();
    }

    private void closeProgram()
    {
    	boolean answer = ConfirmationBox.display("exit question", "Are you sure you want to exit");
    	//Do something before closing window
    	if (answer) 
    	{
    	System.out.println("file is saved");
    	window.close();
    	}
    }

}