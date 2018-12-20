package songbook;

import java.io.FileInputStream;
import java.io.InputStream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import songbook.data.Songbook;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
                
        String fileName = "songs.txt";
        InputStream fis = new FileInputStream(fileName);
                
        DataSaver datasaver = new DataSaver();
        Songbook book = datasaver.readSongbook(fis);
        
        book.printSongs();
        
    }


    public static void main(String[] args) {
        launch(args);
    }
}
