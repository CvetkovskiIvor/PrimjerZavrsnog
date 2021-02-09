package pr_zavrsni;

public class Auto extends Vozilo{
	
	private int brojVrata;
	
	public Auto(String model, int cijena, int brojVrata) {
		super();
		this.brojVrata = brojVrata;
		this.model = model;
		this.cijena = cijena;
	}
}
