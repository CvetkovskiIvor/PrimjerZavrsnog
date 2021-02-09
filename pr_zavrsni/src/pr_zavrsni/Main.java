package pr_zavrsni;

public class Main {

	public static void main(String[] args) {
		String unos = "Subota je najbolji dan u tjednu";
		String ispis = "";
		int k = 0;
		int j = 0;
		int druga = 1;
		for(int i = 0; i < unos.length(); ++i) {
			if(unos.charAt(i) == ' ') {
				if(druga == -1) {
					i = k;
				}
				ispis = ispis + ' ';
				druga *= -1;
			}
			if(druga == 1) {
				ispis = ispis + unos.charAt(i);
			}
			if(druga == -1) {
				for(j = i + 1; j < unos.length(); ++j) {
					if(unos.charAt(j) == ' ' || j + 1 == unos.length()) {
						k = j;
						break;
					}
				}
				j--;
				/*while(j != i && j >= 0) {
					ispis = ispis + unos.charAt(j);
					j--;
				}*/
			}
		}
		System.out.println(ispis);
		
	}

}
