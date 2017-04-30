package core_JavaFX.Vladislav_Kavunenko.L1_Button;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JFX3_Label extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception { 
		Pane root = new Pane(); 
		 
		Label label1 = new Label(); // создаём надпись
		label1.setText("Просто надпись"); // создаём текст надписи 
		
		root.getChildren().addAll(label1); // добавляем надпись в root
		Scene scene1 = new Scene(root,600,600);  
		primaryStage.setScene(scene1);
		primaryStage.show();
	}

}
