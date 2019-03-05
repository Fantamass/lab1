package com.bsuir.application;
	
import javafx.application.Application;
import javafx.stage.Stage;

import com.bsuir.application.Interface;;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		Interface gui = new Interface(primaryStage);
		gui.Create();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
