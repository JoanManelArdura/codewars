package exercicis;

import java.util.Arrays;

/*
A bird flying high above a mountain range is able to estimate the height of the highest peak.

Can you?

Example
The birds-eye view
^^^^^^
 ^^^^^^^^
  ^^^^^^^
  ^^^^^
  ^^^^^^^^^^^
  ^^^^^^
  ^^^^
The bird-brain calculations
111111
 1^^^^111
  1^^^^11
  1^^^1
  1^^^^111111
  1^^^11
  1111
111111
 12222111
  12^^211
  12^21
  12^^2111111
  122211
  1111
111111
 12222111
  1233211
  12321
  12332111111
  122211
  1111
Height = 3
 */
public class BirdMountain {

	public static int peakHeight(char[][] mountain) {
		
		int llarg = mountain[0].length;
		int[] contant = new int[llarg];
		int[][] intMount = new int[mountain.length][llarg];
		int result=0;
		for (int i = 0; i < mountain.length; i++) {
			for (int r = 0; r < llarg; r++) {
				if (mountain[i][r] == ' ')intMount[i][r] = 0;
				if (mountain[i][r] == '^') {
					intMount[i][r] = 1;
					result=1;
				}
			
			}	
		}
		for(int c=1;c<llarg;c++) {
		for(int i=1;i<mountain.length-1;i++) {
			for(int r=1;r<llarg-1;r++) {
				if(checkAround(intMount,i,r,c)) {
					intMount[i][r]=c+1;
					contant[c]++;	
				}
				
			}
		}
		if(contant[c]!=0)result=c+1;
		}
		/*System.out.println(Arrays.toString(intMount[0]));
		System.out.println(Arrays.toString(intMount[1]));
		System.out.println(Arrays.toString(intMount[2]));
		System.out.println(Arrays.toString(intMount[3]));
		System.out.println(Arrays.toString(intMount[4]));
		System.out.println(Arrays.toString(intMount[5]));
		System.out.println(Arrays.toString(intMount[6]));
		System.out.println(Arrays.toString(intMount[7]));
		System.out.println(Arrays.toString(intMount[8]));*/
		return result;
	}

	public static boolean checkAround(int[][] mountain, int i, int r, int c) {
		boolean yes = false;
		if ((mountain[i - 1][r] == c||mountain[i - 1][r] == c+1 )
				&&(mountain[i][r - 1] == c||mountain[i][r - 1] == c+1 )
				&& (mountain[i + 1][r] == c||mountain[i + 1][r] == c+1 ) 
				&&( mountain[i][r + 1] == c||mountain[i][r + 1] == c+1))
			yes = true;
		return yes;
	}
	

}





