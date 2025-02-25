package cercetari;

import com.example.the_squares_odyssey.Choice;
import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BataliaAnimalelor extends Application {
    private int countPositions = 0;
    private double coeficientY = -210, coeficientX = 200;
    private double coeficientSt = 200, coeficientJs = 50;
    private boolean equalList = false;
    private int cntIncercari = 0, cntBoi = 0, cntVaci = 0;
    List<Integer> logicList = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) {
        StackPane layout = new StackPane();

        List<ImageView> heroViews = new ArrayList<>();
        List<Integer> logicImageList = new ArrayList<>();

        Random rand = new Random();

        int cnt = 0;
        while (cnt < 4) {
            int x = rand.nextInt(9) + 1;
            boolean ok = true;
            for (int val : logicList)
                if (val == x)
                    ok = false;
            if (ok) {
                cnt++;
                logicList.add(x);
            }
        }

        Image backgroundImage = new Image("/imagine_fundal_jocuri.jfif");
        ImageView backgroundImageView = new ImageView(backgroundImage);
        backgroundImageView.setFitWidth(1000);
        backgroundImageView.setFitHeight(700);

        Image scoreImage = new Image("/frameF.png");
        ImageView scoreImageView = new ImageView(scoreImage);
        scoreImageView.setFitWidth(500);
        scoreImageView.setFitHeight(655);
        scoreImageView.setTranslateX(230);
        scoreImageView.setTranslateY(55);
        scoreImageView.getStyleClass().add("pergament-image");

        Image bou = new Image("/leopard_1.jpg");
        ImageView bouView = new ImageView(bou);

        Image vaca = new Image("/pantera_11.jpg");
        ImageView vacaView = new ImageView(vaca);

        Image tabel = new Image("/tabel_1.png");
        ImageView backTabel = new ImageView(tabel);
        backTabel.getStyleClass().add("backTabel");
        backTabel.setFitWidth(120 * 2.5);
        backTabel.setFitHeight(30 * 2.5);
        backTabel.setTranslateY(-250 + coeficientJs);
        backTabel.setTranslateX(0 - coeficientSt);


        Image tabel9 = new Image("/tabel_2.jpg");
        ImageView tabel9View = new ImageView(tabel9);
        tabel9View.setFitHeight(300);
        tabel9View.setFitWidth(300);
        tabel9View.setTranslateX(-coeficientSt);
        tabel9View.setTranslateY(coeficientJs);

        // CELE NOUA BUTOANE CU HIEROGLIFE
        Image her1 = new Image("/symbol_1.jpg");
        ImageView herView1 = new ImageView(her1);
        herView1.setFitWidth(70);
        herView1.setFitHeight(70);
        Button button1 = new Button();
        button1.setTranslateX(-95 - coeficientSt);
        button1.setTranslateY(-94 + coeficientJs);
        button1.getStyleClass().add("play_Button");
        button1.setGraphic(herView1);
        button1.setOnAction(event -> {
            if (cntIncercari < 9)
                hieroglifButtonAction(her1, layout, heroViews, logicImageList, bouView, vacaView);
        });

        Image her2 = new Image("/symbol_2.jpg");
        ImageView herView2 = new ImageView(her2);
        herView2.setFitWidth(70);
        herView2.setFitHeight(70);
        Button button2 = new Button();
        button2.setTranslateX(0 - coeficientSt);
        button2.setTranslateY(-94 + coeficientJs);
        button2.getStyleClass().add("play_Button");
        button2.setGraphic(herView2);
        button2.setOnAction(event -> {
            if (cntIncercari < 9)
                hieroglifButtonAction(her2, layout, heroViews, logicImageList, bouView, vacaView);
        });

        Image her3 = new Image("/symbol_3.jpg");
        ImageView herView3 = new ImageView(her3);
        herView3.setFitWidth(70);
        herView3.setFitHeight(70);
        Button button3 = new Button();
        button3.setTranslateX(94 - coeficientSt);
        button3.setTranslateY(-94 + coeficientJs);
        button3.getStyleClass().add("play_Button");
        button3.setGraphic(herView3);
        button3.setOnAction(event -> {
            if (cntIncercari < 9)
                hieroglifButtonAction(her3, layout, heroViews, logicImageList, bouView, vacaView);
        });

        Image her4 = new Image("/symbol_4.jpg");
        ImageView herView4 = new ImageView(her4);
        herView4.setFitWidth(70);
        herView4.setFitHeight(70);
        Button button4 = new Button();
        button4.setTranslateX(-95 - coeficientSt);
        button4.setTranslateY(1 + coeficientJs);
        button4.getStyleClass().add("play_Button");
        button4.setGraphic(herView4);
        button4.setOnAction(event -> {
            if (cntIncercari < 9)
                hieroglifButtonAction(her4, layout, heroViews, logicImageList, bouView, vacaView);
        });

        Image her5 = new Image("/symbol_5.jpg");
        ImageView herView5 = new ImageView(her5);
        herView5.setFitWidth(70);
        herView5.setFitHeight(70);
        Button button5 = new Button();
        button5.setTranslateX(0 - coeficientSt);
        button5.setTranslateY(1 + coeficientJs);
        button5.getStyleClass().add("play_Button");
        button5.setGraphic(herView5);
        button5.setOnAction(event -> {
            if (cntIncercari < 9)
                hieroglifButtonAction(her5, layout, heroViews, logicImageList, bouView, vacaView);
        });

        Image her6 = new Image("/symbol_6.jpg");
        ImageView herView6 = new ImageView(her6);
        herView6.setFitWidth(70);
        herView6.setFitHeight(70);
        Button button6 = new Button();
        button6.setTranslateX(94 - coeficientSt);
        button6.setTranslateY(1 + coeficientJs);
        button6.getStyleClass().add("play_Button");
        button6.setGraphic(herView6);
        button6.setOnAction(event -> {
            if (cntIncercari < 9)
                hieroglifButtonAction(her6, layout, heroViews, logicImageList, bouView, vacaView);
        });

        Image her7 = new Image("/symbol_7.jpg");
        ImageView herView7 = new ImageView(her7);
        herView7.setFitWidth(70);
        herView7.setFitHeight(70);
        Button button7 = new Button();
        button7.setTranslateX(-95 - coeficientSt);
        button7.setTranslateY(96 + coeficientJs);
        button7.getStyleClass().add("play_Button");
        button7.setGraphic(herView7);
        button7.setOnAction(event -> {
            if (cntIncercari < 9)
                hieroglifButtonAction(her7, layout, heroViews, logicImageList, bouView, vacaView);
        });

        Image her8 = new Image("/symbol_8.jpg");
        ImageView herView8 = new ImageView(her8);
        herView8.setFitWidth(70);
        herView8.setFitHeight(70);
        Button button8 = new Button();
        button8.setTranslateX(0 - coeficientSt);
        button8.setTranslateY(95 + coeficientJs);
        button8.getStyleClass().add("play_Button");
        button8.setGraphic(herView8);
        button8.setOnAction(event -> {
            if (cntIncercari < 9)
                hieroglifButtonAction(her8, layout, heroViews, logicImageList, bouView, vacaView);
        });

        Image her9 = new Image("/symbol_9.jpg");
        ImageView herView9 = new ImageView(her9);
        herView9.setFitWidth(70);
        herView9.setFitHeight(70);
        Button button9 = new Button();
        button9.setTranslateX(94 - coeficientSt);
        button9.setTranslateY(94 + coeficientJs);
        button9.getStyleClass().add("play_Button");
        button9.setGraphic(herView9);
        button9.setOnAction(event -> {
            if (cntIncercari < 9)
                hieroglifButtonAction(her9, layout, heroViews, logicImageList, bouView, vacaView);
        });

        Button back = new Button();
        back.setPrefSize(120, 50);
        Image imageBack = new Image("/back_button.png");
        ImageView imageView1 = new ImageView(imageBack);
        back.setGraphic(imageView1);
        imageView1.setFitWidth(48);
        imageView1.setFitHeight(48);
        back.getStyleClass().add("round-image-button");

        back.setTranslateY(-300);
        back.setTranslateX(400);

        back.setOnAction(e -> {
            Choice treiUsi = new Choice();
            treiUsi.start(primaryStage);
        });

        layout.getChildren().addAll(backgroundImageView, backTabel, tabel9View, button1, button2, button3, button4,
                button5, button6, button7, button8, button9, back, scoreImageView);

        for (int i : logicList)
            System.out.println(i);
        System.out.println();

        Scene introducereScene = new Scene(layout, 1000, 700);
        layout.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        primaryStage.setScene(introducereScene);
        primaryStage.show();
    }

    private void hieroglifButtonAction(Image her, StackPane layout, List<ImageView> heroViews, List<Integer> logicImageList, ImageView bouView, ImageView vacaView) {
        ImageView heroView = new ImageView(her);
        if (countPositions < 4 && notExistInListElement(heroViews, heroView)) {
            heroView.setFitWidth(60);
            heroView.setFitHeight(60);
            switch (countPositions) {
                case 0:
                    heroView.setTranslateY(-251 + coeficientJs);
                    heroView.setTranslateX(-114 - coeficientSt);
                    break;
                case 1:
                    heroView.setTranslateY(-251 + coeficientJs);
                    heroView.setTranslateX(-38 - coeficientSt);
                    break;
                case 2:
                    heroView.setTranslateY(-251 + coeficientJs);
                    heroView.setTranslateX(38 - coeficientSt);
                    break;
                case 3:
                    heroView.setTranslateY(-251 + coeficientJs);
                    heroView.setTranslateX(114 - coeficientSt);
                    break;
            }
            countPositions++;
            layout.getChildren().add(heroView);
            heroViews.add(heroView);

            if (countPositions >= 4) {
                PauseTransition pause = new PauseTransition(Duration.seconds(0.5));
                pause.setOnFinished(e -> {
                    cntIncercari++;

                    List<ImageView> heroViewsAdd = new ArrayList<>();

                    for (ImageView view : heroViews) {
                        heroViewsAdd.add(view);
                        layout.getChildren().remove(view);
                    }
                    ImageView bouViewCopy = new ImageView(bouView.getImage());
                    ImageView vacaViewCopy = new ImageView(vacaView.getImage());

                    heroViewsAdd.add(bouViewCopy);
                    heroViewsAdd.add(vacaViewCopy);

                    heroViews.clear();
                    countPositions = 0;
                    int cntOfElement = 0;

                    coeficientX = 100;
                    for (ImageView view : heroViewsAdd) {
                        cntOfElement++;
                        if (cntOfElement != 5) {
                            view.setFitHeight(50);
                            view.setFitWidth(50);
                        } else {
                            view.setFitHeight(45);
                            view.setFitWidth(50);
                        }
                        view.setTranslateY(coeficientY);
                        view.setTranslateX(coeficientX);
                        coeficientX += 55;
                        layout.getChildren().add(view);

                        Image image = view.getImage();
                        String imageUrl = image.getUrl();
                        char c = imageUrl.charAt(imageUrl.length() - 5);
                        //System.out.println(imageUrl);
                        switch (c) {
                            case '1':
                                logicImageList.add(1);
                                break;
                            case '2':
                                logicImageList.add(2);
                                break;
                            case '3':
                                logicImageList.add(3);
                                break;
                            case '4':
                                logicImageList.add(4);
                                break;
                            case '5':
                                logicImageList.add(5);
                                break;
                            case '6':
                                logicImageList.add(6);
                                break;
                            case '7':
                                logicImageList.add(7);
                                break;
                            case '8':
                                logicImageList.add(8);
                                break;
                            case '9':
                                logicImageList.add(9);
                                break;
                        }

                        if (cntOfElement == 4) {
                            int in = 0, jn = 0;
                            cntBoi = 0;
                            cntVaci = 0;
                            for (int i : logicList) {
                                in++;
                                for (int j : logicImageList) {
                                    jn++;
                                    if (i == j && in == jn) {
                                        cntBoi++;
                                    } else {
                                        if (i == j)
                                            cntVaci++;
                                    }
                                }
                                jn = 0;
                            }
                        }

                        if (cntOfElement == 4) {
                            Text bouText = new Text("" + cntBoi);
                            bouText.setTranslateY(coeficientY);
                            bouText.setTranslateX(coeficientX);
                            bouText.setStyle("-fx-fill: #ff0202");
                            layout.getChildren().add(bouText);
                        }
                        if (cntOfElement == 5) {
                            Text vacaText = new Text("" + cntVaci);
                            vacaText.setTranslateY(coeficientY);
                            vacaText.setTranslateX(coeficientX);
                            vacaText.setStyle("-fx-fill: #ff0202");
                            layout.getChildren().add(vacaText);
                        }

                    }
                    coeficientY += 55;
                    heroViewsAdd.clear();
                    equalList = logicList.equals(logicImageList);

                    logicImageList.clear();
                    if (cntIncercari == 9 || equalList)
                        showCongratulations();
                });
                pause.play();
            }
        }
    }

    private boolean notExistInListElement(List<ImageView> heroView, ImageView element) {
        for (ImageView view : heroView)
            if (view.getImage().equals(element.getImage()))
                return false;
        return true;
    }

    private void showCongratulations() {
        Platform.runLater(() -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Felicitări");
            alert.setHeaderText(null);
            alert.setContentText("Ai primit un fragment din cheie!");
            alert.showAndWait();
        });
    }

    private List<Integer> solveBoiSiVaci(List<Integer> secretList, List<Integer> availableSymbols, int maxTries) {
        List<Integer> guess = new ArrayList<>();
        Random rand = new Random();

        for (int tryCount = 0; tryCount < maxTries; tryCount++) {
            guess.clear();

            while (guess.size() < 4) {
                int symbol = availableSymbols.get(rand.nextInt(availableSymbols.size()));
                if (!guess.contains(symbol)) {
                    guess.add(symbol);
                }
            }

            int bulls = countBulls(secretList, guess);
            int cows = countCows(secretList, guess);

            if (bulls == 4) {
                return guess;
            } else {
                updateAvailableSymbols(availableSymbols, guess, bulls, cows);
            }
        }
        return null;
    }

    private int countBulls(List<Integer> secretList, List<Integer> guess) {
        int bulls = 0;
        for (int i = 0; i < secretList.size(); i++) {
            if (secretList.get(i).equals(guess.get(i))) {
                bulls++;
            }
        }
        return bulls;
    }

    private int countCows(List<Integer> secretList, List<Integer> guess) {
        int cows = 0;
        for (Integer symbol : guess) {
            if (secretList.contains(symbol) && !secretList.get(guess.indexOf(symbol)).equals(symbol)) {
                cows++;
            }
        }
        return cows;
    }

    private void updateAvailableSymbols(List<Integer> availableSymbols, List<Integer> guess, int bulls, int cows) {
        List<Integer> symbolsToRemove = new ArrayList<>(guess);
        for (int i = 0; i < guess.size(); i++) {
            if (guess.get(i).equals(logicList.get(i))) {
                symbolsToRemove.remove(guess.get(i));
            }
        }
        for (Integer symbol : guess) {
            if (logicList.contains(symbol) && !logicList.get(guess.indexOf(symbol)).equals(symbol)) {
                symbolsToRemove.remove(symbol);
            }
        }
        availableSymbols.removeAll(symbolsToRemove);
    }
}



