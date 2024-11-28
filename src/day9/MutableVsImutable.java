package day9;

import java.util.Arrays;

public class MutableVsImutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Sorting techniqs
	
		int a[]= {20,10,40,50,80,65};
	    System.out.println(Arrays.toString(a));
		Arrays.sort(a); // mutable 
		System.out.println(Arrays.toString(a));
		
//imutable
		String s = new String ("Welcome");
		System.out.println(s);

		s.concat("to java");
		System.out.println(s);
		
		
		
		
		
	}

}
