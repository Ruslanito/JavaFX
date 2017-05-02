package core_JavaFX.Vladislav_Kavunenko;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JFX5_RadioButton3 extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	/*
	 имеем три кнопки, объединённые в группу с возможностью выбора только одной кнопки
	 */

	@Override
	public void start(Stage primaryStage) throws Exception {
		RadioButton rb1 = new RadioButton("1");
		RadioButton rb2 = new RadioButton("2");
		RadioButton rb3 = new RadioButton("3");
 
		ToggleGroup group = new ToggleGroup();//создаём группу для радио-кнопок
		rb1.setToggleGroup(group);//добавляем кнопки в группу
		rb2.setToggleGroup(group);//добавляем кнопки в группу
		rb3.setToggleGroup(group);//добавляем кнопки в группу
		rb2.setSelected(true);//указываем кнопку по-умолчанию
		
		BorderPane root = new BorderPane();
		HBox buttons = new HBox(10);
		buttons.setAlignment(Pos.CENTER);
		buttons.getChildren().addAll(rb1,rb2,rb3);
		
		root.setTop(buttons);
		Scene scene1 = new Scene(root, 500, 500);
		primaryStage.setScene(scene1);
		primaryStage.show();
	}

}