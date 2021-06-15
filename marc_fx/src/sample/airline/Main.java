package sample.airline;

import com.sun.javafx.scene.control.InputField;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.converter.NumberStringConverter;

import java.util.ArrayList;

public class Main extends Application {
    private Button[][] buttons;
    private final static int SIZE_H = 275;
    private final static int SIZE_W = 300;

    @Override
    public void start(Stage primaryStage) {
        BorderPane layout = new BorderPane();
        GridPane grid = new GridPane();
        layout.setCenter(grid);

        Button commit = new Button("Commit");
        commit.setOnAction(e -> {
            if (commit.getText().equals("Commit")) {
                findInfectedPersons(10, 10, grid);
                for (Button[] ba : buttons) {
                    for (Button b : ba)
                        b.setDisable(true);
                }
                commit.setText("Unlock");
            } else {
                commit.setText("Commit");
                for (Button[] ba : buttons) {
                    for (Button b : ba)
                        b.setDisable(false);
                }
            }
        });


        layout.setBottom(commit);

        generateButtons(10, 10, grid);

        primaryStage.setTitle("Airplane Corona");
        primaryStage.setScene(new Scene(layout, SIZE_W, SIZE_H));
        primaryStage.show();
    }

    private void findInfectedPersons(int width, int height, GridPane pane) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                Button n = buttons[i][j];
                if (n.getText().equals("X")) {
                    setNeighborsInfected(i, j);
                }
            }
        }
    }


    public void setNeighborsInfected(int row, int seat) {
        ArrayList<Integer[]> positions = new ArrayList<>();
        positions.add(new Integer[]{row - 1, seat});
        positions.add(new Integer[]{row + 1, seat});
        positions.add(new Integer[]{row, seat - 1});
        positions.add(new Integer[]{row, seat + 1});
        positions.add(new Integer[]{row + 1, seat + 1});
        positions.add(new Integer[]{row - 1, seat + 1});
        positions.add(new Integer[]{row + 1, seat - 1});
        positions.add(new Integer[]{row - 1, seat - 1});

        for (Integer[] i : positions) {
            Button b = buttons[i[0]][i[1]];
            if (b.getText().equals("O"))
                b.setText("W");
        }
    }

    private void generateButtons(int width, int height, GridPane pane) {
        pane.getChildren().removeAll();
        this.buttons = new Button[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                Button b = new Button();
                b.setOnAction(e -> {
                    switch (b.getText()) {
                        case "X" -> b.setText("");
                        case "O" -> b.setText("X");
                        default -> b.setText("O");
                    }
                });

                this.buttons[i][j] = b;

                b.setMinWidth(SIZE_W / (float) width);
                b.setMinHeight((SIZE_H - 25) / (float) width);

                pane.add(b, i, j);
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
