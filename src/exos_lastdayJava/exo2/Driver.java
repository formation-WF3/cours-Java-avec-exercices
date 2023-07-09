package exos_lastdayJava.exo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Person> persons = new ArrayList<>();
	
		
		System.out.println("Entrez le nombre de personne à mettre dans la liste : ");
		int nbr = sc.nextInt();
		sc.nextLine(); // pour vider le buffer à cause du nextInt ci-dessus
		
		for (int i = 1; i <= nbr; i++) {
			System.out.println("Entrez le prénom de la personne " + i + " : ");
			String firstname = sc.nextLine();
			System.out.println("Entrez le nom de la personne " + i + " : ");
			String name = sc.nextLine();
			Person person = new Person();
			person.setFirstname(firstname);
			person.setName(name);
			
			persons.add(person);
		}
		
		persons.forEach(p -> System.out.println(p.toString()));
		
	}

}
