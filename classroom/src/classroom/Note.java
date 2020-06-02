package classroom;

public class Note {
	private int valeur;
	private int noteMaxi;

	public Note() {
		this.valeur = 0;
		this.noteMaxi = 60;
	}
	public Note(int valeur, int notemax) {
		this.valeur = valeur;
		this.noteMaxi = notemax;
	}
	public Note (Note n)
	{
		this.valeur = n.valeur;
		this.noteMaxi = n.noteMaxi;
		
	}
	public String toString() {
		return""+this.valeur + "/"+this.noteMaxi;
	}
}