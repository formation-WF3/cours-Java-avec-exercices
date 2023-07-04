package learning;

public class Pilote {
	public static void main(String[] args) {
		Person sam = new Person();
		
		println();
	}
	
	public static void println(String... obj) {
		StringBuilder build = new StringBuilder();
		for (int i = 0; i < obj.length; i++) {
			build.append(obj[i]);
			build.append(" ");
		}
		System.out.println(build);
	}
}
