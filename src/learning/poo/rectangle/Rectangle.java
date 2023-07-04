package learning.poo.rectangle;

import java.util.Objects;

public class Rectangle {
	private Float longueur;
	private Float largeur;
	
	public Rectangle() {}
	
	public Rectangle(Float longueur, Float largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public Float getLongueur() {
		return longueur;
	}

	public void setLongueur(Float longueur) {
		this.longueur = longueur;
	}

	public Float getLargeur() {
		return largeur;
	}

	public void setLargeur(Float largeur) {
		this.largeur = largeur;
	}

	@Override
	public String toString() {
		return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(largeur, longueur);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		return Objects.equals(largeur, other.largeur) && Objects.equals(longueur, other.longueur);
	}
	
	public Float surface() {
		return this.longueur * this.largeur;
	}
	
	public Float perimetre() {
		return (this.longueur + this.largeur) * 2;
	}
}
