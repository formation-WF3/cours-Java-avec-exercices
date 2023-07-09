package learning_poo.static_errors;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try (sc) {
			System.out.println("Entrez un nombre : ");
			int nb = sc.nextInt();
			between0_100(nb);
			System.out.println("Le nombre est " + nb);
		} catch (InputMismatchException e) {
			System.err.println("Je ne comprends pas le nombre rentré !");
		} catch (Between0_100Exception b) {
			System.err.println(b.getMessage());
		} finally {
			System.out.println("Terminé");
		}
		
	}
	
	public static boolean between0_100(int nb) throws Between0_100Exception {
		if (nb >= 0 && nb <= 100) {
			return true;
		}
		throw new Between0_100Exception("Le nombre n'est pas compris entre 0 et 100");
	}
	
	public static void learningStatic() {
		Personne p1 = new Personne("p1");
		System.out.println(p1.count);
		
		Personne p2 = new Personne("p2");
		System.out.println(p1.count);
		System.out.println(p2.count);
		
		Personne.affichage();
	}

}
