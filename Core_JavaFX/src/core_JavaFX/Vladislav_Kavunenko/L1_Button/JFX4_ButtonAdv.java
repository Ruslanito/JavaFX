package core_JavaFX.Vladislav_Kavunenko.L1_Button;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JFX4_ButtonAdv extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Button button1 = new Button();
		// button1.setText("Кнопка");
		button1.setTranslateX(100);
		button1.setTranslateY(100);
		// ставим на кнопку картинку
		Image image1 = new Image(getClass().getResourceAsStream("200_4.jpg"));
		ImageView img1 = new ImageView(image1);
		img1.setFitHeight(200);
		img1.setFitWidth(300);
		button1.setGraphic(img1);
		// ставим обработчик событий на кнопку
		DropShadow shadow1 = new DropShadow();
		shadow1.setColor(Color.GREEN);
		shadow1.setRadius(50);
		
		button1.setOnAction(event -> button1.setEffect(shadow1));

		Group root = new Group(button1);
		Scene scene1 = new Scene(root, 500, 500);
		primaryStage.setTitle("Окно приложения");
		primaryStage.setScene(scene1);
		primaryStage.show();

	}

}
