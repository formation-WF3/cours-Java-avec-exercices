package learning_poo.animaux;

public class Chien extends Animal {

    public Chien(String nom, String race) {
        super(nom, race);
    }

    @Override
    public void crier() {
        System.out.println("Waouf waouf");
    }

    public void amitie() {
        System.out.println("Je suis le meilleur ami de l'homme");
    }
}
