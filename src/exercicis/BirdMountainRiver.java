package exercicis;

import java.util.Arrays;

/*
A high flying bird is able to estimate the contours of the ground below.

He sees hills and valleys, he sees plains and mountains.

(But you already know all this because you've solved my Bird Mountain Kata)

But this time our protagonist bird also sees a RIVER.

Not only that, but he sees that the river is rising rapidly, so much so that in a few days it threatens to inundate the surrounding land.

And all this is very important to the bird because he cannot land on water!

Kata Task
The bird quickly calculates how much ground will remain dry as the water rises.

Can you?

Output
A list of how many dry landing spots there are for the next 3 days only (include day 0)
Notes
The ground is always supplied as a rectangular grid
The normal river is at level -0.5. It is rising at 1 unit per day
Sometimes there isn't any river at all, so you better account for those cases too!
Example
The birds-eye view
  ^^^^^^       
^^^^^^^^       ^^^
^^^^^^^  ^^^
^^^^^^^  ^^^
^^^^^^^  ^^^
---------------------
^^^^^        
   ^^^^^^^^  ^^^^^^^
^^^^^^^^     ^     ^
^^^^^        ^^^^^^^
The bird-brain calculations
Day	Prediction	Number of dry landing spots
Day 0	
  111111       
11222221       111
1233321  111
1222221  121
1111111  111
---------------------
11111        
   12111111  1111111
11122111     1     1
11111        1111111
189
Day 1	
  111111-------------
11222221-------111---
1233321--111---------
1222221--121---------
1111111--111---------
---------------------
11111----------------
   12111111--1111111-
11122111-----1     1-
11111--------1111111-
99
Day 2	
---------------------
--22222--------------
-23332---------------
-22222----2----------
---------------------
---------------------
---------------------
----2----------------
---22----------------
---------------------
19
Day 3	
---------------------
---------------------
--333----------------
---------------------
---------------------
---------------------
---------------------
---------------------
---------------------
---------------------
3
Dry ground = [189, 99, 19, 3]
 */
public class BirdMountainRiver {
	static int aigua=0;

	public static int[] dryGround(char[][] terrain) {
		int[] contant = new int[4];
		if (terrain == null) {
			  System.out.println("array is null");
			  return contant;
			}
		if (terrain.length == 0) {
			  System.out.println("array is empty");
			  return contant;
			}
		aigua=0;
		int llarg = terrain[0].length;
		
		int[][] intMount = new int[terrain.length][llarg];
		int nivell = -1;
		for (int i = 0; i < terrain.length; i++) {
			for (int r = 0; r < llarg; r++) {
				if (terrain[i][r] == ' ')
					intMount[i][r] = 0;
				if (terrain[i][r] == '^') {
					intMount[i][r] = 1;
				}
				if (terrain[i][r] == '-') {
					intMount[i][r] = -1;
					aigua++;
				}
			}
		}
		for (int c = 1; c < llarg; c++) {
			for (int i = 1; i < terrain.length - 1; i++) {
				for (int r = 1; r < llarg - 1; r++) {
					if (checkAround(intMount, i, r, c)) {
						intMount[i][r] = c + 1;
					}

				}
			}
		}

		contant[0] = (llarg * terrain.length) - aigua;
		System.out.println(contant.length);
		printMount(intMount);
		System.out.println("llarg: "+ llarg + ", terrain.length: "+ terrain.length);
		for (int dia = 1; dia < 4; dia++) {
			nivell++;
			intMount = flood(intMount, nivell);
			contant[dia] = (llarg * terrain.length) - aigua;
		}
		System.out.println(Arrays.toString(contant));
		return contant;
	}
	

	public static boolean checkAround(int[][] mountain, int i, int r, int c) {
		boolean yes = false;
		if(mountain[i][r]<c)return yes;
		if ((mountain[i - 1][r] == c || mountain[i - 1][r] == c + 1)
				&& (mountain[i][r - 1] == c || mountain[i][r - 1] == c + 1)
				&& (mountain[i + 1][r] == c || mountain[i + 1][r] == c + 1)
				&& (mountain[i][r + 1] == c || mountain[i][r + 1] == c + 1))
			yes = true;
		return yes;
	}

	public static int[][] flood(int[][] mountain, int nivell) {
		boolean continuem = false;
		do {
			continuem = false;
			for (int i = 0; i < mountain.length; i++) {
				for (int r = 0; r < mountain[0].length; r++) {
					if (i > 0) {
						if (mountain[i][r] == -1 && (mountain[i - 1][r] <= nivell && mountain[i - 1][r] != -1)) {
							mountain[i - 1][r] = -1;
							aigua++;
							continuem = true;
						}
					}
					if (r > 0) {
						if (mountain[i][r] == -1 && (mountain[i][r - 1] <= nivell && mountain[i][r - 1] != -1)) {
							mountain[i][r - 1] = -1;
							aigua++;
							continuem = true;
						}
					}
					if (i < mountain.length - 1) {
						if (mountain[i][r] == -1 && (mountain[i + 1][r] <= nivell && mountain[i + 1][r] != -1)) {
							mountain[i + 1][r] = -1;
							aigua++;
							continuem = true;
						}
					}
					if (r < mountain[0].length - 1) {
						if (mountain[i][r] == -1 && (mountain[i][r + 1] <= nivell && mountain[i][r + 1] != -1)) {
							mountain[i][r + 1] = -1;
							aigua++;
							continuem = true;
						}
					}
				}

			}
		} while (continuem == true);
		printMount(mountain);
		System.out.println("----------------------------------------------------------");
		return mountain;

	}

	public static void printMount(int[][] intMount) {
		System.out.println(Arrays.toString(intMount[0]));
		System.out.println(Arrays.toString(intMount[1]));
		System.out.println(Arrays.toString(intMount[2]));
		System.out.println(Arrays.toString(intMount[3]));
		System.out.println(Arrays.toString(intMount[4]));
		System.out.println(Arrays.toString(intMount[5]));
		System.out.println(Arrays.toString(intMount[6]));
		System.out.println(Arrays.toString(intMount[7]));
		System.out.println(Arrays.toString(intMount[8]));
		System.out.println(Arrays.toString(intMount[9]));
		System.out.println(Arrays.toString(intMount[10]));
	}
}
