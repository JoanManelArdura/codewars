package exercicis;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*char[][] mountain = {
			      "      ^^^^^^^^^      ".toCharArray(),
			      "    ^^^^^^^^^^^^^    ".toCharArray(),
			      "  ^^^^^^^^^^^^^^^^^  ".toCharArray(),
			      " ^^^^^^^     ^^^^^^^ ".toCharArray(),
			      "^^^^^^^       ^^^^^^^".toCharArray(),
			      "^^^^^^^       ^^^^^^^".toCharArray(),
			      "^^^^^^^       ^^^^^^^".toCharArray(),
			      " ^^^^^^^     ^^^^^^^ ".toCharArray(),
			      "  ^^^^^^^^^^^^^^^^^  ".toCharArray(),
			      "    ^^^^^^^^^^^^^    ".toCharArray(),
			      "      ^^^^^^^^^      ".toCharArray(),
			    };*/
		char[][] mountain = {
			      "^^^^^^        ".toCharArray(),
			      " ^^^^^^^^     ".toCharArray(),
			      "  ^^^^^^^     ".toCharArray(),
			      "  ^^^^^       ".toCharArray(),
			      "  ^^^^^^^^^^^ ".toCharArray(),
			      "  ^^^^^^      ".toCharArray(),
			      "  ^^^^        ".toCharArray()
			    };  
	  

		BirdMountain bird= new BirdMountain();
		bird.peakHeight(mountain);
	}

}
