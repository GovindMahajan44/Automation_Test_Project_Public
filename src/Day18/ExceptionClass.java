package Day18;

import java.util.Scanner;

public class ExceptionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program is started....");
		
		Scanner sc= new Scanner(System.in);
		/*	System.out.println("Enter a number: ");
		int num= sc.nextInt();
		
		System.out.println(100/num);
		*/
		
		// Example 2
	/*	
		int a[]= new int [5];
		System.out.println("Enter the position (0-4): ");
		int pos= sc.nextInt();
		System.out.println("Enter the value");
		int value= sc.nextInt();
		a[pos]=value; //ArrayIndexOutOfBoundsException error
		*/
		
		// example
		String s="welcome";
		int num= Integer.parseInt(s);
		System.out.println(num); // NumberFormatException
		
		
		System.out.println("Program is completed....");
		System.out.println("Program is exited....");
		
	}

}
