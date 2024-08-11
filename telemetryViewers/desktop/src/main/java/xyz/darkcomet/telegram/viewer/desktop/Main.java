package xyz.darkcomet.telegram.viewer.desktop;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public final class Main extends Application {
    
    @Override
    public void start(Stage stage) {
        stage.setScene(new Scene(new BorderPane(), 600, 400));
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
