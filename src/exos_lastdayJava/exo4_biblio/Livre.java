package exos_lastdayJava.exo4_biblio;

public class Livre {
	private String titre;
	private String auteur;
	private Integer nombreDePages;
	private Boolean disponible;
	
	public Livre() {}
	
	public Livre(String titre, String auteur, Integer nombreDePages, Boolean disponible) {
		this.titre = titre;
		this.auteur = auteur;
		this.nombreDePages = nombreDePages;
		this.disponible = disponible;
	}

	public String getTitre() {
		return titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public Integer getNombreDePages() {
		return nombreDePages;
	}

	public Boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Livre [titre = " + titre + ", auteur = " + auteur + ", nombreDePages = " + nombreDePages + ", disponible = "
				+ disponible + "]";
	}
	
}
