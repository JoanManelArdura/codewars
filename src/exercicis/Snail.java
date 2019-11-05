package exercicis;

/*
Snail Sort
Given an n x n array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.

array = [[1,2,3],
         [4,5,6],
         [7,8,9]]
snail(array) #=> [1,2,3,6,9,8,7,4,5]
For better understanding, please follow the numbers of the next array consecutively:

array = [[1,2,3],
         [8,9,4],
         [7,6,5]]
snail(array) #=> [1,2,3,4,5,6,7,8,9]
This image will illustrate things more clearly:


NOTE: The idea is not sort the elements from the lowest value to the highest; the idea is to traverse the 2-d array in a clockwise snailshell pattern.

NOTE 2: The 0x0 (empty matrix) is represented as en empty array inside an array [[]].
 */
public class Snail {

	  public static int[] snail(int[][] array) {
	       int[] cuc = new int[array.length*array[0].length];
	       int total= array.length;
	       char direccio='e';
	       int x=0;
	       int y=0;
	       int limit=1;
	       for(int i=0;i<cuc.length;i++) {
	         switch(direccio) {
	         case 'e':
	           cuc[i]=array[x][y];
	           y++;
	           if(y==total-limit) {
	             direccio='s';
	           }
	           //System.out.println(Arrays.toString(cuc));
	           break;
	         case 's':
	           cuc[i]=array[x][y];
	           x++;
	           if(x==total-limit) {
	             direccio='w';
	           }
	           //System.out.println(Arrays.toString(cuc));
	           break;
	         case 'w':
	           cuc[i]=array[x][y];
	           y--;
	           if(y==limit-1) direccio='n';
	           //System.out.println(Arrays.toString(cuc));
	           break;
	         case 'n':
	           cuc[i]=array[x][y];
	           x--;
	           if(x==limit) {
	             direccio='e';
	             limit++;
	           }
	           //System.out.println(Arrays.toString(cuc));
	           break;
	         }
	         
	       }
	       
	       //System.out.println(cuc.toString());
	       return cuc;
	     }
	}