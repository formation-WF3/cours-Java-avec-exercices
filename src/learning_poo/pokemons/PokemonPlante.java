package learning_poo.pokemons;

public class PokemonPlante extends Pokemon {
	
	public PokemonPlante(String nom, Integer hp, Integer atk) {
		super(nom, hp, atk);
	}
	
	@Override
	public void attaquer(Pokemon p) {
		switch(p.getClass().getSimpleName()) {
		case "PokemonFeu":
			p.setHp((int) Math.round(p.getHp() - this.getAtk() * 0.5));
			break;
		case "PokemonEau":
			p.setHp((int) Math.round(p.getHp() - this.getAtk() * 0.5));
			break;
		case "PokemonPlante":
			p.setHp(p.getHp() - this.getAtk() * 2);
			break;
		default:	
			p.setHp(p.getHp() - this.getAtk());
		}
		if (p.getHp() < 0) {
			p.setHp(0);
		}
	}

}
