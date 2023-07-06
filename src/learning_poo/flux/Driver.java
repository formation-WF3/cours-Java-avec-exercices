package learning_poo.flux;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Driver {
	public static void main(String[] args) {
		List<Integer> notes = new ArrayList<>(
			Arrays.asList(2, 67, -87, 45, 3164, 65, 90, 123)
		);
		// Attention, avec of, la liste n'est pas modifiable
		//List<Integer> notes1 = List.of(2, 67, -87, 45, 3164, 65, 90, 123);
		/*
		List<Integer> notesPaires = new ArrayList<Integer>();
		for (Integer n : notes) {
			if (n % 2 == 0) {
				notesPaires.add(n);
			}
		}
		*/
		List<Integer> notesPaires = notes.stream()
			.filter(n -> n % 2 == 0)
			.toList();
		System.out.println(notesPaires);
		
		notes.forEach(n -> System.out.println(n)); // Peut s'écrire : System.out::println
		
		Integer somme = notes.stream()
			.reduce((e1, e2) -> e1 + e2)
			.get();
		
		Optional<Integer> somme2 = notes.stream()
			.reduce((e1, e2) -> e1 + e2);
		
		if (somme2.isPresent()) {
			System.out.println(somme2.get());
		}
		
		List<String> strNote = notes.stream().map(String::valueOf).toList();
		
		notes.stream()
			.filter(n -> n % 3 == 0)
			.filter(n -> n % 2 != 0)
			.filter(n -> n > 0)
			.forEach(System.out::println);
	}

}
