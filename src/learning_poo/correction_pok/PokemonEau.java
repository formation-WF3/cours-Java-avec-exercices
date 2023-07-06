package learning_poo.correction_pok;

public class PokemonEau extends Pokemon {
	public PokemonEau(String nom, Integer hp, Integer atk) {
        super(nom, hp, atk);
    }

    @Override
    public void attaquer(Pokemon p) {
        if (p instanceof PokemonFeu) {
            p.setHp(p.getHp() - (this.getAtk() * 2));
        } else if (p instanceof PokemonEau || p instanceof PokemonPlante ) {
            p.setHp((int) (p.getHp() - (this.getAtk() * 0.5)));
        } else {
            super.attaquer(p);
        }
    }
}
