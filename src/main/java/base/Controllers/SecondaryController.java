package base.Controllers;

import java.io.IOException;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SecondaryController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;
    @FXML
    private Hyperlink createAccount;

    @FXML
    private void handleLoginButton(ActionEvent event) throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();
        System.out.println("Username: " + username + " Password: " + password);

        URL fxmlLocation = getClass().getResource("/base/primary.fxml");
        if (fxmlLocation == null) {
            System.err.println("Error: Could not find primary.fxml");
            // Handle the error appropriately (e.g., show an error message to the user)
            return;
        }

        FXMLLoader loader = new FXMLLoader(fxmlLocation);
        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleCreateAccount(ActionEvent event) throws IOException {
        URL fxmlLocation = getClass().getResource("/base/third.fxml");
        if (fxmlLocation == null) {
            System.err.println("Error: Could not find third.fxml");
            // Handle the error appropriately (e.g., show an error message to the user)
            return;
        }

        FXMLLoader loader = new FXMLLoader(fxmlLocation);
        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}