package learning_poo.animaux;

import java.util.Scanner;


public class Driver {
    public static void main(String[] args) {
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
    }
}
