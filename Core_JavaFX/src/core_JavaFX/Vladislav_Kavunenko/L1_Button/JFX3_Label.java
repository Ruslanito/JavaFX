package core_JavaFX.Vladislav_Kavunenko.L1_Button;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JFX3_Label extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane root = new Pane();
		// 1.создаём метку с надписью
		Label label1 = new Label();
		label1.setText("Просто надпись"); // создаём текст надписи
		// 2.создаём метку с картинкой
		Image image1 = new Image(getClass().getResourceAsStream("200_4.jpg"));
		ImageView img1 = new ImageView(image1);
		img1.setFitHeight(300);// размер картинки в метке
		img1.setFitWidth(400);// размер картинки в метке
		Label labelImg = new Label();
		labelImg.setGraphic(img1);// вставляем картинку в метку
		labelImg.setTranslateX(100);
		labelImg.setTranslateY(50);
		// 3.создаём метку с картинкой и текстом
		labelImg.setText("200"); // надпись в метке
		labelImg.setGraphicTextGap(10); // растояние между элементами
		labelImg.setContentDisplay(ContentDisplay.TOP); // картинка будет вверху
														// а текст внизу
		// 4.создаём метку, реагирующую на наведение курсора
		Label magicLabel = new Label();
		magicLabel.setText("Волшебная метка - наведи");
		magicLabel.setTranslateX(150);
		magicLabel.setTranslateY(200);
		// добавляем обработчик событий (при наведени курсора текст
		// увеличивается и меняет цвет)
		magicLabel.setOnMouseEntered(event -> {
			magicLabel.setScaleX(2);
			magicLabel.setScaleY(2);
			magicLabel.setTextFill(Color.RED);
		});  
		magicLabel.setOnMouseExited(event -> {
			magicLabel.setScaleX(1);
			magicLabel.setScaleY(1);
			magicLabel.setTextFill(Color.BLUE);
		});
		

		root.getChildren().addAll(label1, labelImg, magicLabel); // добавляем
																	// метки в
																	// root
		Scene scene1 = new Scene(root, 600, 500);
		primaryStage.setScene(scene1);
		primaryStage.show();
	}

}
