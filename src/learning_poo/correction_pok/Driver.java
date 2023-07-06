package learning_poo.correction_pok;

import java.util.Random;

public class Driver {
	public static void main(String[] args) {
        PokemonFeu salameche = new PokemonFeu("salameche", 100, 8);
        PokemonEau carapuce = new PokemonEau("carapuce", 100, 9);
//        PokemonPlante bulbizarre = new PokemonPlante("bulbizarre", 100, 7);

        int rand = new Random().nextInt(2);

        Pokemon joueur1;
        Pokemon joueur2;

        while(true) {
            if (rand == 0) {
                joueur1 = salameche;
                joueur2 = carapuce;
            } else {
                joueur1 = carapuce;
                joueur2 = salameche;
            }
            if (attaque(joueur1, joueur2)) {
                break;
            }

            if (attaque(joueur2, joueur1)) {
                break;
            }
        }

        if (joueur1.isDead()) {
            System.out.println("Félicitations à " + joueur2.getNom());
        } else {
            System.out.println("Félicitations à " + joueur1.getNom());
        }

    }

    private static boolean attaque(Pokemon joueur1, Pokemon joueur2) {
        joueur1.attaquer(joueur2);
        return joueur2.isDead();
    }
}
