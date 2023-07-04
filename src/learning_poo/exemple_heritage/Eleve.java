package learning_poo.exemple_heritage;

public class Eleve extends Personne {
	private String classe;
	
	public Eleve() {};
	
	public Eleve(String nom, String prenom, Integer age, String classe) {
		super(nom, prenom, age);
		this.classe = classe;
	}
	
	@Override
	public void affichage() {
		String str = String.format("Je suis un élève qui se nomme : %s %s.",
				this.getPrenom(), this.getNom().toUpperCase());
		System.out.println(str);
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}	
	
}
