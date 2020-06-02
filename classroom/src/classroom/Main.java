package classroom;



public class Main {

	public static void main(String[] args) {
		DateHeure today = new DateHeure(10,10,2020,13,14);
		System.out.println(""+ today);
		//Personne p1 = new Personne(String nom, String prenom, Date date_naissance);
		//p1.setNom("Noskov");
		//p1.setPrenom("Boris");
		//System.out.println(""+ p1);
		Matiere matiere1 = new Matiere("geographie", 2);
		System.out.println(""+ matiere1);
		Note exam1 = new Note(30,60);
		System.out.println(""+ exam1);
		


	}

}
