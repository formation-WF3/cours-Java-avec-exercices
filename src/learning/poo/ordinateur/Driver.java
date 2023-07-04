package learning.poo.ordinateur;

public class Driver {
	public static void main(String[] args) {
		Ordinateur monOrdinateur = new Ordinateur(
			"Apple", "II+", 1978, TypeOrdinateur.BUREAU, "14 pouces", "360Ko", "32Ko", "6502 à 1.023 Mhz de MOS"
		);
		
		monOrdinateur.afficherDetails();
		System.out.println();
		monOrdinateur.executerProgramme("Test");
	}

}
