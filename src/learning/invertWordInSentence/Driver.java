package learning.invertWordInSentence;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str;
		String pos;
		
		do {
			System.out.println("Saisissez une phrase contenant un mot inversé : ");
			str = scanner.nextLine();
			System.out.println();
			System.out.println("Saisissez un entier correspondant à la position du mot inversé.");
			System.out.println("Attention, une lettre suivi d'un \"'\" n'est pas considéré comme un mot (Ex : l') : ");
			pos = scanner.nextLine();
			System.out.println();
		} while(!checkSentenceAndPosition(str, pos));
		System.out.println("Phrase et position, acceptées.");
		System.out.println();
		String correctedSentence = sentenceCorrection(str, pos);
		System.out.println("Phrase corrigée : " + correctedSentence);
	}
	
	public static boolean checkSentenceAndPosition(String sentence, String position) {
		if (sentence == "" || sentence.trim() == "") {
			System.out.println("Vous n'avez rien saisie ou que des espaces, recommencez.");
			System.out.println();
			return false;
		} else {
			String[] tabOfStr = sentence.split(" ");
			if (tabOfStr.length == 1) {
				System.out.println("Vous n'avez saisie qu'un mot, recommencez.");
				System.out.println();
				return false;
			} else if (position.matches(".*[^0-9].*")) {
				System.out.println("La position saisie n'est pas un entier, recommencez.");
				System.out.println();
				return false;
			} else if (Integer.parseInt(position) > tabOfStr.length) {
				System.out.println("La position du mot inversé est supérieure au nombre de mots de la phrase, recommencez.");
				System.out.println();
				return false;
			}
		}
		return true;		
	}
	
	public static String sentenceCorrection(String sentence, String position) {
		String[] strTab = sentence.split(" ");
		int pos = Integer.parseInt(position);
		String wordToCorrect = strTab[pos - 1]; 
		String correctedWord = "";
		if (wordToCorrect.matches("^[a-zA-Z]'(.*)")) {
			String letterWithAppos = wordToCorrect.substring(0, 2);
			wordToCorrect = wordToCorrect.replace(letterWithAppos, "");
			correctedWord = letterWithAppos;
		}
		for(int i = wordToCorrect.length() - 1; i >= 0; i--) {
			correctedWord = correctedWord + wordToCorrect.charAt(i);
		}
		strTab[Integer.parseInt(position) - 1] = correctedWord;
		sentence = String.join(" ", strTab);
		return sentence;
	}
}
