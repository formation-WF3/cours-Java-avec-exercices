package learning.poo.cercle;

import java.util.Objects;

public class Cercle {
	private Float rayon;

	public Cercle() {}
	
	public Cercle(Float rayon) {
		this.rayon = rayon;
	}

	public Float getRayon() {
		return rayon;
	}

	public void setRayon(Float rayon) {
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(rayon);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cercle other = (Cercle) obj;
		return Objects.equals(rayon, other.rayon);
	}
	
	public Float surface() {
		return (float) (Math.pow(this.rayon, 2) * Math.PI);
	}
	
	public Float perimetre() {
		return this.rayon * 2 * (float) Math.PI;
	}
}
