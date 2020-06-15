package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.web.HTMLEditor;

public class Controller {


        float data = 0f;
        int operation = -1;

        @FXML
        private Button neuf;

        @FXML
        private Button quinze;

        @FXML
        private Button dix;

        @FXML
        private Button onze;

        @FXML
        private Button douze;

        @FXML
        private Button sept;

        @FXML
        private Button huit;

        @FXML
        private Button cinq;

        @FXML
        private Button quatre;

        @FXML
        private Button egale;

        @FXML
        private Button moins;

        @FXML
        private Button plus;

        @FXML
        private Button treize;

        @FXML
        private Button un;

        @FXML
        private Button divise;

        @FXML
        private Button deux;

        @FXML
        private Button zero;

        @FXML
        private Button virgule;

        @FXML
        private Button trois;

        @FXML
        private Button multiplie;

        @FXML
        private Button quatorze;

        @FXML
        private Button six;

        @FXML
        private ComboBox comboBox;


        @FXML
        private Button supprimer;

        @FXML
        private Button quitter;

        @FXML
        private TextField affichage;

        @FXML
        void Buttonaction (ActionEvent event){
            if (event.getSource() == un) {
                affichage.setText(affichage.getText() + "1");
            } else if (event.getSource() == deux) {
                affichage.setText(affichage.getText() + "2");
            } else if (event.getSource() == trois) {
                affichage.setText(affichage.getText() + "3");
            } else if (event.getSource() == quatre) {
                affichage.setText(affichage.getText() + "4");
            } else if (event.getSource() == cinq) {
                affichage.setText(affichage.getText() + "5");
            } else if (event.getSource() == six) {
                affichage.setText(affichage.getText() + "6");
            } else if (event.getSource() == sept) {
                affichage.setText(affichage.getText() + "7");
            } else if (event.getSource() == huit) {
                affichage.setText(affichage.getText() + "8");
            } else if (event.getSource() == neuf) {
                affichage.setText(affichage.getText() + "9");
            } else if (event.getSource() == dix) {
                affichage.setText(affichage.getText() + "10");
            } else if (event.getSource() == onze) {
                affichage.setText(affichage.getText() + "11");
            } else if (event.getSource() == douze) {
                affichage.setText(affichage.getText() + "12");
            } else if (event.getSource() == treize) {
                affichage.setText(affichage.getText() + "13");
            } else if (event.getSource() == quatorze) {
                affichage.setText(affichage.getText() + "14");
            } else if (event.getSource() == quinze) {
                affichage.setText(affichage.getText() + "15");
            } else if (event.getSource() == zero) {
                affichage.setText(affichage.getText() + "0");
            } else if (event.getSource() == virgule) {
                affichage.setText(affichage.getText() + ".");
            } else if (event.getSource() == supprimer) {
                affichage.setText("");
            } else if (event.getSource() == quitter) {
                System.exit(0);
            } else if (event.getSource() == plus) {
                data = Float.parseFloat(affichage.getText());
                operation = 1;
                affichage.setText("");
            } else if (event.getSource() == moins) {
                data = Float.parseFloat(affichage.getText());
                operation = 2;
                affichage.setText("");
            } else if (event.getSource() == multiplie) {
                data = Float.parseFloat(affichage.getText());
                operation = 3;
                affichage.setText("");
            } else if (event.getSource() == divise) {
                data = Float.parseFloat(affichage.getText());
                operation = 4;
                affichage.setText("");
            } else if (event.getSource() == egale) {
                Float tmp = Float.parseFloat(affichage.getText());
                switch (operation) {
                    case 1:
                        Float res = data + tmp;
                        affichage.setText(String.valueOf(res));
                        break;
                    case 2:
                        res = data - tmp;
                        affichage.setText(String.valueOf(res));
                        break;
                    case 3:
                        res = data * tmp;
                        affichage.setText(String.valueOf(res));
                        break;
                    case 4:
                        res = 0f;
                        try {
                            res = data / tmp;
                        } catch (Exception e) {
                            affichage.setText("Erreur");
                        }
                        affichage.setText(String.valueOf(res));
                        break;
                    case 5:
                        res = data + tmp;
                        affichage.setText(String.valueOf(res));
                        break;
                }
            }

        }
}





