package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class First_JavaFX2 extends Application {
	private int windowWidth = 500;
	private int windowHeight = 500;

	@Override
	// метод start() создаёт поток приложения
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();//указываем главного родителя
		Scene scene1 = new Scene(root, windowWidth, windowHeight);
		primaryStage.setScene(scene1);
		primaryStage.setTitle("Окно простого приложения ");
		primaryStage.show();
	}

	// в методе Main находится точка входа в программу Launch()
	public static void main(String[] args) {
		launch(args); // launch(args) точка входа в FX-приложение
	}

}
