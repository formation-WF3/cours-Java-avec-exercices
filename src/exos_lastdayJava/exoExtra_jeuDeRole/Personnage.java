package exos_lastdayJava.exoExtra_jeuDeRole;

public class Personnage {
	private String nom;
	private Integer niveau;
	private Integer pointsDeVie;
	private Integer force;
	private Integer agilite;
	private Integer intelligence;
	private Arme arme;
	
	public Personnage() {}

	public Personnage(String nom, Integer pointsDeVie, Integer force, Integer agilite,
			Integer intelligence, Arme arme) {
		this.nom = nom;
		this.niveau = 1;
		this.pointsDeVie = pointsDeVie;
		this.force = force;
		this.agilite = agilite;
		this.intelligence = intelligence;
		this.arme = arme;
	}
	
	// dégâts = (force + agilite) * arme
	public Integer attaquer(Personnage cible) { // Comment transformer en type adequat ? 
		int degats = (int) Math.round((this.force + this.agilite) * 1.5);
		if (cible instanceof Guerrier) {
			degats = degats - cible.getArmure();
		}
		return degats;
	}
	
	// PdV : 7d6, Force : 3d6, Agilité : 3d6, Intelligence : 3d6, Arme : Epée
	public void creationPersonnage() {
		this.pointsDeVie = Jeu.nombreAleatoire(7, 42);
		this.force = Jeu.nombreAleatoire(3, 18);
		this.agilite = Jeu.nombreAleatoire(3,18);
		this.intelligence = Jeu.nombreAleatoire(3, 18);
		this.arme = Arme.EPEE;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getNiveau() {
		return niveau;
	}

	public void setNiveau(Integer niveau) {
		this.niveau = niveau;
	}

	public Integer getPointsDeVie() {
		return pointsDeVie;
	}

	public void setPointsDeVie(Integer pointsDeVie) {
		this.pointsDeVie = pointsDeVie;
	}

	public Integer getForce() {
		return force;
	}

	public void setForce(Integer force) {
		this.force = force;
	}

	public Integer getAgilite() {
		return agilite;
	}

	public void setAgilite(Integer agilite) {
		this.agilite = agilite;
	}

	public Integer getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}

	public Arme getArme() {
		return arme;
	}

	public void setArme(Arme arme) {
		this.arme = arme;
	}

	@Override
	public String toString() {
		return "Personnage [nom = " + nom + ", niveau = " + niveau + ", pointsDeVie = " + pointsDeVie + ", force = " + force + ", agilite = " + agilite + ", intelligence = " + intelligence + ", arme = " + arme + "]";
	}
	
}
