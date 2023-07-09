package exos_lastdayJava.exoExtra_jeuDeRole;

public enum Arme {
	EPEE(1.5),
	HACHE(2.0),
	ARC(1.0),
	BATON(0.5);
	
	private double numVal;
	
	Arme(double numVal) {
		this.numVal = numVal;
	}
	
	public double getNumVal() {
		return numVal;
	}
}
