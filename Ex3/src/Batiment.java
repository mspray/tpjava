public class Batiment {
    public String adresse;
    final private int nbPieceMax = 10;
    private int nbPiece;
    private Piece[] tabPiece;

    public Batiment(){
        adresse = "";
        nbPiece = 0;
        tabPiece = new Piece[nbPieceMax];
    }
    public Batiment(String Adresse){
        adresse = Adresse;
        nbPiece = 0;
        tabPiece = new Piece[nbPieceMax];
    }

    public int getNbPiece() {
        return nbPiece;
    }

    public int getNbPieceMax() {
        return nbPieceMax;
    }

    public void ajouterPiece(Piece piece){
        if(nbPiece<nbPieceMax){
            tabPiece[nbPiece] = piece;
            nbPiece++;
        }
    }
    public int piecesLibres(){
        return nbPieceMax-nbPiece;
    }

    public void affiche(){
        System.out.println("Batiment a l'adresse : " + adresse);
        for(int i = 0; i < nbPiece;i++){
            tabPiece[i].affiche();
        }
    }
}
