package pr_zavrsni;

import java.util.ArrayList;
import java.util.List;

abstract public class Vozilo {
	
	public int cijena;
	public String model;
	public static List<String> popisVozila = new ArrayList<String>();

	public Vozilo() {
		popisVozila.add(model);
	}
}
