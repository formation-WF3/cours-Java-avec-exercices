package learning_poo.static_errors;

public class Between0_100Exception extends Exception {
	
	private static final long serialVersionUID = 685325451654848494L;

	private String message;
	
	public Between0_100Exception(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
}