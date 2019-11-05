package exercicis;

/*
Task
 	In this simple Kata your task is to create a function that turns a string into a Mexican Wave. You will be passed a string and you must return that string in an array where an uppercase letter is a person standing up.
Rules
 	1.  The input string will always be lower case but maybe empty.
2.  If the character in the string is whitespace then pass over it as if it was an empty seat.
Example
wave("hello") => []string{"Hello", "hEllo", "heLlo", "helLo", "hellO"}
 */
public class MexicanWave {
	public static String[] wave(String str) {
		int contador = 0;
		char[] chars = str.toCharArray();
		String[] oleada = new String[str.replace(" ", "").length()];
		for (int i = 0; i < str.length(); i++) {

			if (chars[i] != ' ') {
				System.out.println(chars[i]);
				chars[i] = Character.toUpperCase(chars[i]);
				oleada[contador] = String.copyValueOf(chars);
				chars[i] = Character.toLowerCase(chars[i]);
				contador++;
			}
		}
		return oleada;
	}
}
