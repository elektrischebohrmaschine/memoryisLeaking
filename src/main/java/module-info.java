module thisisagroup.myfirstproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens thisisagroup.myfirstproject to javafx.fxml;
    exports thisisagroup.myfirstproject;
}