module base {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens base to javafx.fxml, javafx.graphics; // Open base to both modules
    opens base.Controllers to javafx.fxml; // Add this line
    exports base.Controllers to javafx.fxml;    // Export Controllers specifically
}