package core_JavaFX.Vladislav_Kavunenko.L1;

import java.awt.Button;
import java.security.acl.Group;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JFX_1 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Окно приложения");// название заголовка окна
		primaryStage.setWidth(300);// задаём ширину окна
		primaryStage.setHeight(300); // задаём высоту окна
		primaryStage.setResizable(true);// можно изменять размер

		//Button button1 = new Button("Жми");// создаём кнопку
		//button1.setLocation(100, 100);
		//button1.setSize(70, 20);

		Pane root = new Pane();// создаём площадку элементов для сцены

		Scene scene1 = new Scene(root,300,300);

		//root.getChildren().add(button1);
		primaryStage.setScene(scene1);// выбираем сцену для показа
		primaryStage.show();// показываем окно
	}

	public static void main(String[] args) {
		launch(args);

	}

}
