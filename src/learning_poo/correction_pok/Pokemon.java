package learning_poo.correction_pok;

public class Pokemon {
	private final String nom;
    private Integer hp;
    private final Integer atk;

    public Pokemon(String nom, Integer hp, Integer atk) {
        this.nom = nom;
        this.hp = hp;
        this.atk = atk;
    }

    public boolean isDead() {
        return this.hp <= 0;
    }

    public void attaquer(Pokemon p) {
        p.hp = p.hp - this.atk;
    }

    public String getNom() {
        return nom;
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

    @Override
    public String toString() {
        return """
                %s nom = %s, hp = %d, atk = %d
                """.formatted(
                this.getClass().getSimpleName(),
                this.nom,
                this.hp,
                this.atk
        );
    }
}
