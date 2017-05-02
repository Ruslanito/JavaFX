package core_JavaFX.Vladislav_Kavunenko;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.Button;



public class JFX1_Button extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("окно приложения");
        primaryStage.setWidth(600);
        primaryStage.setHeight(300);

        Pane root = new Pane();

        Button button1 = new Button();
        button1.setText("Жми )");
        button1.setTranslateX(100);
        button1.setTranslateY(100);
        button1.setPrefSize(50, 50);

        Button button2 = new Button();
        button2.setText("Ещё раз )");
        button2.setTranslateY(150);
        button2.setTranslateX(150);

        Scene scene1 = new Scene(root);

        root.getChildren().addAll(button1, button2);
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}