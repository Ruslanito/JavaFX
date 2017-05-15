package Core_JavaFX.src.core_JavaFX.Vladislav_Kavunenko;

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
				new Rectangle(100, 100),
				new Rectangle(100, 100),
				new Rectangle(100, 100), 
		};
		
		for (int i = 0; i <3; i++){
			CheckBox cb = cbs[i];
			Rectangle rect = rectangles[i];
			btns.getChildren().add(cb);
			cb.selectedProperty().addListener(event->{
				if(cb.isSelected()){
					rects.getChildren().add(rect);
				}
				else{
					rects.getChildren().remove(rect);
				}
			});
		}
		

		root.setCenter(rects);
		root.setLeft(btns);
		Scene scene1 = new Scene(root, 500, 500);
		primaryStage.setScene(scene1);
		primaryStage.show();
	}
}
