package core_JavaFX.Vladislav_Kavunenko;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class JFX7_CheckBox extends Application {

	public static void main(String[] args) {
		launch (args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Окно приложения");
		BorderPane root = new BorderPane();
		
		Scene scene1 = new Scene(root,500,500);
		primaryStage.setScene(scene1);
		primaryStage.show();
	}
	
	
	
	

}
