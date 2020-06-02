public class Meuble {
    public int largeur;
    public int hauteur;
    public int profondeur;
    public String nom;


    public Meuble(){
        this.hauteur=0;
        this.largeur=0;
        this.profondeur=0;
        this.nom="Meuble";
    }

    public Meuble(int Hauteur, int Largeur, int Profondeur){
        this.hauteur=Hauteur;
        this.largeur=Largeur;
        this.profondeur=Profondeur;
        this.nom="Meuble";
    }
    public Meuble(int Hauteur, int Largeur, int Profondeur, String Nom){
        this.hauteur=Hauteur;
        this.largeur=Largeur;
        this.profondeur=Profondeur;
        this.nom=Nom;
    }

    public long volume(){
        return this.hauteur*this.largeur*this.profondeur;
    }

    public long surface(){
        return this.largeur*this.profondeur;
    }

    public void affiche(){
        System.out.println(this.nom +
                " Dimentions : hauteur : " + this.hauteur +
                " largeur : " + this.largeur +
                " profondeur : " + this.profondeur);
    }
}
