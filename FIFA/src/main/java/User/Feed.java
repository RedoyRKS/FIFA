package User;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Objects;

public class Feed extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Feed.fxml")));
        Scene scene  = new Scene(root);
        stage.setTitle("Feed");
        stage.setScene(scene);
        stage.show();
    }
}
