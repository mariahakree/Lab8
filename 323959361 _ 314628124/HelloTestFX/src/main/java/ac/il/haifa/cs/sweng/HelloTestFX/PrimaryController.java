/**
 * Sample Skeleton for 'primary.fxml' Controller Class
 */

package ac.il.haifa.cs.sweng.HelloTestFX;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML // fx:id="textField"
    private TextField textField; // Value injected by FXMLLoader
    
    @FXML // fx:id="primaryButton"
    private Button primaryButton; // Value injected by FXMLLoader

    @FXML
    void sayHello(ActionEvent event) {
    	textField.setText("Hello World");
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		textField.setEditable(false);
		
	}

}
