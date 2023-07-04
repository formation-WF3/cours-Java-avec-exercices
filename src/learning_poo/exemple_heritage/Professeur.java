package learning_poo.exemple_heritage;

public class Professeur extends Personne {
	private String matiere;
	
	public Professeur() {};
	
	public Professeur(String nom, String prenom, Integer age, String matiere) {
		super(nom, prenom, age);
		this.matiere = matiere;
	}
}
