import javax.swing.table.TableCellEditor;

public class Exercice3 {

    public static void main(String[] args) {
    Meuble table = new Meuble(100,120,80,"Table");
    Meuble chaise = new Meuble(80,40,40,"Chaise");
    Meuble lit = new Meuble(60,140,190,"Lit");
    Piece chambre = new Piece(210,250,300,"Chambre");
    chambre.ajouterMeuble(lit);
    chambre.ajouterMeuble(table);
    chambre.ajouterMeuble(chaise);
    Piece cuisine = new Piece(210,200,250,"Cuisine");
    cuisine.ajouterMeuble(table);
    cuisine.ajouterMeuble(chaise);
    cuisine.ajouterMeuble(chaise);
    Batiment batiment = new Batiment("6 Boulevard Maréchal Juin, 14000 Caen");
    batiment.ajouterPiece(chambre);
    batiment.ajouterPiece(cuisine);
    batiment.affiche();
    }
}
