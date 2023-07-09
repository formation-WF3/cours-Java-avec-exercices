package learning_poo.static_errors;

public class Personne {
	String nom;
	int count = 0;
	
	public Personne(String nom) {
		this.nom = nom;
		count++;
	}
	
	public static void affichage() {
		System.out.println("Bonjour à tous.");
	}

}
