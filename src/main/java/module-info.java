module final {
    requires javafx.controls;
    requires javafx.fxml;

    opens final to javafx.fxml;
    exports final;
}
