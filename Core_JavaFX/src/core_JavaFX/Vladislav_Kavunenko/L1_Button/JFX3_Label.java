package core_JavaFX.Vladislav_Kavunenko.L1_Button;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JFX3_Label extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception { 
		Pane root = new Pane(); 
		 
		Label label1 = new Label(); // создаём метку с надписью
		label1.setText("Просто надпись"); // создаём текст надписи  
		 
		Image image1 = new Image(getClass().getResourceAsStream("200_4.jpg")); //создаём метку с картинкой
		ImageView img1 = new ImageView(); 
		img1.setFitHeight(300); 
		img1.setFitWidth(300); 
				
		
		root.getChildren().addAll(label1); // добавляем метку с надписью в root
		Scene scene1 = new Scene(root,600,600);  
		primaryStage.setScene(scene1);
		primaryStage.show();
	}

}
