package learning_poo.pokemons;

public class Driver {
    public static void main(String[] args) {
    		PokemonFeu feuPok = new PokemonFeu("Super pokémon", 100, 80);
    		PokemonPlante herbePok = new PokemonPlante("Mauvaise herbe", 30, 10);
    		System.out.println(feuPok);
    		System.out.println();
    		System.out.println(herbePok);
    		System.out.println();
    		
    		feuPok.attaquer(herbePok);
    		if (herbePok.isDead()) {
    			System.out.println(herbePok.getNom() + " est mort, " + feuPok.getNom() + " est vainqueur.");
    		}
    		
    		System.out.println(herbePok);
    		
    }
    
}
