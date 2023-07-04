package learning.poo.pointEtLigne;

import java.util.Objects;

public class Ligne {
	private Point debutDeLigne;
	private Point finDeLigne;
	
	public Ligne() {}

	public Ligne(Point debutDeLigne, Point finDeLigne) {
		this.debutDeLigne = debutDeLigne;
		this.finDeLigne = finDeLigne;
	}

	public Point getDebutDeLigne() {
		return debutDeLigne;
	}

	public void setDebutDeLigne(Point debutDeLigne) {
		this.debutDeLigne = debutDeLigne;
	}

	public Point getFinDeLigne() {
		return finDeLigne;
	}

	public void setFinDeLigne(Point finDeLigne) {
		this.finDeLigne = finDeLigne;
	}

	@Override
	public String toString() {
		return "Ligne [debutDeLigne=" + debutDeLigne + ", finDeLigne=" + finDeLigne + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(debutDeLigne, finDeLigne);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ligne other = (Ligne) obj;
		return Objects.equals(debutDeLigne, other.debutDeLigne) && Objects.equals(finDeLigne, other.finDeLigne);
	}
		
	public Float longueur() {	
		return (float) Math.sqrt(
			Math.pow(Math.abs(this.debutDeLigne.getX() - this.finDeLigne.getX()), 2) +
			Math.pow(Math.abs(this.debutDeLigne.getY() - this.finDeLigne.getY()), 2)
		);
	}
}
