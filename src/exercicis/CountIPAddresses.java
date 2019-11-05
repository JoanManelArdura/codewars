package exercicis;

/*
Implement a function that receives two IPv4 addresses, and returns the number of addresses between them (including the first one, excluding the last one).

All inputs will be valid IPv4 addresses in the form of strings. The last address will always be greater than the first one.

Examples
ips_between("10.0.0.0", "10.0.0.50")  ==   50 
ips_between("10.0.0.0", "10.0.1.0")   ==  256 
ips_between("20.0.0.10", "20.0.1.0")  ==  246
 
 */
public class CountIPAddresses {
	public static long ipsBetween(String start, String end) {
		String[] llistaString = start.split("\\.");
		String[] llistaString2 = end.split("\\.");
		int[] total = new int[4];
		int contador = 0;
		long absolut = 0;
		for (int i = 3; i > -1; i--) {
			if (contador == 0) {
				absolut += Integer.parseInt(llistaString2[i]) - Integer.parseInt(llistaString[i]);
			} else {
				absolut += (Integer.parseInt(llistaString2[i]) - Integer.parseInt(llistaString[i])) * (long)Math.pow(256 , contador);
			}
			contador++;

			
		}
		System.out.println(absolut);
		return absolut;
	}
}
