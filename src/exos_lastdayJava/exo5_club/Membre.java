package exos_lastdayJava.exo5_club;

import java.util.ArrayList;
import java.util.List;

public class Membre {
	private String nom;
	private String prenom;
	private Integer age;
	private List<Activite> activitesDuMembre;

	public Membre() {}

	public Membre(String nom, String prenom, Integer age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.activitesDuMembre = new ArrayList<>();
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

	public List<Activite> getActivitesDuMembre() {
		return activitesDuMembre;
	}
	
	public void setActivitesDuMembre(List<Activite> activitesDuMembre) {
		this.activitesDuMembre = activitesDuMembre;
	}

	@Override
	public String toString() {
		return "Membre [nom = " + nom + ", prenom = " + prenom + ", age = " + age + ", activitesDuMembre = " + activitesDuMembre
				+ "]";
	}	
	
}
