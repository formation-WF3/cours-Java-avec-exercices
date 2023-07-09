package exos_lastdayJava.exo3_invent;


import java.util.HashMap;
import java.util.Map;

public class Inventaire {
	private Map<String, Article> articles = new HashMap<String, Article>();

	public void ajouterArticle(String nom, float prix, int quantite) {
		Article article = new Article(nom, prix, quantite);
		
		articles.put(nom, article);
	}
	
	public void supprimerArticle(String nom) {
		if (articles.get(nom) == null) {
			System.out.println("Article non trouvé !");
		} else {
			articles.remove(nom);
			System.out.println("Article supprimé !");
		}
	}
	
	public Article rechercherArticle(String nom) {
		return articles.get(nom);
	}
	
	public void afficherInventaire() {
		for (Article article : this.articles.values()) {
            System.out.println(article);
        }
	}

}
