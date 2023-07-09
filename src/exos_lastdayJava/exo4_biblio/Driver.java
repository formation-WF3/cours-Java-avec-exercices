package exos_lastdayJava.exo4_biblio;

public class Driver {
	public static void main(String[] args) {
		Bibliotheque biblio = new Bibliotheque();
		
		biblio.ajouterLivre(new Livre("Apprenti charlot", "Gil", 50, true));
		biblio.ajouterLivre(new Livre("Magicien de l'apocalypse", "Dav", 80, true));
		biblio.ajouterLivre(new Livre("Dragon de nuit", "Line", 75, false));
		biblio.ajouterLivre(new Livre("Les Guerriers d'hiver", "Gil", 60, true));
		
		biblio.emprunterLivre("Les Orques");
		biblio.emprunterLivre("Dragon de nuit");
		biblio.emprunterLivre("Magicien de l'apocalypse");
		
		biblio.rendreLivre("Les Orques");
		biblio.rendreLivre("Magicien de l'apocalypse");
		biblio.rendreLivre("Les Guerriers d'hiver");
		
		biblio.rechercherLivre("Les Orques");
		biblio.rechercherLivre("Apprenti charlot");
		
	}

}
