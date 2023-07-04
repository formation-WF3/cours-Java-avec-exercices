package learning.poo.pointEtLigne;


public class Driver {
	public static void main(String[] args) {
		Point depart = new Point(5, 9);
		Point arrivee = new Point(16, 24);
		Ligne ligne = new Ligne(depart, arrivee);
		
		System.out.println("La longueur de la ligne est de " + ligne.longueur());
	}

}
