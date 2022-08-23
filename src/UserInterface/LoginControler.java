package UserInterface;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class LoginControler {

    @FXML
    private Button buttonEnter;

    @FXML
    private TextField campPassword;

    @FXML
    private TextField campUser;

    @FXML
    void Login(ActionEvent event) {
        String username = campUser.getText();
        String password = campPassword.getText();
    }
}
