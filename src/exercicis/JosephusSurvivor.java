package exercicis;

import java.util.ArrayList;

public class JosephusSurvivor {
	public static int josephusSurvivor(final int n, final int k) {
		 
		ArrayList<Integer> array=new ArrayList<>();
		for(int i=0;i<n;i++) array.add(i+1);
		int y=0;
		while(array.size()>1) {
			y += k;
			System.out.println(y + "arraysize: "+array.size());
			if((y)>=array.size())y -= array.size()+1;
			System.out.println(y);
			array.remove(y);
		}
		return array.get(0);
		
	}
	         


	public static void main(String[] args) {
		
		josephusSurvivor(40, 3);
	}
}
