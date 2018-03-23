package br.com.ifro.calculadorafx;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
public class CalculadoraController implements Initializable {
    @FXML
    private JFXTextField txtnum1,txtnum2;
    @FXML
    private Label lblRes;
    @FXML
    private JFXButton btnSomar,btnMult,btnSub,btnDiv;
    @FXML
    private void Somar(ActionEvent event){
        int a=Integer.parseInt(txtnum1.getText()),
            b=Integer.parseInt(txtnum2.getText());
        lblRes.setText("Resultado da Soma: "+(a+b));
    }
    @FXML
    private void Subtrair(ActionEvent event){
        int a=Integer.parseInt(txtnum1.getText()),
            b=Integer.parseInt(txtnum2.getText());
        lblRes.setText("Resultado da Subtração: "+(a-b));
    }
    @FXML
    private void Multiplicar(ActionEvent event){
        int a=Integer.parseInt(txtnum1.getText()),
            b=Integer.parseInt(txtnum2.getText());
        lblRes.setText("Resultado da Multiplicação: "+(a*b));
    }
    @FXML
    private void Dividir(ActionEvent event){
        int a=Integer.parseInt(txtnum1.getText()),
            b=Integer.parseInt(txtnum2.getText());
        lblRes.setText("Resultado da Divisão: "+(a/b));
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
}