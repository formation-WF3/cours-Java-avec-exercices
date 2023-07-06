package learning_poo.blog;

@FunctionalInterface
interface Request {
	boolean execute(String str);
}

public class Driver {
	public static void main(String[] args) {
		/*
		 * C => Create => Insert => insert()
		 * R => Read   => Select => findAll() | findById()
		 * U => Update => Update => update()
		 * D => Delete => Delete => delete() | deleteById()
		 */
		
		Request req = (String message) -> {
			System.out.println(message);
			return message.isEmpty();
		};
		
		request(req);		
	}
	
	public static void request(Request req) {
		System.out.println("Connexion");
		
		// ToDo : requête SQL
		req.execute("SELECT * FROM blog;");
		
		System.out.println("Déconnexion");
	}
}
