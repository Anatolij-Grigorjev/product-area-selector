module com.tiem625 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.tiem625 to javafx.fxml;
    exports com.tiem625;
}