package learning_poo.animaux;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
// import java.util.Scanner;


public class Driver {
    public static void main(String[] args) {
    	/*
        Scanner sc = new Scanner(System.in);

        System.out.println("Choisis parmis cette liste : ");
        System.out.println("\t1 - Chat");
        System.out.println("\t2 - Chien");
        System.out.println("\t3 - Oiseau");

        Animal animal = null;

        int choix = sc.nextInt();

        if (choix == 1) {
            animal = new Chat("Perséa", "Gouttière");
        } else if (choix == 2) {
            animal = new Chien("Pluto", "Disney");
        } else if (choix == 3) {
            animal = new Oiseau("Woody", "Warner");
        }

        System.out.println(animal.getClass().getSimpleName());
        System.out.println(animal instanceof Chien);
        // ToDo : crier()
        animal.crier();

        if (animal instanceof Chien chien) { // cast automatique de chien
//            System.out.println("Je suis le meilleur ami de l'homme");
            chien.amitie();
        }
        */
    	
    		List<Chat> chats = new ArrayList<>();
    		chats.add(new Chat("a", "r"));
    		chats.add(new Chat("b", "r"));
    		chats.add(new Chat("c", "r"));
    		
    		System.out.println(chats.get(1));
    		
    		chats.remove(new Chat("b", "r"));
    		
    		System.out.println(chats.size());
    		
    		for (Chat chat : chats) {
    			System.out.println(chat);
    		}
    		
    		Map<String, Chat> map = new HashMap<>();
    		map.put("perséa", new Chat("perséa", "Gouttière"));
    		map.put("pluto", new Chat("pluto", "Disney"));
    		
    		System.out.println(map);
    		
    		System.out.println(map.get("perséas"));
    		
    		map.remove("pluto");
    		System.out.println(map.size());
    		
    		// map.values()
    		for (String key : map.keySet()) {
    			System.out.println(map.get(key));
    		}
    		
    		for (Map.Entry<String, Chat> m : map.entrySet()) {
    			System.out.println(m.getKey() + " " + m.getValue());
    		}
    }
}
