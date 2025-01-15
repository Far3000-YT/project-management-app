package base.Controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ThirdController {
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;
    @FXML
    private TextField cpasswordField;

    @FXML
    private Button signupButton;

    @FXML
    private void handleSignupButton(ActionEvent event) throws IOException {
        System.out.println("Sign up button clicked!");
        // nothing for now !!
    }
    
}
