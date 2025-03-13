import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // make this my main page
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        // title of the window
        primaryStage.setTitle("Hello Worlds");
        // sizeo of window
        primaryStage.setScene(new Scene(root, 400, 300));
        // shows everything
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}