module org.example.btl10_4 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens org.example.btl10_4 to javafx.fxml;
    exports org.example.btl10_4;
}