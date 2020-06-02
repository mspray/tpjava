package classroom;


public class Date {

	public int annee;
	public int mois;
	public int jour;

	public Date (){
		this.annee = 0;
		this.mois = 0;
		this.jour = 0;
	}
	public Date(int Jour, int Mois, int Annee) throws DateException{
		this.annee = Annee;
		if (Mois < 0 || Mois > 12){
			throw new DateException();
		}
		this.mois = Mois;
		if (Jour < 0 || Jour > 31){
			throw new DateException();
		}
		if(Jour == 31 && (Mois == 2 || Mois == 4 || Mois == 6 || Mois == 9 || Mois == 11)){
			throw new DateException();
		} else if (Jour == 30 && Mois == 2){
			throw new DateException();
		} else if (Jour == 29  && Mois == 2 && Annee%4 != 0){
			throw new DateException();
		}
		this.jour = Jour;
	}

	public Date (Date d)
	{
		this.jour = d.jour;
		this.mois = d.mois;
		this.annee = d.annee;
	}

	@Override
	public String toString() {
		return""+this.annee + "."+this.mois+"."+this.jour;
	}
}

	
	
	


