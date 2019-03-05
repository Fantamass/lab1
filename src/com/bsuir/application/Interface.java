package com.bsuir.application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;

public class Interface {

	private Stage primaryStage;
	
	Interface(Stage primaryStage){
		this.primaryStage = primaryStage;
	}
	
	public void Create () {
		try {
			primaryStage.setTitle("ПроРешатель");
			FlowPane root = new FlowPane  ();
			root.setPadding(new Insets(10, 10, 10, 10)); 
			root.setVgap(5); 
			root.setHgap(10);       
			Scene scene = new Scene(root, 345, 120);
			primaryStage.setResizable(false);
			
			Text labelAdd = new Text("x +");
			Text labelSum = new Text("=");
			Text labelFrom = new Text("Начало интервала");
			Text labelTill = new Text("Конец интервала");
			Text labelRes = new Text("Корень 3");

		    TextField textAdd = new TextField();       		      
		    TextField textSum = new TextField();
		    TextField textFrom = new TextField();
		    textFrom.setPrefWidth(220);
		    TextField textTill = new TextField();  
		    textTill.setPrefWidth(225);
		    
		    CalculateButton button = new CalculateButton("Подобрать корень"); 
		    button.setOnMouseClicked(textAdd, textSum, textFrom, textTill);
	    
		    root.getChildren().addAll(labelAdd, textAdd, labelSum, textSum, labelFrom, textFrom, labelTill, textTill, labelRes, button);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
