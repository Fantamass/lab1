package com.bsuir.application;

import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;

class CalculateButton extends Button{
	
	public CalculateButton (String name){
		super(name);
	}
	
	public void setOnMouseClicked(TextField textAdd, TextField textSum, TextField textFrom, TextField textTill) {
		super.setOnMouseClicked((new EventHandler<MouseEvent>() { 
	        public void handle(MouseEvent event) { 
	        	buttonPressed(textAdd.getText(), textSum.getText(), textFrom.getText(), textTill.getText()); 
	        } 
	    }));
	}
	
	private void buttonPressed(String addText, String resTest, String startText, String endText) {
		try {
	        Alert alert = new Alert(AlertType.INFORMATION);
	        alert.setTitle("Подбор корней");
			int add = Integer.parseInt(addText);
			int res = Integer.parseInt(resTest);
			int start = Integer.parseInt(startText);
			int end = Integer.parseInt(endText);
			
			for(int i = start; i <= end; ++i)
				if(i + add == res){
			        alert.setHeaderText("Найденный корень: " + String.valueOf(i));
			        alert.showAndWait();
			        return;
				}
	
	        alert.setHeaderText("Невозможно подобраь корень");
	        alert.showAndWait();	
		}
		catch(Exception e){
	        Alert alert = new Alert(AlertType.ERROR);
	        alert.setTitle("Ошибка");
	        alert.setHeaderText("Неверные данные");
	        alert.showAndWait();
		}
	}
}