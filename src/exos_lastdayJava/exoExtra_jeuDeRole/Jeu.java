package exos_lastdayJava.exoExtra_jeuDeRole;

import java.util.Scanner;

public class Jeu {
	
	// A corriger et à finir
	public void initialiserPersonnages() {
		String[] typesPersonnage = { "Personnage", "Guerrier", "Mage", "Roublard" };
		Scanner sc = new Scanner(System.in);	
		
		int type1 = nombreAleatoire(0, 3);				
		System.out.println("Ce personnage sera de type : " + typesPersonnage[type1]);
		System.out.println("Nom du personnage ?");
		String nom1 = sc.nextLine();
		Personnage perso1 = creationPerso(type1, nom1); // Comment transformer en type adequat ?
		System.out.println(perso1);
		
		int type2 = nombreAleatoire(0, 3);
		System.out.println("Ce personnage sera de type : " + typesPersonnage[type2]);
		System.out.println("Nom du personnage ?");
		String nom2 = sc.nextLine();
		Personnage perso2 = creationPerso(type2, nom2); // Comment transformer en type adequat ?
		System.out.println(perso2);
	}
	
	public void jouerTour() {
		// ToDo
	}
	
	public static int nombreAleatoire(int min, int max) {
		return (int) Math.floor(Math.random() * (max - min + 1) + min);
	}
	
	public Personnage creationPerso(int type, String nom) {
		switch (type) {
			case 0:
				Personnage personnage = new Personnage();
				personnage.setNom(nom);
				personnage.creationPersonnage();
				System.out.println(personnage);
				return personnage;
//				break;
			case 1:
				Guerrier guerrier = new Guerrier();
				guerrier.setNom(nom);
				guerrier.creationPersonnage();
				System.out.println(guerrier);
				return guerrier;
//				break;
			case 2:
				Mage mage = new Mage();
				mage.setNom(nom);
				mage.creationPersonnage();
				System.out.println(mage);
				return mage;
//				break;
			case 3:
				Roublard roublard = new Roublard();
				roublard.setNom(nom);
				roublard.creationPersonnage();
				System.out.println(roublard);
				return roublard;
//				break;
			default:	
				return null;
		}
		
	}

}
