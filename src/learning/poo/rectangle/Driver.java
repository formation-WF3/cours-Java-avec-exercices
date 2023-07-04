package learning.poo.rectangle;


public class Driver {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5.2f, 7.7f); // f pour cast en float
		
		System.out.println("La surface du rectangle est de " + rectangle.surface());
		System.out.println();
		System.out.println("Le périmètre du rectangle est de " + rectangle.perimetre());
	}
}
