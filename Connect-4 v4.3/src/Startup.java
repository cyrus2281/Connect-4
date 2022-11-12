
/** Cyrus Mobini* */
// This class is for the film introduction at the begining of the game
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.net.URL;
import javafx.application.Application;
import static javafx.application.Application.launch;
public class Startup extends Application {
    private String Dir = System.getProperty("film.mp4");
    public static void main(String[] args) throws Exception {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        //get the file URL
        URL soundPath = getClass().getResource("startup.mp4");
        //creat a new media
        Media media = new Media(soundPath.toString());
        javafx.scene.media.MediaPlayer player = new javafx.scene.media.MediaPlayer(media);
        MediaView viewer = new MediaView(player);
        //change width and height to fit video  
        viewer.setPreserveRatio(true);
        StackPane root = new StackPane();
        root.getChildren().add(viewer);
        //set the Scene
        Scene scenes = new Scene(root, 770, 530, Color.BLACK);
        stage.setScene(scenes);
        stage.show();
        //play
        player.play();
        //close after 7 sec
        player.setStopTime(Duration.millis(7000.0));
        player.setOnEndOfMedia(new Runnable() {
            @Override
            public void run() {
                player.stop();
                stage.close();
                Menu ob = new Menu();
                ob.main(null);
            }
        });
    }
}
