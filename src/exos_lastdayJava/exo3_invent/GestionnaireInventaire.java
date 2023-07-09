package exos_lastdayJava.exo3_invent;


import java.util.Scanner;

public class GestionnaireInventaire {
	public static void main(String[] args) {
		Inventaire invent = new Inventaire();
		Scanner sc = new Scanner(System.in);
		int choix;
		do {
			System.out.println("1- Ajouter un article");
			System.out.println("2- Supprimer un article");
			System.out.println("3- Rechercher un article");
			System.out.println("4- Afficher tous les articles");
			System.out.println("0- Sortir du programme");
			System.out.println("-----------------------------");
			System.out.println("Faites votre choix : ");	
			choix = sc.nextInt();
			sc.nextLine();
			String nom;
			
			switch (choix) {
				case 1:				
					System.out.println("Entrez le nom de l'article à ajouter : ");
					nom = sc.nextLine();
					System.out.println("Entrez le prix de l'article à ajouter : ");
					float prix = sc.nextFloat();
					sc.nextLine();
					System.out.println("Entrez la quantité d'article à ajouter : ");
					int quantite = sc.nextInt();
					sc.nextLine();
					invent.ajouterArticle(nom, prix, quantite);
					break;
				case 2:
					System.out.println("Entrez le nom de l'article à supprimer : ");
					nom = sc.nextLine();
					invent.supprimerArticle(nom);
					break;
				case 3:
					System.out.println("Entrez le nom de l'article à rechercher : ");
					nom = sc.nextLine();
					if (invent.rechercherArticle(nom) == null) {
						System.out.println("Article non trouvé !");
					} else {
						System.out.println(invent.rechercherArticle(nom).toString());
					}
					break;
				case 4:
					invent.afficherInventaire();
					break;
				default:
					System.out.println();
			}
		} while (choix != 0);
		System.out.println("Au revoir, à bientôt.");
	}
}
