package learning.palindrome;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Saisissez une chaîne de caractères : ");
		String str = scanner.nextLine();
		System.out.println();

		if (isPalindrome(str)) {
			System.out.println("C'est un palindrome");
		} else {
			System.out.println("Ce n'est pas un palindrome");
		}
	}

	public static boolean isPalindrome(String str) {
		String strCleaned = str.replaceAll("\\W", "").toLowerCase();
		int i = 0;
		int len = strCleaned.length();
		boolean isPal = true;

		while (isPal && i < len) {
			isPal = strCleaned.charAt(i) == strCleaned.charAt(len - 1 - i);
			i++;
		}
		return isPal;
	}

}
