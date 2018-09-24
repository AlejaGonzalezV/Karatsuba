package main;

import java.math.BigInteger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Karatsuba;

public class Main extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("/view/GUI.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Calculator");
		primaryStage.show();
		
		
	}
	
	public static void main (String[] args) {
		launch(args);
		
//		Karatsuba k = new Karatsuba();
//		BigInteger num1 = BigInteger.valueOf(1234);
//		BigInteger num2 = BigInteger.valueOf(5678);
//		System.out.println(k.karatsuba(num1, num2));
		
	}
	
}