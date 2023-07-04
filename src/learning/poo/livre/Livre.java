package learning.poo.livre;

import java.util.Objects;

public class Livre {
	private String titre;
	private String auteur;
	private Integer nombreDePages;
	private Float prix;
	
	public Livre() {}
	
	public Livre(String titre, String auteur, Integer nombreDePages, Float prix) {
		this.titre = titre;
		this.auteur = auteur;
		this.nombreDePages = nombreDePages;
		this.prix = prix;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public Integer getNombreDePages() {
		return nombreDePages;
	}

	public void setNombreDePages(Integer nombreDePages) {
		this.nombreDePages = nombreDePages;
	}

	public Float getPrix() {
		return prix;
	}

	public void setPrix(Float prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", auteur=" + auteur + ", nombreDePages=" + nombreDePages
				+ ", prix=" + prix + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(auteur, nombreDePages, prix, titre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livre other = (Livre) obj;
		return Objects.equals(auteur, other.auteur) && Objects.equals(nombreDePages, other.nombreDePages)
				&& Objects.equals(prix, other.prix) && Objects.equals(titre, other.titre);
	}
	
	public Float prixParPage() {
		return this.prix / this.nombreDePages;
	}
	
}
