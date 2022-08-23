package GUI;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class MainViewController implements Initializable{

    @FXML
    private MenuItem menuItemLivros;

    @FXML
    private MenuItem menuItemUsuarios;

    @FXML
    private MenuItem menuItemEmprestimos;

    @FXML
    private MenuItem menuItemInserirLivros;

    @FXML
    public void onMenuItemLivrosAction() {
        System.out.println("onMenuItemLivrosAction");
    }

    @FXML
    public void onMenuItemUsuariosAction() {
        System.out.println("onMenuItemUsuariosAction");
    }

    @FXML
    public void onMenuItemEmprestimosAction() {
        System.out.println("onMenuItemEmprestimosAction");
    }

    @FXML
    public void onMenuItemInserirLivrosAction() {
        System.out.println("onMenuItemEmprestimosAction");
    }

    @Override
    public void initialize(URL uri, ResourceBundle rb) {
        // TODO Auto-generated method stub
        
    }
}
