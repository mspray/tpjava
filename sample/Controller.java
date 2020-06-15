package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.*;
import javafx.scene.input.Clipboard;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.scene.input.KeyEvent;
import javafx.scene.web.WebView;
import javafx.stage.FileChooser;
import javafx.stage.Window;


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
    private MenuBar vbMenu;


    @FXML
    private MenuItem menusave;

    @FXML
    private Button btn;

    @FXML
    private Label textsrcnbc;

    @FXML
    private Label textsrcnbl;

    @FXML
    FileChooser fileChooser = new FileChooser();


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
        Cursor p = textsrc.getCursor();
        textsrc.setCursor(p);
        textsrc.cursorProperty().setValue(p); // Trouver un moyen pour coller a la place exacte du curseur actuel.
        textsrc.setText(clipboardText);
    }

    private void saveFile(String wording, File file){
        try {
            PrintWriter write;
            write = new PrintWriter(file);
            write.println(wording);
            write.close();
        } catch(IOException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void handlesave(ActionEvent event){


        Window stage = vbMenu.getScene().getWindow();

        fileChooser.setInitialDirectory(new File("C:\\Users\\AM\\IdeaProjects\\testjavafx\\src\\sample")); // go to initialize

        fileChooser.setTitle("Enregistrer un fichier dans le stockage local");
        String defaultSaveName = "sauvegarde";
        fileChooser.setInitialFileName(defaultSaveName);
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter(".html", "*.html"),
                new FileChooser.ExtensionFilter(".txt", "*.txt"));
        try
        {
            File file = fileChooser.showSaveDialog(stage);
            if (file != null) {
                File dir = file.getParentFile();
                fileChooser.setInitialDirectory(dir); // enregistrer le repertoire pour la prochaine fois.
                final String text_to_save = textsrc.getText();
                saveFile(text_to_save, file);

            }

        }
        catch (Exception ex){}

        String content;
        content = textsrc.getText();


    }

    public void handleopen(ActionEvent event){
        Window stage = vbMenu.getScene().getWindow();
        fileChooser.setInitialDirectory(new File("C:\\Users\\AM\\IdeaProjects\\testjavafx\\src\\sample")); // go to initialize

        fileChooser.setTitle("Ouvrir un fichier");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("text file", "*.txt"),
                new FileChooser.ExtensionFilter("html", "*.html"));

        try
        {
            File file = fileChooser.showOpenDialog(stage);
            fileChooser.setInitialDirectory(file.getParentFile()); // enregistrer le repertoire pour la prochaine fois.
        }
        catch (Exception ex){}




    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //WebView browser = new WebView();
        //WebEngine render = textdst.getEngine();
        //render.loadContent(String.valueOf(textsrc));
        //we.loadContent("http://google.fr");

    }


}










