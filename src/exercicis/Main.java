package exercicis;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
	
			 
		char[][] terrain = {
			      "         ^^^^^ ^^^^^".toCharArray(),
			      "  ^^^^^  ^^^^^ ^^^^^".toCharArray(),
			      "  ^^^^^^^^          ".toCharArray(),
			      "^^^^^^^^^       ^^^^".toCharArray(),
			      "^^ ^^^^^^^  ^^^^^^^^".toCharArray(),
			      "^^^^^^^     ^^^^^^^^".toCharArray(),
			      "   ^^^^^    ^^^^^   ".toCharArray(),
			      "--------------------".toCharArray(),
			      "^^^^^^^             ".toCharArray(),
			      "^^^^^^^^            ".toCharArray(),
				  "^^^^^               ".toCharArray()
			           
			    };  
				
		
		
		BirdMountainRiver bird= new BirdMountainRiver();
		bird.dryGround(terrain);
	}

}
