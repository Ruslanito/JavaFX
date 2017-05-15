package Core_JavaFX.src.core_JavaFX.Vladislav_Kavunenko;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JFX5_RadioButton3 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	/*
	 * имеем три кнопки, объединённые в группу с возможностью выбора только
	 * одной кнопки, при этом будет появляться картинка
	 * 
	 */

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		HBox buttons = new HBox(10);
		buttons.setAlignment(Pos.CENTER);
		HBox pic = new HBox();
		pic.setAlignment(Pos.CENTER);

		ToggleGroup group = new ToggleGroup();// создаём группу для радио-кнопок

		RadioButton rb1 = new RadioButton("1");
		RadioButton rb2 = new RadioButton("2");
		RadioButton rb3 = new RadioButton("3");

		rb1.setToggleGroup(group);// добавляем кнопки в группу
		rb2.setToggleGroup(group);// добавляем кнопки в группу
		rb3.setToggleGroup(group);// добавляем кнопки в группу
		rb2.setSelected(true);// указываем кнопку по-умолчанию
		
		rb1.setUserData("200_4");
		rb2.setUserData("DSCN0631");
		rb3.setUserData("simmetria");

		ImageView img = new ImageView();
		//добавляем обработчик событий
		group.selectedToggleProperty().addListener(event -> {
			Image image = new Image(getClass().getResourceAsStream(group.getSelectedToggle().getUserData()+".jpg"));
			img.setImage(image);
			img.setFitHeight(250);
			img.setFitWidth(300);
		});

		buttons.getChildren().addAll(rb1, rb2, rb3);
		pic.getChildren().add(img);
		root.setTop(buttons);
		root.setCenter(pic);
		Scene scene = new Scene(root, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}