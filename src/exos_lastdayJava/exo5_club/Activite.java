package exos_lastdayJava.exo5_club;

// cinéma, jeux, bricolage, jardinage, cuisine, décoration, voyage, gaming, lecture, musique, sports, cryptomonnaies, randonnée, sociologie, philosophie, SF/Fantasy, couture, tennis, politique internationale, activités manuelles, séries scandinaves, histoire, littérature

public class Activite {
	private String nom;
	private String description;
	private Integer nombreDeParticipants;
	private String heure;

	public Activite() {}

	public Activite(String nom, String description, String heure) {
		this.nom = nom;
		this.description = description;
		this.nombreDeParticipants = 0;
		this.heure = heure;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getNombreDeParticipants() {
		return nombreDeParticipants;
	}

	public void setNombreDeParticipants(Integer nombreDeParticipants) {
		this.nombreDeParticipants = nombreDeParticipants;
	}

	public String getHeure() {
		return heure;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}

	@Override
	public String toString() {
		return "Activite [nom = " + nom + ", description = " + description + ", nombreDeParticipants = "
				+ nombreDeParticipants + ", heure = " + heure + "]";
	}	
	
}
