package core_JavaFX.Vladislav_Kavunenko;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class JFX6_ToggleButton extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		
		HBox buttons = new HBox();		
		buttons.setAlignment(Pos.CENTER);
		
		ToggleButton tb1 = new ToggleButton("1");
		ToggleButton tb2 = new ToggleButton("2");
		ToggleButton tb3 = new ToggleButton("3");
		
		Rectangle rect = new Rectangle(300,300);
		rect.setFill(Color.WHITE);
		rect.setStroke(Color.DARKGOLDENROD);
		
		buttons.getChildren().addAll(tb1,tb2,tb3);
		root.setTop(buttons);
		Scene scene1 = new Scene(root,500,500);
		primaryStage.setScene(scene1);
		primaryStage.show();		
	}
}
