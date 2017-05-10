package core_JavaFX.Vladislav_Kavunenko;

import java.awt.TextField;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JFX8_TextField_GridPane extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane root = new GridPane();
		root.setPadding(new Insets(10, 10, 10, 10));
		root.setHgap(5);
		root.setVgap(5);

		TextField name = new TextField("Имя");
		GridPane.setConstraints(name, 0, 0);
		root.getChildren().add(name);
		
		TextField lastName = new TextField("Фамилия");
		GridPane.setConstraints(lastName, 0, 1);
		root.getChildren().add(lastName);
		
		TextField comment = new TextField();
		comment.setPromptText("Введи комментарий");
		GridPane.setConstraints(comment, 0, 2);
		root.getChildren().add(comment);		

		Scene scene1 = new Scene(root, 500, 500);
		primaryStage.setScene(scene1);
		primaryStage.show();
	}

}
