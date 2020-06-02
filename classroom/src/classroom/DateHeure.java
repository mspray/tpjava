package classroom;

public class DateHeure extends Date{
	private int heure;
	private int minute;

	public DateHeure()  {
		super();
		this.heure = 0;
		this.minute = 0;
	}

	public DateHeure (int jour, int mois, int annee, int heure, int minute) throws DateException, HeureException {
		super(jour,mois,annee);
		if(heure < 0 || heure > 24 || minute < 0 || minute > 60){
			throw new HeureException();
		}
		this.heure = heure;
		this.minute = minute;
	}
	public DateHeure (DateHeure d) {
		this.heure = d.heure;
		this.minute = d.minute;

	}
	public String toString() {
		return"" +super.annee +"."+ super.mois  +"."+super.jour +"."+ this.heure + "h"+this.minute;
	}
}