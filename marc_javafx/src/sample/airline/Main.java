package sample.airline;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(grid, 300, 275));
        primaryStage.show();

        Button[][] buttons = new Button[10][5];
    }

    private void generateButtons(int width, int height, GridPane pane) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Button b = new Button();
                b.fireEvent();

                pane.add();
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
