package learning.poo.cercle;

import com.formation.poo.cercle.Cercle;

public class Driver {
	public static void main(String[] args) {
		Cercle cercle = new Cercle(5.2f); // f pour cast en float
		
		System.out.println("La surface du cercle est de " + cercle.surface());
		System.out.println();
		System.out.println("Le périmètre du cercle est de " + cercle.perimetre());
	}
}
