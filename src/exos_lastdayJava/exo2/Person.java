package exos_lastdayJava.exo2;

public class Person {
	private String name;
	private String firstname;
	
	public Person() {}
	
	public Person(String name, String firstname) {
		this.name = name;
		this.firstname = firstname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Override
	public String toString() {
		return "Person [firstname = " + firstname + ", name = " + name + "]";
	}
		
}
