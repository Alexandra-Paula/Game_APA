package com.example.the_squares_odyssey;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class Introduction extends Application {

    @Override
    public void start(Stage primaryStage) {


        // Folosești resursa din proiect
        Media media = new Media(getClass().getResource("/Trailer.MOV").toExternalForm());

        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);

        // Setăm lățimea și înălțimea MediaView conform scenei
        mediaView.setFitWidth(1100);  // Lățimea scenei
        mediaView.setFitHeight(750);  // Înălțimea scenei
        mediaView.setPreserveRatio(true); // Păstrează proporțiile originale ale videoului

        StackPane layout = new StackPane();
        layout.getChildren().add( mediaView);

        Scene scene = new Scene(layout, 1000, 700);  // Dimensiunea scenei
        primaryStage.setScene(scene);
        primaryStage.show();

        mediaPlayer.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

