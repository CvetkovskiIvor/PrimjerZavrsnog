package pr_zavrsni;

public class Zaposlenik {
	
	private int brojac = 0;
	private String ime;
	private int popisCijena[] = new int[3];
	private String popisModel[] = new String[3];
	private int placa;
	
	public Zaposlenik(String ime) {
		this.ime = ime;
	}
	
	public int getPlaca() {
		placa = (popisCijena[0] + popisCijena[1] + popisCijena[2]) * 25;
		return placa;
	}
	
	public void iznajmi(Vozilo v) {
		popisModel[brojac] = v.model;
		popisCijena[brojac] = v.cijena;
		brojac = (brojac + 1) % 3;
	}
}
