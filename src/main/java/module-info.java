module com.example.parisroutefinderdsaca2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires xstream;
    requires org.jetbrains.annotations;
    requires java.desktop;


    exports com.example.parisroutefinderdsaca2;
    exports com.example.parisroutefinderdsaca2.DataStructure;
    opens com.example.parisroutefinderdsaca2.DataStructure to javafx.fxml, xstream;
    opens com.example.parisroutefinderdsaca2 to javafx.fxml, xstream;
}