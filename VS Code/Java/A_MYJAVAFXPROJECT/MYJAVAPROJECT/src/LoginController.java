import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;


public class LoginController {

    @FXML
     Label usernameLabel;
     
    @FXML
     Label passwordLabel;

     @FXML
     TextField usernameTextfield;
   
    @FXML
     TextField passwordTextfield;

    @FXML
     Button loginButton;

     private Stage stage;
     private Scene scene;
     private Parent root;

     public void loginButtonHandler(ActionEvent event) throws IOException {
        
        String uname = usernameTextfield.getText();
        String pword = passwordTextfield.getText();

        System.out.println(uname + " " + pword);

    System.out.println("Welcome to my app");

        if (DatabaseHandler.validateLogin(uname, pword)) {
         //   System.out.println("Sucess!");

            FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));

            root = loader.load();
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } else {
            // System.out.println("Not SUJCES");
        }

     }
}