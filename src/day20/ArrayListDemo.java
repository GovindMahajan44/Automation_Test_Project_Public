package day20;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	ArrayList mylist= new ArrayList();
	//	ArrayList <Integer>mylist= new ArrayList <Integer>(); when we use only Int value
		
		ArrayList Alist= new ArrayList();
		
		Alist.add(100);
		Alist.add(22.3);
		Alist.add("Welcom");
		Alist.add('A');
		Alist.add(true);
		Alist.add(100);
		Alist.add(null);
		
		// Size of Array List
		System.out.println("The Size of arrayList  : "+Alist.size());
		
		// Printing Array list
		System.out.println("Printing Array List..:"+Alist);
		
		//Remove the element from Arraylist
		Alist.remove(5);
		System.out.println("Printing Array List..:"+Alist);// 100 is removed
		
		// Inserting in Arraylist
		
	}

}
