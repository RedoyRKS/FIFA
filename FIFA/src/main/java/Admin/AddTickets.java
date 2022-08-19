package Admin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class AddTickets extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("AddTickets.fxml")));
        stage.setTitle(" Admin Panel ");
        stage.setScene(new Scene(root));
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
