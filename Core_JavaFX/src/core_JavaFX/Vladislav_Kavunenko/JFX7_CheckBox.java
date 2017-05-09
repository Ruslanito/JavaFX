package core_JavaFX.Vladislav_Kavunenko;

import java.awt.Rectangle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class JFX7_CheckBox extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Окно приложения");
		BorderPane root = new BorderPane();
		VBox btns = new VBox(10);
		HBox rects = new HBox();

		// создаём массив кнопок
		CheckBox[] cbs = new CheckBox[] { 
				new CheckBox("Red"),
				new CheckBox("Green"), 
				new CheckBox("Blue"), 
		};

		// создаём массив треугольников
		Rectangle[] rectangles = new Rectangle[] {
				new Rectangle(100, 100, Color.RED),
				new Rectangle(100, 100, Color.GREEN),
				new Rectangle(100, 100, Color.BLUE), 
		};

		root.setCenter(rects);
		root.setLeft(btns);
		Scene scene1 = new Scene(root, 500, 500);
		primaryStage.setScene(scene1);
		primaryStage.show();
	}
}
