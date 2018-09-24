package controller;

import java.math.BigInteger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.*;

public class Controller {

    @FXML
    private Label result;

    @FXML
    private TextField number1;

    @FXML
    private TextField number2;

    @FXML
    private Button multiplyButton;

    @FXML
    void mBut(ActionEvent event) {
    	
    	long val1 = Long.valueOf(number1.getText());
    	BigInteger num1 = BigInteger.valueOf(val1);
    	long val2 = Long.valueOf(number2.getText());
    	BigInteger num2 = BigInteger.valueOf(val2);
    	Karatsuba k = new Karatsuba();
    	String res = k.karatsuba(num1, num2).toString();
    	result.setText(res);
    	

    }

}
