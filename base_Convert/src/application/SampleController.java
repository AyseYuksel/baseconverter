package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class SampleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField sayi;

    @FXML
    private TextField taban;

    @FXML
    private Button hesapla;

    @FXML
    private Label sonuc;

    @FXML
    void hesapla_btn(ActionEvent event) {
     	int taban2=Integer.parseInt(taban.getText());
     	int sayi2=Integer.parseInt(sayi.getText());
    	if((taban2!=2) && (taban2!=16) && (taban2!=8)) {
    		Alert alert=new Alert(AlertType.INFORMATION);
    		alert.setTitle("UYARI");
    		alert.setContentText("Lütfen tabaný 2,8 ya da 16 giriniz.");
    		alert.showAndWait();
    	}else {
    		if(taban2==2) {
    	    sonuc.setText(Integer.toBinaryString(sayi2));	
    		}else if(taban2==16) {
    	   	    sonuc.setText(Integer.toHexString(sayi2));
    		}else {
    			sonuc.setText(Integer.toOctalString(sayi2));
    		}
    		
    	}
    }
    
    @FXML
    void initialize() {
      

    }
}