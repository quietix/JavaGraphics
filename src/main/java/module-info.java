module com.example.computergraphicslabs {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.computergraphicslabs to javafx.fxml;
    exports com.example.computergraphicslabs;
}