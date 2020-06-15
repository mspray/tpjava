package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.web.HTMLEditor;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;



public class Controller {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea textsrc;

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
    public void initialize() {
        assert textsrc != null : "fx:id=\"textsrc\" was not injected: check your FXML file 'sample.fxml'.";
        assert textsrcnbc != null : "fx:id=\"textsrcnbc\" was not injected: check your FXML file 'sample.fxml'.";
        assert textsrcnbl != null : "fx:id=\"textsrcnbl\" was not injected: check your FXML file 'sample.fxml'.";

    }

}










