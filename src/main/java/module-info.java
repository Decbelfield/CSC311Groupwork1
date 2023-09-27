module com.example.csc311groupwork1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csc311groupwork1 to javafx.fxml;
    exports com.example.csc311groupwork1;
}