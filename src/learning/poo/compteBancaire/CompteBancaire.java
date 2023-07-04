package learning.poo.compteBancaire;

import java.util.Objects;


public class CompteBancaire {
	private Integer numeroDeCompte;
	private String nomDuTitulaire;
	private Double solde;
	
	public CompteBancaire() {}
	
	public CompteBancaire(Integer numeroDeCompte, String nomDuTitulaire, Double solde) {
		this.numeroDeCompte = numeroDeCompte;
		this.nomDuTitulaire = nomDuTitulaire;
		this.solde = solde;
	}

	public Integer getNumeroDeCompte() {
		return numeroDeCompte;
	}
	
	public void setNumeroDeCompte(Integer numeroDeCompte) {
		this.numeroDeCompte = numeroDeCompte;
	}
	
	public String getNomDuTitulaire() {
		return nomDuTitulaire;
	}
	
	public void setNomDuTitulaire(String nomDuTitulaire) {
		this.nomDuTitulaire = nomDuTitulaire;
	}
	
	public Double getSolde() {
		return solde;
	}
	
	public void setSolde(Double solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "CompteBancaire [numeroDeCompte=" + numeroDeCompte + ", nomDuTitulaire=" + nomDuTitulaire + ", solde="
				+ solde + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nomDuTitulaire, numeroDeCompte, solde);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompteBancaire other = (CompteBancaire) obj;
		return Objects.equals(nomDuTitulaire, other.nomDuTitulaire)
				&& Objects.equals(numeroDeCompte, other.numeroDeCompte) && Objects.equals(solde, other.solde);
	}
	
	public void affichageSolde() {
		System.out.println("Votre solde est de " + this.solde + ".");
	}
	
	public void depot(Double montant) {
		this.solde = this.solde + montant;
		this.affichageSolde();
	}
	
	public void retrait(Double montant) {
		System.out.println("Vous avez demandé " + montant + ".");
		if (montant > this.solde) {
			System.out.println("Solde insuffisant, essayez avec un autre montant.");
		} else {
			this.solde = this.solde - montant;
			this.affichageSolde();
		}
	}
}
