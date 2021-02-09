package pr_zavrsni;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Iznajmi {
	public static void iznajmiAuto(Korisnik k, Auto a, Zaposlenik z) {
		
		try(PrintWriter out = new PrintWriter("k1.txt")){
			
			out.println(a.toString());
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	public static void iznajmiMotor(Korisnik k, Motor a, Zaposlenik z) {
		
	}
}
