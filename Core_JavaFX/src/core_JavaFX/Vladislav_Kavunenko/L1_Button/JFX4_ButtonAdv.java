package core_JavaFX.Vladislav_Kavunenko.L1_Button;

import java.io.InputStream;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class JFX4_ButtonAdv extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Button button1 = new Button();
		button1.setText("Кнопка");
		button1.setTranslateX(150);
		button1.setTranslateY(150);

		Image image1 = new Image(getClass().getResourceAsStream("200_4.jpg"));
		ImageView img1 = new ImageView(image1);
		

		Group root = new Group(button1);
		Scene scene1 = new Scene(root, 500, 500);
		primaryStage.setTitle("Окно приложения");
		primaryStage.setScene(scene1);
		primaryStage.show();

	}

}
