module bryan.mod5lab {
    requires javafx.controls;
    requires javafx.fxml;


    opens bryan.mod5lab to javafx.fxml;
    exports bryan.mod5lab;
}