module org.example.the_squares_odysssy {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens com.example.the_squares_odyssey to javafx.fxml;
    exports com.example.the_squares_odyssey;
}