module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;
    requires java.desktop;
    requires MyLib;

    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
}