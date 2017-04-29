package core_JavaFX.Vladislav_Kavunenko.L1_Button;

import javafx.application.Application;
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
		 
		Button btn1 = addButton("#1"); 
		Button btn2 = addButton("#2");
		Button btn3 = addButton("#3"); 
		Button btn4 = addButton("#4");
		Button btn5 = addButton("#5");
		Button btn6 = addButton("#6");
		Button btn7 = addButton("#7");
		Button btn8 = addButton("#8");
		
	} 
	  
	private Button addButton(String name){
		Button btn = new Button(name);
		btn.setPrefSize(50,30);
		return btn;
		
	}
	
	
	public static void main (String []args){ 
		launch(args);
		
	}

}
