package classroom;

public class Matiere {
	String intitule;
	int coefficient;


	public Matiere() {
		this.intitule = null;
		this.coefficient = 0;
	}
	public Matiere(String intitule, int coefficient) {
		this.intitule = intitule;
		this.coefficient = coefficient;
	}
	public Matiere (Matiere m)
	{
		this.intitule = m.intitule;
		this.coefficient = m.coefficient;
		
	}
	public String toString() {
		return""+this.intitule + "\n"+ "Coefficient:"+this.coefficient;
	}
}