package learning_poo.animaux;

public class Chat extends Animal {

    public Chat(String nom, String race) {
        super(nom, race);
    }   

	@Override
    public void crier() {
        System.out.println("Miaou miaou");
    }
	
	@Override
	public String toString() {
		return "Chat [getNom() = " + getNom() + ", getRace() = " + getRace() + "]";
	}
}
