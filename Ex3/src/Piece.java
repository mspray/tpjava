public class Piece {
    public int largeur;
    public int hauteur;
    public int profondeur;
    private String nom;
    final private int nbMeublesMaxi = 10;
    private int nbMeubles;
    private Meuble[] tabMeuble;

    public Piece(){
        this.hauteur=0;
        this.largeur=0;
        this.profondeur=0;
        this.nom="Piece";
        this.nbMeubles=0;
        this.tabMeuble = new Meuble[nbMeublesMaxi];
    }

    public Piece(int Hauteur, int Largeur, int Profondeur){
        this.hauteur=Hauteur;
        this.largeur=Largeur;
        this.profondeur=Profondeur;
        this.nom="Piece";
        this.nbMeubles=0;
        this.tabMeuble = new Meuble[nbMeublesMaxi];
    }
    public Piece(int Hauteur, int Largeur, int Profondeur, String Nom){
        this.hauteur=Hauteur;
        this.largeur=Largeur;
        this.profondeur=Profondeur;
        this.nom=Nom;
        this.nbMeubles=0;
        this.tabMeuble = new Meuble[nbMeublesMaxi];
    }

    public int getNbMeubles() {
        return nbMeubles;
    }

    public int getNbMeubleMaxi() {
        return nbMeublesMaxi;
    }

    public void modifierNomMeuble (int numero, String nom){
        tabMeuble[numero].nom=nom;
    }

    public void ajouterMeuble(Meuble meuble){
        if(this.nbMeubles<this.nbMeublesMaxi && surfaceVide() > meuble.surface()) {
            this.tabMeuble[this.nbMeubles] = meuble;
            this.nbMeubles++;
        }
    }

    public long volume(){
        return this.hauteur*this.largeur*this.profondeur;
    }

    public long surface(){
        return this.largeur*this.profondeur;
    }

    public long surfaceMeuble(){
        long surface = 0;
        for (int i = 0; i<nbMeubles;i++){
            surface += tabMeuble[i].surface();
        }
        return surface;
    }

    public long surfaceVide(){
        return surface() - surfaceMeuble();
    }

    public void affiche(){
        System.out.println(this.nom +
                " Dimentions : hauteur : " + this.hauteur +
                " largeur : " + this.largeur +
                " profondeur : " + this.profondeur);
        if (nbMeubles>0){
            System.out.println("Listes des meubles de la piece : ");
        }
        for (int i = 0; i<nbMeubles;i++){
            tabMeuble[i].affiche();
        }
    }
}
