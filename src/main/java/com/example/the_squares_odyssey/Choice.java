package com.example.the_squares_odyssey;

import cercetari.BataliaAnimalelor;
import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Choice extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    private Stage stage;

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;

        // Imaginea de fundal
        Image backgroundImage = new Image("/arena.jfif");
        ImageView backgroundImageView = new ImageView(backgroundImage);
        backgroundImageView.setFitWidth(1000);
        backgroundImageView.setFitHeight(700);

        // Textul de la mijloc
        Text text = new Text("The Squares' Odyssey!");
        text.setTranslateY(-280);
        text.getStyleClass().add("text_Game");

        // HBox pentru organizarea zeilor
        HBox buttonBox = new HBox(10);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setTranslateY(0);
        buttonBox.setPadding(new Insets(10, 10, 40, 10));

        // Crearea imaginilor zeilor
        ImageView zeu1 = new ImageView(new Image("/zeu1.png"));
        ImageView zeu2 = new ImageView(new Image("/zeu2.png"));
        ImageView zeu3 = new ImageView(new Image("/zeu3.png"));

        // Setarea dimensiunilor imaginilor
        zeu1.setFitWidth(120);
        zeu1.setFitHeight(170);
        zeu2.setFitWidth(110);
        zeu2.setFitHeight(220);
        zeu3.setFitWidth(95);
        zeu3.setFitHeight(180);

        // Evenimente de click pentru zei
        zeu1.setOnMouseClicked(event -> {
            handleZeuClick(zeu1);
            PauseTransition pause = new PauseTransition(Duration.seconds(1.9));
            pause.setOnFinished(e -> {
                BataliaAnimalelor boiSiVaci = new BataliaAnimalelor();
                boiSiVaci.start(stage);
            });
            pause.play();
        });

        zeu2.setOnMouseClicked(event -> {
            handleZeuClick(zeu2);
            PauseTransition pause = new PauseTransition(Duration.seconds(2.6));
            pause.setOnFinished(e -> {
                BataliaAnimalelor boiSiVaci = new BataliaAnimalelor();
                boiSiVaci.start(stage);
            });
            pause.play();
        });

        zeu3.setOnMouseClicked(event -> {
            handleZeuClick(zeu3);
            PauseTransition pause = new PauseTransition(Duration.seconds(2.6));
            pause.setOnFinished(e -> {
                BataliaAnimalelor boiSiVaci = new BataliaAnimalelor();
                boiSiVaci.start(stage);
            });
            pause.play();
        });

        buttonBox.getChildren().addAll(zeu1, zeu2, zeu3);

        StackPane root = new StackPane();
        root.getChildren().addAll(backgroundImageView, buttonBox, text);

        Scene scene = new Scene(root, 1000, 700);
        stage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setTitle("The Squares' Odyssey!");
        stage.show();
    }

    private void handleZeuClick(ImageView zeu) {
        FadeTransition fadeOut = new FadeTransition(Duration.seconds(2), zeu);
        fadeOut.setFromValue(1.0);
        fadeOut.setToValue(0.0);
        fadeOut.play();
    }
}
