package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Button btnSub;

    @FXML
    private Button btnMul;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnDiv;

    @FXML
    private TextField tfNum1;

    @FXML
    private TextField tfNum2;

    @FXML
    private Label lblAns;

    @FXML
    private Button btnClr;

    @FXML
    private Button btnExp;

    @FXML
    private Button btnPct;

    @FXML
    private Button btnSqr;

    @FXML
    private Button btnSin;

    @FXML
    private Button btnCos;

    @FXML
    private Button btnTan;

    @FXML
    private Button btnLog;


    @FXML
    void initialize() {
        assert btnSub != null : "fx:id=\"btnSub\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnMul != null : "fx:id=\"btnMul\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnAdd != null : "fx:id=\"btnAdd\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnDiv != null : "fx:id=\"btnDiv\" was not injected: check your FXML file 'sample.fxml'.";
        assert tfNum1 != null : "fx:id=\"tfNum1\" was not injected: check your FXML file 'sample.fxml'.";
        assert tfNum2 != null : "fx:id=\"tfNum2\" was not injected: check your FXML file 'sample.fxml'.";
        assert lblAns != null : "fx:id=\"lblAns\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnClr != null : "fx:id=\"btnClr\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnPct != null : "fx:id=\"btnPct\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnSqr != null : "fx:id=\"btnSqr\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnSin != null : "fx:id=\"btnSin\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnCos != null : "fx:id=\"btnCos\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnTan != null : "fx:id=\"btnTan\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnLog != null : "fx:id=\"btnLog\" was not injected: check your FXML file 'sample.fxml'.";
    }

    @FXML
    void addition(ActionEvent event) {
        String number=tfNum1.getText().trim();
        int num=Integer.parseInt(number);
        String number1=tfNum2.getText().trim();
        int num1=Integer.parseInt(number1);
        int btnAdd=num+num1;
        String s=Integer.toString(btnAdd);
        lblAns.setText(num + "+" + num1 +"=" + s);
    }

    @FXML
    void subtraction(ActionEvent event) {
        String number=tfNum1.getText().trim();
        int num=Integer.parseInt(number);
        String number1=tfNum2.getText().trim();
        int num1=Integer.parseInt(number1);
        int btnSub=num-num1;
        String s=Integer.toString(btnSub);
        lblAns.setText(num + "-" + num1 +"=" + s);
    }

    @FXML
    void multiplication(ActionEvent event) {
        String number=tfNum1.getText().trim();
        int num=Integer.parseInt(number);
        String number1=tfNum2.getText().trim();
        int num1=Integer.parseInt(number1);
        int btnMul=num*num1;
        String s=Integer.toString(btnMul);
        lblAns.setText(num + "*" + num1 +"=" + s);
    }

    @FXML
    void division(ActionEvent event) {
        String number=tfNum1.getText().trim();
        int num=Integer.parseInt(number);
        String number1=tfNum2.getText().trim();
        int num1=Integer.parseInt(number1);
        int btnDiv=num/num1;
        String s=Integer.toString(btnDiv);
        lblAns.setText(num + "/" + num1 +"=" + s);
    }

    @FXML
    void pow(ActionEvent event) {
        String number=tfNum1.getText().trim();
        int num=Integer.parseInt(number);
        int btnExp=num*num;
        String s=Integer.toString(btnExp);
        lblAns.setText(number + "^" + number + "=" + s);
    }

    @FXML
    void percentage(ActionEvent event) {
        String number=tfNum1.getText().trim();
        double num=Double.parseDouble(number);
        double btnPct=num*0.10;
        String s=Double.toString(btnPct);
        lblAns.setText(number + "%" + "=" + s);
    }

    @FXML
    void squareroot(ActionEvent event) {
        String number=tfNum1.getText().trim();
        double num=Double.parseDouble(number);
        double btnSqr=Math.sqrt(num);
        String s=Double.toString(btnSqr);
        lblAns.setText("√" + number + "=" + s);
    }

    @FXML
    void sin(ActionEvent event) {
        String number=tfNum1.getText().trim();
        double num=Double.parseDouble(number);
        if(num==0){
            lblAns.setText(number + "sin" + "=" + "0");
        }
        else if (num==30){
            lblAns.setText(number + "sin" + "=" + "1/2");
        }
        else if (num==45){
            lblAns.setText(number + "sin" + "=" + "1/√2");
        }
        else if (num==60){
            lblAns.setText(number + "sin" + "=" + "√3/2");
        }
        else if (num==90){
            lblAns.setText(number + "sin" + "=" + "1");
        }
        else {
            double btnSin=(num/180)*3.14;
            String s=Double.toString(btnSin);
            lblAns.setText(number + "sin" + "=" + s);
        }
    }

    @FXML
    void tan(ActionEvent event) {
        String number=tfNum1.getText().trim();
        double num=Double.parseDouble(number);
        if(num==0){
            lblAns.setText(number + "tan" + "=" + "0");
        }
        else if (num==30){
            lblAns.setText(number + "tan" + "=" + "1/√3");
        }
        else if (num==45){
            lblAns.setText(number + "tan" + "=" + "1");
        }
        else if (num==60){
            lblAns.setText(number + "tan" + "=" + "√3");
        }
        else if (num==90){
            lblAns.setText(number + "tan" + "=" + "Not Defined");
        }
        else {
            double btnTan=(num/180)*3.14;
            String s=Double.toString(btnTan);
            lblAns.setText(number + "tan" + "=" + s);
        }
    }

    @FXML
    void cos(ActionEvent event) {
        String number=tfNum1.getText().trim();
        double num=Double.parseDouble(number);
        if(num==0){
            lblAns.setText(number + "cos" + "=" + "1");
        }
        else if (num==30){
            lblAns.setText(number + "cos" + "=" + "√3/2");
        }
        else if (num==45){
            lblAns.setText(number + "cos" + "=" + "1/√2");
        }
        else if (num==60){
            lblAns.setText(number + "cos" + "=" + "1/2");
        }
        else if (num==90){
            lblAns.setText(number + "cos" + "=" + "0");
        }
        else {
            double btnCos=(num/180)*3.14;
            String s=Double.toString(btnCos);
            lblAns.setText(number + "cos" + "=" + s);
        }

    }

    @FXML
    void log(ActionEvent event) {
        String number=tfNum1.getText().trim();
        double num=Double.parseDouble(number);
        double btnLog=Math.log(num);
        String s=Double.toString(btnLog);
        lblAns.setText("√" + number + "=" + s);
    }

    @FXML
    void clear(ActionEvent event) {
         tfNum1.setText("");
         tfNum2.setText("");
         lblAns.setText("");
    }
}
