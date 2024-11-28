package day7;

import java.util.Arrays;

public class SortingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a[]= {'a','d','y','w','p'};
	//	String a[]= {"Scot","Marry","jone","David"};
		
		System.out.println("before sorting..."+ Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println("After sorting..."+Arrays.toString(a));
		
		
	}

}
