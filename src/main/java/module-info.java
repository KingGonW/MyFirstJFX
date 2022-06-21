module com.example.myfirstjfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.myfirstjfx to javafx.fxml;
    exports com.example.myfirstjfx;
}