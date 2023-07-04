package learning_poo.animaux;

public abstract class Animal {
    private String nom;
    private String race;

    public Animal(String nom, String race) {
        this.nom = nom;
        this.race = race;
    }

    public abstract void crier();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
