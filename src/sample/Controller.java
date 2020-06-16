package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.web.HTMLEditor;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import javafx.scene.web.WebView;
import javafx.scene.web.WebEngine;


public class Controller implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea textsrc;

    @FXML
    private WebView textdst;


    @FXML
    private Button btn;

    @FXML
    private Label textsrcnbc;

    @FXML
    private Label textsrcnbl;

    @FXML
    void calculer_nombrecrc(KeyEvent event) {
        String text = textsrc.getText();
        int len = 0;
        if (text != null) {
            len = text.length();
            textsrcnbc.setText("Caracteres: " + len);
        }
    }
    @FXML
    void calculer_nombrel(KeyEvent event) {
        int nbrl = 0;
        nbrl = textsrc.getText().split("\n").length;
        textsrcnbl.setText("Lignes: " + nbrl);
    }

    @FXML
    void btnOnAction(ActionEvent e) {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //textdst = new WebView();
        //WebEngine we = textdst.getEngine();
    textdst.getEngine().loadContent("");
        //we.loadContent("http://google.fr");
    }
}










