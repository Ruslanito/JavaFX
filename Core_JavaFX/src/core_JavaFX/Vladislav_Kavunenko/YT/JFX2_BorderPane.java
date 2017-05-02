package core_JavaFX.Vladislav_Kavunenko.YT;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JFX2_BorderPane extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root =new BorderPane(); //выбираем основную панель
		VBox vbox = new VBox(10);//выбираем вертикальную панель, растояние между элементами 10
		HBox hbox = new HBox (10);//выбираем горизонтад панель, растояние между элементами 10
		hbox.setAlignment(Pos.CENTER);//выравниваем по центру горизонтальную часть 
		
		Button btn1 = addButton("#1"); 
		Button btn2 = addButton("#2");
		Button btn3 = addButton("#3"); 
		Button btn4 = addButton("#4");
		Button btn5 = addButton("#5");
		Button btn6 = addButton("#6");
		Button btn7 = addButton("#7");
		Button btn8 = addButton("#8"); 
		 
		vbox.getChildren().addAll(btn1,btn2,btn3,btn4); // распределяем кнопки 
		hbox.getChildren().addAll(btn5,btn6,btn7,btn8); // распределяем кнопки 
		
		root.setTop(hbox);//размещение конопк вверху
		root.setLeft(vbox);//размещение конопк слева
		
		Scene scene1 = new Scene(root, 600, 600);
		primaryStage.setScene(scene1); 
		primaryStage.show();		
		
	} 
	 //метод для создания кнопок 
	private Button addButton(String name){
		Button btn = new Button(name);
		btn.setPrefSize(50,30);
		return btn;
		
	}
	
	
	public static void main (String []args){ 
		launch(args);
		
	}

}
