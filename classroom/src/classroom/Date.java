package classroom;


public class Date {
	protected int jour;
	protected int mois;
	protected int annee;
	
	
	public Date()
	{
		this.jour = 0;
		this.mois = 0;
		this.annee = 0;
	}
	public Date(int jour, int mois, int annee)
	{
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}
	public Date (Date d)
	{
		this.jour = d.jour;
		this.mois = d.mois;
		this.annee = d.annee;
	}
	
	public String toString() {
		return""+this.annee + "."+this.mois+"."+this.jour;
	}
}
	
	
	


