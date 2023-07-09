package exos_lastdayJava.exo3_invent;

public class Article {
	private String nom;
	private Float prix;
	private Integer quantite;
	
	public Article() {}

	public Article(String nom, float prix, Integer quantite) {
		this.nom = nom;
		this.prix = prix;
		this.quantite = quantite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Float getPrix() {
		return prix;
	}

	public void setPrix(Float prix) {
		this.prix = prix;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "Article [nom = " + nom + ", prix = " + prix + ", quantite = " + quantite + "]";
	}
	
}
