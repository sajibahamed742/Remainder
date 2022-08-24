module com.example.remainder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.remainder to javafx.fxml;
    exports com.example.remainder;
}