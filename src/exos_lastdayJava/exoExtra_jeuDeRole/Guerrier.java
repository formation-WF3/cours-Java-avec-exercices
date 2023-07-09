package exos_lastdayJava.exoExtra_jeuDeRole;

public class Guerrier extends Personnage {
	private Integer armure; // à déduire des dégâts infligés, sauf contre l'attaque furtive du Roublard
	
	public Guerrier() {}

	public Guerrier(String nom, Integer niveau, Integer pointsDeVie, Integer force, Integer agilite,
			Integer intelligence, Arme arme, Integer armure) {
		super(nom, pointsDeVie, force, agilite, intelligence, arme);
		this.armure = armure;
	}

	// dégâts = force * arme
	public Integer attaquer(Personnage cible) { // Comment transformer en type adequat ? 
		int degats = (int) Math.round(this.getForce() * this.getArme().getNumVal());
		if (cible instanceof Guerrier) {
			degats = degats - cible.getArmure();
		}
		return degats;
	}
	
	// PdV : 6d6, Force : 5d6, Agilité : 2d6, Intelligence : 2d6, Armure : 1d6, Arme : Hache
	public void creationPersonnage() {
		this.setPointsDeVie(Jeu.nombreAleatoire(6, 36));
		this.setForce(Jeu.nombreAleatoire(5, 30));
		this.setAgilite(Jeu.nombreAleatoire(2,12));
		this.setIntelligence(Jeu.nombreAleatoire(2, 12));
		this.setArme(Arme.HACHE);
		this.armure = Jeu.nombreAleatoire(1, 6);
	}

	public Integer getArmure() {
		return armure;
	}

	public void setArmure(Integer armure) {
		this.armure = armure;
	}

	@Override
	public String toString() {
		return "Guerrier [nom = " + this.getNom() + ", niveau = " + this.getNiveau() + ", pointsDeVie = " + this.getPointsDeVie() + ", force = " + this.getForce() + ", agilite = " + this.getAgilite() + ", intelligence = " + this.getIntelligence() + ", arme = " + this.getArme() + "armure = " + armure + "]";
	}
	
}
