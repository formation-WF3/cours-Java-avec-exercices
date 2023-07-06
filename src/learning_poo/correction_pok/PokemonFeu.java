package learning_poo.correction_pok;

public class PokemonFeu extends Pokemon {
	public PokemonFeu(String nom, Integer hp, Integer atk) {
        super(nom, hp, atk);
    }

    @Override
    public void attaquer(Pokemon p) {
        if (p instanceof PokemonPlante plante) {
            plante.setHp(plante.getHp() - (this.getAtk() * 2));
        } else if (p instanceof PokemonEau || p instanceof PokemonFeu ) {
            p.setHp((int) (p.getHp() - (this.getAtk() * 0.5)));
        } else {
            super.attaquer(p);
        }
    }
}
