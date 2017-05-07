package core_JavaFX.TimurBaturshinov;


import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class JFX_11 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("HBox Experiment 1");

		Button button = new Button("My Button");

		Scene scene = new Scene(button, 200, 100);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
