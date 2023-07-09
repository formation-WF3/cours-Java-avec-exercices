package exos_lastdayJava.exoExtra_jeuDeRole;

public class Mage extends Personnage {
	private Integer mana;

	public Mage() {}

	public Mage(String nom, Integer niveau, Integer pointsDeVie, Integer force, Integer agilite,
			Integer intelligence, Arme arme, Integer mana) {
		super(nom, pointsDeVie, force, agilite, intelligence, arme);
		this.mana = mana;
	}
	
	// dégâts = (intelligence + mana) * arme
	public Integer attaquer(Personnage cible) { // Comment transformer en type adequat ? 
		int degats = (int) Math.round((this.getIntelligence() + this.mana) * 0.5);
		if (cible instanceof Guerrier) {
			degats = degats - cible.getArmure();
		}
		return degats;
	}
	
	// PdV : 4d6, Force : 1d6, Agilité : 2d6, Intelligence : 5d6, Mana : 4d6, Arme : Bâton
	public void creationPersonnage() {
		this.setPointsDeVie(Jeu.nombreAleatoire(4, 24));
		this.setForce(Jeu.nombreAleatoire(1, 6));
		this.setAgilite(Jeu.nombreAleatoire(2,12));
		this.setIntelligence(Jeu.nombreAleatoire(5, 30));
		this.setArme(Arme.BATON);
		this.mana = Jeu.nombreAleatoire(4, 24);
	}

	public Integer getMana() {
		return mana;
	}

	public void setMana(Integer mana) {
		this.mana = mana;
	}

	@Override
	public String toString() {
		return "Guerrier [nom = " + this.getNom() + ", niveau = " + this.getNiveau() + ", pointsDeVie = " + this.getPointsDeVie() + ", force = " + this.getForce() + ", agilite = " + this.getAgilite() + ", intelligence = " + this.getIntelligence() + ", arme = " + this.getArme() + "mana = " + mana + "]";
	}
	
}
