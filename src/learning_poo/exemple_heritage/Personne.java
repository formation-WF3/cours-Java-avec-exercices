package learning_poo.exemple_heritage;

public class Personne {
	private String nom;
	private String prenom;
	private Integer age;
	
	public Personne() {};
	
	public Personne(String nom, String prenom, Integer age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public void affichage() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Je suis une personne qui se nomme : ")
		.append(this.prenom)
		.append(" ")
		.append(this.nom.toUpperCase());
		
		System.out.println(stringBuilder);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}	

}
