package exos_lastdayJava.exoExtra_jeuDeRole;


public class Driver {
	public static void main(String[] args) {
		Jeu jeu = new Jeu();
		System.out.println("Tous les personnages ont 16d6 répartis dans leurs caractéristiques, comme ci-dessous :");
		System.out.println("Personnage => PV: 7d6, F: 3d6, A: 3d6, I: 3d6, Arme: Epée, dégâts = (force + agilité) * arme");
		System.out.println("Guerrier => PV: 6d6, F: 5d6, A: 2d6, I: 2d6, Armure: 1d6, Arme: Hache, dégâts = force * arme");
		System.out.println("Mage => PV: 4d6, F: 1d6, A: 2d6, I: 5d6, Mana: 4d6, Arme: Bâton, dégâts = (intelligence + mana) * arme");
		System.out.println("Roublard => PV: 5d6, F: 2d6, A: 4d6, I: 2d6, Chance: 3d6, Arme: Arc, dégâts = ((force + intelligence) / 2 + agilité) * arme, ou attaque furtive si réussie (degats = agilité * 3)");
		System.out.println();
		
		// ToDo : jeu.initialiserPersonnages();
		
		// ToDo : jeu.jouerTour();
		
	}

}
