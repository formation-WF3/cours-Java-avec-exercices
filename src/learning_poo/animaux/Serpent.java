package learning_poo.animaux;

public class Serpent extends Animal {

    public Serpent(String nom, String race) {
        super(nom, race);
    }

    @Override
    public void crier() {
        System.out.println("Ssss ssss");
    }
}
