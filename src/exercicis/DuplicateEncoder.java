package exercicis;

/*
The goal of this exercise is to convert a string to a new string where each character 
in the new string is "(" if that character appears only once in the original string, 
or ")" if that character appears more than once in the original string. Ignore 
capitalization when determining if a character is a duplicate.

Examples
"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))((" 
Notes

Assertion messages may be unclear about what they display in some languages. 
If you read "...It Should encode XXX", the "XXX" is the expected result, not the input!
 */

public class DuplicateEncoder {
	
	static String encode(String word) {
		word = word.toLowerCase();
		String word2 = "";
		for (int i = 0; i < word.length(); i++) {
			int repe = 0;
			for (int p = 0; p < word.length(); p++) {
				System.out.println(word.charAt(p) + " " + word.charAt(i));
				if (word.charAt(p) == word.charAt(i) && p != i) {
					repe++;
				}
			}
			if (repe == 0) {
				word2 += "(";
			} else {
				word2 += ")";
			}
			System.out.println(word2);
		}
		return word2;
	}
}
