package exos_lastdayJava.exo5_club;

import java.util.Scanner;


public class Driver {
	public static void main(String[] args) {
		Club club = new Club();
		
		Scanner sc = new Scanner(System.in);
		int choix;
		do {
			System.out.println("1- Ajouter un membre");
			System.out.println("2- Ajouter une activité");
			System.out.println("3- Inscrire un membre à une activité");
			System.out.println("4- Désinscrire un membre à une activité");
			System.out.println("5- Afficher les activités");
			System.out.println("6- Afficher les membres");
			System.out.println("0- Quitter le programme");
			System.out.println("-----------------------------");
			System.out.println("Faites votre choix : ");	
			choix = sc.nextInt();
			sc.nextLine();
			String nomMembre;
			String nomActivite;
			
			switch (choix) {
				case 1:
					System.out.println("Nom du membre ?");
					nomMembre = sc.nextLine();
					System.out.println("Prénom du membre ?");
					String prenom = sc.nextLine();
					System.out.println("Age du membre ?");
					int age = sc.nextInt();
					sc.nextLine();
					club.ajouterMembre(new Membre(nomMembre.toUpperCase(), prenom, age));					
					break;
				case 2:
					System.out.println("Nom de l'activité ?");
					nomActivite = sc.nextLine();
					System.out.println("Description de l'activité ?");
					String description = sc.nextLine();
					System.out.println("Heure de l'activité (ex: 9:30) ?");
					String heure = sc.nextLine();
					club.ajouterActivite(new Activite(nomActivite.toLowerCase(), description, heure));
					break;
				case 3:
					System.out.println("Nom du membre voulant participer ?");
					nomMembre = sc.nextLine();
					if (!club.membreExistant(nomMembre.toUpperCase())) {
						System.out.println("Membre non inscrit au club !");
						break;
					}
					System.out.println("Nom de l'activité concernée ?");
					nomActivite = sc.nextLine();
					if (!club.activiteExistante(nomActivite.toLowerCase())) {
						System.out.println("Activité non trouvée !");
						break;
					}
					club.inscrireMembreActivite(nomMembre, nomActivite);
					break;
				case 4:
					System.out.println("Nom du membre à désinscrire ?");
					nomMembre = sc.nextLine();
					if (!club.membreExistant(nomMembre.toUpperCase())) {
						System.out.println("Membre non inscrit au club !");
						break;
					}
					System.out.println("Nom de l'activité concernée ?");
					nomActivite = sc.nextLine();
					if (!club.activiteExistante(nomActivite.toLowerCase())) {
						System.out.println("Activité non trouvée !");
						break;
					}
					club.desinscrireMembreActivite(nomMembre, nomActivite);
					break;
				case 5:
					club.afficherActivites();
					break;
				case 6:
					club.afficherMembres();
					break;
				default:
					System.out.println();
			}
		} while (choix != 0);
		System.out.println("Au revoir, à bientôt.");		
	}

}
