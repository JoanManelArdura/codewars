package exercicis;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
Write a function that takes a positive integer and returns the next smaller positive integer containing the same digits.

For example:

nextSmaller(21) == 12
nextSmaller(531) == 513
nextSmaller(2071) == 2017
Return -1 (for Haskell: return Nothing, for Rust: return None), when there is no smaller number that contains the same digits. Also return -1 when the next smaller number with the same digits would require the leading digit to be zero.

nextSmaller(9) == -1
nextSmaller(111) == -1
nextSmaller(135) == -1
nextSmaller(1027) == -1 // 0721 is out since we don't write numbers with leading zeros
some tests will include very large numbers.
test data only employs positive integers.
 */
public class NextSmaller {
	public static long nextSmaller(long n)
	  {
		long resultat=0;
		int llarg = String.valueOf(n).length();;
		int[] array = new int[llarg];
		for(int r=llarg;r>0;r--){
		    array[r-1]= (int) (n % 10);
		    n /= 10;
		}
		System.out.println(llarg);
		System.out.println(array[0]);
		System.out.println(array[1]);
	
		for(int i=llarg;i>1;i--) {
			if(array[i-1]<array[i-2]||(array[i-2])==0) {
				int temporal=array[i-1];
				array[i-1]=array[i-2];
				array[i-2]=temporal;
				break;			
			}
		}
	
		if(array[0]==0)return -1;
		for(int i=0;i<array.length;i++) {
			resultat= (resultat*10)+array[i];
		}
		
		System.out.println(resultat);
	    return resultat;
	  }
}
