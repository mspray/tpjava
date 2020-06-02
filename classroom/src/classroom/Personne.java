package classroom;

public abstract class Personne {
	protected String nom;
	protected String prenom;
	protected Date date_naissance;

	public Personne(String nom, String prenom, Date date_naissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissance = date_naissance;
	}
	public Personne (Personne p) {
		this.nom = p.nom;
		this.prenom = p.prenom;
		this.date_naissance = p.date_naissance;
	}
	
	public Date getNaissance() {
		return date_naissance;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	
	public void setNom(String nom) {
	      this.nom = nom;
	   }
	
	public void setPrenom(String prenom) {
	      this.prenom = prenom;
	   }

	 public String toString() {
	      String info_personne = "Nom: " + getNom() + "\n"; 
	            info_personne += " Prénom: " + getPrenom() + "\n"; 
	            info_personne += " Date naissance: " + getNaissance() + "\n";
	      return info_personne;
	   }
}