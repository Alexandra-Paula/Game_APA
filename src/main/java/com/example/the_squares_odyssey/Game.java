package com.example.the_squares_odyssey ;

import javafx.application.Application ;
import javafx.scene.Scene ;
import javafx.scene.control.Button ;
import javafx.scene.image.Image ;
import javafx.scene.image.ImageView ;
import javafx.scene.layout.StackPane ;
import javafx.scene.text.Text ;
import javafx.stage.Stage ;

public class Game extends Application{

    public static void main (String[] args){
        launch (args) ;
    }

    @Override
    public void start (Stage primaryStage){

        Image backgroundImage = new Image ("/background_1.jfif") ;
        ImageView backgroundImageView = new ImageView (backgroundImage) ;
        backgroundImageView.setFitWidth (1000) ;
        backgroundImageView.setFitHeight (700) ;

        Text text = new Text ("Welcome to The Squares’ Odyssey!") ;
        text.setTranslateY (-280) ;
        text.getStyleClass().add ("text_Game") ;

        Image imageButtonPlay = new Image ("/play.png") ;
        ImageView imageViewButton = new ImageView (imageButtonPlay) ;
        imageViewButton.setFitWidth (130) ;
        imageViewButton.setFitHeight (50) ;

        Button playButton = new Button() ;
        playButton.getStyleClass().add ("play_Button") ;
        playButton.setGraphic (imageViewButton) ;
        StackPane root = new StackPane() ;
        root.getChildren().addAll (backgroundImageView, text, playButton) ;

        playButton.setTranslateY (-215) ;

        playButton.setOnAction (event ->{
            Introduction introduction = new Introduction() ;
            introduction.start (primaryStage) ;
        });

        Scene scene = new Scene (root, 1000, 700) ;
        primaryStage.setScene (scene) ;
        scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm()) ;
        primaryStage.setTitle ("The Squares’ Odyssey") ;
        primaryStage.show() ;
    }
}