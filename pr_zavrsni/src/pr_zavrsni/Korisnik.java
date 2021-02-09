package pr_zavrsni;

import java.io.*;

public class Korisnik {
	
	private String ime;
	private String adresa;
	int potroseno = 0;
	
	public Korisnik(String ime, String adresa) {
		this.ime = ime;
		this.adresa = adresa;
	}
	
	public void unajmi(Vozilo a, Zaposlenik z) {
		z.iznajmi(a);
		try(FileWriter fw = new FileWriter(adresa, true)){
			fw.append(new Integer(a.cijena).toString());
			fw.append(" ");
			fw.append(a.model);
			fw.append("\n");
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public int potroseno() {
		
		try(BufferedReader br = new BufferedReader(new FileReader(adresa))){
			String line = br.readLine();
			while(line != null) {
				String arr[] = line.split(" ", 2);
				potroseno = potroseno + Integer.parseInt(arr[0]);
				line = br.readLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		return potroseno;
	}
}
