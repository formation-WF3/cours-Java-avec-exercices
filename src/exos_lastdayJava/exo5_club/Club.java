package exos_lastdayJava.exo5_club;

import java.util.ArrayList;
import java.util.List;


public class Club {
	private List<Membre> membres = new ArrayList<>();
	private List<Activite> activites = new ArrayList<>();
	
	public void ajouterMembre(Membre membre) {
		this.membres.add(membre);
	}
	
	public void ajouterActivite(Activite activite) {
		this.activites.add(activite);
	}
	
	public void inscrireMembreActivite(String nomMembre, String nomActivite) {
		for(Membre membre : this.membres) {
			if (membre.getNom().equals(nomMembre)) {
				for (Activite activite : this.activites) {
					if (activite.getNom().equals(nomActivite)) {
						if (membre.getActivitesDuMembre().contains(activite)) {
							System.out.println("Membre déjà inscrit à cette activité.");
						} else {
							membre.getActivitesDuMembre().add(activite);
							System.out.println("Membre désormais inscrit à l'activité.");
						}
						return;
					}
				}				
			}
		}
	}
	
	public void desinscrireMembreActivite(String nomMembre, String nomActivite) {
		for(Membre membre : this.membres) {
			if (membre.getNom().equals(nomMembre)) {
				for (Activite activite : this.activites) {
					if (activite.getNom().equals(nomActivite)) {
						int indiceActiviteDuMembre = membre.getActivitesDuMembre().indexOf(activite);
						if (indiceActiviteDuMembre == -1) {
							System.out.println("Le membre n'est pas inscrit à cette activité.");
						} else {
							membre.getActivitesDuMembre().remove(indiceActiviteDuMembre);
							System.out.println("Membre désormais désinscrit de l'activité.");
						}
						return;
					}
				}				
			}
		}
	}
	
	public void afficherActivites() {
		this.activites.forEach(a -> System.out.println(a));
	}

	public void afficherMembres() {
		this.membres.forEach(m -> System.out.println(m));
	}
	
	public boolean membreExistant(String nom) {
		for(Membre membre : this.membres) {
			if (membre.getNom().equals(nom)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean activiteExistante(String nom) {
		for(Activite activite : this.activites) {
			if (activite.getNom().equals(nom)) {				
				return true;
			}
		}		
		return false;
	}
}
