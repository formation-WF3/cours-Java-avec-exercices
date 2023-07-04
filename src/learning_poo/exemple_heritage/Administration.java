package learning_poo.exemple_heritage;

public class Administration extends Personne {
	private String poste;
	
	public Administration() {};
	
	public Administration(String nom, String prenom, Integer age, String poste) {
		super(nom, prenom, age);
		this.poste = poste;
	}
}
