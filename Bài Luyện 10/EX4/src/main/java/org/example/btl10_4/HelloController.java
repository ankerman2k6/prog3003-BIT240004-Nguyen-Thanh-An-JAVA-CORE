package org.example.btl10_4;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField txtFirst;
    @FXML
    private TextField txtSecond;

    @FXML
    private TextField txtResult;

    @FXML
    protected void onResultClick(){
        String num =  txtFirst.getText();
        String num2 = txtSecond.getText();

        int numInt = Integer.parseInt(num);
        int numInt2 = Integer.parseInt(num2);
        int resultNum = numInt + numInt2;
        String result = "Kết quả: " + resultNum;

        txtResult.setText(result);
    }
}
