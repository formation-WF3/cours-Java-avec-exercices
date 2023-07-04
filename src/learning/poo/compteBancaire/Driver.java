package learning.poo.compteBancaire;


public class Driver {
	public static void main(String[] args) {
		CompteBancaire compteBancaire = new CompteBancaire(
			15864585, "Gilles", (double) 500
		);
		compteBancaire.depot(300.00);
		compteBancaire.retrait(1000.00);
		compteBancaire.retrait(350.00);
	}

}
