package exos_lastdayJava.exo4_biblio;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
	private List<Livre> livres = new ArrayList<>();
	
	public void ajouterLivre(Livre livre) {
		this.livres.add(livre);
	}
	
	public void rechercherLivre(String titre) {
		for (Livre l : this.livres) {
			if (l.getTitre().equals(titre)) {
				System.out.println(l);
				return;
			}
		}
		System.out.println("Livre non trouvé");
	}
	
	public void emprunterLivre(String titre) {
		for (Livre l : this.livres) {
			if (l.getTitre().equals(titre)) {
				if (l.getDisponible()) {
					l.setDisponible(false);
					System.out.println("Vous emprunter ce livre, c'est enregistré.");
					return;
				} else {
					System.out.println("Le livre n'est pas disponible.");
					return;
				}
			}
		}
		System.out.println("Livre non trouvé !");
	}
	
	public void rendreLivre(String titre) {
		for (Livre l : this.livres) {
			if (l.getTitre().equals(titre)) {
				if (!l.getDisponible()) {
					l.setDisponible(true);
					System.out.println("Vous rendez ce livre, c'est enregistré.");
					return;
				} else {
					System.out.println("Ce livre est déjà là.");
					return;
				}
			}
		}
		System.out.println("Livre non trouvé !");
	}
	
}
