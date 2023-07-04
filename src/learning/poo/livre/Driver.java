package learning.poo.livre;


public class Driver {
	public static void main(String[] args) {
		Livre livre = new Livre("Le mage", "Raymond Feist", 350, (float) 15);
		
		System.out.println("Le prix par page de ce livre est de " + livre.prixParPage());
	}
}
