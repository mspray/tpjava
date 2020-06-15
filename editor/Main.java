package editor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;



public class Main extends Application {


    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("editeur_html.fxml"));
        stage.setTitle("Editeur HTML");
        stage.setScene(new Scene(root, 870, 645));
        stage.show();
        //WebView webView = new WebView();
        //WebEngine webEngine = webView.getEngine();
        // test.getEngine().load("http://google.fr");
        //WebEngine run = test.getEngine();
        //run.loadContent("http://google.fr");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
