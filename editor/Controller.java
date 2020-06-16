package editor;

import com.sun.deploy.util.StringUtils;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.*;
import javafx.scene.input.Clipboard;

import java.io.*;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.scene.input.ClipboardContent;
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
    private MenuItem menucoller;

    @FXML
    private MenuItem menusave;

    @FXML
    public Button btn;

    @FXML
    private Label textsrcnbc;

    @FXML
    private Label textsrcnbl;

    @FXML
    FileChooser fileChooser = new FileChooser();


    @FXML
    void calculer_nombrecrc(KeyEvent event) {
        String text = textsrc.getText();
        int taille = textsrc.getLength();
        int len = 1;

        textsrcnbc.setText("Caracteres: " + len);
        len = text.length() + 1;
        textsrcnbc.setText("Caracteres: " + len);

        if (taille == 0) {
            len = 0;
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
    void btngeneratehtml(ActionEvent e) {
        String content;
        content = textsrc.getText();
        //System.out.println(content);
        textdst.getEngine().loadContent(content); // Prends un string
    }

    public void quitter(ActionEvent event){
        Platform.exit();

        System.exit(0);
    }

    public void nouveau(ActionEvent event){

        if (textsrc.getSelectedText()!= null) {
            textsrc.clear();
        }
    }
    private String getSelectedText() {

        return textsrc.getSelectedText();


    }

    public void couper(ActionEvent event) {
        int taille = textsrc.getSelectedText().length();
        String text = getSelectedText();
        ClipboardContent content = new ClipboardContent();
        content.putString(text);
        Clipboard systemClipboard = Clipboard.getSystemClipboard();
        systemClipboard.setContent(content);
        textsrc.setText(textsrc.getText().replace(textsrc.getSelectedText(),""));
    }


    public void copier(ActionEvent event) {
        String text = getSelectedText();
        ClipboardContent content = new ClipboardContent();
        content.putString(text);
        Clipboard systemClipboard = Clipboard.getSystemClipboard();
        systemClipboard.setContent(content);
    }

    public void coller(ActionEvent event) {
        Cursor test = textsrc.getCursor();
        Clipboard systemClipboard = Clipboard.getSystemClipboard();
        String clipboardText = systemClipboard.getString();
        if (clipboardText.length() == 0){
            menucoller.setDisable(true);
        }
        else {

            // Trouver un moyen pour coller a la place exacte du curseur actuel.
            textsrc.setCursor(test);
            textsrc.setText(clipboardText);



        }

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


    public void sauvegarder(ActionEvent event){


        Window stage = vbMenu.getScene().getWindow();

        fileChooser.setInitialDirectory(new File("C:\\Users")); // go to initialize?

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
    }

    public void ouvrir(ActionEvent event) {
        Window stage = vbMenu.getScene().getWindow();
       
        fileChooser.setTitle("Ouvrir un fichier");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("text file", "*.txt"),
                new FileChooser.ExtensionFilter("html", "*.html"));

        File file = fileChooser.showOpenDialog(stage);
        fileChooser.setInitialDirectory(file.getParentFile()); // enregistrer le repertoire pour la prochaine fois.

        if ((file == null) || (file.length() == 0))
            return;
        File f;
        FileReader in = null;

        try
        {
            in = new FileReader(file);
            char[] buffer = new char[4096]; // vitesse de lecture
            int len;
            textsrc.setText(""); // clean TextArea
            while ((len = in.read(buffer)) != -1) {
                String s = new String(buffer, 0, len);
                textsrc.setText(s);
            }
        } catch (IOException e) { textsrc.setText(e.getClass().getName() + ": " + e.getMessage());}

    finally {
        try {
            if (in != null)
                in.close();
        } catch (IOException e) { // fermeture
        }
    }
}


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //WebView browser = new WebView();
        //WebEngine render = textdst.getEngine();
        //render.loadContent(String.valueOf(textsrc));
        //we.loadContent("http://google.fr");
        textsrcnbc.setText("Caracteres: " + "0");
        textsrcnbl.setText("Lignes: " + "0");

    }


}










