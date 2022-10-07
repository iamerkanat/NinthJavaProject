module com.example.ninthjavaproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ninthjavaproject to javafx.fxml;
    exports com.example.ninthjavaproject;
}