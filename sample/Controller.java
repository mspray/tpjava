package sample;

import com.sun.deploy.util.StringUtils;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.Clipboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.web.HTMLEditor;

import java.awt.Robot;
import java.awt.MouseInfo;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import javafx.scene.web.WebView;
import javafx.scene.web.WebEngine;
import javafx.stage.FileChooser;


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
        String text = textsrc.getText();
        if (text != null) {
            nbrl = textsrc.getText().split("\n").length;
            textsrcnbl.setText("Lignes: " + nbrl);
        }
    }
    @FXML
    void sauvegarder(ActionEvent e) {
        String content;
        content = textsrc.getText();
        //System.out.println(content);
        textdst.getEngine().loadContent(content);
        //textdst.getEngine().loadContent(textsrc); // Prends un string
    }


    @FXML
    void btnOnAction(ActionEvent e) {
        String content;
        content = textsrc.getText();
        //System.out.println(content);
        textdst.getEngine().loadContent(content);
        //textdst.getEngine().loadContent(textsrc); // Prends un string
    }

    public void quitter(ActionEvent event){
        Platform.exit();
        System.exit(0);
    }

    public void nouveau(ActionEvent event){
        textsrc.clear();
    }

    public void ouvrir(ActionEvent event) {

    }
    public void coller(ActionEvent event) {
        Clipboard systemClipboard = Clipboard.getSystemClipboard();
        String clipboardText = systemClipboard.getString();
        //Cursor p = getCursor();

        textsrc.setText(clipboardText);
        //textsrc.setCursor(p).setText()
    }









    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //WebView browser = new WebView();
        //WebEngine render = textdst.getEngine();
        //render.loadContent(String.valueOf(textsrc));
        //we.loadContent("http://google.fr");


    }


}










