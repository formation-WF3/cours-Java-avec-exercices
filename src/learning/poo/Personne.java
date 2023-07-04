package learning.poo;

import java.util.Objects;

public class Personne {
	public static void main(String[] args) {
		Personne personne = new Personne(
			"Gilles", "TAG", 54
		);
		System.out.println(personne.toString());
	}
	
	private String prenom;
	private String nom;
	private Integer age;
	
	public Personne() {}
		
	public Personne(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
	}
	
	public Personne(String prenom, String nom, Integer age) {
		this(prenom, nom);
		this.age = age;
	}
		
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Personne:\n\t" + prenom + ' ' + nom + ", " + age + " ans.";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, nom, prenom);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		return Objects.equals(age, other.age) && Objects.equals(nom, other.nom) && Objects.equals(prenom, other.prenom);
	}
		
}
