package exos_lastdayJava.exoExtra_jeuDeRole;

public class Roublard extends Personnage {
	private Integer chance; // %age de réussir une attaque furtive (dégâts = agilité * 3, pas de déduction d'armure contre cette attaque)

	public Roublard() {}

	public Roublard(String nom, Integer niveau, Integer pointsDeVie, Integer force, Integer agilite,
			Integer intelligence, Arme arme, Integer chance) {
		super(nom, pointsDeVie, force, agilite, intelligence, arme);
		this.chance = chance;
	}
	
	// dégâts = ((force + intelligence) / 2 + agilite) * arme, ou attaque furtive si réussie
	public Integer attaquer(Personnage cible) { // Comment transformer en type adequat ? 
		int degats = 0;
		if (Jeu.nombreAleatoire(1, 100) <= this.getChance()) {
			degats = this.getAgilite() * 3;
		} else {
			degats = (int) Math.round(((this.getForce() + this.getIntelligence()) / 2 + this.getAgilite()) * this.getArme().getNumVal());
			if (cible instanceof Guerrier) {
				degats = degats - cible.getArmure();
			}
		}
		return degats;
	}
	
	// PdV : 5d6, Force : 2d6, Agilité : 4d6, Intelligence : 2d6, Chance : 3d6, Arme : Arc
	public void creationPersonnage() {
		this.setPointsDeVie(Jeu.nombreAleatoire(5, 30));
		this.setForce(Jeu.nombreAleatoire(2, 12));
		this.setAgilite(Jeu.nombreAleatoire(4,24));
		this.setIntelligence(Jeu.nombreAleatoire(2, 12));
		this.setArme(Arme.ARC);
		this.chance = Jeu.nombreAleatoire(3, 18);
	}

	public Integer getChance() {
		return chance;
	}

	public void setChance(Integer chance) {
		this.chance = chance;
	}

	@Override
	public String toString() {
		return "Guerrier [nom = " + this.getNom() + ", niveau = " + this.getNiveau() + ", pointsDeVie = " + this.getPointsDeVie() + ", force = " + this.getForce() + ", agilite = " + this.getAgilite() + ", intelligence = " + this.getIntelligence() + ", arme = " + this.getArme() + "chance = " + chance + "]";
	}
	
}
