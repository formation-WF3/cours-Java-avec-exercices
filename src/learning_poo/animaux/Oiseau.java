package learning_poo.animaux;

public class Oiseau extends Animal {

    public Oiseau(String nom, String race) {
        super(nom, race);
    }

    @Override
    public void crier() {
        System.out.println("Cui cui");
    }
}
