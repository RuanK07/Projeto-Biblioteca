import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        try {
        FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Layout.fxml"));
        Parent root = fxmlloader.load();
        Scene tela = new Scene(root);

        primaryStage.setTitle("Test");
        primaryStage.setScene(tela);
        primaryStage.show();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}