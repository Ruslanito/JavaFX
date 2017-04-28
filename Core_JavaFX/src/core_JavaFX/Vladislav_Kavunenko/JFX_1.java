package core_JavaFX.Vladislav_Kavunenko;

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
		primaryStage.setOpacity(50);// прозрачность

		Pane root = new Pane();

		Scene scene1 = new Scene(root); // создаём сцену
 
		primaryStage.setScene(scene1);//выбираем сцену для показа 
		primaryStage.show();// показываем окно
	}

	public static void main(String[] args) {

	}

}
