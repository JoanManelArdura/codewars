package exercicis;

import java.util.Map;
import java.util.TreeMap;

/*
You are given an input string.

For each symbol in the string if it's the first character occurence, replace it with a '1', else replace it with the amount of times you've already seen it...

But will your code be performant enough?

Examples:
input   =  "Hello, World!"
result  =  "1112111121311"

input   =  "aaaaaaaaaaaa"
result  =  "123456789101112"
Note: there will be no int domain overflow (character occurences will be less than 2 billion).

There might be some non-ascii characters in the string.
 */
public class NumericalsOfAString {
	public static String numericals(String s) {
		long startTime = System.nanoTime();
		StringBuffer nouString = new StringBuffer();

		Map<Character, Integer> mapa = new TreeMap<Character, Integer>();
		char[] charArray = s.toCharArray();
		for (Character ch : charArray) {
			mapa.merge(ch, 1, Integer::sum);
			nouString.append(mapa.get(ch));
		}
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println("Execution time in nanoseconds  : " + timeElapsed);
		return nouString.toString();
	}
}
