package learning.poo.ordinateur;


public class Ordinateur {
	private String marque ;
	private String modele;
	private Integer annee;
	private TypeOrdinateur typeOrdinateur;
	private String tailleEcran;
	private String tailleStockage;
	private String ram;
	private String processeur;

	public Ordinateur() {}
	
	public Ordinateur(String marque, String modele, Integer annee, TypeOrdinateur typeOrdinateur, String tailleEcran, String tailleStockage,
			String ram, String processeur) {
		this.marque = marque;
		this.modele = modele;
		this.annee = annee;
		this.typeOrdinateur = typeOrdinateur;
		this.tailleEcran = tailleEcran;
		this.tailleStockage = tailleStockage;
		this.ram = ram;
		this.processeur = processeur;
	}
	
	public void afficherDetails() {
		System.out.println("Ordinateur " + marque +
			", modèle " + modele +
			", année " + annee +
			", de type " + typeOrdinateur +
			", ayant un écran de " + tailleEcran +
			", une valeur de stockage de " + tailleStockage +
			", " + ram + " de RAM, et un processeur " +
			processeur + ".");
	}
	
	public void executerProgramme(String prog) {
		System.out.println("Le programme est en cours d'exécution, veuillez patienter.");
		System.out.println();
		for (int i = 0; i < 300000000; i++) {
			String str = "i est égale à " + i;
		}
		System.out.println("Le programme \"" + prog + "\" s'est terminé avec succès.");	
	}
}
