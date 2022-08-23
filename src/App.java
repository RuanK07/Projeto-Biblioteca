import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        try {
        FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Layout.fxml"));
        ScrollPane scrollPane = fxmlloader.load();

        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);

        Scene tela = new Scene(scrollPane);
        primaryStage.setTitle("Test");
        primaryStage.setScene(tela);
        primaryStage.show();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}