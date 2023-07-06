package learning_poo.pokemons;

public class Pokemon {
	private String nom;
	private Integer hp;
	private Integer atk;
	
	public Pokemon(String nom, Integer hp, Integer atk) {
		this.nom = nom;
		this.hp = hp;
		this.atk = atk;
	}
	
	public boolean isDead() {
		return this.hp == 0;
	}
	
	public void attaquer(Pokemon p) {
		p.setHp(p.getHp() - this.getAtk());
		if (p.getHp() < 0) {
			p.setHp(0);
		}
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getHp() {
		return hp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	public Integer getAtk() {
		return atk;
	}

	public void setAtk(Integer atk) {
		this.atk = atk;
	}

	@Override
	public String toString() {
		return "Pokemon : " + nom + ", hp = " + hp + ", attaque = " + atk;
	}

}
